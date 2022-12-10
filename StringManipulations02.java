package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Ex 1 : Bir Stringdeki SPACE hariç kaç tane karakter kullanıldığını gösteren kodu yazınız
        //"Ali okula gitti."

        String str = "Ali okula gitti.";
        //replace() methodu bir Strinteki herhangi bir karakteri veya karakterleri değiştirmek için kullanılır
        int num = str.replace(" ","").length();
        System.out.println(num);

        //Ex 2: Bir stringteki tüm 'a' harflerini 'A' ya çeviriniz.

        String str2 = "Ankara'nın tasina gozlerimin yasina bak.";
        String newStr = str2.replace("a","A");
        System.out.println(newStr);

        //Ex 3: Bir stringteki "kara" kelimelerinin yerine "*" koyunuz

        String str3 = "Kara kara düşünme Ankara";
        String yeniS = str3.replace("kara", "*");
        System.out.println(yeniS);//Kara * düşünme An*

        //Ex 3: Bir stringteki tüm sayıları '*' a çeviriniz

        String stdId = "AC202112004";
        String newStdId = stdId.replaceAll("[0-9]","*");
        System.out.println(newStdId);

        /*
        Bir grup data yı ifade eden kodlara "Regex" denir.
        "Regex" Regular Expressions in kisaltilmis halidir.
        1) Tüm rakamlar ==> [0-9]
        2) Tüm küçük harfler ==> [a-z]
        3) Tüm büyük harfler ==> [A-Z]
        4) Tüm harfler ==> [a-zA-Z]
        5) Sesli harfler ==> [aeiouAEIOU]
        6) Space ==> [ ]
        7) Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
        8) Tüm noktalama işaretleri ==> \\p{Punct}

        Hariç olma

        1) Tüm rakamlar ==> [^0-9]
        2) Tüm küçük harfler ==> [^a-z]
        3) Tüm büyük harfler ==> [A-Z]
        4) Tüm harfler ==> [^a-zA-Z]
        5) Sesli harfler ==> [^aeiouAEIOU]
        6) Space ==> [^ ]




         */

        //Ex 5 :Verilen bir Stringte kullanılan noktalama işareti, rakamlar ve spacel karakteri haric
        // kalan cümleyi ve tüm karakterlerin sayisini bulan kodu yazınız.

        String u = "Ali 13 yaşında, dersem inanma!...";
        String newU = u.
                replaceAll("[0-9]","" ).
                replace(" ", "").
                replaceAll("\\p{Punct}","");
        int numOfU = newU.length();


        System.out.println(newU + " \nKarakter sayısı:" + numOfU);

        //Ex 6 : Bir password un geçerli olup olmadığını aşağıdaki kurallara göre test eden kodu yazınız
        /*
        i-  Space hariç en az sekiz karakter olmalı
        ii- En az bir sembol içermeli
        iii-En az 1 rakam içermeli
        iv- En az 1 büyük harf içermeli
        v-  En az 1 küçük harf içermeli
        */

        String pwd = "B78c? K!m";
        boolean first = pwd.replace(" ", "").length()>7;
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGeçerli = first && second && third && fourth && fifth;
        if (pwdGeçerli){
            System.out.println("Password Geçerli");
        }else  {
            System.out.println("Password Geçerli Değil");
        }


        //Ex 7: Bir Stringteki noktalama işaretleri hariç karakter sayısını gösteren kodu yazınız.
        String cumle = "sen |£#½?";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);

        //Ex 8 : Verilen bir String "Al" ile başlıyor ve "x" ile bitiyorsa ekrana "Harika" yazdırın
        //Aksi halde "Normal" yazdırın.

        String v = "Alex";
        boolean başlangıç = v.startsWith("Al");
        boolean son = v.endsWith("x");
        String result = başlangıç && son ? "Harika" : "Normal";
        System.out.println(result);






    }
}
