/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Contoller;

import Model.loginPage;
import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private void BtnLogin(ActionEvent event) {
                try {
                    ViewManager.openConverterPage();
                    ViewManager.closeloginPage();
                } catch (IOException ex) {
                    Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    

