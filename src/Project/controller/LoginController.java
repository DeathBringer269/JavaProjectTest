package Project.controller;

import Project.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {
    
    Stage stage = MainApp.stage;

    @FXML
    private Label fielderrorlabel;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button signinbutton;

    @FXML
    private Button backtohome;

    @FXML
    private Button teacherbutton;

    @FXML
    private Button studentbutton;
    
    //1 indicates that teacher is selected
    int set = 1;

    @FXML
    void onClick(MouseEvent event) {
        //switch scene
        if(username.getText().isEmpty()){
            fielderrorlabel.setText("Username cannot be empty!");
        }
        else if(password.getText().isEmpty()) {
            fielderrorlabel.setText("Password cannot be empty!");
        }
        else {
            fielderrorlabel.setText("");
            //connect to database
            if(set == 1) {
                //check credentials
                //switch to teacher scene
            }
            else {
                //check credentials
                //switch to APPROPRIATE student scene
            }
        }
    }

    @FXML
    void onKeyPress(KeyEvent event) {
        
        //Testing for keyevent !!DO NOT REMOVE
        /*        String type = event.getEventType().getName();
        
        // Get the KeyCode of the Event
        KeyCode keyCode = event.getCode();
        
        // Log the Information
        System.out.println(type + ": Key Code=" + keyCode.getName() +
        ", Text=" + event.getText()+"\n");*/
         
        if(event.getCode() == KeyCode.ENTER) {
            //switch scene
        }
    }
    
    @FXML
    void onClicktoBack(MouseEvent event) {
        MainApp mainapp = new MainApp();
        Scene scene = mainapp.setHomePage();
        stage.setScene(scene);
        stage.setResizable(false);
    }

    @FXML
    void onSetStudent(MouseEvent event) {
        //setting default to student
        studentbutton.setDefaultButton(true);
        teacherbutton.setDefaultButton(false);
        set = 0;
    }

    @FXML
    void onSetTeacher(MouseEvent event) {
        //setting default to teacher
        teacherbutton.setDefaultButton(true);
        studentbutton.setDefaultButton(false);
        set = 1;
    }    
    
}
