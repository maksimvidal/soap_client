
package delivery.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleType", propOrder = {
    "vehicleName",
    "vehicleId"
})
public class VehicleType {

    @XmlElement(required = true)
    protected String vehicleName;
    @XmlElement(required = true)
    protected String vehicleId;

    /**
     * Gets the value of the vehicleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * Sets the value of the vehicleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleName(String value) {
        this.vehicleName = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleId(String value) {
        this.vehicleId = value;
    }

}
