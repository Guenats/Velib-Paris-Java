//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.11.16 à 10:58:49 AM CET 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="markers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="marker" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="lng" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="bonus" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="arrondissements">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="arrondissement" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                           &lt;attribute name="minLat" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="minLng" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="maxLat" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="maxLng" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "markers",
    "arrondissements"
})
@XmlRootElement(name = "carto")
public class Carto {

    @XmlElement(required = true)
    protected Carto.Markers markers;
    @XmlElement(required = true)
    protected Carto.Arrondissements arrondissements;

    /**
     * Obtient la valeur de la propriété markers.
     * 
     * @return
     *     possible object is
     *     {@link Carto.Markers }
     *     
     */
    public Carto.Markers getMarkers() {
        return markers;
    }

    /**
     * Définit la valeur de la propriété markers.
     * 
     * @param value
     *     allowed object is
     *     {@link Carto.Markers }
     *     
     */
    public void setMarkers(Carto.Markers value) {
        this.markers = value;
    }

    /**
     * Obtient la valeur de la propriété arrondissements.
     * 
     * @return
     *     possible object is
     *     {@link Carto.Arrondissements }
     *     
     */
    public Carto.Arrondissements getArrondissements() {
        return arrondissements;
    }

    /**
     * Définit la valeur de la propriété arrondissements.
     * 
     * @param value
     *     allowed object is
     *     {@link Carto.Arrondissements }
     *     
     */
    public void setArrondissements(Carto.Arrondissements value) {
        this.arrondissements = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="arrondissement" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="minLat" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="minLng" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="maxLat" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="maxLng" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "arrondissement"
    })
    public static class Arrondissements {

        protected List<Carto.Arrondissements.Arrondissement> arrondissement;

        /**
         * Gets the value of the arrondissement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arrondissement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArrondissement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carto.Arrondissements.Arrondissement }
         * 
         * 
         */
        public List<Carto.Arrondissements.Arrondissement> getArrondissement() {
            if (arrondissement == null) {
                arrondissement = new ArrayList<Carto.Arrondissements.Arrondissement>();
            }
            return this.arrondissement;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="minLat" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="minLng" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="maxLat" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="maxLng" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Arrondissement {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "number")
            protected Byte number;
            @XmlAttribute(name = "minLat")
            protected Float minLat;
            @XmlAttribute(name = "minLng")
            protected Float minLng;
            @XmlAttribute(name = "maxLat")
            protected Float maxLat;
            @XmlAttribute(name = "maxLng")
            protected Float maxLng;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété number.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getNumber() {
                return number;
            }

            /**
             * Définit la valeur de la propriété number.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setNumber(Byte value) {
                this.number = value;
            }

            /**
             * Obtient la valeur de la propriété minLat.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getMinLat() {
                return minLat;
            }

            /**
             * Définit la valeur de la propriété minLat.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setMinLat(Float value) {
                this.minLat = value;
            }

            /**
             * Obtient la valeur de la propriété minLng.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getMinLng() {
                return minLng;
            }

            /**
             * Définit la valeur de la propriété minLng.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setMinLng(Float value) {
                this.minLng = value;
            }

            /**
             * Obtient la valeur de la propriété maxLat.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getMaxLat() {
                return maxLat;
            }

            /**
             * Définit la valeur de la propriété maxLat.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setMaxLat(Float value) {
                this.maxLat = value;
            }

            /**
             * Obtient la valeur de la propriété maxLng.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getMaxLng() {
                return maxLng;
            }

            /**
             * Définit la valeur de la propriété maxLng.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setMaxLng(Float value) {
                this.maxLng = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="marker" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="lng" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="bonus" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "marker"
    })
    public static class Markers {

        protected List<Carto.Markers.Marker> marker;

        /**
         * Gets the value of the marker property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marker property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarker().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carto.Markers.Marker }
         * 
         * 
         */
        public List<Carto.Markers.Marker> getMarker() {
            if (marker == null) {
                marker = new ArrayList<Carto.Markers.Marker>();
            }
            return this.marker;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="lng" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="bonus" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Marker {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "number")
            protected Integer number;
            @XmlAttribute(name = "address")
            protected String address;
            @XmlAttribute(name = "fullAddress")
            protected String fullAddress;
            @XmlAttribute(name = "lat")
            protected Float lat;
            @XmlAttribute(name = "lng")
            protected Float lng;
            @XmlAttribute(name = "open")
            protected Byte open;
            @XmlAttribute(name = "bonus")
            protected Byte bonus;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Définit la valeur de la propriété name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtient la valeur de la propriété number.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * Définit la valeur de la propriété number.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumber(Integer value) {
                this.number = value;
            }

            /**
             * Obtient la valeur de la propriété address.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Définit la valeur de la propriété address.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Obtient la valeur de la propriété fullAddress.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullAddress() {
                return fullAddress;
            }

            /**
             * Définit la valeur de la propriété fullAddress.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullAddress(String value) {
                this.fullAddress = value;
            }

            /**
             * Obtient la valeur de la propriété lat.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLat() {
                return lat;
            }

            /**
             * Définit la valeur de la propriété lat.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLat(Float value) {
                this.lat = value;
            }

            /**
             * Obtient la valeur de la propriété lng.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLng() {
                return lng;
            }

            /**
             * Définit la valeur de la propriété lng.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLng(Float value) {
                this.lng = value;
            }

            /**
             * Obtient la valeur de la propriété open.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getOpen() {
                return open;
            }

            /**
             * Définit la valeur de la propriété open.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setOpen(Byte value) {
                this.open = value;
            }

            /**
             * Obtient la valeur de la propriété bonus.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getBonus() {
                return bonus;
            }

            /**
             * Définit la valeur de la propriété bonus.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setBonus(Byte value) {
                this.bonus = value;
            }

        }

    }

}
