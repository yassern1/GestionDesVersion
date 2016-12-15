import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Principal {
	public Principal(){
		//printStartMessage();
		printDateVol();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Principal();
	}
	
	public void printStartMessage(){
		System.out.println("Bonjour Tout le Monde!!!!!");
		System.out.println("premier commit!!!!");
	
	}
	public void printDateVol(){
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dfm.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			Date dep = dfm.parse("2016-11-28 20:15:00");
			Date arri = dfm.parse("2016-11-29 08:00:00");
			System.out.println("Date départ:"+dep);
			System.out.println("Date arrivée:"+arri);

		} catch (ParseException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
