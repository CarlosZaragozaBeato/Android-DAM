
package actividad_5.pkg6;

import java.io.Serializable;


public class Calificación implements Serializable{
    
    
    private double bDatos, programacion, ende, sisi, fol, ing, lgm;

    public Calificación(double bDatos, double programacion, double ende, double sisi, double fol, double ing, double lgm) {
        this.bDatos = bDatos;
        this.programacion = programacion;
        this.ende = ende;
        this.sisi = sisi;
        this.fol = fol;
        this.ing = ing;
        this.lgm = lgm;
    }

    public double getbDatos() {
        return bDatos;
    }

    public void setbDatos(double bDatos) {
        this.bDatos = bDatos;
    }

    public double getProgramacion() {
        return programacion;
    }

    public void setProgramacion(double programacion) {
        this.programacion = programacion;
    }

    public double getEnde() {
        return ende;
    }

    public void setEnde(double ende) {
        this.ende = ende;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getFol() {
        return fol;
    }

    public void setFol(double fol) {
        this.fol = fol;
    }

    public double getIng() {
        return ing;
    }

    public void setIng(double ing) {
        this.ing = ing;
    }

    public double getLgm() {
        return lgm;
    }

    public void setLgm(double lgm) {
        this.lgm = lgm;
    }
    
    
    
    
}
