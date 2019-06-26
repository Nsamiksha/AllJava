package commercial;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import java.util.StringJoiner;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.linkedlist_methods.stackMethods;



public class C_Stack {
	
		public static void main(String args[]) throws JsonMappingException, IOException {
			String companyName;
			String symbol;
			int totalShares;
			int sharePrice;
			int total;
			ObjectMapper mapper = new ObjectMapper();
			stackMethods<String> stack = new stackMethods<>();

			LinkedList<Commercial_Company_Elements> data1 = mapper.readValue(new File(
					"/home/user/company123.json"),
					new TypeReference<LinkedList<Commercial_Company_Elements>>() {
					});
			int i = 0;
			int size = data1.size();
			if (size == 0)
				System.out.println("\nno data found");

			else {

				for (i = 0; i < data1.size(); i++) {
					companyName = (String) data1.get(i).getCompanyName().trim();
					symbol = data1.get(i).getSymbol().trim();
					totalShares = data1.get(i).getTotalShares();
					sharePrice = data1.get(i).getEachSharePrice();
					total = totalShares * sharePrice;
					StringJoiner joiner = new StringJoiner(" ");
					joiner.add(companyName + "    ");
					joiner.add(symbol + "    ");
					joiner.add(totalShares + "    ");
					joiner.add(sharePrice + "    ");
					joiner.add(total + "    ");
					stack.push1(joiner.toString());
					
				}
				
			}
			System.out.println("company\t symbol\tSymbolvalue\n");
		
		}
	}


