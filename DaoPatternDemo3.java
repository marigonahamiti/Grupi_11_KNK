public class DaoPatternDemo3{
public static void main(String[] args){
ReservationDao reservationDao=new ReservationDaoImpl();
for(Reservation reservation:reservationDao.getAllReservations()){
System.out.println("Room number:"+reservation.getRoomNumber()+",status:"+reservation.getStatus()+"]");
}
Reservation reservation=reservationDao.getAllReservations().get(0);
reservation.setStatus("E zene");
reservationDao.updateReservation(reservation);
reservationDao.getReservation(0);
System.out.println("Room number:"+reservation.getRoomNumber()+",status:"+reservation.getStatus()+"]");
}
}
