package guias;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// la suma de n primeros numeros naturales
		int N=0;
		int aux=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero");
		N=sc.nextInt();
		if(N==0){System.out.println("Es 0");}
		for(int i =0;i<=N;i++){
			aux=aux+i;
		}
		System.out.println("La suma de los primeros "+N+" numeros es "+aux);

	}

}
