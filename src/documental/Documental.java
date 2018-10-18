/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documental;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Documental {
    
    public String subgenero;
    public String modoExposicion;
    public String nivelDivulgacion;
    public String formato;
    
    public Documental (String sg, String me, String nd, String f){
        this.subgenero = sg;
        this.modoExposicion = me;
        this.nivelDivulgacion = nd;
        this.formato = f;
    }
    
    public void reproducir() {
    }
    
    public void eliminar() {
    }
    
    
    public static void main(String[] args) {
        
        Documental d1  = new Documental ("Problemática social.","Divulgativo.","Público interesado.", "Televisivo.");
                        
                System.out.println("DOCUMENTAL NRO 1" + '\n' + "Subgénero: " + d1.subgenero + '\n'
                + "Modo de exposición: " + d1.modoExposicion + '\n' + "Nivel de divulgación: "
                + d1.nivelDivulgacion + '\n' + "Formato: " + d1.formato);
                
                
        Documental d2  = new Documental ("Médico.","Científico.","Experto.", "Cinematográfico.");
                        
                System.out.println("DOCUMENTAL NRO 2" + '\n' + "Subgénero: " + d2.subgenero + '\n'
                + "Modo de exposición: " + d2.modoExposicion + '\n' + "Nivel de divulgación: "
                + d2.nivelDivulgacion + '\n' + "Formato: " + d2.formato);
        
       
        Documental d3  = new Documental ("De naturaleza.","Entretenimiento.","Gran público.", "Cinematográfico.");
                        
                System.out.println("DOCUMENTAL NRO 3" + '\n' + "Subgénero: " + d3.subgenero + '\n'
                + "Modo de exposición: " + d3.modoExposicion + '\n' + "Nivel de divulgación: "
                + d3.nivelDivulgacion + '\n' + "Formato: " + d3.formato);        
        
        
        Documental d4  = new Documental ("Jurídico.","Divulgativo.","Público interesado.", "Televisivo.");
                        
                System.out.println("DOCUMENTAL NRO 4" + '\n' + "Subgénero: " + d4.subgenero + '\n'
                + "Modo de exposición: " + d4.modoExposicion + '\n' + "Nivel de divulgación: "
                + d4.nivelDivulgacion + '\n' + "Formato: " + d4.formato); 
                
                
        Documental d5  = new Documental ("Arqueológico.","Científico.","Experto.", "Cinematográfico.");
                 
                System.out.println("DOCUMENTAL NRO 5" + '\n' + "Subgénero: " + d5.subgenero + '\n'
                + "Modo de exposición: " + d5.modoExposicion + '\n' + "Nivel de divulgación: "
                + d5.nivelDivulgacion + '\n' + "Formato: " + d5.formato);
                
                JOptionPane.showMessageDialog(null, "DOCUMENTAL NRO 1" + '\n' + "Subgénero: "
                + d1.subgenero + '\n' + "Modo de exposición: " + d1.modoExposicion + '\n'
                + "Nivel de divulgación: " + d1.nivelDivulgacion + '\n' + "Formato: " + d1.formato + '\n'
                + "DOCUMENTAL NRO 2" + '\n' + "Subgénero: " + d2.subgenero + '\n' + "Modo de exposición: "
                + d2.modoExposicion + '\n' + "Nivel de divulgación: " + d2.nivelDivulgacion + '\n' + "Formato: "
                + d2.formato + '\n' + "DOCUMENTAL NRO 3" + '\n' + "Subgénero: " + d3.subgenero + '\n'
                + "Modo de exposición: " + d3.modoExposicion + '\n' + "Nivel de divulgación: " +
                d3.nivelDivulgacion + '\n' + "Formato: " + d3.formato + '\n' + "DOCUMENTAL NRO 4" + '\n'
                + "Subgénero: " + d4.subgenero + '\n' + "Modo de exposición: " + d4.modoExposicion + '\n'
                + "Nivel de divulgación: " + d4.nivelDivulgacion + '\n' + "Formato: " + d4.formato + '\n'
                + "DOCUMENTAL NRO 5" + '\n' + "Subgénero: " + d5.subgenero + '\n' + "Modo de exposición: "
                + d5.modoExposicion + '\n' + "Nivel de divulgación: " + d5.nivelDivulgacion + '\n' + "Formato: "
                + d5.formato);
                
        }
    
}
