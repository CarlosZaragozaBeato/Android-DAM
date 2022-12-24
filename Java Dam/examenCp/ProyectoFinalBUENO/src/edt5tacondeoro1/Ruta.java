package edt5tacondeoro1;

/**
 * Representa una ruta de env�o de paquetes de los socios. Los pedidos se asignan a las rutas en funci�n de la poblaci�n del socio que ha hecho el pedido. Una ruta almacena un �rea de influencia y unos d�as de reparto.
 */
public class Ruta {

        private String nombre;
	private String[] areaInfluencia;
	private String[] diasReparto;
	EmpresaDeTransporte EmpresaDeTransportesRol;

	public String[] getAreaInfluencia() {
		return this.areaInfluencia;
	}

	/**
	 * 
	 * @param areaInfluencia
	 */
	public void setAreaInfluencia(String[] areaInfluencia) {
		this.areaInfluencia = areaInfluencia;
	}

	public String[] getDiasReparto() {
		return this.diasReparto;
	}

	/**
	 * 
	 * @param diasReparto
	 */
	public void setDiasReparto(String[] diasReparto) {
		this.diasReparto = diasReparto;
	}

	
        
        public Ruta(String nombre, String[] areaInfluencia) {
        this.areaInfluencia = areaInfluencia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

}