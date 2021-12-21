package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PatientViewController implements Initializable{

	@FXML
    private TableColumn<Patient, Integer> IDcolumn;

    @FXML
    private TableColumn<Patient,String> EmailColumn;

    @FXML
    private TableView<Patient> PatientView;

    @FXML
    private TableColumn<Patient, String> CNICColumn;

    @FXML
    private TableColumn<Patient,String> NameColumn;

    @FXML
    private TableColumn<Patient, Integer> AgeColumn;
    @FXML
    private Button deleteButton;

    @FXML
    private Button modifyButton;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTextField;

    @FXML
    private Label titleLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Patient> patient = FXCollections.observableArrayList(
        new Patient(9,20,"Moosa", "12345678","moosa@gmail.com"),
                new Patient(10,21,"Zainab", "45565556", "zainab@gmail.com"),
                new Patient(11,20,"Rafia", "57543535", "rafia@gmail.com")
            );
        //int id, int age, String name, String cnic, String email
    

        IDcolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        AgeColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        CNICColumn.setCellValueFactory(new PropertyValueFactory<>("cnic"));
        EmailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        //add your data to the table here.
        PatientView.setItems(patient);
    }
    
    @FXML
    void handleDeleteButton(ActionEvent event) {

    }

    @FXML
    void handleModifyButton(ActionEvent event) {

    }

    @FXML
    void handleSearchButton(ActionEvent event) {

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
