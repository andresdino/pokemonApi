
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
 *         &lt;element name="held_items" type="{http://www.by.com/pokemonapi/wsdl}held_items"/&gt;
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
    "heldItems"
})
@XmlRootElement(name = "getPokemonHeld_itemsResponse")
public class GetPokemonHeldItemsResponse {

    @XmlElement(name = "held_items", required = true)
    protected HeldItems heldItems;

    /**
     * Obtiene el valor de la propiedad heldItems.
     * 
     * @return
     *     possible object is
     *     {@link HeldItems }
     *     
     */
    public HeldItems getHeldItems() {
        return heldItems;
    }

    /**
     * Define el valor de la propiedad heldItems.
     * 
     * @param value
     *     allowed object is
     *     {@link HeldItems }
     *     
     */
    public void setHeldItems(HeldItems value) {
        this.heldItems = value;
    }

}
