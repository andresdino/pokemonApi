package com.by.pokemonapi.models;

import java.util.List;

public class PokemonHeldItem {
	
	private PokemonHIItem item;
	
	private List<PokemonHIVersionDetails> version_details;
	
	
	

	public PokemonHIItem getItem() {
		return item;
	}

	public void setItem(PokemonHIItem item) {
		this.item = item;
	}

	public List<PokemonHIVersionDetails> getVersion_details() {
		return version_details;
	}

	public void setVersion_details(List<PokemonHIVersionDetails> version_details) {
		this.version_details = version_details;
	}
	
	

}
