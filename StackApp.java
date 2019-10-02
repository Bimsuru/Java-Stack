package exam;

public class StackApp {
	
	//main
	public static void main(String[] args) {
		
		//call the constructor
		StackX s = new StackX(5);
		
		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');
		
		while(!s.isEmpty())
		{
			System.out.print(" "+ s.pop());
		}
	
		
	}
	

}
