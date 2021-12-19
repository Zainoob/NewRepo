package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PaymentHandler {
	
	@FXML
	Button Pay;

	@FXML
    private void Payment() throws IOException {
		Stage stage = (Stage) Pay.getScene().getWindow();
 	     
	    stage.close();

	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Payment_done.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
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
