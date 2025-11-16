class Ogrenci {
    int id;
    String adi;
    String soyadi;
    String email;
    Ogrenci next;

    public Ogrenci(int id, String adi, String soyadi, String email) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.next = null;
    }
}

class OgrenciList {
    Ogrenci head;
    Ogrenci tail;

    // Başa ekle
    public void BasaOgrenciEkle(int id, String adi, String soyadi, String email) {
        Ogrenci newOgrenci = new Ogrenci(id, adi, soyadi, email);
        newOgrenci.next = head;
        head = newOgrenci;
        if (tail == null) {
            tail = newOgrenci;
        }
    }

    // Sona ekle
    public void SonaOgrenciEkle(int id, String adi, String soyadi, String email) {
        Ogrenci newOgrenci = new Ogrenci(id, adi, soyadi, email);
        if (head == null) {
            head = newOgrenci;
            tail = newOgrenci;
        } else {
            tail.next = newOgrenci;
            tail = newOgrenci;
        }
    }

    // Araya ekle
    public void ArayaOgrenciEkle(int id, String adi, String soyadi, String email, Ogrenci oncekiOgrenci) {
        if (oncekiOgrenci == null) {
            BasaOgrenciEkle(id, adi, soyadi, email);
            return;
        }
        Ogrenci newOgrenci = new Ogrenci(id, adi, soyadi, email);
        newOgrenci.next = oncekiOgrenci.next;
        oncekiOgrenci.next = newOgrenci;
        if (oncekiOgrenci == tail) {
            tail = newOgrenci;
        }
    }

    // Baştan sil
    public void BastanOgrenciSil() {
        if (head == null) {
            System.out.println("Liste boş!");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    // Sondan sil
    public void SondanOgrenciSil() {
        if (head == null) {
            System.out.println("Liste boş!");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Ogrenci temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    // Aradan sil
    public void AradanOgrenciSil(Ogrenci oncekiOgrenci) {
        if (oncekiOgrenci == null || oncekiOgrenci.next == null) {
            System.out.println("Silinecek öğe bulunamadı.");
            return;
        }
        if (oncekiOgrenci.next == tail) {
            tail = oncekiOgrenci;
        }
        oncekiOgrenci.next = oncekiOgrenci.next.next;
    }

    // Belirli indisteki düğümü getir
    public Ogrenci getNodeAt(int index) {
        Ogrenci temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) return temp;
            temp = temp.next;
            count++;
        }
        return null;
    }

    // Listeyi yazdır
    public void Yazdir() {
        Ogrenci temp = head;
        System.out.println("Liste:");
        while (temp != null) {
            System.out.println(temp.id + " -> " + temp.adi + " -> " + temp.soyadi + " -> " + temp.email);
            temp = temp.next;
        }
        System.out.println("null");
    }
}




