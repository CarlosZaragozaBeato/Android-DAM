package edt5tacondeoro1;

/**
 * Uno de los nucleos centrales del sistema. Representa los articulos que se venden a traves del sistema. De un articulo almacenamos su nombre, descripcion, precio, material, stock y una fotografia.
 */
public class Articulo {

	private String nombre;
	private float precio;
	private String descripcion;
	private String material;
	private int stock;
	private String fotografia;
        
        public Articulo(){
            
        }

    public Articulo(String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.material = material;
        this.stock = stock;
        this.fotografia = fotografia;
    }
    public Articulo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
        

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		// TODO - implement Articulo.setDescripcion
		throw new UnsupportedOperationException();
	}

	public String getMaterial() {
		return this.material;
	}

	/**
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	public int getStock() {
		return this.stock;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getFotografia() {
		return this.fotografia;
	}

	/**
	 * 
	 * @param fotografia
	 */
	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

    @Override
    public String toString() {
        return nombre +" " +precio ;
    }
        
        

}