import java.util.ArrayList;

class BookingManager {
    private ArrayList<Booking> bookings = new ArrayList<>();

    void addBooking(Booking booking) {
        if (!bookings.contains(booking)) {
            bookings.add(booking);
        }
    }

    boolean isBookingPresent(String id) {
        return bookings.contains(new Booking(id, ""));
    }

    ArrayList<Booking> getBookings() {
        return bookings;
    }

}