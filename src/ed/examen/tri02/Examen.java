package ed.examen.tri02;
/**
 * @author Antonio Manuel Escaño Arias
 * @version https://github.com/aescanyo/ED_examenTRI02_AMEA.git
 */
public class Examen
{
    
/**
 * Constante TAMAÑO FIJO
 */
 public static int TAMAÑOMAXIMO = 100;
 /**
  * 
  * @param listaEnteros
  * @return null
  * @throws Exception 
  * Comprueba que el array no esté vacío
  */

 public static int elMayorDe (int[] listaEnteros) throws Exception {
 if (listaEnteros == null) {
    throw new Exception ("Lista de números vacía, no se puede calcular el máximo");
 }
 /**
  * Comprueba que el array no supere el tamaño máximo definido.
  */
 if (listaEnteros.length > TAMAÑOMAXIMO) {
    throw new Exception ("Lista de números demasido grande, no se puede calcular el máximo");
 }
 
/**
 * Ordena el array guardando en mayor el mayor al recorrer el array.
 * @ return mayor
 */
 int mayor = listaEnteros[0];
 for (int i = 1; i< listaEnteros.length; i++) {
 if (mayor < listaEnteros[i]) {
 mayor = listaEnteros[i];
 }
 }
 return mayor;
 }
}

