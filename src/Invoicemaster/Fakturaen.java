package Invoicemaster;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Fakturaen {
    private Faktiramodtager faktiramodtager;
    private Fakturaudsteder fakturaudsteder;
    private ArrayList<Fakturalinje> fakturalinjes;
    private LocalDate fakturedato;
    private LocalDate forfaldsdato;
    private int ordrenummber;
    private double moms;
    private double subtotalUdenMoms;
    private double total;



    Fakturaen(int ordrenummber,Fakturaudsteder fakturaudsteder, Faktiramodtager faktiramodtager,LocalDate forfaldsdato, LocalDate fakturedato){
        setOrdrenummber(ordrenummber);
        setFakturaudsteder(fakturaudsteder);
        setFaktiramodtager(faktiramodtager);
        setFakturedato(fakturedato);
        setForfaldsdato(forfaldsdato);
        this.fakturalinjes = new ArrayList<>();
    }

    public LocalDate getForfaldsdato() {
        return forfaldsdato;
    }

    public void setForfaldsdato(LocalDate forfaldsdato) {
        this.forfaldsdato = forfaldsdato;
    }

    public LocalDate getFakturedato() {
        return fakturedato;
    }

    public void setFakturedato(LocalDate fakturedato) {
        this.fakturedato = fakturedato;
    }

    public double getMoms() {
        return getSubtotalUdenMoms()*0.25;
    }

    public double getTotal() {
        return getSubtotalUdenMoms()+getMoms();
    }



    public double getSubtotalUdenMoms() {
        subtotalUdenMoms = 0;
        for (int i = 0; i < fakturalinjes.size(); i++) {
            subtotalUdenMoms += fakturalinjes.get(i).getBeløb();
        }
        return subtotalUdenMoms;
    }


    public Faktiramodtager getFaktiramodtager() {
        return faktiramodtager;
    }

    public void setFaktiramodtager(Faktiramodtager faktiramodtager) {
        this.faktiramodtager = faktiramodtager;
    }

    public Fakturaudsteder getFakturaudsteder() {
        return fakturaudsteder;
    }

    public void setFakturaudsteder(Fakturaudsteder fakturaudsteder) {
        this.fakturaudsteder = fakturaudsteder;
    }

    public ArrayList<Fakturalinje> getFakturalinjes() {
        return fakturalinjes;
    }
    public void addtolist(Fakturalinje fakturalinje){
        fakturalinjes.add(fakturalinje);
    }


    public int getOrdrenummber() {
        return ordrenummber;
    }

    public void setOrdrenummber(int ordrenummber) {
        this.ordrenummber = ordrenummber;
    }

    @Override
    public String toString() {
        return "Fakturaen{" +
                "faktiramodtager=" + faktiramodtager +
                ", fakturaudsteder=" + fakturaudsteder +
                ", fakturalinjes=" + fakturalinjes +
                ", fakturedato=" + fakturedato +
                ", forfaldsdato=" + forfaldsdato +
                ", ordrenummber=" + ordrenummber +
                ", moms=" + getMoms() +
                ", subtotalUdenMoms=" + subtotalUdenMoms +
                ", total=" + getTotal() +
                '}';
    }
}
