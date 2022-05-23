package com.vezbanje;

/*
Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
 Pored toga, klasa ima:
apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
Metoda kao ulazni parametar prima objekat tipa Planina./
 */
public abstract class Planinar {
    private int id;
    private String ime;
    private String prezime;

    public Planinar(){

    }

    public Planinar(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    //apstraktnu metodu štampaj

    public abstract void stampaj();

    //apstraktnu metodu koja vraca clanarinu planinara

    public abstract int clanarina();

    //apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.

    public abstract boolean uspesanUspon(Planina p2);
    //da/ne, zavisi od vrste planinara, kod rekreativnog od opreme a alpinista se podrazumeva da sve do 4000 je
    // uspesan uspon

    //Metoda kao ulazni parametar prima objekat tipa Planina./


    @Override
    public String toString() {
        return "Planinar{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
