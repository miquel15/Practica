import java.util.Scanner;


public class ExercicisString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introdueix una paraula");
		Scanner scan1= new Scanner(System.in);
		String paraula=scan1.next();
		
		System.out.println("SENARS");
		for (int i=0;i<paraula.length();++i)
		{
			if(i%2==1) {
				char aux = paraula.charAt(i);
				System.out.print(aux);
			}
			
		}
		System.out.println("");
		
		System.out.println("PARELLS");
		for (int i=0;i<paraula.length();++i)
		{
			if(i%2==0) {
			
				char aux = paraula.charAt(i);
				System.out.print(aux);
			}
			
			
		}
		scan1.close();
	}

}
