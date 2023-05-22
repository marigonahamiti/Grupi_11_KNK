public interface BillDao{
public List<Reservation> getAllReservations();
public Reservation getReservation(int roomNumber);
public void updateReservation(Reservation reservation);
public void deleteReservation(Reservation reservation);
}
