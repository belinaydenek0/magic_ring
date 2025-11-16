
#HESAP MAKİNESİ
#eklentiler
import tkinter as tk

#pencere oluşturma
pencere=tk.Tk()
pencere.title("Hesap Makinesi")
pencere.geometry("500x500")

#ekran sonuç kısmı
giris = tk.Entry(pencere, width=30, font=("Arial", 20), borderwidth=5, relief="ridge", justify="right")
giris.grid(row=0, column=0, columnspan=4, padx=10, pady=10)

#buton oluşturma
buton0=tk.Button(pencere,text="0",height=5,width=10)
buton1=tk.Button(pencere,text="1",height=5,width=10)
buton2=tk.Button(pencere,text="2",height=5,width=10)
buton3=tk.Button(pencere,text="3",height=5,width=10)
buton4=tk.Button(pencere,text="4",height=5,width=10)
buton5=tk.Button(pencere,text="5",height=5,width=10)
buton6=tk.Button(pencere,text="6",height=5,width=10)
buton7=tk.Button(pencere,text="7",height=5,width=10)
buton8=tk.Button(pencere,text="8",height=5,width=10)
buton9=tk.Button(pencere,text="9",height=5,width=10)

buton_arti=tk.Button(pencere,text="+",height=5,width=10)
buton_eksi=tk.Button(pencere,text="-",height=5,width=10)
buton_carpi=tk.Button(pencere,text="*",height=5,width=10)
buton_bolme=tk.Button(pencere,text="/",height=5,width=10)
buton_esittir=tk.Button(pencere,text="=",height=5,width=10)
buton_sil=tk.Button(pencere,text="C",height=5,width=10)
buton_nokta=tk.Button(pencere,text=".",height=5,width=10)
buton_parantez1=tk.Button(pencere,text="(",height=5,width=10)
buton_parantez2=tk.Button(pencere,text=")",height=5,width=10)
buton_yuzde=tk.Button(pencere,text="%",height=5,width=10)

#butonları pencereye ekleme
#sayılar
buton0.grid(row=5,column=1)
buton1.grid(row=4,column=0)
buton2.grid(row=4,column=1)
buton3.grid(row=4,column=2)
buton4.grid(row=3,column=0)
buton5.grid(row=3,column=1)
buton6.grid(row=3,column=2)
buton7.grid(row=2,column=0)
buton8.grid(row=2,column=1)
buton9.grid(row=2,column=2)
#işaretler
buton_esittir.grid(row=1,column=3)
buton_arti.grid(row=3,column=3)
buton_eksi.grid(row=4,column=3)
buton_carpi.grid(row=5,column=3)
buton_bolme.grid(row=5,column=2)
buton_sil.grid(row=1,column=0)
buton_nokta.grid(row=5,column=0)
buton_parantez1.grid(row=1,column=1)
buton_parantez2.grid(row=1,column=2)
buton_yuzde.grid(row=2,column=3)

#tıklama eventleri
def tikla(deger):
    giris.insert(tk.END, deger)

def temizle():
    giris.delete(0, tk.END)

def hesapla():
    try:
        sonuc = eval(giris.get())
        giris.delete(0, tk.END)
        giris.insert(tk.END, str(sonuc))
    except:
        giris.delete(0, tk.END)
        giris.insert(tk.END, "Hata")

#buton işlevleri
#sayilar
buton0.config(command=lambda: tikla("0"))
buton1.config(command=lambda: tikla("1"))
buton2.config(command=lambda: tikla("2"))
buton3.config(command=lambda: tikla("3"))
buton4.config(command=lambda: tikla("4"))
buton5.config(command=lambda: tikla("5"))
buton6.config(command=lambda: tikla("6"))
buton7.config(command=lambda: tikla("7"))
buton8.config(command=lambda: tikla("8"))
buton9.config(command=lambda: tikla("9"))
#işaretler
buton_arti.config(command=lambda: tikla("+"))
buton_eksi.config(command=lambda: tikla("-"))
buton_carpi.config(command=lambda: tikla("*"))
buton_bolme.config(command=lambda: tikla("/"))
buton_nokta.config(command=lambda: tikla("."))
buton_parantez1.config(command=lambda: tikla("("))
buton_parantez2.config(command=lambda: tikla(")"))
buton_yuzde.config(command=lambda: tikla("%"))
buton_sil.config(command=temizle)
buton_esittir.config(command=hesapla)


#pencereyi çalıştırma
pencere.mainloop()

