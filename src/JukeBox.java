import java.io.*;
import java.util.ArrayList;

public class JukeBox {

    ArrayList<Songs> al = new ArrayList<Songs>();

    public static void main(String[] args) {

        new JukeBox().printData();
    }

    public void printData() {
        loadSongs();
        for (Songs users : al)
            System.out.println(users);
    }

    private void loadSongs() {
        try {
            File file = new File("songs.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                loadSongs(line);
            }
        } catch (Exception e) {
        }
    }


    private void loadSongs(String parseData) throws IOException {

        String[] tokens = parseData.split("/");
        Songs users = new Songs(tokens[0], tokens[1], tokens[2], tokens[3]);
        al.add(users);
        FileOutputStream fos = new FileOutputStream("users.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(al);
        System.out.println("user data added");
//        JukeBox it = new JukeBox();
//        it.printData();
    }
}
