
package View;

import Model.ConverterPage;
import Model.loginPage;
import java.io.IOException;

/**
 *
 * @author Ahmed
 */
public class ViewManager {
    public static loginPage loginPage;
    public static ConverterPage ConverterPage;
    
    
    private ViewManager(){   
    }
    
    public static void openloginPage() throws IOException{
        if (loginPage == null) {
            loginPage = new loginPage();
            loginPage.show();
        } else {
            loginPage.show();
        }
        
    }
    public static void closeloginPage(){
        if(loginPage != null)
            loginPage.close();
    }
    
    public static void openConverterPage() throws IOException{
        if (ConverterPage == null) {
            ConverterPage = new ConverterPage();
            ConverterPage.show();
        } else {
            ConverterPage.show();
        }
        
    }
    public static void closeConverterPage(){
        if(ConverterPage != null)
            ConverterPage.close();
    }
}
