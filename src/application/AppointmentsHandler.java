package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppointmentsHandler {

		@FXML
	    private void Book_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Book_Appointment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	   
	    @FXML
	    private void Cancel_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Cancel_Appointment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	    @FXML
	    private void view_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("View_Appointment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	    @FXML
	    private void Reschedule_appointment(ActionEvent event) throws IOException {
	    	Parent CalenderView = FXMLLoader.load(getClass().getResource("Reschedule_Appointment.fxml"));
			Scene CalenderScene=  new Scene(CalenderView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(CalenderScene);
			window.setTitle("");
			window.show();
	    }
	    @FXML
	    private void home(ActionEvent event) throws IOException {
	    	Parent HomeView = FXMLLoader.load(getClass().getResource("Main_Menu.fxml"));
			Scene HomeScene=  new Scene(HomeView);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(HomeScene);
			window.setTitle("Main Menu");
			window.show();
	    }

}
