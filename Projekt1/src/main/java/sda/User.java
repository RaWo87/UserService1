package sda;

public class User {
    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setHaslo(String haslo){
        this.haslo = haslo;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getLogin(){
        return login;
    }

    public String getHaslo(){
        return haslo;
    }

}
