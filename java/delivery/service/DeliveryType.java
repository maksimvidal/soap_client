
package delivery.service;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="courier" type="{http://service.delivery/}courierType"/&gt;
 *         &lt;element name="client" type="{http://service.delivery/}clientType"/&gt;
 *         &lt;element name="item" type="{http://service.delivery/}itemType"/&gt;
 *         &lt;element name="deliveryStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="deliveryEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", propOrder = {
    "deliveryPrice",
    "address",
    "courier",
    "client",
    "item",
    "deliveryStart",
    "deliveryEnd",
    "finished",
    "deliveryId"
})
public class DeliveryType {

    protected float deliveryPrice;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected CourierType courier;
    @XmlElement(required = true)
    protected ClientType client;
    @XmlElement(required = true)
    protected ItemType item;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryEnd;
    protected boolean finished;
    protected String deliveryId;

    /**
     * Gets the value of the deliveryPrice property.
     * 
     */
    public float getDeliveryPrice() {
        return deliveryPrice;
    }

    /**
     * Sets the value of the deliveryPrice property.
     * 
     */
    public void setDeliveryPrice(float value) {
        this.deliveryPrice = value;
    }

    /**
     * Gets the value of the address property.
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
     * Sets the value of the address property.
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
     * Gets the value of the courier property.
     * 
     * @return
     *     possible object is
     *     {@link CourierType }
     *     
     */
    public CourierType getCourier() {
        return courier;
    }

    /**
     * Sets the value of the courier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourierType }
     *     
     */
    public void setCourier(CourierType value) {
        this.courier = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientType }
     *     
     */
    public ClientType getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType }
     *     
     */
    public void setClient(ClientType value) {
        this.client = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the deliveryStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryStart() {
        return deliveryStart;
    }

    /**
     * Sets the value of the deliveryStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryStart(XMLGregorianCalendar value) {
        this.deliveryStart = value;
    }

    /**
     * Gets the value of the deliveryEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryEnd() {
        return deliveryEnd;
    }

    /**
     * Sets the value of the deliveryEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryEnd(XMLGregorianCalendar value) {
        this.deliveryEnd = value;
    }

    /**
     * Gets the value of the finished property.
     * 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Sets the value of the finished property.
     * 
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

    /**
     * Gets the value of the deliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * Sets the value of the deliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryId(String value) {
        this.deliveryId = value;
    }

}
