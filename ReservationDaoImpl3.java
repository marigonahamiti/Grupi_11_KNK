public class ReservationDaoImpl implements ReservationDao{
List<Reservation> reservations;
public ReservationDaoImpl3 (){
reservations=new ArrayList<Reservation>();
Reservation reservation1=new Reservation(1,"E zene");
Reservation reservation2=new Reservation(2,"E lire");
Reservation reservation3=new Reservation(3,"E zene");
Reservation reservation4=new Reservation(4,"E lire");
reservations.add(reservation1);
reservations.add(reservation2);
reservations.add(reservation3);
reservations.add(reservation4);
}
@Override
public void deleteReservation(Reservation reservation){
reservation.remove(reservation.getRoomNumber());
System.out.println("Room number: "+reservation.getRoomNumber()+",updated in the database");
}
@Override
public List<Reservation>getAllReservations(){
return reservations;
}
@Override
public Reservation getReservation(int roomNumber){
return Rerevation.get(roomNumber);
}
@Override
public void updateReservation(Reservation reservation){
reservations.get(reservation.getRoomNumber()).setStatus(bill.getstatus());
System.out.println("Room number: "+reservation.getRoomNumber()+",updated in the database");
}
}
