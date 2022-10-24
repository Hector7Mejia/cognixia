import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("userdata.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Users user=(Users)ois.readObject();

        System.out.println(user);
    }
}
