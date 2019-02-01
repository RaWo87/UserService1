package com.company.ZadaniaDomowe;

import java.util.*;

import static java.lang.Double.MIN_VALUE;

public class Algorytmy {
    //###ZAD 1

    protected String toUpperCases(String tekst){
        return tekst.toUpperCase();
    }
    //###ZAD 2

    protected Double biggestNumber(Set<Double> numb) {
        double min = Double.MIN_VALUE;
        double resault = 0;

        for (Double liczba : numb) {
            resault = Math.max(liczba, min);
        }
        return resault;
    }
    //###ZAD 3

    protected Double smallestNumber(Set<Double> numb) {
        double max = Double.MIN_VALUE;
        double resault = 0;

        for (Double liczba : numb) {
            resault = Math.max(liczba, max);
        }
        return resault;
    }
    //###ZAD 4

    protected Set<Double> modulo3(Set<Double> set){
        Set<Double> resault = new HashSet<>();
        for (Double num: set
             ) {
            if(num %3 == 0){
                resault.add(num);
            }
        }
        return resault;
    }
    //###ZAD 5

    protected Set<Double> custoModulo(Set<Double> set, int modulo) {
        Set<Double> resault = new HashSet<>();
        for (Double num : set
        ) {
            if (num % modulo == 0) {
                resault.add(num);
            }
        }
        return resault;
    }
    //###ZAD 6
    protected  List<Integer> returnOdd(int a, int b){
        List<Integer> resault = new ArrayList<>();
        if(a>b){
            int tmp=a; a=b; b=tmp;
        }
        for (int i = a; i <= b; i++) {
            if(i%2!=0){
                resault.add(i);
            }
        }
        return resault;
    }
    //###ZAD7 liczby pierwsze
    protected  List<Integer> returnPrime(int a, int b){
        // pola pomocnicze
        List<Integer> resault = new ArrayList<>();
        boolean isPrime;
        //warunek zmieniajacy kolejnosc iterowania
        if(a>b){ int tmp=a; a=b; b=tmp; }

        for (int i = a; i <= b; i++) {
            isPrime=true;
            for(int j=2; j <i; j++){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime)resault.add(i);
        }
        return resault;
    }
    //###ZAD 8 liczenie slow
    protected int countWords(String tekst){
        if(tekst.isEmpty())return 0;

        tekst=tekst.trim();
        ArrayList<String> words = new ArrayList<>();
        for (String word: tekst.split(" +")
             ) {
            words.add(word);
        }
        return words.size();
    }
    //###ZAD 9 ilosc liter

    protected int countLetters(String tekst) {
        if (tekst.isEmpty()) return 0;
        tekst = tekst.trim();
        tekst = tekst.replaceAll(" ", "");

        return tekst.length();
    }
    //###ZAD 10 samogloski i spolgloski

    protected int[]  ConsonantOrVowel(String tekst){
        int[] resault = new int[2];
        Set<String> con = new HashSet<>();
        Set<String> vow = new HashSet<>();
       String samo = "aeiouy";
       String wspol = "bcdghjklmnprstvwxz";


        return resault;
    }
}
