
package com.by.pokemonapi.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ability" type="{http://www.by.com/pokemonapi/wsdl}abilityList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ability"
})
@XmlRootElement(name = "getPokemonAbilitiesResponse")
public class GetPokemonAbilitiesResponse {

    @XmlElement(required = true)
    protected AbilityList ability;

    /**
     * Obtiene el valor de la propiedad ability.
     * 
     * @return
     *     possible object is
     *     {@link AbilityList }
     *     
     */
    public AbilityList getAbility() {
        return ability;
    }

    /**
     * Define el valor de la propiedad ability.
     * 
     * @param value
     *     allowed object is
     *     {@link AbilityList }
     *     
     */
    public void setAbility(AbilityList value) {
        this.ability = value;
    }

}
