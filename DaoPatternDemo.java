public class DaoPatternDemo{
public static void main(String[] args){
RoomDao roomDao=new RoomDaoImpl();
for(Room room:roomDao.getAllRooms()){
System.out.println("Room: [Number:"+room.getNumber()+",Type:"+room.getType()+"]");
}
Room room=roomDao.getAllRooms().get(0);
room.setType("Single");
roomDao.updateRoom(room);
roomDao.getRoom(0);
System.out.println("Room:[Number:"+room.getNumber()+",Type:"+room.getType()+"]");
}
}
