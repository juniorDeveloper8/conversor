/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura;

/**
 *
 * @author rober
 */
public class grados {
    private int diviza;
    private double valor;
    private double result;
    private int diviza2;

    public grados() {
    }

    public int getDiviza() {
        return diviza;
    }

    public void setDiviza(int diviza) {
        this.diviza = diviza;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public int getDiviza2() {
        return diviza2;
    }

    public void setDiviza2(int diviza2) {
        this.diviza2 = diviza2;
    }
    
    public double convertir() {

        if (diviza == 0 && diviza2 == 1) {
            result = valor + 33.8;
        } else {
            result = valor - 33.8;
        }

        return result;
    }
}
