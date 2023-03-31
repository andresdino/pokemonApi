package com.by.pokemonapi.service;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.by.pokemonapi.assembler.PokemonAbilityAssembler;
import com.by.pokemonapi.assembler.PokemonHeldItemAssembler;
import com.by.pokemonapi.models.Pokemon;
import com.by.pokemonapi.wsdl.AbilityList;
import com.by.pokemonapi.wsdl.HeldItems;

@Service
public class PokemonApiService {
	
	private static final String POKEMON_URL = "https://pokeapi.co/api/v2/pokemon/";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PokemonApiService.class);
	

	 public AbilityList findAbilityByPokemonName(String name) {
		LOGGER.info("Star findAbilityByPokemonName Service");
		 Pokemon pokemon = getPokemonForApi(name);
		if(pokemon != null) {
			AbilityList result = PokemonAbilityAssembler.builtAbiliyListToPokemonAbility(pokemon.getAbilities());
			LOGGER.info("End findAbilityByPokemonName Service");
			return result;
			
		} else {
			LOGGER.error("Pokemon No encotrado");
			return null;
		}

	 }
	 
	 public HeldItems findHeldItemsByPokemonName(String name) {
		 LOGGER.info("Star findHeldItemsByPokemonName Service");
		Pokemon pokemon = getPokemonForApi(name);
		if(pokemon != null) {
			HeldItems result = PokemonHeldItemAssembler.builtHeldItemListToPokemonHeldItem(pokemon.getHeld_items());
			LOGGER.info("End findHeldItemsByPokemonName Service");
			return result;
				
		} else {
			LOGGER.error("Pokemon No encotrado");
			return null;
		}
			
	}
	 
	public Integer findIdByPokemonName(String name) {
		LOGGER.info("Star findIdByPokemonName Service");
		Pokemon pokemon = getPokemonForApi(name);
		if (pokemon != null) {
			
			LOGGER.info("End findAbilityByPokemonName Service");
			return pokemon.getId();

		} else {
			LOGGER.error("Pokemon No encotrado");
			return null;
		}

	}
	
	public String findNamebyName(String name) {
		LOGGER.info("Star findNamebyName Service");
		Pokemon pokemon = getPokemonForApi(name);
		if (pokemon != null) {
			
			LOGGER.info("End findNamebyName Service");
			return pokemon.getName();

		} else {
			LOGGER.error("Pokemon No encotrado");
			return null;
		}

	}
	
	public Integer findBaseExperiencebyName(String name) {
		LOGGER.info("Star findBaseExperiencebyName Service");
		Pokemon pokemon = getPokemonForApi(name);
		if (pokemon != null) {
			
			LOGGER.info("End findBaseExperiencebyName Service");
			return pokemon.getBase_experience();

		} else {
			LOGGER.error("Pokemon No encotrado");
			return null;
		}

	}
	
	public String findLocationAreaEncountersbyName(String name) {
		LOGGER.info("Star findLocationAreaEncountersbyName Service");
		Pokemon pokemon = getPokemonForApi(name);
		if (pokemon != null) {
			
			LOGGER.info("End findLocationAreaEncountersbyName Service");
			return pokemon.getLocation_area_encounters();

		} else {
			LOGGER.error("Pokemon No encotrado");
			return null;
		}

	}
	 
	 
	 
	 
	 private Pokemon getPokemonForApi(String name) {
		 try {
				
			 CloseableHttpClient httpClient = HttpClients.custom()
	                    .setSSLHostnameVerifier(new NoopHostnameVerifier())
	                    .build();
	        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
	            requestFactory.setHttpClient(httpClient);
	        RestTemplate restTemplate = new RestTemplate(requestFactory);
	        //ResponseEntity<String> response = restTemplate.getForEntity(POKEMON_URL + name, String.class);
	            
			Pokemon pokemon =  restTemplate
					  .getForObject(POKEMON_URL + name, Pokemon.class);
			LOGGER.info("Fin de consulta al pokemon");
			
			return pokemon;
				
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

}
