/**
 * Descripción: Realizar un programa que contenga un 
 * método que su parámetro sea una cadena de números enteros, 
 * y que realice la suma de todos los números de un solo dígito que se puedan 
 * extraer del número dado, la suma ahora será el número a abstraer dígitos, 
 * repetir hasta obtener un número de un solo digito y retornarlo.
 * 
 * @author (Aimée Jahdaí Pineda Nivón) 
 * @version (15/04/2020)
 */
public class Digitos
{// se crea la clase Dígitos
    // se declaran las variables de instancia
    
    /**
     * Campos de clase
       */
    private String numero;
    private int suma;
    /**
     * Constuctor para la clase Digitos
       */
    public Digitos()// se ejecuta el método constructor Dígitos
    {
        // se inicializan las variables 
        numero = " ";
        suma = 0;
    }
    /**
     
     
     *@param numero El parametro numero define el numero que va a acceder el usuario
     */
    public void SumaDigitos(String numero)
    {// inicio del método que realiza la suma de los dígitos del número a ingresar
        do{// Inicio del do - while
            int longitud = numero.length();/// se obtiene el valor de la variable local longitud con el método .length() del número que nos dieron 
            suma = 0;//cuando siguen quedando dos dígitos en la pprimera suma se tine que iniciar de cero otra vez
            for (int i = 0; i < longitud; i++) {// se inicia el for
             String num = String.valueOf(numero.charAt(i));// se crea la variable local num y con el metodo de String se pasa de char a string
             suma += Integer.parseInt(num);//pasamos de tipo String a int para poder sumar 
            }// fin del for
            numero = suma + "";// se pasa de int (que es el tipo de dato de suma) a string (que es el tipo de dato de número)
        }while(suma > 9);// se repite mientras la suma sea mayor a 9 es decir mientras hayan dos dígitos
    }
     /**
     
     
     *@return toString El método toString devuelve el resultado de la suma de lo dígitos del número
     */
   public String toString()//inicia el método tipo String que muestra la suma 
    {
        String cadena =  " ";// se declara la variable local cadena en vacío
        cadena = "Suma: " + suma; // se le asigna a la cadena el valor de la suma
        return cadena;//se muestra el resultado de la suma
    }// fin del métdodo toString
}// cierre de la clase

