
package delivery.service;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the delivery.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AssignCourierReq_QNAME = new QName("http://service.delivery/", "AssignCourierReq");
    private final static QName _AssignCourierResp_QNAME = new QName("http://service.delivery/", "AssignCourierResp");
    private final static QName _CancelDeliveryReq_QNAME = new QName("http://service.delivery/", "CancelDeliveryReq");
    private final static QName _CancelDeliveryResp_QNAME = new QName("http://service.delivery/", "CancelDeliveryResp");
    private final static QName _CreateReq_QNAME = new QName("http://service.delivery/", "CreateReq");
    private final static QName _CreateResp_QNAME = new QName("http://service.delivery/", "CreateResp");
    private final static QName _DeliveriesReq_QNAME = new QName("http://service.delivery/", "DeliveriesReq");
    private final static QName _DeliveriesResp_QNAME = new QName("http://service.delivery/", "DeliveriesResp");
    private final static QName _UpdateDeliveryReq_QNAME = new QName("http://service.delivery/", "UpdateDeliveryReq");
    private final static QName _UpdateDeliveryResp_QNAME = new QName("http://service.delivery/", "UpdateDeliveryResp");
    private final static QName _ClientType_QNAME = new QName("http://service.delivery/", "clientType");
    private final static QName _CourierType_QNAME = new QName("http://service.delivery/", "courierType");
    private final static QName _DeliveryType_QNAME = new QName("http://service.delivery/", "deliveryType");
    private final static QName _ItemType_QNAME = new QName("http://service.delivery/", "itemType");
    private final static QName _VehicleType_QNAME = new QName("http://service.delivery/", "vehicleType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: delivery.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssignCourierReq }
     * 
     */
    public AssignCourierReq createAssignCourierReq() {
        return new AssignCourierReq();
    }

    /**
     * Create an instance of {@link AssignCourierResp }
     * 
     */
    public AssignCourierResp createAssignCourierResp() {
        return new AssignCourierResp();
    }

    /**
     * Create an instance of {@link CancelDeliveryReq }
     * 
     */
    public CancelDeliveryReq createCancelDeliveryReq() {
        return new CancelDeliveryReq();
    }

    /**
     * Create an instance of {@link CancelDeliveryResp }
     * 
     */
    public CancelDeliveryResp createCancelDeliveryResp() {
        return new CancelDeliveryResp();
    }

    /**
     * Create an instance of {@link CreateReq }
     * 
     */
    public CreateReq createCreateReq() {
        return new CreateReq();
    }

    /**
     * Create an instance of {@link CreateResp }
     * 
     */
    public CreateResp createCreateResp() {
        return new CreateResp();
    }

    /**
     * Create an instance of {@link DeliveriesReq }
     * 
     */
    public DeliveriesReq createDeliveriesReq() {
        return new DeliveriesReq();
    }

    /**
     * Create an instance of {@link DeliveriesResp }
     * 
     */
    public DeliveriesResp createDeliveriesResp() {
        return new DeliveriesResp();
    }

    /**
     * Create an instance of {@link UpdateDeliveryReq }
     * 
     */
    public UpdateDeliveryReq createUpdateDeliveryReq() {
        return new UpdateDeliveryReq();
    }

    /**
     * Create an instance of {@link UpdateDeliveryResp }
     * 
     */
    public UpdateDeliveryResp createUpdateDeliveryResp() {
        return new UpdateDeliveryResp();
    }

    /**
     * Create an instance of {@link ClientType }
     * 
     */
    public ClientType createClientType() {
        return new ClientType();
    }

    /**
     * Create an instance of {@link CourierType }
     * 
     */
    public CourierType createCourierType() {
        return new CourierType();
    }

    /**
     * Create an instance of {@link DeliveryType }
     * 
     */
    public DeliveryType createDeliveryType() {
        return new DeliveryType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignCourierReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignCourierReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "AssignCourierReq")
    public JAXBElement<AssignCourierReq> createAssignCourierReq(AssignCourierReq value) {
        return new JAXBElement<AssignCourierReq>(_AssignCourierReq_QNAME, AssignCourierReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignCourierResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignCourierResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "AssignCourierResp")
    public JAXBElement<AssignCourierResp> createAssignCourierResp(AssignCourierResp value) {
        return new JAXBElement<AssignCourierResp>(_AssignCourierResp_QNAME, AssignCourierResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelDeliveryReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelDeliveryReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "CancelDeliveryReq")
    public JAXBElement<CancelDeliveryReq> createCancelDeliveryReq(CancelDeliveryReq value) {
        return new JAXBElement<CancelDeliveryReq>(_CancelDeliveryReq_QNAME, CancelDeliveryReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelDeliveryResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelDeliveryResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "CancelDeliveryResp")
    public JAXBElement<CancelDeliveryResp> createCancelDeliveryResp(CancelDeliveryResp value) {
        return new JAXBElement<CancelDeliveryResp>(_CancelDeliveryResp_QNAME, CancelDeliveryResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "CreateReq")
    public JAXBElement<CreateReq> createCreateReq(CreateReq value) {
        return new JAXBElement<CreateReq>(_CreateReq_QNAME, CreateReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "CreateResp")
    public JAXBElement<CreateResp> createCreateResp(CreateResp value) {
        return new JAXBElement<CreateResp>(_CreateResp_QNAME, CreateResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveriesReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveriesReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "DeliveriesReq")
    public JAXBElement<DeliveriesReq> createDeliveriesReq(DeliveriesReq value) {
        return new JAXBElement<DeliveriesReq>(_DeliveriesReq_QNAME, DeliveriesReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveriesResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveriesResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "DeliveriesResp")
    public JAXBElement<DeliveriesResp> createDeliveriesResp(DeliveriesResp value) {
        return new JAXBElement<DeliveriesResp>(_DeliveriesResp_QNAME, DeliveriesResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeliveryReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDeliveryReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "UpdateDeliveryReq")
    public JAXBElement<UpdateDeliveryReq> createUpdateDeliveryReq(UpdateDeliveryReq value) {
        return new JAXBElement<UpdateDeliveryReq>(_UpdateDeliveryReq_QNAME, UpdateDeliveryReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeliveryResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDeliveryResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "UpdateDeliveryResp")
    public JAXBElement<UpdateDeliveryResp> createUpdateDeliveryResp(UpdateDeliveryResp value) {
        return new JAXBElement<UpdateDeliveryResp>(_UpdateDeliveryResp_QNAME, UpdateDeliveryResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "clientType")
    public JAXBElement<ClientType> createClientType(ClientType value) {
        return new JAXBElement<ClientType>(_ClientType_QNAME, ClientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CourierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CourierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "courierType")
    public JAXBElement<CourierType> createCourierType(CourierType value) {
        return new JAXBElement<CourierType>(_CourierType_QNAME, CourierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "deliveryType")
    public JAXBElement<DeliveryType> createDeliveryType(DeliveryType value) {
        return new JAXBElement<DeliveryType>(_DeliveryType_QNAME, DeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "itemType")
    public JAXBElement<ItemType> createItemType(ItemType value) {
        return new JAXBElement<ItemType>(_ItemType_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.delivery/", name = "vehicleType")
    public JAXBElement<VehicleType> createVehicleType(VehicleType value) {
        return new JAXBElement<VehicleType>(_VehicleType_QNAME, VehicleType.class, null, value);
    }

}
