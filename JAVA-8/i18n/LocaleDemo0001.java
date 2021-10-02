import java.util.Locale;

public class LocaleDemo0001 {

	public static void main(String[] args) {
		// Checking the default locale in our machine which is set by default.
		
		Locale locale = Locale.getDefault();
		System.out.println(locale.getCountry() +" --- "+locale.getLanguage());
		System.out.println(locale.getDisplayCountry() +" --- "+locale.getDisplayLanguage());
		
	}

}
