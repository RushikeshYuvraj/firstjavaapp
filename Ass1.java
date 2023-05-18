import java.util.*;

public class Ass1 {
    // Argya
	public static void main(String[] args) {
		int ch;
		
		LinkedList<String> list1 = new LinkedList<>();
		
		Scanner sc=new Scanner(System.in);
//		String s1 = sc.next();
		
		do {
			System.out.println("Enter 1. to add"
					+ "2. to remove"
					+ "3. for sorting"
					+ "4. for searching"
					+ "5. for displaying \\"
					+ "0. for exit");
			
			ch = sc.nextInt();
			switch(ch){
			case 1:
				System.out.println("Enter name");
				String s = sc.next();
				list1.add(s);
				break;
				
			case 2:
				System.out.println("Enter the index position you want to delete the element at...");
				int i = sc.nextInt();
				System.out.println("Removing element at index " + i);
				list1.remove(i);
				break;
				
			case 3:
				System.out.println("Sorting the list...");
				Collections.sort(list1);
				break;
			
			case 4:
//				System.out.println("");
				if(list1.contains("rushikesh"))
					System.out.println("Name is available int the list.");
				else
					System.out.println("Sorry ! the name you entered is not available in our list." 
							+ " Please enter 1 to insert it in the list...");
			case 5:
				System.out.println(list1);
				break;
			
			}
		}while(ch != 0);
	}
}
