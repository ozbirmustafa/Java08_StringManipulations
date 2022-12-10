package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Ex 1: kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yansıtınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String isim = scan.next();
        char ilkHarf =isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);
        // yazdığınız code sadece bazı durumlar için çalışırsa = "Hard Coding"
        // Her durum için çalırsa "Dynamic Code"
        System.out.println("\"İlk Harf\" " + ilkHarf +  " \"Son Harf\" " + sonHarf);

        //2.Yol

        String ilk =isim.substring(0,1);
        String son = isim.substring(isim.length()-1);
        System.out.println("==>İlk Harf: " + ilk + " ==>Son Harf: " + son );

        //substring kullanınca ilk index dahil ikinci index dahil değil

        /*
        Ex 2: Verilen stringteki tüm hayvan isimlerini ekrana yazdırınız.
        "Ben kedi, eşim tavuk, oğlum sever inek "
         */
        String str = "Ben kedi, eşim tavuk, oğlum sever inek ";

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34);
        /*
        substring in iki kullanımı vardır.
        i)substring(başlangıç indexi, bitiş indexi) String in ortasından bir parça almaya yarar
        ii)substring(başlangıç indexi) String in verilen index ten sonuna kadar almaya yarar

         */
        System.out.println("" + kedi + tavuk + kedi);

        //Ex 3 : İlk İsmi ve soyismi içeren isimlerden ilk ve soyisimlerin baş harflerini ekrana yazdırınız.


        Scanner scan1 = new Scanner(System.in);
        System.out.println("İlk ve Soyisminizi Giriniz");
        String tamIsim = scan1.nextLine();
        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a + b);



    }

}


