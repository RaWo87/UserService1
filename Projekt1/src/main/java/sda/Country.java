package sda;

public class Country {
    private String countryName;
    private String capitol;
    private double population;

    Country(String CN, String CP, double Popul){
        this.countryName = CN;
        this.capitol = CP;
        this.population = Popul;
    }
    Country(){

    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", capitol='" + capitol + '\'' +
                ", population=" + population +
                '}';
    }

    public String getCountryName(){
     return    countryName;
    }
    public String getCountryCapital(){
        return    capitol;
    }
    public double getCountryPop(){
        return    population;
    }


}
