package com.bridgeit.objectprograms;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;




import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.linkedlist_methods.Queue;



public class Commercial_Queue {
	
	
	
		@SuppressWarnings("null")
		public static void main(String args[]) throws JsonMappingException, IOException {
			String companyName = null;
			String symbol = null;
			
			ObjectMapper mapper = new ObjectMapper();
			Queue<String> queue = new Queue<>(); 
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
			LocalDateTime now = LocalDateTime.now(); 
			String date = (dtf.format(now));
			
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
					StringBuffer buffer=new StringBuffer();
					companyName = data1.get(i).getCompanyName().trim();
					buffer.append(companyName+" \t\t ");
					
					symbol = data1.get(i).getSymbol().trim();
					buffer.append(symbol+" \t\t ");
					date = data1.get(i).getDate().trim();
					buffer.append(date+" \t\t ");
					queue.enQueue(buffer.toString()) ;
					
				}
			}
			System.out.println("  company\tsymbol\t  date & time of transaction\n");
			queue.show();
			}  

		}

	
	
	
	
	
	
	
	
	
	
	
	
	

