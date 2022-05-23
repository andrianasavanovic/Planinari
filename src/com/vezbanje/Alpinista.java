package com.vezbanje;

/*
Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario
(celobrojna vrednost) i poeni se mogu menjati kroz adekvatnu metodu. kroz seter?
Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom
za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni/
 */
public class Alpinista extends Planinar{
    private int poeni;

    public Alpinista(){

    }

    public Alpinista(int iD, String ime, String prezime, int poeni) {
        super(iD, ime, prezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        //Alpinista, id: id
        //ime: ime i prezime
        //Broj poena: poeni/
        System.out.println("Alpinista ID: " + getId() + "\n" + "Ime i prezime " + getIme() + " " + getPrezime() + "\n" + "Broj poena: " + getPoeni());

    }

    @Override
    public int clanarina() {
        //clanarinu u iznosu od 1500 pritom
        //za svaki poen ima popust od 50
        int clanarina = 1500 - 50*getPoeni();
        if(clanarina < 0){
            System.out.println("Vec ne placate clanarinu!");
        }
        //System.out.println("Clanarina je " + clanarina);
        //ne sme da ide u minus
        return clanarina;


    }

    @Override
    public boolean uspesanUspon(Planina p2) {
        //apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
        //Metoda kao ulazni parametar prima objekat tipa Planina./
        //sve uspone do 4000 metara je uspesan uspon
        return p2.getVisinaPlanine() < 4000;


    }
}
