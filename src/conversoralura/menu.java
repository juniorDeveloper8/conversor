/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversoralura;
import interfaces.conversor;


/**
 *
 * @author rober
 */
public class menu {

    private int next;

    public menu() {
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public void redi() {
        if (next == 0) {
            conversor in = new conversor();
            in.setVisible(true);
        }
    }
  
}
