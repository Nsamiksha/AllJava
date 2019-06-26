package commercial;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import Utility.util;

public class Company_Main {
	
	
	public static ObjectMapper mapper = new ObjectMapper();



	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

	String	string = "";
		
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

		List<Commercial_Company_Elements> company = new ArrayList<>();

		System.out.println("enter the total no of Company");
		int totalCompany = util.printint();
		int count = 0;
		while(count<totalCompany) {
		System.out.println("enter the name of company");
		String shareName = util.printstring();
		System.out.println("enter the symbol of company");
		String symbol = util.printstring();
		System.out.println("enter the total shares of company");
		int totalShare = util.printint();
		System.out.println("enter the value of each share");
		int priceOfEach = util.printint();
		Date current=new Date();
		SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
		String date=simple.format(current);
		
		Commercial_Company_Elements comp = new Commercial_Company_Elements();
		comp.setCompanyName(shareName);
		comp.setSymbol(symbol);
		comp.setTotalShares(totalShare);
		comp.setEachSharePrice(priceOfEach);
		comp.setDate(date);
		
		company.add(comp);
		count++;
		System.out.println("\n");	
	

}
		writer.writeValue(
				new File("/home/user/company123.json/"),
				company);
	}
}
