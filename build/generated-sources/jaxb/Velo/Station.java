//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.11.16 à 01:06:34 PM CET 
//


package Velo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="free" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="connected" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
    "available",
    "free",
    "total",
    "ticket",
    "open",
    "updated",
    "connected"
})
@XmlRootElement(name = "station")
public class Station {

    protected byte available;
    protected byte free;
    protected byte total;
    protected byte ticket;
    protected byte open;
    protected int updated;
    protected byte connected;

    /**
     * Obtient la valeur de la propriété available.
     * 
     */
    public byte getAvailable() {
        return available;
    }

    /**
     * Définit la valeur de la propriété available.
     * 
     */
    public void setAvailable(byte value) {
        this.available = value;
    }

    /**
     * Obtient la valeur de la propriété free.
     * 
     */
    public byte getFree() {
        return free;
    }

    /**
     * Définit la valeur de la propriété free.
     * 
     */
    public void setFree(byte value) {
        this.free = value;
    }

    /**
     * Obtient la valeur de la propriété total.
     * 
     */
    public byte getTotal() {
        return total;
    }

    /**
     * Définit la valeur de la propriété total.
     * 
     */
    public void setTotal(byte value) {
        this.total = value;
    }

    /**
     * Obtient la valeur de la propriété ticket.
     * 
     */
    public byte getTicket() {
        return ticket;
    }

    /**
     * Définit la valeur de la propriété ticket.
     * 
     */
    public void setTicket(byte value) {
        this.ticket = value;
    }

    /**
     * Obtient la valeur de la propriété open.
     * 
     */
    public byte getOpen() {
        return open;
    }

    /**
     * Définit la valeur de la propriété open.
     * 
     */
    public void setOpen(byte value) {
        this.open = value;
    }

    /**
     * Obtient la valeur de la propriété updated.
     * 
     */
    public int getUpdated() {
        return updated;
    }

    /**
     * Définit la valeur de la propriété updated.
     * 
     */
    public void setUpdated(int value) {
        this.updated = value;
    }

    /**
     * Obtient la valeur de la propriété connected.
     * 
     */
    public byte getConnected() {
        return connected;
    }

    /**
     * Définit la valeur de la propriété connected.
     * 
     */
    public void setConnected(byte value) {
        this.connected = value;
    }

}
