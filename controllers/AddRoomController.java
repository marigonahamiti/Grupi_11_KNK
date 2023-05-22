package sample.projectknk.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.projectknk.database.DBConnection;
import sample.projectknk.Room;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import static sample.projectknk.controllers.RoomController.roomList;
import static sample.projectknk.controllers.RoomController.rooms;

public class AddRoomController implements Initializable {

    @FXML
    private Button add;

    @FXML
    private TextField number;

    @FXML
    private TextField price;

    @FXML
    private TextField type;

    private Connection connection;

    private DBConnection dbConnection;

    private PreparedStatement pst;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
    }

    public void handleAddAction(javafx.event.ActionEvent actionEvent) {
        String query = "INSERT INTO rooms (roomNumber, roomType, price) VALUES (?,?,?)";
        try {
            pst = connection.prepareStatement(query);
            pst.setString(1, number.getText());
            pst.setString(2, type.getText());
            pst.setString(3, price.getText());
            roomList.add(new Room(Integer.parseInt(number.getText()), Integer.parseInt(price.getText()), type.getText(), "Not Booked"));
            rooms.add(new Room(Integer.parseInt(number.getText()), Integer.parseInt(price.getText()), type.getText(), "Not Booked"));
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
