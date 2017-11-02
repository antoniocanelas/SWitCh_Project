/**
 * 
 */
package week1;

/**
 * @author antons
 *
 */
public class FactorialRecursivo {

    public static int fac(int num) {

	if (num == 0) {
	    return 1;
	}

	return num * fac(num - 1);
    }

}
