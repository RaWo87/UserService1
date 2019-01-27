package sda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    private User[] uzytkownicy = new User[5];
    private int count = 0;
    private ArrayList<User> moiUserzy = new ArrayList<>();



    private Map<Integer,User> mapaUserow = new HashMap<>();
    private int userIDs = 1;

    public void removeByName(String userName) {
        for (User currentUser : mapaUserow.values()) {
            if(currentUser.getImie().equals(userName)){
            mapaUserow.remove(currentUser);
            }
            if(currentUser.getNazwisko().equals(userName)){
                mapaUserow.remove(currentUser);
            }


            }
    }

    public void addToMap(User user) {
        boolean brakduplikatów = true;
        if (mapaUserow.isEmpty()) {
            mapaUserow.put(this.userIDs, user);
            userIDs++;
        } else {
            for (User currentUser : mapaUserow.values()) {
                if (currentUser.getEmail().equals(user.getEmail())) {
                    brakduplikatów=false;
                }
            }
            if(brakduplikatów == true){
                mapaUserow.put(this.userIDs, user);
                userIDs++;
            }
        }
    }

    public User getUserByID(int id){

        return mapaUserow.get(id);
    }
    public List<User> getYounger(){
        List<User> tempList = new ArrayList<>();
        for(User currentUser: mapaUserow.values()){
            if(currentUser.getAge() <18){
                tempList.add(currentUser);
            }
        }
        return tempList;
    }

    public Map<String,Integer> getOlder(){
        Map<String,Integer> tempMap = new HashMap<>();

        for(User currentUser: mapaUserow.values()){
            if(currentUser.getAge() >=18){
                tempMap.put(currentUser.getImie(), currentUser.getAge());
            }

        }
        return tempMap;
    }





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
