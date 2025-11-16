#yaşa göre mesaj çıktısı veren program

#eklenti
import tkinter as tk

#pencere oluşturma
print("Yaşınıza göre mesaj alabilirsiniz.")
pencere = tk.Tk()
pencere.title("Yaşa Göre Mesaj")
pencere.geometry("500x200")

# Yaşınızı giriniz etiketi
etiket_giris = tk.Label(pencere, text="Lütfen Yaşınızı giriniz:", font=("Arial", 12),fg="red")
etiket_giris.pack(pady=5)

# Kullanıcıdan değer alma
entry_yas = tk.Entry(pencere, font=("Arial", 12))
entry_yas.pack(pady=5)

# Sonuç etiketi
etiket_sonuc = tk.Label(pencere, text="", font=("Arial", 12), fg="blue")
etiket_sonuc.pack(pady=10)

#koşullar ve mesajlar

def mesaj_goster():
    try:
        yas = int(entry_yas.get())  # Entry'den yaş bilgisini al
        #koşul ve mesaj
        if(yas<18):
            mesaj=("Reşit değilsiniz, bu yüzden bazı şeylerden eksik kalabilirsiniz.")

        elif(yas>=18 and yas<30):
            mesaj=("Gençsiniz, hayatınızın baharındasınız.")

        elif(yas>=30 and yas<55):   
            mesaj=("Orta yaşlısınız, hayatınızı dolu dolu yaşayın.") 

        elif(yas>=55 and yas<70):
            mesaj=("Gençliğiniz bitti, çocuklarınızla ve torunlarınızla vakit geçirebilirsiniz.")

        elif(yas>=70):
            mesaj=("Çok yaşlandınız, sağlığınıza dikkat etmelisiniz.")

    except ValueError:
        mesaj = "Lütfen geçerli bir sayı girin."
    etiket_sonuc.config(text=mesaj)


buton_mesaj=tk.Button(pencere,text="Mesajı Göster",height=5,width=20) 
buton_mesaj.config(command=mesaj_goster)
buton_mesaj.pack(pady=10)
buton_mesaj.pack(pady=10)

 #çalıştırma
pencere.mainloop()
       