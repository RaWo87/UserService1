package sda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        User user1 = new User();
        user1.setHaslo("tajne");
        user1.setImie("andzej");
        user1.setLogin("andrzej111");
        user1.setNazwisko("kowalski");

        User user2 = new User();
        user2.setHaslo("nietajne");
        user2.setImie("maciek");
        user2.setLogin("maciek111");
        user2.setNazwisko("nowak");

        User user3 = new User();
        user3.setHaslo("qwerty");
        user3.setImie("tomek");
        user3.setLogin("tomek111");
        user3.setNazwisko("duda");


        UserService usluga = new UserService();
        usluga.addUser(user1);
        usluga.addUser(user2);
        usluga.addUser(user3);
        usluga.printALL();

        user1.toString();
    }
}
