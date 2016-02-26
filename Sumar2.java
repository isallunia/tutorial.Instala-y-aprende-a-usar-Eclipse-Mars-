/**
*Define la clase Sumar2 que realice una suma y la muestre. Para ello implementa el
*método sumar con los dos argumentos que sean los sumandos. Ha de devolver su suma. Documéntalo correctamente (@param y @return)
*
*@author Isabel María Gómez Palomeque
*@version 1.0
*/
import utiles.*;

public class Sumar2{
	public static void main(String[] args){
		int num=Teclado.leerEntero("Introduce un n\u00famero: ");
		int	num2=Teclado.leerEntero("Introduce el segundo n\u00famero: ");
		System.out.println(num+"+"+num2+"="+sumar(num, num2));
		
	}
	/**
	*Método que suma dos números obtenidos desde el main y los muestra.
	*
	*@param num, número obtenido desde el main por teclado para realizar la suma.
	*@param	num2, número obtenido desde el main por teclado para realizar la suma.
	*
	*@return devuelve la impresión en pantalla de la suma de los números pedidos por teclado
	*/
	public static int sumar(int num, int num2){
		return (num+num2);
	}
		
}