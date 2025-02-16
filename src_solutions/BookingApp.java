public class BookingApp {

    public static void main(String[] args) {
        BookingManager manager = new BookingManager();

        Booking b1 = new Booking("B001", "Alice");
        Booking b2 = new Booking("B002", "Bob");
        Booking b3 = new Booking("B001", "Charlie");

        manager.addBooking(b1);
        manager.addBooking(b2);
        manager.addBooking(b3);

        System.out.println("Checking:");
        System.out.println("Amount of bookings: " + manager.getBookings().size()); // 2
        System.out.println("Booking B001 available? " + manager.isBookingPresent("B001")); // true
        System.out.println("Booking B003 available? " + manager.isBookingPresent("B003")); // false
    }

}
