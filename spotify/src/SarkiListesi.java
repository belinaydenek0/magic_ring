class Song {
    String sarkiAdi;
    String sarkiciAdi;
    Song next;

    public Song(String name, String artist) {
        this.sarkiAdi = name;
        this.sarkiciAdi = artist;
        this.next=null;
    }
}

public class SarkiListesi {

    Song head;
    Song tail;

    //basa sarki ekleme
    public void BasaSarkiEkle(String sarkiAdi, String sarkiciAdi) {
        Song newsong = new Song(sarkiAdi, sarkiciAdi);
        newsong.next = head;
        head = newsong;
        if (tail == null) {
            tail = newsong;
        }
    }


    //sona sarki ekleme
    public void SonaSarkiEkle(String sarkiAdi, String sarkiciAdi) {
        Song newsong = new Song(sarkiAdi, sarkiciAdi);
        if (head == null) {
            head = newsong;
            tail = newsong;
        } else {
            tail.next = newsong;
            tail = newsong;
        }
    }


    //araya sarki ekleme
    public void ArayaSarkiEkle(Song oncekiSarki, String sarkiAdi, String sarkiciAdi) {
        if (oncekiSarki == null) {
            BasaSarkiEkle(sarkiAdi, sarkiciAdi);
            return;
        }
        Song newSong = new Song(sarkiAdi, sarkiciAdi);
        newSong.next = oncekiSarki.next;
        oncekiSarki.next = newSong;
        if (oncekiSarki == tail) {
            tail = newSong;
        }
    }

    //bastan sarki silme
    public void BastanSarkiSil(){
        if (head == null) {
            System.out.println("Liste boş!");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    //sondan sarki silme
    public void SondanSarkiSil(){
        if (head == null) {
            System.out.println("Liste boş!");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Song temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    //aradan sarki silme
    public void AradanSarkiSil(Song oncekiSarki) {
        if (oncekiSarki == null || oncekiSarki.next == null) {
            System.out.println("Silinecek öğe bulunamadı.");
            return;
        }
        if (oncekiSarki.next == tail) {
            tail = oncekiSarki;
        }
        oncekiSarki.next = oncekiSarki.next.next;
    }

    // Belirli indisteki düğümü getir
    public Song getNodeAt(int index) {
        Song temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) return temp;
            temp = temp.next;
            count++;
        }
        return null;
    }

    //listeyi yazdir
    public void Yazdir() {
            Song temp = head;
            System.out.println("Liste:");
            while (temp != null) {
                System.out.println(temp.sarkiAdi + " -> " + temp.sarkiciAdi + " -> " );
                temp = temp.next;
            }
            System.out.println("null");
    }

}
