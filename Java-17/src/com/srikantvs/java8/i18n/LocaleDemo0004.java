import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleDemo0004 {

	public static void main(String[] args) throws ParseException {
		// Formatting.
		Integer money = 10000;
		
		Locale locale = new Locale("kn","IN");
		System.out.println(locale.getLanguage()+ "--- "+locale.getCountry());
		String indianFormatMoney = moneyFormatter(locale, money);
		System.out.println("Money in Indian Format : "+indianFormatMoney);//₹10,000.00
		
		
		Locale locale2 = Locale.US;
		System.out.println(locale2.getLanguage()+ "--- "+locale2.getCountry());
		String usFormatMoney = moneyFormatter(locale2, money);
		System.out.println("Money in US Format : "+usFormatMoney);//$10,000.00
		
		
	}
	
	public static String moneyFormatter(Locale locale, Object data){
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		return numberFormat.format(data);
	}
	
}
