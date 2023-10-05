package Invoicemaster;

public class Fakturalinje {
    private String vare;
    private int antal;
    private double pris;
    private double beløb;


    Fakturalinje(String vare, int antal, double pris){
        setVare(vare);
        setAntal(antal);
        setPris(pris);

    }

    public double getBeløb() {
        return antal*pris;
    }

    public void setBeløb(double beløb) {
        this.beløb = beløb;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public String getVare() {
        return vare;
    }

    public void setVare(String vare) {
        this.vare = vare;
    }

    @Override
    public String toString() {
        return "vare =" + getVare() + " " + " antal =" + getAntal() + " " +" pris =" + getPris();
    }
}
