package sda;

import java.util.ArrayList;

public class UserService {

    private User[] uzytkownicy = new User[5];
    private int count = 0;
    private ArrayList<User> moiUserzy = new ArrayList<>();

    public  void addUserL(User user){
        moiUserzy.add(user);
    }
    public ArrayList<User> getAllUsers(){
        return moiUserzy;
    }

    public void addUser(User user) {
        uzytkownicy[count++] = user;
    }

    public void printALL() {
        for (int i = 0; i < uzytkownicy.length; i++) {
            if(uzytkownicy[i]==null)continue;
            System.out.println(uzytkownicy[i].toString());
        }
    }


}
