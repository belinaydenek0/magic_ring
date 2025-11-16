import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SarkiListesi list = new SarkiListesi();
        Scanner input = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n--- Şarkı Listesi Menüsü ---");
            System.out.println("0. Çıkış");
            System.out.println("1. Başa Şarkı Ekle");
            System.out.println("2. Sona Şarkı Ekle");
            System.out.println("3. Araya Şarkı Ekle");
            System.out.println("4. Baştan Şarkı Sil");
            System.out.println("5. Sondan Şarkı Sil");
            System.out.println("6. Aradan Şarkı Sil");
            System.out.println("7. Şarkı Listesini Yazdır");

            System.out.print("Seçiminiz: ");
            secim = input.nextInt();
            input.nextLine(); // buffer temizliği

            switch (secim) {
                case 1:
                    System.out.print("Şarkı adı giriniz: ");
                    String ad = input.nextLine();
                    System.out.print("Sarkici adi giriniz: ");
                    String ad1 = input.nextLine();

                    list.BasaSarkiEkle(ad, ad1);
                    System.out.println("Başa ekleme yapıldı.");

                    list.Yazdir();
                    break;

                case 2:
                    System.out.print("Şarkı adı giriniz: ");
                    String sonad = input.nextLine();
                    System.out.print("Sarkici adi giriniz: ");
                    String sonad1 = input.nextLine();

                    list.SonaSarkiEkle(sonad, sonad1);
                    System.out.println("Sona ekleme yapıldı.");

                    list.Yazdir();
                    break;

                case 3:
                    System.out.print("Kaçıncı düğümden sonra eklemek istiyorsunuz (0 tabanlı): ");
                    int index = input.nextInt();
                    input.nextLine();
                    System.out.print("Şarkı adı giriniz: ");
                    String araad = input.nextLine();
                    System.out.print("Sarkici adi giriniz: ");
                    String araad1 = input.nextLine();
                    Song onceki = list.getNodeAt(index);

                    list.ArayaSarkiEkle(onceki, araad, araad1);
                    System.out.println("Araya ekleme yapıldı.");

                    list.Yazdir();
                    break;

                case 4:
                    list.BastanSarkiSil();

                    System.out.println("Baştan silindi.");

                    list.Yazdir();
                    break;

                case 5:
                    list.SondanSarkiSil();

                    System.out.println("Sondan silindi.");

                    list.Yazdir();
                    break;

                case 6:
                    System.out.print("Kaçıncı düğümden sonra silmek istiyorsunuz (0 tabanlı): ");
                    int silIndex = input.nextInt();
                    input.nextLine();
                    Song prevSil = list.getNodeAt(silIndex);
                    list.AradanSarkiSil(prevSil);

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
