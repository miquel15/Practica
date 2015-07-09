import java.util.Scanner;


public class Aritmètiques_pantalla {
	
	private static int Resultat(int x,int y,String operador)
	{
		int resultat;
		resultat=-1;
		if (operador.equals("suma"))
		{
			resultat=x+y;
		}
		else if(operador.equals("resta"))
		{
			resultat=x-y;
		}
		else if (operador.equals("multi"))
		{
			resultat=x*y;
		}
		else if (operador.equals("div"))
		{
			resultat=x/y;
			
		}
		return resultat;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introdueix un número");
		Scanner scan1= new Scanner(System.in);
		int num1=scan1.nextInt();
		System.out.println("Introdueix un altre");
		int num2=scan1.nextInt();
		System.out.println("Introdueix suma,resta,multi 'o' div");
		String operador=scan1.next();
		System.out.println(operador);
		System.out.println("El resultat és " + Resultat(num1,num2,operador));
		scan1.close();
	}

}
