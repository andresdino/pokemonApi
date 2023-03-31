package com.by.pokemonapi.wsdl;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getPokemonContent")
public class PokemonDTO {

    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "url")
    private String url;
}
