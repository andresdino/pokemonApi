package com.by.pokemonapi.assembler;

import java.util.ArrayList;
import java.util.List;

import com.by.pokemonapi.models.PokemonAbility;
import com.by.pokemonapi.wsdl.Ability;
import com.by.pokemonapi.wsdl.AbilityList;

public class PokemonAbilityAssembler {
	public static AbilityList builtAbiliyListToPokemonAbility( List<PokemonAbility> pokemonAbilityList) {
	
		AbilityList abiliyList = new AbilityList();
		
		ArrayList<Ability> abilities = new ArrayList<Ability>();
		
		for (PokemonAbility pokemonAbility : pokemonAbilityList) {
			Ability ability = new Ability();
			ability.setIsHidden(pokemonAbility.getIs_hidden()+"");
			ability.setName(pokemonAbility.getAbility().getName());
			ability.setSlot(pokemonAbility.getSlot());
			ability.setUrl(pokemonAbility.getAbility().getUrl());
			
			abilities.add(ability);
		}
		abiliyList.getAbility().addAll(abilities);
		
		return abiliyList;
		
	}
}
