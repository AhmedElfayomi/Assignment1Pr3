/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import View.LoginPage;
import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ahmed
 */
public class LoginController implements Initializable {

    @FXML
    private TextField textUsername;
    @FXML
    private TextField textPassword;
    @FXML
    private Button login;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BtnLogin(ActionEvent event) throws IOException {
        if (textUsername.getText().equals("admin") && textPassword.getText().equals("admin")) {
                ViewManager.openConverterPage();
                ViewManager.closeloginPage();
        } else {
              Alert alert = new Alert(Alert.AlertType.ERROR, "UserName Or Password incorrect");
                alert.showAndWait();
        }
        
    }
    
}
