import java.io.*;

public class Userserial {
    public static void main(String[] args) throws IOException {
        Users users = new Users("sam", "sam@mail.com", "Manager", "florida");
        System.out.println(users);

        FileOutputStream fos = new FileOutputStream("users.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(users);
        System.out.println("user data added");

    }
}
