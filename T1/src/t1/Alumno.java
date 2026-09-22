/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1;

/**
 *
 * @author Fabia
 */
public class Alumno {
    private String nombreCompleto;
    private String dni;
    private String residenciaTemporal;
    private char nivelSocioeconomico;
    private char tipoBeca;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getResidenciaTemporal() {
        return residenciaTemporal;
    }

    public void setResidenciaTemporal(String residenciaTemporal) {
        this.residenciaTemporal = residenciaTemporal;
    }

    public char getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(char nivelSocioeconomico) {
        this.nivelSocioeconomico = nivelSocioeconomico;
    }

    public char getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(char tipoBeca) {
        this.tipoBeca = tipoBeca;
    }
    
    void verAlumno()
    {
        System.out.println("Alumno: Nombre: "+ this.nombreCompleto+ 
                " Dni: " + this.dni+
                " Residencia Temporal: "+this.residenciaTemporal +
                " Nivel Socioeconomico: " + this.nivelSocioeconomico+
                " Beca: "+this.tipoBeca);
    }
}

