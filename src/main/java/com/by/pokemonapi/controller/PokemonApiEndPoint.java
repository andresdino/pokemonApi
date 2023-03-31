package com.by.pokemonapi.controller;

import javax.servlet.http.HttpServletRequest;

import com.by.pokemonapi.service.PokemonDAO;
import com.by.pokemonapi.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.by.pokemonapi.entity.Request;
import com.by.pokemonapi.service.PokemonApiService;
import com.by.pokemonapi.service.RequestService;

import java.io.IOException;


@Endpoint
public class PokemonApiEndPoint {
	
	@Autowired
	private PokemonApiService pokemonApiService;
	
	@Autowired
	private RequestService requestService;
	
	private HttpServletRequest httpServletRequest;

    @Autowired
    public void setRequest(HttpServletRequest request) {
        this.httpServletRequest = request;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(PokemonApiEndPoint.class);
    
	private static final String NAMESPACE_URI = "http://www.by.com/pokemonapi/wsdl";
      
   @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonIdRequest")
   @ResponsePayload
   public GetPokemonIdResponse getId(@RequestPayload GetPokemonIdRequest request) {
	   GetPokemonIdResponse response = new GetPokemonIdResponse();
	  Integer id = pokemonApiService.findIdByPokemonName(request.getName());
      
	  response.setId(id);

	  
	  String incoming =  this.httpServletRequest.getRemoteAddr();
	  requestService.saveRequest(incoming, "getPokemonIdRequest");     
	    
       return response;
   }
   
   @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonNameRequest")
   @ResponsePayload
   public GetPokemonNameResponse getName(@RequestPayload GetPokemonNameRequest request) {
	  GetPokemonNameResponse response = new GetPokemonNameResponse();
	  String name = pokemonApiService.findNamebyName(request.getName());
      
	  response.setName(name);
	  
	  String incoming =  this.httpServletRequest.getRemoteAddr();
	  requestService.saveRequest(incoming, "getPokemonNameRequest");  

	  LOGGER.info("Muestro todos las peticiones");
	  for (Request r : requestService.getRequest()) {
		LOGGER.info(r.toString());
	  }
	  requestService.getRequest();
	  
       return response;
   }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonRequest")
	@ResponsePayload
	public PokemonApiDTO getPokemonList(@RequestPayload RequestDTO requestDTO) throws IOException {
		PokemonDAO pokemonDAO = new PokemonDAO();
		PokemonApiDTO poke = pokemonDAO.getPokemon(requestDTO);
		return poke;
	}

   

      
   
}
