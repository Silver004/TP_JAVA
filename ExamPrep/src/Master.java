import java.io.FileNotFoundException;
import java.io.IOException;

public class Master {
    String doFileStuff() throws FileNotFoundException {
        return "a";
    }
}
class Slave extends Master {
    public static void main(String[] args) {
        String s = null;
        try {
            s = new Slave().doFileStuff();
        } catch ( Exception x) {
            s = "b";
        }
        System.out.println(s);
    }
    //String doFileStuff() { return "b"; }
    //String doFileStuff() throws IOException { return "b"; }
    //String doFileStuff(int x) throws IOException { return "b"; }
    String doFileStuff() throws FileNotFoundException { return "b";}
}
