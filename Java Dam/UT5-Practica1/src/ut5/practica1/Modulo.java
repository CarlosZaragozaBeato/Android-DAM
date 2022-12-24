
package ut5.practica1;

/**
 * 
 * @author usumaniana1
 */
public class Modulo {
 
    private int codigo;
    private String nombre;
    private Ciclo clc;
    private Profesor prf;
/**
 * 
 * @param codigo codigo del modulo
 * @param nombre nombre del modulo
 * @param clc ciclo del modulo
 */
 public Modulo(int codigo, String nombre, Ciclo clc) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clc = clc;
    }
 /**
  * 
  * @param codigo codigo del modulo
  * @param nombre nombre del modulo
  * @param clc ciclo del modulo
  * @param prf profesor del modulo 
  */
  public Modulo(int codigo, String nombre, Ciclo clc, Profesor prf) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clc = clc;
        this.prf = prf;
    }
  /**
   * 
   * @return devuelve el codigo del modulo
   */
   public int getCodigo() {
        return codigo;
    }
   /**
    * 
    * @param codigo cambia el codigo del modulo
    */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * 
     * @return devuelve el nombre del módulo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre cambia el nombre del módulo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return devuelve el ciclo del módulo
     */
    public Ciclo getClc() {
        return clc;
    }
    /**
     * 
     * @param clc cambia el ciclo del módulo 
     */
    public void setClc(Ciclo clc) {
        this.clc = clc;
    }
    /**
     * 
     * @return devuelve el profesor del módulo
     */
    public Profesor getPrf() {
        return prf;
    }
    /**
     * 
     * @param prf cambia el profesor del módulo
     */
    public void setPrf(Profesor prf) {
        this.prf = prf;
    }
    /**
     * 
     * @return devuelve la información del módulo
     */
    @Override
    public String toString() {
       
        return "Codigo Modulo : "+this.codigo+"\n"
                + "     Nombre Modulo: "+this.clc.getNombre()+"\n"
                + "     Codigo Ciclo :"+this.clc.getCodigo();
        
    }
 
    
    
}
