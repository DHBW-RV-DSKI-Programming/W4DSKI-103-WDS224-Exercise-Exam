class Booking {

    private String id;
    private String customerName;

    Booking(String id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    String getId() {
        return id;
    }

    String getCustomerName() {
        return customerName;
    }

}