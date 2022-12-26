package ua.delivery;

import delivery.service.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public interface Operations {

    private static Delivery getReq() {
        DeliveryService service = null;
        try {
            service = new DeliveryService(new URL("http://localhost:9090/Delivery?wsdl"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return service.getDeliveryPort();
    }

    static DeliveryType createDelivery(DeliveryType deliveryType) {
        Delivery delivery = getReq();
        CreateReq deliveryReq = new CreateReq();
        deliveryReq.setDelivery(deliveryType);
        return delivery.createDelivery(deliveryReq).getReturn();
    }

    static DeliveryType assignCourier(CourierType courierType, String deliveryId) {
        Delivery delivery = getReq();
        AssignCourierReq assignCourierReq = new AssignCourierReq();
        assignCourierReq.setCourier(courierType);
        assignCourierReq.setArg1(deliveryId);

        return delivery.assignCourier(assignCourierReq).getReturn();
    }

    static List<DeliveryType> getAllDeliveries(ClientType clientType) {
        Delivery delivery = getReq();
        DeliveriesReq driverReq = new DeliveriesReq();
        driverReq.setClient(clientType);

        return delivery.getClientDeliveries(driverReq).getReturn();
    }

    static DeliveryType updateDelivery(DeliveryType newDelivery) {
        Delivery delivery = getReq();
        UpdateDeliveryReq updateReq = new UpdateDeliveryReq();
        updateReq.setUpdatedDelivery(newDelivery);

        return delivery.updateDelivery(updateReq).getReturn();
    }

    static void cancelDelivery(DeliveryType deliveryType) {
        Delivery delivery = getReq();
        CancelDeliveryReq cancelDeliveryReq = new CancelDeliveryReq();
        cancelDeliveryReq.setDelivery(deliveryType);

        delivery.cancelDelivery(cancelDeliveryReq);
    }

}
