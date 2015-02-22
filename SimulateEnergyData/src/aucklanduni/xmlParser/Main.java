package aucklanduni.xmlParser;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
 
public class Main 
{ 
	public static void main(String a[])
	{
		//Date now = new Date();  
		Calendar cal = Calendar.getInstance();  
		cal.set(2014,0,23);  
		cal.add(Calendar.DAY_OF_YEAR, 1); // <--  
		Date tomorrow = cal.getTime();  
		System.out.println(tomorrow);	
		
		while
	}
}

