package Invoicemaster;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class test {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2012-02-02");
        LocalDate date2 = LocalDate.parse("2012-02-02");
        Fakturaudsteder ud1 = new Fakturaudsteder("komkom",2200,"nørrebro");
        Faktiramodtager mod1 = new Faktiramodtager("kom kom kom ",2300,"danmark");
        Fakturaen fak1 = new Fakturaen(1,ud1, mod1,date1,date2);
        Fakturalinje vare1 = new Fakturalinje("dick",20,10);
        Fakturalinje vare2 = new Fakturalinje("dick",20,10);
        Fakturalinje vare3 = new Fakturalinje("dick",20,10);
        Fakturalinje vare4 = new Fakturalinje("dick",20,10);
        System.out.println(vare1);

        fak1.addtolist(vare1);
        fak1.addtolist(vare2);
        fak1.addtolist(vare3);
        fak1.addtolist(vare4);


        System.out.println(fak1.getForfaldsdato());
        System.out.println(fak1.getFakturedato());
        System.out.println(fak1.getFakturalinjes());
        System.out.println(fak1.getTotal());
        System.out.println(fak1.getMoms());
        System.out.println(fak1.getSubtotalUdenMoms());
    }
}
