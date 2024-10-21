package org.mavenproject1.javafx_1st_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logoutBtn;

public  void userLogout() throws IOException {
    HelloApplication application = new HelloApplication();
    application.changeScene("hello-view.fxml");
    }
}
