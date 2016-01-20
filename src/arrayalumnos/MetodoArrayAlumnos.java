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
public class MetodoArrayAlumnos {
    int numElementos=pedirElementos();
    
    
   String [] nomes= new String [numElementos];
    float[]notas=new float[numElementos];
    
    public int pedirElementos(){
         return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumnos"));
    } 

    public String pedirNome(){
        return (JOptionPane.showInputDialog("Introduce el nombre del alumno"));
    }

    public float pedirNota(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del alumno"));
    }

    public void cargarArray(){
        for(int i=0;i<numElementos;i++){
           
             nomes[i]=pedirNome();
             
             notas[i]=pedirNota();
            
        }
    }
        public void visualizar(){
            
            for(int y=0;y<nomes.length;y++)
                System.out.println("Alumno:"+ nomes[y]+" "+"Nota: "+ notas[y]);
           
        }
        
        public void ordenarcion(){
            float aux;
            String aux1;
            
            for(int x=0;x<numElementos-1;x++)
                for(int j=x+1;j<numElementos;j++)
                    if(notas[x]>notas[j]) {
                       aux =  notas[x]; 
                       notas[x] = notas[j];
                       notas[j] = aux;
                       aux1 = nomes[x];
                       nomes[x]=nomes[j];
                       nomes[j] =aux1;
                       
                       
                       
                       
            
                    
                       
                     
                    }
                
}

    
    }



