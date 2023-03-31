package com.by.pokemonapi.models;


import java.util.List;


public class Pokemon {
	
	private List<PokemonAbility> abilities;
	
	private Integer base_experience;
	
	private String location_area_encounters;
	
	private String name;
	
	private Integer id;
	
	private List<PokemonHeldItem> held_items;


	public List<PokemonAbility> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<PokemonAbility> abilities) {
		this.abilities = abilities;
	}

	public Integer getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}

	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<PokemonHeldItem> getHeld_items() {
		return held_items;
	}

	public void setHeld_items(List<PokemonHeldItem> held_items) {
		this.held_items = held_items;
	}
	
	
	

}
