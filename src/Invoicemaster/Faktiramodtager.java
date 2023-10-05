package Invoicemaster;

public class Faktiramodtager {
    private int postnummer;
    private String adresse;
    private String land;



    Faktiramodtager(String adresse, int postnummer, String land){

        setAdresse(adresse);
        setPostnummer(postnummer);
        setLand(land);
    }


    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "Fakturemodtager:"+ getAdresse() + getLand() + getPostnummer();
    }
}
