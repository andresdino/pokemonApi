package com.by.pokemonapi.service;

import com.by.pokemonapi.wsdl.PokemonApiDTO;
import com.by.pokemonapi.wsdl.RequestDTO;
import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PokemonDAO {

    private Gson gson;

    public PokemonDAO(){
        this.gson = new Gson();
    }

    public PokemonApiDTO getPokemon(RequestDTO requestDTO) throws IOException {
        String path = "https://pokeapi.co/api/v2/pokemon?offset="+requestDTO.getInicio()+"&limit="+requestDTO.getLimite()+"";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(path);
        CloseableHttpResponse response = httpClient.execute(request);
        try {
            String responseBody = EntityUtils.toString(response.getEntity());
            PokemonApiDTO pokemonApiDTO = gson.fromJson(responseBody, PokemonApiDTO.class);
            System.out.println(responseBody);
            System.out.println(pokemonApiDTO);
            return pokemonApiDTO;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            response.close();
        }

    }
}
