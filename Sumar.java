/**
*Define la clase Sumar que realice una suma y la muestre. Para ello implementa el
*método sumar que devuelva la suma de dos números, solicitados por teclado (sin
*argumentos) . Documéntalo correctamente (@return)
*
*@author Isabel María Gómez Palomeque
*@version 1.0
*/
import utiles.*;

public class Sumar{
	public static void main(String[] args){
	Suma();
		
	}
	/**
	*Método que pide dos números por teclado, realiza la suma de éstos y los muestra.
	*
	*@return devuelve la impresión en pantalla de la suma de los números pedidos por teclado
	*/
	public static void Suma(){
		int num=Teclado.leerEntero("Introduce un n\u00famero: ");
		int	num2=Teclado.leerEntero("Introduce el segundo n\u00famero: ");
		System.out.println(num+"+"+num2+"="+(num+num2));
	}
		
}