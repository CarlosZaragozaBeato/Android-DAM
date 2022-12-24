
package principal;

public class Cliente extends Utilidades{
    
    
    private int codigo,puntos,pedidos;
    private String nombre, apellidos, movil;
    private static int nextCodigo=1;
    
    
    
    
    
    
    
    
    
    
   public Cliente() {
          this.codigo = nextCodigo;
          this.puntos = 0;
          this.pedidos = 0;
          nextCodigo++;
   
   } 
    
    
    
    
      public Cliente(String nombre, String apellidos, String movil) {
        this.nombre =getFormatoNombre(nombre) ;
        this.apellidos = getFormatoNombre(apellidos);
        this.movil = movil;
        this.codigo = nextCodigo;
        nextCodigo++;
    }
    
    
    
    public Cliente( int puntos, int pedidos, String nombre, String apellidos, String movil) {
        this.codigo = nextCodigo;
        this.puntos = puntos;
        this.pedidos = pedidos;
        this.nombre = getFormatoNombre(nombre);
        this.apellidos = getFormatoNombre(apellidos);
        this.movil = movil;
        nextCodigo++;
    }
    
    
    
   public String getTipo(){
       String claseCliente=null;
       if(this.puntos>50 || this.pedidos>3){
           claseCliente = "cliente vip";
       }else{
           claseCliente = "cliente básico";
       }
       
       return claseCliente;
   } 
    
     @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", puntos=" + puntos + ", pedidos=" + pedidos + ", nombre=" + nombre + ", apellidos=" + apellidos + ", movil=" + movil + '}' +"El tipo del cliente es " +getTipo();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }
  public void setPedidos(int pedidos, int aumento) {
        this.pedidos = pedidos+aumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public static int getNextCodigo() {
        return nextCodigo;
    }

    public static void setNextCodigo(int nextCodigo) {
        Cliente.nextCodigo = nextCodigo;
    }
    


   


  

    
    
}
