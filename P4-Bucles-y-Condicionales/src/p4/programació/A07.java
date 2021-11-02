/*"
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.programació;

/**
 *
 * @author Javier
 */
public class A07 {

    public static void main(String[] args) {
        int num = 542344;
        int div = num;
        int resto = -1;
        int multiplo = 3;
        while ((resto > multiplo || resto != 0)) {
            resto = num % multiplo;
            div /= multiplo;
            System.out.println("Resultado división de " + num + " entre " + multiplo + ": " + div + " Resto: " + resto);
            num = div;

        }
    }
}
