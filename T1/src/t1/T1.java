/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1;
import java.util.Scanner;
/**
 *
 * @author Fabia
 */
public class T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno a = new Alumno();
        System.out.println("Ingrese el Nombre completo del Estudiante");
        a.setNombreCompleto(sc.nextLine());
        System.out.println("Ingrese el Dni del Estudiante");
        a.setDni(sc.nextLine());
        System.out.println("Ingrese el código de residencia temporal del Estudiante");
        a.setResidenciaTemporal(sc.nextLine());
        System.out.println("Ingrese el nivel socioeconomico del Estudiante [A/B/C]");
        a.setNivelSocioeconomico(sc.nextLine().charAt(0));
        System.out.println("Cuenta con beca? Beca Completa: C; Media Beca: M; No cuenta: N");
        a.setTipoBeca(sc.nextLine().charAt(0));
        
        
        a.verAlumno();
    }
    
}
