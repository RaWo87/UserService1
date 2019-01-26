package sda;

import java.util.ArrayList;
import java.util.List;

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
        //usluga.printALL();

        user1.toString();

        Listy lista = new Listy();

        List<User> listaUserow = new ArrayList<>();
        listaUserow.add(user1);
        listaUserow.add(user2);
        listaUserow.add(user3);

        System.out.println(listaUserow);

        UserService usluga2 = new UserService();
        usluga2.addUserL(user3);
        usluga2.addUserL(user2);
        usluga2.addUserL(user1);

        System.out.println(usluga2.getAllUsers());
    }
}
