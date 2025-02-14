import java.util.ArrayList;

class BookingManager {
    private ArrayList<Booking> bookings = new ArrayList<>();

    void addBooking(Booking booking) {
//        if (!bookings.contains(booking)) {
        if (!isBookingPresent(booking.getId())) { // 2 Punkt
            bookings.add(booking);
        }
    }

    boolean isBookingPresent(String id) {
//        return bookings.contains(new Booking(id, ""));
        for (Booking b : bookings) { // 2 Punkt
            if (b.getId().equals(id)) { // 2 Punkt
                return true; // 2 Punkt
            }
        }
        return false; // 2 Punkt
    }

    ArrayList<Booking> getBookings() {
        return bookings;
    }

    // 5 Punkte

}