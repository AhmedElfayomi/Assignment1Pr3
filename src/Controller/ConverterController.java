
package Controller;

import View.ConverterPage;
import Model.CurrencyConverter;
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
public class ConverterController implements Initializable {

    @FXML
    private Button logout;
    @FXML
    private TextField TfUSD;
    @FXML
    private TextField TfNIS;
    @FXML
    private Button Convert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BtnLogout(ActionEvent event) {
        try {
            ViewManager.closeConverterPage();
            ViewManager.openloginPage();
        } catch (IOException ex) {
            Logger.getLogger(ConverterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void BtnConvert(ActionEvent event) {
        if (!TfUSD.getText().isEmpty() && TfNIS.getText().isEmpty()) {
                double USD = Double.parseDouble(TfUSD.getText());
                double ILS = CurrencyConverter.convertToILS(USD);
                TfNIS.setText(String.format("%.2f", ILS));
            } else if (!TfNIS.getText().isEmpty() && TfUSD.getText().isEmpty()) {
                double ILS = Double.parseDouble(TfNIS.getText());
                double USD = CurrencyConverter.convertToUSD(ILS);
                TfUSD.setText(String.format("%.2f", USD));
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Please Fill in one of the TextFields");
                alert.showAndWait();
            }
    }

}
