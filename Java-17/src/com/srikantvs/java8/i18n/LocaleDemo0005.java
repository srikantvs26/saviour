package com.srikantvs.java8.i18n;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleDemo0005 {

	public static void main(String[] args) throws ParseException {
		
		// parsing.
		
		Locale locale = new Locale("kn","IN");
		
		String indMon = "₹10,000.00";
		Number indMoney = moneyParser(locale, indMon);
		System.out.println(indMoney);
		
		
		Locale locale2 = Locale.US;
		String usMon = "$10,000.00";
		Number usMoney = moneyParser(locale2, usMon);
		System.out.println(usMoney);
	}
	
	public static Number moneyParser(Locale locale, String data) throws ParseException{
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		return numberFormat.parse(data);
	}
}
