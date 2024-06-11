package com.srikantvs.java8.i18n;

import java.util.Locale;

public class LocaleDemo0002 {

	public static void main(String[] args) {
		// Creating a locale based on our requirements.
		
		// India Punjabi
		
		
		
		Locale newLocale = new Locale("pa", "IN");
		System.out.println(newLocale.getCountry() +" --- "+newLocale.getLanguage());
		System.out.println(newLocale.getDisplayCountry() +" --- "+newLocale.getDisplayLanguage());
		
		// India Kananda
		Locale newLocale2 = new Locale("kn","IN"); 
		Locale.setDefault(newLocale2);
		System.out.println(newLocale2.getCountry() +" --- "+newLocale2.getLanguage());
		System.out.println(newLocale2.getDisplayCountry() +" --- "+newLocale2.getDisplayLanguage());
		// Same we can do for Hindi as well.
		
	}

}
