package currencyformatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatter {
    public void programHelp(double payment){
        NumberFormat numberFormat= NumberFormat.getCurrencyInstance();
        numberFormat.setCurrency(Currency.getInstance(Locale.US));
        String value= numberFormat.getCurrency().getDisplayName();
        System.out.println(value);
        System.out.println(numberFormat.format(payment));
    }
    public void program(double payment){
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        String u= nf.format(payment);
        nf=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String i= nf.format(payment);
        nf=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String c= nf.format(payment);
        nf=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String f= nf.format(payment);

        System.out.println(u);
        System.out.println(i);
        System.out.println(c);
        System.out.println(f);
    }


    public static void main(String[] args) {
        new CurrencyFormatter().program(100);
        new CurrencyFormatter().programHelp(10);

        float amount = 100000;


    }
}
