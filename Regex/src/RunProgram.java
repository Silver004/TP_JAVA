import java.awt.Desktop;
import java.net.URI;
public class RunProgram {
    public static void main(String[] args) {
        try{
            Desktop.getDesktop().browse(new URI("https://google.com"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
