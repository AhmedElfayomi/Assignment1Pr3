
package Model;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Ahmed
 */
public class loginPage extends Stage {

    private Scene login;

    public loginPage() throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        login = new Scene(p);

    }

}
