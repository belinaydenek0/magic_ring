//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
class Lesson1_Practices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1-- ÇAY -- 5 TL");
        System.out.println("2-- KAHVE -- 10 TL");
        System.out.println("3-- TATLI -- 20 TL");

        System.out.println("Kaç ürün seçeceksiniz:");
        int secim=sc.nextInt();
        int tutar=0;

        if(secim==1){
            System.out.println("Almak istediğiniz ürünü giriniz:");
            int secim2=sc.nextInt();
            switch(secim2){
                case 1:
                    tutar = 5;
                    System.out.println("Tutar: "+tutar);
                    break;
                case 2:
                    tutar = 10;
                    System.out.println("Tutar: "+tutar);
                    break;
                case 3:
                    tutar = 20;
                    System.out.println("Tutar: "+tutar);
                    break;
            }
        }
        if (secim ==2){
            System.out.println("Almak istediğiniz ilk ürünü giriniz:");

            int secim3=sc.nextInt();
            switch(secim3){
                case 1:
                    tutar=5;
                    break;
                case 2:
                    tutar=10;
                    break;
                case 3:
                    tutar=20;
                    break;
            }
            System.out.println("Almak istediğiniz ikinci ürünü giriniz:");
            int secim4=sc.nextInt();
            switch(secim4){
                case 1:
                    tutar=tutar+5;
                    System.out.println("Tutar: "+tutar);
                    break;
                case 2:
                    tutar=tutar+10;
                    System.out.println("Tutar: "+tutar);
                    break;
                case 3:
                    tutar=tutar+20;
                    System.out.println("Tutar: "+tutar);
                    break;
            }
        }
        if (secim ==3){
            System.out.println("Almak istediğiniz ilk ürünü giriniz:");
            int secim5=sc.nextInt();
            switch(secim5) {
                case 1:
                    tutar = 5;
                    break;
                case 2:
                    tutar = 10;
                    break;
                case 3:
                    tutar = 20;
                    break;
            }
            System.out.println("Almak istediğiniz ikinci ürünü giriniz:");
            int secim6=sc.nextInt();
            switch(secim6){
                case 1:
                    tutar=tutar+5;
                    break;
                case 2:
                    tutar=tutar+10;
                    break;
                case 3:
                    tutar=tutar+20;
                    break;
            }
            System.out.println("Almak istediğiniz üçüncü ürünü giriniz:");
            int secim7=sc.nextInt();
            switch(secim7){
                case 1:
                    tutar=tutar+5;
                    System.out.println("Tutar: "+tutar);
                    break;
                case 2:
                    tutar=tutar+10;
                    System.out.println("Tutar: "+tutar);
                    break;
                case 3:
                    tutar=tutar+20;
                    System.out.println("Tutar: "+tutar);
                    break;
            }
        }
        if (tutar>50)
        {
            tutar=tutar-tutar*1/10;
        }
        System.out.println("Toplam Tutar= "+tutar);


        }
    }

