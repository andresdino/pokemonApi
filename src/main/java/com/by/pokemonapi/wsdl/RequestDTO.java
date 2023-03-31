package com.by.pokemonapi.wsdl;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getPokemonRequest")
public class RequestDTO {

    @XmlElement(name = "inicio")
    private Long inicio;
    @XmlElement(name = "limite")
    private Long limite;
}
