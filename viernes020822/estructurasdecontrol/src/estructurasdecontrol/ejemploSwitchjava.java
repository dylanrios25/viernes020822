package estructurasdecontrol;
import java.util.Scanner;
public class ejemploSwitchjava {

	public static void main(String[] args) {
		
		/*crear un programa que muestre las opciones
		 *de una calculadora estandar:
		 *suma (2 numero)
		 *restar (2 numero)
		 *multiplicar (2 numero)
		 *dividir (2 numero - tomar en cuenta la division entre cero)
		 * residuo (2 numero)
		 * potencia (de una base a un exponente)
		 * raiz cuadrada(tomar en cuenta el signo de la raiz)
		 * inverso multiplicador(tomar en cuenta la division entre cero)
		 * salir de la aplicacion*/
		
		Scanner lec = new Scanner(System.in);
		int entrada;
		double a,b;
		System.out.println("calculadora estandar");
		System.out.println("operaciones");
		System.out.println("1.sumar.");
		System.out.println("2.resta.");
		System.out.println("3.multiplicacion.");
		System.out.println("4.division.");
		System.out.println("5.residuo.");
		
		entrada = lec.nextInt();
		switch(entrada) {
		case 1:
		System.out.println("escriba num1");
		a= lec.nextInt();
		System.out.println("escrib num2");
		b= lec.nextInt();
		System.out.println("la suma de "+a+" y "+b+" es"+(a+b));
		break;
		
		case 2:
			System.out.println("escriba num1");
			a= lec.nextInt();
			System.out.println("escrib num2");
			b= lec.nextInt();
			System.out.println("la suma de "+a+" y "+b+" es"+(a-b));
			break;
			
		case 3:
			System.out.println("escriba num1");
			a= lec.nextInt();
			System.out.println("escrib num2");
			b= lec.nextInt();
			System.out.println("la suma de "+a+" y "+b+" es"+(a*b));
			break;	
			
			
		case 4:
			System.out.println("escriba num1");
			a= lec.nextInt();
			System.out.println("escrib num2");
			b= lec.nextInt();
			if(b==0) {
				System.out.println("la definicion entre 0 no esta definida");	
			}else {
				System.out.println("la suma de "+a+" y "+b+" es"+(a/b));
			
			}break;	
			
			case 5:	
				System.out.println("escriba num1");
				a= lec.nextInt();
				System.out.println("escrib num2");
				b= lec.nextInt();
				
					System.out.println("El residuo entre"+a+" y"+b+" es igual a"+(a%b));	
				
					System.out.println("la suma de "+a+" y "+b+" es"+(a/b));
		            }break;	
		
		
		
	







