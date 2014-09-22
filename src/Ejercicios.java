
public class Ejercicios
{
	//Devuelve el valor de mi_arreglo en la posicion [columna][fila]
	static String obtenerValor(String mi_arreglo[][], int columna, int fila)
	{
		//va a devolver el areeglo en la posicion de la columna y fila
		return mi_arreglo[columna][fila];
	}
	
	//Devuelve la cantidad de columnas de mi_arreglo
	static int obtenerCantidadColumnas(double mi_arreglo[][])
	{
		//ayuda a devoelver la cantidad de columnas del arreglo
		return mi_arreglo.length;
	}
	
	//Devuelve la cantidad de filas de mi_arreglo
	static int obtenerCantidadFilas(double mi_arreglo[][])
	{
		//ayuda a devoelver la cantidad de filas del arreglo
		return mi_arreglo[1].length;
	}
	
	//Devuelve la cantidad de elementos que puede alacenar mi_arreglo
	static int obtenerCantidadElementos(double mi_arreglo[][])
	{
		double suma = 0;
		//el ciclo me ayuda a correr todo el arreglo
		for(int c=0; c<mi_arreglo.length; c++)
		for(int f=0; f<mi_arreglo[1].length; f++)
		//al correr todo el arreglo se multiplica la cantidad de filas por la cantidad de columnas
			suma = c * f;
		//me devuelve la multiplicacion en total
		return (int)suma;
	}
	
	//Devuelve la suma de todos los elementos de mi_arreglo
	static double sumaElementos(double mi_arreglo[][])
	{
		double suma = 0;
		//el ciclo me ayuda a correr todo el arreglo
		for(int c=0; c<mi_arreglo.length; c++)
		{
			for(int f=0; f<mi_arreglo[1].length; f++)
			{
				//me ayuda a saber cuantos suman los valores de todos los arreglos
				suma = suma + mi_arreglo[c][f];
			}
		}
		//devuelde la cantidad de los valores de todos los arreglos			
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos de mi_arreglo
	static double promedioElementos(double mi_arreglo[][])
	{
		double suma = 0;
		//ayuda a saber cuantos arreglos hay en total
		double promedio = mi_arreglo.length * mi_arreglo[1].length;
		//el ciclo me ayuda a correr todo el arreglo
		for(int c=0; c<mi_arreglo.length; c++)
		{
			for(int f=0; f<mi_arreglo[1].length; f++)
			{
				//me ayuda a saber cuantos suman los valores de todos los arreglos
				suma = suma + mi_arreglo[c][f];
			}
		}
					
		return suma/promedio;
	}
	
	//Devuelve verdadero si num esta en mi_arreglo, de lo contrario devuelve false
	static boolean existe(double mi_arreglo[][], int num)
	{
		//el ciclo me ayuda a correr todo el arreglo
		for(int c=0; c<mi_arreglo.length; c++)
		{
			for(int f=0; f<mi_arreglo[1].length; f++)
			{
				// me devuelve verdadero si el valor existe en algun arreglo
				if (mi_arreglo[c][f]==num);
				return true;
			}
		}
		// me devuelve falso si el valor no existe en algun arreglo			
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
