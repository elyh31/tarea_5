
public class Ejercicios
{
	//Devuelve el valor de mi_arreglo en la posicion [columna][fila]
	static String obtenerValor(String mi_arreglo[][], int columna, int fila)
	{
		return mi_arreglo[columna][fila];
	}
	
	//Devuelve la cantidad de columnas de mi_arreglo
	static int obtenerCantidadColumnas(double mi_arreglo[][])
	{
		return mi_arreglo.length;
	}
	
	//Devuelve la cantidad de filas de mi_arreglo
	static int obtenerCantidadFilas(double mi_arreglo[][])
	{
		return mi_arreglo[1].length;
	}
	
	//Devuelve la cantidad de elementos que puede alacenar mi_arreglo
	static int obtenerCantidadElementos(double mi_arreglo[][])
	{
		double suma = 0;
		for(int c=0; c<mi_arreglo.length; c++)
		for(int f=0; f<mi_arreglo[1].length; f++)	
			suma = c * f;
		return (int)suma;
	}
	
	//Devuelve la suma de todos los elementos de mi_arreglo
	static double sumaElementos(double mi_arreglo[][])
	{
		double suma = 0;
		for(int c=0; c<mi_arreglo.length; c++)
		{
			for(int f=0; f<mi_arreglo[1].length; f++)
			{
				suma = suma + mi_arreglo[c][f];
			}
		}
					
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos de mi_arreglo
	static double promedioElementos(double mi_arreglo[][])
	{
		double suma = 0;
		double promedio = mi_arreglo.length * mi_arreglo[1].length;
		for(int c=0; c<mi_arreglo.length; c++)
		{
			for(int f=0; f<mi_arreglo[1].length; f++)
			{
				suma = suma + mi_arreglo[c][f];
			}
		}
					
		return suma/promedio;
	}
	
	//Devuelve verdadero si num esta en mi_arreglo, de lo contrario devuelve false
	static boolean existe(double mi_arreglo[][], int num)
	{
		for(int c=0; c<mi_arreglo.length; c++)
		{
			for(int f=0; f<mi_arreglo[1].length; f++)
			{
				if (mi_arreglo[c][f]==num);
				return true;
			}
		}
					
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
