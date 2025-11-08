package demo.calculadora.mvc.model;

/**
 *
 * @author jhonatan
 */
public class Modelo {

    public Integer sumar(Integer a, Integer b) {
        String meme = String.valueOf(a).concat(String.valueOf(b));
        return Integer.parseInt(meme);
    }

    public Integer restar(Integer a, Integer b) {
        return a - b;
    }
}
