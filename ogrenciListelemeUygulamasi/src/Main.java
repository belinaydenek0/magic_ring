import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OgrenciList list = new OgrenciList();
        Scanner input = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n--- Öğrenci Listesi Menüsü ---");
            System.out.println("0. Çıkış");
            System.out.println("1. Başa Öğrenci Ekle");
            System.out.println("2. Sona Öğrenci Ekle");
            System.out.println("3. Araya Öğrenci Ekle");
            System.out.println("4. Baştan Öğrenci Sil");
            System.out.println("5. Sondan Öğrenci Sil");
            System.out.println("6. Aradan Öğrenci Sil");
            System.out.println("7. Öğrenci Listesini Yazdır");

            System.out.print("Seçiminiz: ");
            secim = input.nextInt();
            input.nextLine(); // buffer temizliği

            switch (secim) {
                case 1:
                    System.out.print("İd giriniz: ");
                    int id1 = input.nextInt();
                    input.nextLine();
                    System.out.print("Ad giriniz: ");
                    String ad1 = input.nextLine();
                    System.out.print("Soyad giriniz: ");
                    String soyad1 = input.nextLine();
                    System.out.print("Email giriniz: ");
                    String email1 = input.nextLine();
                    list.BasaOgrenciEkle(id1, ad1, soyad1, email1);

                    System.out.println("Başa ekleme yapıldı.");

                    list.Yazdir();
                    break;

                case 2:
                    System.out.print("İd giriniz: ");
                    int id2 = input.nextInt();
                    input.nextLine();
                    System.out.print("Ad giriniz: ");
                    String ad2 = input.nextLine();
                    System.out.print("Soyad giriniz: ");
                    String soyad2 = input.nextLine();
                    System.out.print("Email giriniz: ");
                    String email2 = input.nextLine();
                    list.SonaOgrenciEkle(id2, ad2, soyad2, email2);

                    System.out.println("Sona ekleme yapıldı.");

                    list.Yazdir();
                    break;

                case 3:
                    System.out.print("Kaçıncı düğümden sonra eklemek istiyorsunuz (0 tabanlı): ");
                    int index = input.nextInt();
                    input.nextLine();
                    System.out.print("İd giriniz: ");
                    int id3 = input.nextInt();
                    input.nextLine();
                    System.out.print("Ad giriniz: ");
                    String ad3 = input.nextLine();
                    System.out.print("Soyad giriniz: ");
                    String soyad3 = input.nextLine();
                    System.out.print("Email giriniz: ");
                    String email3 = input.nextLine();
                    Ogrenci onceki = list.getNodeAt(index);
                    list.ArayaOgrenciEkle(id3, ad3, soyad3, email3, onceki);

                    System.out.println("Araya ekleme yapıldı.");

                    list.Yazdir();
                    break;

                case 4:
                    list.BastanOgrenciSil();

                    System.out.println("Baştan silindi.");

                    list.Yazdir();
                    break;

                case 5:
                    list.SondanOgrenciSil();

                    System.out.println("Sondan silindi.");

                    list.Yazdir();
                    break;

                case 6:
                    System.out.print("Kaçıncı düğümden sonra silmek istiyorsunuz (0 tabanlı): ");
                    int silIndex = input.nextInt();
                    input.nextLine();
                    Ogrenci prevSil = list.getNodeAt(silIndex);
                    list.AradanOgrenciSil(prevSil);

                    System.out.println("Aradan silindi.");

                    list.Yazdir();
                    break;

                case 7:
                    list.Yazdir();
                    break;

                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız!");
                    break;
            }
        } while (secim != 0);

        input.close();
    }
}


