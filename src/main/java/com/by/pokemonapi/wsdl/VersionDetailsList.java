
package com.by.pokemonapi.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para version_detailsList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="version_detailsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version_url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "version_detailsList", propOrder = {
    "rarity",
    "versionName",
    "versionUrl"
})
public class VersionDetailsList {

    @XmlElement(required = true)
    protected String rarity;
    @XmlElement(name = "version_name", required = true)
    protected String versionName;
    @XmlElement(name = "version_url", required = true)
    protected String versionUrl;

    /**
     * Obtiene el valor de la propiedad rarity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * Define el valor de la propiedad rarity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRarity(String value) {
        this.rarity = value;
    }

    /**
     * Obtiene el valor de la propiedad versionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * Define el valor de la propiedad versionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionName(String value) {
        this.versionName = value;
    }

    /**
     * Obtiene el valor de la propiedad versionUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionUrl() {
        return versionUrl;
    }

    /**
     * Define el valor de la propiedad versionUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionUrl(String value) {
        this.versionUrl = value;
    }

}
