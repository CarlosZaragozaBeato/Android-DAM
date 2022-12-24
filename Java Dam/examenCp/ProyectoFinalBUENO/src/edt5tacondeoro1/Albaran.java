/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt5tacondeoro1;

/**
 *
 * @author usumaniana1
 */
public class Albaran {
    
    private Socio socio;
    private Pedido pedido;
    private double total;

    public Albaran() {
    }

    public Albaran(Socio socio, Pedido pedido, double total) {
        this.socio = socio;
        this.pedido = pedido;
        this.total = total;
    }

    public Socio getSocio() {
        return socio;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Albaran{" + "socio=" + socio + ", pedido=" + pedido + '}';
    }
    
    
    
}
