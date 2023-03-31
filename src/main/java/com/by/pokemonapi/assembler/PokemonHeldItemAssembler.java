package com.by.pokemonapi.assembler;

import java.util.ArrayList;
import java.util.List;

import com.by.pokemonapi.models.PokemonHIVersionDetails;
import com.by.pokemonapi.models.PokemonHeldItem;
import com.by.pokemonapi.wsdl.HeldItems;
import com.by.pokemonapi.wsdl.HeldItemsList;
import com.by.pokemonapi.wsdl.Item;
import com.by.pokemonapi.wsdl.VersionDetailsList;

public class PokemonHeldItemAssembler {
	public static HeldItems builtHeldItemListToPokemonHeldItem( List<PokemonHeldItem> pokemonHeldItemList) {
		
		HeldItems heldItem = new HeldItems();
		
		List<HeldItemsList> heldItems = new ArrayList<HeldItemsList>();
		
		for (PokemonHeldItem pokemonHeldItem : pokemonHeldItemList) {
			HeldItemsList heldItemsList = new HeldItemsList();
			
			Item item = new Item();
			
			item.setName(pokemonHeldItem.getItem().getName());
			item.setUrl(pokemonHeldItem.getItem().getUrl());
			
			
			ArrayList<VersionDetailsList> versionDetailsList = new ArrayList<VersionDetailsList>();
			for (PokemonHIVersionDetails vd : pokemonHeldItem.getVersion_details()) {
				VersionDetailsList versionDetails  = new VersionDetailsList();
				versionDetails.setRarity(vd.getRarity());
				versionDetails.setVersionName(vd.getVersion().getName());
				versionDetails.setVersionUrl(vd.getVersion().getUrl());
				versionDetailsList.add(versionDetails);
			}
			heldItemsList.setItem(item);
			heldItemsList.getVersionDetails().addAll(versionDetailsList);
			
			heldItems.add(heldItemsList);
			
		}
		
		heldItem.getHeldItems().addAll(heldItems);
		return heldItem;
		
	}
}
