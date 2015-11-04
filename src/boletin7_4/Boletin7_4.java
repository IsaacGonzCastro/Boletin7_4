
package boletin7_4;

/**
 *
 * @author igonzalezcastro
 */
public class Boletin7_4 {

    public static void main(String[] args) {
    String nome1, nome2;
    float peso1, peso2;
    Peso obx = new Peso();
    nome1 = obx.PedirNome();
    nome2 = obx.PedirNome();
    peso1 = obx.PedirPeso();
    peso2 = obx.PedirPeso();
    obx.Peso(nome1, nome2, peso1, peso2);
    }
    
}
