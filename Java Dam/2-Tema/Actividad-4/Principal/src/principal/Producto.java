
package principal;


public class Producto extends Utilidades{
    
    private int codigo,stockProducto;
    private String titulo;
    private double Iva, precio;
    private Categoria categoria;
    private static int nextCodigo=1;

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", stockProducto=" + stockProducto + ", titulo=" + titulo + ", Iva=" + Iva + ", precio=" + precio + ", categoria=" + categoria + '}';
    }

    public Producto( int stockProducto, String titulo, double Iva, double precio, Categoria categoria) {
        this.codigo = nextCodigo;
        this.stockProducto = stockProducto;
        this.titulo = getFormatoNombre(titulo);
        this.Iva = Iva;
        this.precio = precio;
        this.categoria = categoria;
        nextCodigo++;
    }
    
 



    public Producto() {
        this.codigo = nextCodigo;
        this.stockProducto = stockProducto;
        this.titulo = getFormatoNombre(titulo);
        this.Iva = Iva;
        this.precio = precio;
        this.categoria = categoria; 
        nextCodigo++;
    }





    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getTitulo() {
        return getFormatoNombre(titulo);
    }

    public void setTitulo(String titulo) {
       this.titulo = getFormatoNombre(titulo);
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

 

    

    
    
}
