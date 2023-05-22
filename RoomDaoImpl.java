import java.util.ArrayList;
import java.util.List;
public class RoomDaoImpl implements RoomDao{
List<Room> rooms;
public RoomDaoImpl (){
rooms=new ArrayList<Room>();
Room room1=new Room(1,"Single");
Room room2=new Room(2,"Double");
Room room3=new Room(3,"Single");
Room room4=new Room(4,"Double");
rooms.add(room1);
rooms.add(room2);
rooms.add(room3);
rooms.add(rooms4);
}
@Override
public void deleteRoom(Room room){
rooms.remove(room.getNumber());
System.out.println("Room: Number"+room.getNumber()+",updated in the database");
}
@Override
public List<Room>getAllRooms(){
return rooms;
}
@Override
public Room getRoom(int Number){
return Room.get(Number);
}
@Override
public void updateRoom(Room room){
rooms.get(room.getNumber()).setType(room.getType());
System.out.println("Room: Number"+room.getNumber()+",updated in the database");
}
}
