/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed
 */
public class ConverterPage extends Stage {

    private Scene ConverterPage;

    public ConverterPage() throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("Converter.fxml"));
        ConverterPage = new Scene(p);
        this.setScene(ConverterPage);
        this.setTitle("Login Page");
    }

}
