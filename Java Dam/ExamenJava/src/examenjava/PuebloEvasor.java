/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjava;

/**
 *
 * @author carlo
 */
public class PuebloEvasor extends Exception{
    private final int codigoError;
    private String mensaje;
    private int cantEvadida;

public PuebloEvasor(int codigoError, String mensaje) {
        super();
        this.codigoError = codigoError;
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        String msgFinal = " --> ";
        switch (this.codigoError) {
            case 1:
                msgFinal+=""+this.mensaje;
                break;
                case 2:
                msgFinal+=""+this.mensaje;
                break;
        }
        return msgFinal;
    }
}
