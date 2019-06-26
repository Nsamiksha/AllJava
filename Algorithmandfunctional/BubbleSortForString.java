import java.util.*;
import java.util.Scanner;
public class BubbleSortForString {
	public static void main(String[] args)  {
		Scanner num = new Scanner(System.in);
		System.out.println("enter string 1 ");
		String l = num.nextLine();
		int n = l.length();
		int[] array = new int[n];

	for(int i = 0; i<n; i++){
	array[i] = l.codePointAt(i);
	}
	sorting(array);
	}	
//method for sorting
 static void sorting(int[] array) {
	int temp = 0;
	int a = array.length;

	for(int i=0; i< a ; i++){  
     		 for(int j=0; j < a-i-1; j++){  
                 if(array[j] > array[j+1]){  
        	 temp = array[j+1]; 	
		array[j+1] = array[j];  
                    array[j] = temp;  
		}

		}
		}
        
	String str =null;
        for(int i: array){
	str = Character.toString((char)i);
	System.out.print(str);

}System.out.println();


}
}


