package sda;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Kolejki {
    public static void main(String[] args) {

            Shop sklep = new Shop();
        try {
            sklep.addToQue(new Klient("ania", 22));
            sklep.addToQue(new Klient("hania", 12));
            sklep.addToQue(new Klient("bania", 22));
            sklep.addToQue(new Klient("wania", 44));
            sklep.addToQue(new Klient("Dania", 22));
            sklep.addToQue(new Klient("Kania", 99));
        }catch(AgeExcept e){
            System.out.println("elo za mlody jestes");
        }catch(QueIsFull e){
            System.out.println("kolejka pelna");
        }


        System.out.println(sklep.kolejkaDoSklepu.size());

        sklep.addVIP(new Klient("Czesio",11));

        System.out.println(sklep.kolejkaDoSklepu.peekFirst().getName());
    }

}
class Klient{
    String imie;
    double wiek;

    Klient(String imie, double wiek){
        this.imie=imie;
        this.wiek=wiek;
    }
    public double getAge(){
        return wiek;
    }
    public String getName(){
        return imie;
    }
}
class Shop{
    Deque<Klient> kolejkaDoSklepu = new LinkedList<>();

    public void addVIP(Klient name){
        kolejkaDoSklepu.addFirst(name);
    }

    public void addToQue(Klient name) throws AgeExcept,QueIsFull{
        if (kolejkaDoSklepu.size() >= 3) {
            throw  new QueIsFull("kolejka za dluga");

        } else if(name.getAge()<18) {
            //throw new AgeExcept("jestes niepelnoletni");
        }else
            kolejkaDoSklepu.add(name);
        }


   public Klient serveCustomer(){
       return kolejkaDoSklepu.poll();
   }




}
