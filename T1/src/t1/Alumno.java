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
        if(dni.length()==8)
        {
            this.dni= dni;
        }
        else
        {
            System.out.println("El DNI debe tener 8 dígitos");
        }
    }

    public String getResidenciaTemporal() {
        return residenciaTemporal;
    }

    public void setResidenciaTemporal(String residenciaTemporal) {
        if(residenciaTemporal.length()==11)
        {
            this.residenciaTemporal= residenciaTemporal;
        }
        else
        {
            System.out.println("El código de residencia temporal debe tener 11 dígitos");
        }
    }

    public char getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(char nivelSocioeconomico) {
        if (nivelSocioeconomico == 'A')
        {
            this.nivelSocioeconomico = nivelSocioeconomico;
        }
        else if (nivelSocioeconomico == 'B')
        {
            this.nivelSocioeconomico = nivelSocioeconomico;
        }
        else if (nivelSocioeconomico == 'C')
        {
            this.nivelSocioeconomico = nivelSocioeconomico;
        }
        else
        {
            System.out.println("Solo debe elegir una lentra (A/B/C)");
        }
        
    }

    public char getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(char tipoBeca) {
        if(tipoBeca=='C')
        {
            this.tipoBeca = tipoBeca;
        }
        else if (tipoBeca == 'M')
        {
            this.tipoBeca= tipoBeca;
        }
        else if (tipoBeca == 'N')
        {
            this.tipoBeca= tipoBeca;
        }
        
    }
    
    void verAlumno()
    {
        System.out.println("Alumno: Nombre: "+ this.nombreCompleto+ 
                " Dni: " + this.dni+
                " Residencia Temporal: "+this.residenciaTemporal +
                " Nivel Socioeconomico: Nivel " + this.nivelSocioeconomico+
                " Beca: "+this.tipoBeca);
    }
}

