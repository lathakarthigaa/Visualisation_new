package aucklanduni.xmlParser;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
 
public class ReadXMLFile 
{ 
	public void readXMLFile(String filename)
	{ 
	    try 
	    { 
			File fXmlFile = new File(filename);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
		 
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("home");//<home>
		 
			System.out.println("----------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{		 
				Node nNode = nList.item(temp);
		 
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					System.out.println("Room id : " + eElement.getAttribute("id"));
					System.out.println("Room Name : " + eElement.getElementsByTagName("roomname").item(0).getTextContent());
					
					NodeList applianceList = doc.getElementsByTagName("appliances");
										
					for(int applianceIterate = 0; applianceIterate < applianceList.getLength(); applianceIterate++)
					{
						Node applianceNode = applianceList.item(applianceIterate);
						 
						System.out.println("\nCurrent Element :" + applianceNode.getNodeName());
						System.out.println("\n Node Type::"+applianceNode.getNodeType());
						System.out.println("\nNode.ELEMENT_NODE::"+Node.ELEMENT_NODE);
						if (applianceNode.getNodeType() == Node.ELEMENT_NODE) 
						{
							Element applianceElement = (Element) applianceNode;
							System.out.println("Appliance id : " + applianceElement.getAttribute("id"));
							System.out.println("Appliance Name : " + applianceElement.getElementsByTagName("appliance_name").item(0).getTextContent());	
							System.out.println("Energy Rating : " + applianceElement.getElementsByTagName("energy_rating").item(0).getTextContent());	
							
							NodeList operatingHoursList = doc.getElementsByTagName("operating_hours");
												
							for(int operatingHoursIterate = 0; operatingHoursIterate < operatingHoursList.getLength(); operatingHoursIterate++)
							{
								Node operatingHoursNode = operatingHoursList.item(operatingHoursIterate);
								 
								System.out.println("\nCurrent Element :" + operatingHoursNode.getNodeName());
								System.out.println("\n Node Type::"+operatingHoursNode.getNodeType());
								System.out.println("\nNode.ELEMENT_NODE::"+Node.ELEMENT_NODE);
								if (operatingHoursNode.getNodeType() == Node.ELEMENT_NODE) 
								{
									NodeList monthList = doc.getElementsByTagName("months");
														
									for(int monthsIterate = 0; monthsIterate < monthList.getLength(); monthsIterate++)
									{
										Node monthNode = monthList.item(monthsIterate);
										if(monthNode.getNodeType() == Node.ELEMENT_NODE)
										{
											Element weekDayElement = (Element) monthNode;
											System.out.println("Monday Timing : " + weekDayElement.getElementsByTagName("Monday").item(0).getTextContent());	
											System.out.println("Tuesday Timing : " + weekDayElement.getElementsByTagName("Tuesday").item(0).getTextContent());	
											System.out.println("Wednesday Timing : " + weekDayElement.getElementsByTagName("Wednesday").item(0).getTextContent());	
											System.out.println("Thursday Timing : " + weekDayElement.getElementsByTagName("Thursday").item(0).getTextContent());	
											System.out.println("Friday Timing : " + weekDayElement.getElementsByTagName("Friday").item(0).getTextContent());	
											System.out.println("Saturday Timing : " + weekDayElement.getElementsByTagName("Saturday").item(0).getTextContent());
											System.out.println("Sunday Timing : " + weekDayElement.getElementsByTagName("Sunday").item(0).getTextContent());		
										}
									}
								}
							}
						}
					}
				}
			}
	    } 
	    catch (Exception e) 
	    {
	    	e.printStackTrace();
	    }
	}
}

