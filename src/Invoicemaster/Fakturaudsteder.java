package Invoicemaster;

public class Fakturaudsteder {

    private String addresse;
    private int postnummer;
    private String by;




    Fakturaudsteder(String addresse, int postnummer, String by){
        setAddresse(addresse);
        setPostnummer(postnummer);
        setBy(by);
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String toString() {
        return "Fakturaudsteder{" +
                "addresse='" + getAddresse() + '\'' +
                ", postnummer=" + getPostnummer() +
                ", by='" +getBy() + '\'' +
                '}';
    }
}
