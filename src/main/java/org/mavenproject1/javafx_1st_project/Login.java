package org.mavenproject1.javafx_1st_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;

public class Login {
    public Login(){

    }

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @FXML
    private PasswordField pwField;

    @FXML
    private Label wrongPassword;


    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication m= new HelloApplication();

        if (textField.getText().toString().equals("Herve Only")
                && pwField.getText().toString().equals("NeverSayNever")){
            wrongPassword.setText("You have Successfully Logged In");

            m.changeScene("AfterLogin.fxml");

        }
        else if (textField.getText().isEmpty() || pwField.getText().isEmpty()) {
            wrongPassword.setText("Please Enter Your Credentials");

        }
        else  {

             wrongPassword.setText("Wrong Username or Password");
        }
    }
}
