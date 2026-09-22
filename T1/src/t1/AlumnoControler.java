/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1;

/**
 *
 * @author Fabia
 */
import java.util.ArrayList;
public class AlumnoControler {
    
    ArrayList<Alumno> lista_alumno = new ArrayList();
    void agregarAlumno(Alumno a)
    {
        lista_alumno.add(a);
    }
    void listaAlumno()
    {
        System.out.println("La lista de asistentes es:");
        for(Alumno alumno : lista_alumno)
        {
            alumno.verAlumno();
        }
    }
}
