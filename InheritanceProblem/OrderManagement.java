import java.time.LocalDate;
class Order {
    int orderId;
   LocalDate orderDate;

 Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Placed";
    }
}
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getOrderStatus() {
        return "Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

  DeliveredOrder(int orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getOrderStatus() {
        return "Delivered";
    }
}
class OrderManagement{
    public static void main(String[] args) {
        Order order = new Order(101, LocalDate.of(2025, 2, 1));
        System.out.println("Order ID: " + order.orderId + ", Status: " + order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder(102, LocalDate.of(2025, 2, 2), "TRK23456");
        System.out.println("Order ID: " + shippedOrder.orderId + ", Status: " + shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, LocalDate.of(2025, 2, 3), "TRK68765", LocalDate.of(2025, 2, 5));
        System.out.println("Order ID: " + deliveredOrder.orderId + ", Status: " + deliveredOrder.getOrderStatus());
    }
}
