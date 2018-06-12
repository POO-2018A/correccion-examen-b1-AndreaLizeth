/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccionprueba;
import java.util.*;
/**
 *
 * @author Andrea Lizeth
 */
public class CorreccionPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int numLib = 1,cont = 0, opc;
        
        
        
        
        Libros libros []= new Libros[numLib];
        Autor autor[]= new Autor[numLib];
        
     do{
        System.out.println("Ingrese la opción deseada: ");
        System.out.println("1. Ingresar nuevo libro.");
        System.out.println("2. Lista de Favoritos.");
        System.out.println("3. Contar libros de Autor.");
        System.out.println("4. Salir!!");
        
        opc = scan.nextInt();
     
            switch(opc){
                case 1:
                    if(numLib == 10){
                        System.out.println("Lista de Libros llena");
                        break;
                    }
                
                    System.out.println("\tLIBROS");
                   
                
                    for(int i = 0; i < libros.length ; i++){
                        
                        System.out.println("\tLibro"+ (i+1));
                        
                        System.out.print("Título: ");
                        scan.nextLine();
                        String titulo = scan.nextLine();
                        
                        System.out.print("Autor: ");
                        String nombAutor = scan.nextLine();
                        
                        System.out.print("Pais del Autor: ");
                        String pais = scan.nextLine();
                        
                        autor [i] = new Autor(nombAutor, pais);
                        
                        System.out.print("Año: ");
                        int anio = scan.nextInt();
                        
                        System.out.println("¿El libros es uno de sus favoritos?");
                        System.out.println("0: no  ;  1: si");
                        boolean favorito = false;
                        int fav = scan.nextInt();
                        
                        if(fav == 1){
                            favorito = true;                            
                        }
                        
                        libros[i]= new Libros(titulo,autor,anio,favorito);
                    }
                        cont++;
                        numLib++;
                        
                    break;
                    
                case 2:
                    if(libros == null){
                        System.out.println("No existen libros en la lista.");
                      
                    }else{
                    
                    
                    System.out.println("\tFAVORITOS");
                    System.out.println(libros);
                    }
                    
                    break;
                    
                case 3:
                    if(autor == null){
                        System.out.println("No se ha registrado ningún autor en Libros.");
                        break;
                    }
                    boolean igual = false;
                    for(int j = 0; j < autor.length; j++){
                        if(autor.equals(autor[j])){
                            System.out.println(autor);
                            igual = true;
                        }
                    
                    
                    }
                    break;
                case 4:
                    System.out.println("ADIOS!");
                    break;
                default:
                    System.out.println("OPCION NO VÁLIDA!!");
                    break;
                    
        
            }
        }while(opc != 4);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
