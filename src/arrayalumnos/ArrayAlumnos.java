/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayalumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class ArrayAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      MetodoArrayAlumnos obx = new MetodoArrayAlumnos();
        int op;
        do{
          op = Integer.parseInt(JOptionPane.showInputDialog("***MENÚ***\nApachurre 1 para 'cargar array'\nApachurre 2 para 'consultar alumno'\nApachurre 3 para 'consultar nota'\nApachurre 4 para 'ordenar nomes e notas'\nSalir"));
          
          switch(op){
              case 1: obx.cargarArray();
                  break;
              case 2: obx.visualizar();
                  break;
              case 3: obx.amosar();
                  break;
              case 4: obx.ordenarcion();
                  break;
              //case 5: System.exit(0);
                  
              default: JOptionPane.showMessageDialog(null,"Apachurre o boton correcto wey");
          }
        }while(op<5);
        
        
    }
    
}
