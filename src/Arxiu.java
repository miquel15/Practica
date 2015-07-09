import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Arxiu {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File text	=	new File("C:/Users/Asus/Documents/PractiquesEmpresa/prova.txt");
		File output	=	new File("C:/Users/Asus/Documents/PractiquesEmpresa/sortida.txt");
		Scanner scan = new Scanner(text);
		PrintWriter printer = new PrintWriter(output);
		printer.println("Hola");
		printer.close();
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
			
		}
		scan.close();
	}

}
