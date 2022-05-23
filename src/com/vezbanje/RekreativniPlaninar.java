package com.vezbanje;

/*
Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je
njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za
svaki kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: id
ime: ime prezime Okrug: okrug/
 */
public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int usponBezOpreme;

    public RekreativniPlaninar(){

    }

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String okrug, int usponBezOpreme) {
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.usponBezOpreme = usponBezOpreme;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public int getUsponBezOpreme() {
        return usponBezOpreme;
    }

    public void setUsponBezOpreme(int usponBezOpreme) {
        this.usponBezOpreme = usponBezOpreme;
    }

    @Override
    public void stampaj() {
        //Rekreativac, id: id
        //ime: ime prezime Okrug: okrug/
        System.out.println("Rekreativac ID: " + getId() + " \n" + "Ime i prezime: " + getIme() + " " + getPrezime() + " Okrug: " + getOkrug());

    }

    @Override
    public int clanarina() {
        //rekeativci placaju clanarinu u iznosu od 1000 rsd
        int clanarina = 1000;
        //System.out.println("Clanarina je " + clanarina);
        return clanarina;

    }

    @Override
    public boolean uspesanUspon(Planina p2) {
        /*
        da li će rekreativni planinar uspešno popeti na planinu zavisi da li je
        njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za
        svaki kilogram opreme koji nosi može da pređe 50 metara manje./
         */
        return (getUsponBezOpreme() <= p2.getVisinaPlanine() - 50* getTezinaOpreme());





    }
}
