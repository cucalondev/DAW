package Ejercicios;
import java.util.Scanner;

public class Ejercicio_26 {
	public static void main(String[]Args) {
		Scanner entrada = new Scanner (System.in);
		int cantidad,num=0,ac=0;
		System.out.println("Introduzca la cantidad de n�meros");
		cantidad=entrada.nextInt();
		System.out.println("Introduce los n�meros");
		do {
			for (int i=0;i<cantidad;i++) {//Contador = i;
				num=entrada.nextInt();
				ac=num+ac;
			}
		}while(num<0 && num==cantidad);
		System.out.print("La media es:"+ac/cantidad);
			entrada.close();
			
		}
	}
