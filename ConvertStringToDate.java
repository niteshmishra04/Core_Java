import java.text.*;
import java.time.LocalDateTime;
import java.util.*;
public class ConvertStringToDate {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Present Date:"+c.getTime());
		Date d=new Date();
		LocalDateTime lt=LocalDateTime.now();
		System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());
	
		//System.out.println(lt);
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
	String sF=	sd.format(d);
	System.out.println(sF);
	
	}

}
