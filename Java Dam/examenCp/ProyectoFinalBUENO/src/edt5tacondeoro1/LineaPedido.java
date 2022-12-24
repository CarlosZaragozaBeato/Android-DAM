package edt5tacondeoro1;


public class LineaPedido {

	private int cantidad;
	private Articulo articulo;
	//private Pedido Pedido;

    public LineaPedido(Articulo articulo, int cantidad) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
        

	public int getCantidad() {
		return this.cantidad;
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
        
        


}