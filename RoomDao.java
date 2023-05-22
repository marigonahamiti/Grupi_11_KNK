import java.util.ArrayList;
import java.util.List;
public interface RoomDao{
public List<Room> getAllRooms();
public Room getRoom(int Number);
public void updateRoom(Room room);
public void deleteRoom(Room room);
}
