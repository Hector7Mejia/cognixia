import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class UserDataApp {

    ArrayList<Users> al = new ArrayList<Users>();

    public static void main(String[] args) {

        new UserDataApp().printData();
    }

    public void printData() {
        loadUsers();
        //Collections.sort(al.new NameCOmp());
        for (Users users : al)
            System.out.println(users);
    }

    private void loadUsers() {
        try {
            File file = new File("users.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                addUsers(line);
            }


        } catch (Exception e) {
        }
    }

    private void addUsers(String parseData) {

        String[] tokens = parseData.split("/");
        Users users = new Users(tokens[0], tokens[1], tokens[2], tokens[3]);
        al.add(users);
    }
}