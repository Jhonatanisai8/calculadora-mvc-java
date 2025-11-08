package demo.calculadora.mvc.controller;

import demo.calculadora.mvc.model.Modelo;
import demo.calculadora.mvc.view.frmCalculator;

/**
 *
 * @author jhonatan
 */
public class Controlador {

    private Modelo modelo;
    private frmCalculator frmCalculator;

    public Controlador(Modelo modelo, frmCalculator frmCalculator) {
        this.modelo = modelo;
        this.frmCalculator = frmCalculator;
    }

    public void realizarSuma() {
        Integer num1 = frmCalculator.getNumero1();
        Integer num2 = frmCalculator.getNumero2();
        Integer resultado = modelo.sumar(num1, num2);
        frmCalculator.setResultado(resultado);
    }

    public void realizarResta() {
        Integer num1 = frmCalculator.getNumero1();
        Integer num2 = frmCalculator.getNumero2();
        Integer resultado = modelo.restar(num1, num2);
        frmCalculator.setResultado(resultado);
    }
}
