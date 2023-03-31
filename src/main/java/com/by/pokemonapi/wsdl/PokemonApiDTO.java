package com.by.pokemonapi.wsdl;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getPokemonResponse")
public class PokemonApiDTO {

    @XmlElement(name = "count")
    private int count;
    @XmlElement(name = "next")
    private String next;
    @XmlElement(name = "previous")
    private String previous;
    @XmlElement(name = "results")
    private List<PokemonDTO> results;
}
