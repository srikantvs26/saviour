package com.srikantvs.java8.i18n;
import java.util.Locale;

public class LocaleDemo0003 {

	public static void main(String[] args) {
		// Creating a locale based on our requirements.
		// India Punjabi
		
		Locale newLocale = new Locale("pa", "IN");
		Locale.setDefault(newLocale);
		System.out.println(newLocale.getCountry() +" --- "+newLocale.getLanguage());
		System.out.println(newLocale.getDisplayCountry() +" --- "+newLocale.getDisplayLanguage());
		
		
		Locale newLocale2 = new Locale("kn","IN"); 
		
		
		
		Locale[] availableLocales = Locale.getAvailableLocales();
		for (int i = 0; i < availableLocales.length; i++) {
			System.out.println(availableLocales[i].getLanguage()+"...."+availableLocales[i].getCountry());
			System.out.println(availableLocales[i].getDisplayLanguage()+"...."+availableLocales[i].getDisplayCountry());
			System.out.println(availableLocales[i].getDisplayName());
			System.out.println("--------------");
		}
	}

}
