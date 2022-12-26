package ua.delivery;

import delivery.service.*;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Logger;


public class Start {

    private static Logger LOG = Logger.getLogger(Start.class.getName());


    public static void main(String[] args) {

        VehicleType vehicleType = new VehicleType();
        vehicleType.setVehicleId(UUID.randomUUID().toString());
        vehicleType.setVehicleName("Truck");

        CourierType courierType = new CourierType();
        courierType.setCourierId("1");
        courierType.setAge((byte)25);
        courierType.setFirstName("Ivan");
        courierType.setLastName("Chornozem");
        courierType.setVehicle(vehicleType);
        courierType.setPhoneNumber("000000000");

        ItemType itemType = new ItemType();
        itemType.setItemId("1");
        itemType.setPrice((float) 1234.1);
        itemType.setItemName("item");

        ClientType clientType = new ClientType();
        clientType.setClientId("1");
        clientType.setClientAge((byte) 23);
        clientType.setEmail("email");
        clientType.setClientFirstName("Bob");
        clientType.setClientLastName("Bob");


        DeliveryType deliveryType = new DeliveryType();
        deliveryType.setDeliveryId("1");
        deliveryType.setAddress("random address");
        deliveryType.setDeliveryPrice((float) 124.1);
        deliveryType.setFinished(false);
        deliveryType.setClient(clientType);
        deliveryType.setItem(itemType);

        boolean stop = false;
        while (!stop) {
            System.out.println("Operations:");
            System.out.println("1.\tCreate delivery");
            System.out.println("2.\tAssign courier");
            System.out.println("3.\tCancel delivery");
            System.out.println("4.\tUpdate delivery");
            System.out.println("5.\tGet all deliveries");
            int n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1:
                    DeliveryType delivery = Operations.createDelivery(deliveryType);
                    System.out.println("Created delivery:\n");
                    System.out.println("Address: " + delivery.getAddress());
                    System.out.println("Client: " + delivery.getClient().getClientFirstName() + " " + delivery.getClient().getClientLastName());
                    System.out.println("Item: " + delivery.getItem().getItemName());
                    break;
                case 2:
                        DeliveryType del = Operations.assignCourier(courierType, "1");
                        System.out.println("delivery:\n");
                        System.out.println("Created delivery:\n");
                        System.out.println("Address: " + del.getAddress());
                        System.out.println("Client: " + del.getClient().getClientFirstName() + " " + del.getClient().getClientLastName());
                        System.out.println("Item: " + del.getItem().getItemName());
                        System.out.println("Courier: " + del.getCourier().getFirstName() + " " + del.getCourier().getLastName());
                        deliveryType = del;
                    break;
                case 3:
                    Operations.cancelDelivery(deliveryType);
                        System.out.println("Delivery canceled");
                    break;
                case 4:
                        deliveryType.setAddress("Another address");
                        DeliveryType updatedDelivery = Operations.updateDelivery(deliveryType);
                        System.out.println("delivery updated:\n");
                        System.out.println("delivery:\n");
                        System.out.println("Created delivery:\n");
                        System.out.println("Address: " + updatedDelivery.getAddress());
                        System.out.println("Client: " + updatedDelivery.getClient().getClientFirstName() + " " + updatedDelivery.getClient().getClientLastName());
                        System.out.println("Item: " + updatedDelivery.getItem().getItemName());
                        if(updatedDelivery.getCourier() != null)
                            System.out.println("Courier: " + updatedDelivery.getCourier().getFirstName() + " " + updatedDelivery.getCourier().getLastName());
                        deliveryType = updatedDelivery;
                    break;
                case 5:
                        System.out.println("deliveries :\n");
                        List<DeliveryType> deliveryTypes = Operations.getAllDeliveries(clientType);
                        deliveryTypes.stream().forEach(dell -> {
                            System.out.println("Address: " + dell.getAddress());
                            System.out.println("Client: " + dell.getClient().getClientFirstName() + " " + dell.getClient().getClientLastName());
                            System.out.println("Item: " + dell.getItem().getItemName());
                            if(dell.getCourier() != null)
                                System.out.println("Courier: " + dell.getCourier().getFirstName() + " " + dell.getCourier().getLastName());
                        });
                        System.out.println(" :\n");
                    break;
                default:
                    LOG.warning("Unknown input");
            }
            System.out.println("\nType something to exit or Enter to continue");
            if (!new Scanner(System.in).nextLine().isBlank())
                stop = true;
        }
    }
}
