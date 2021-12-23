/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_mayafop;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.Initializable;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import java.net.URL;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
/**
 *
 * @author Ming
 */
public class login_controller implements Initializable,ControlledScreen{
    ScreenController myController;
    @FXML
    private Button exit_button;
    @FXML
    private Label login_message_label;
    @FXML
    private ImageView logoImageView;
    @FXML
    private TextField username_text_field;
    @FXML
    private PasswordField password_field;
    @FXML
    private Button signup_button; 
    @FXML
    private BorderPane loginScreen;
    
    Stage home_stage;
    Scene home_scene;
    Parent home_root;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
    int validated = 1; 
    public void login_button_on_action(ActionEvent event) throws IOException {
        //Click on login button
        if(username_text_field.getText().isEmpty() == false && password_field.getText().isEmpty() == false) {
            validate_login();
        } else {
            login_message_label.setText("Please enter username and password.");
        }
        //Create home page
        
        if(validated == 1){
            myController.setScreen(Assignment_MayaFOP.controlCenter);
            validated =0;
//            myController.unloadScreen(Assignment_MayaFOP.loginScreen);
        }
    }
    
    public void exit_button(ActionEvent event) {
        //Click on exit button to exit
        Stage stage = (Stage) exit_button.getScene().getWindow();
        stage.close();
        
    }
    

    public void validate_login(){
        //Verify the information match with database ot not
        database_connection connectNow = new database_connection();
        Connection connectDB = connectNow.getConnection();
        
        String verify_login = "SELECT COUNT(1) FROM student WHERE matric_num='" + username_text_field.getText() + "' AND password='" + password_field.getText() + "';";
        
        try {
            Statement statement = connectDB.createStatement();
            ResultSet query_result = statement.executeQuery(verify_login);
            
            while(query_result.next()) {
                if(query_result.getInt(1) == 1) {
                    //login_message_label.setText("Congratulations!");
                    validated = 1;
                }else {
                    login_message_label.setText("Invalid login. Please try again.");
                }
                
                
            }
            
        } catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    
    public void sign_up_button_on_action(ActionEvent event) {
        //Codes to open signup page
        try {
            BoxBlur boxBlur = new BoxBlur();
            boxBlur.setWidth(10);
            boxBlur.setHeight(10);
            boxBlur.setIterations(3);
            loginScreen.setEffect(boxBlur);
            Stage signup = new Stage();
            myController.showPopupStage("/assignment_MayaFOP/signupStudent.fxml" );
            if (!myController.showing) {
                loginScreen.setEffect(null);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    @Override
    public void setScreenParent(ScreenController screenParent) {
        myController = screenParent; //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}
