package application;
	
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;




public class Main extends Application
{
    static int num=11;
	@Override
    public void start(Stage stage) throws Exception {
		/*
		System.out.println("HIB started");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//hibernateload();
		//creating Patient
		Patient pat = new Patient();
		++num;
		pat.setId(num);
		pat.setAge(20);
		pat.setName("Zainab");
		pat.setCnic("1111111111111");
		pat.setEmail("zainoob@yahoo.com");
		System.out.println(pat);
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(pat);
		session.getTransaction().commit();
		
		session.close();
		*/
		
		//System.out.println(factory);
		//System.out.println(factory.isClosed());
		
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("MEDICSi Health Care");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}