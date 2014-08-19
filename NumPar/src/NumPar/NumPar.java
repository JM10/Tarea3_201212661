package NumPar;
/**
@author Jose Mauricio Us De Leon
@carnet 201212661
*/
import java.util.Scanner;

public class NumPar {
public static void main(String[] args) {
	int numero;
	Scanner sc=new Scanner(System.in);
	System.out.println("Ingrese Un Numero");
	numero=sc.nextInt();
	
	if (numero%2==0) {
		System.out.println("El numero "+numero+" es PAR");
	}else {
		System.out.println("El numero "+numero+" es IMPAR");
	}
}
}
