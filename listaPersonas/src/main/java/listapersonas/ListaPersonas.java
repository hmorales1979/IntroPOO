package listapersonas;
import java.util.ArrayList;
import java.util.Scanner; 

public class ListaPersonas {    
    // método para pintar el Menu
    static String  Menu(){
         Scanner entradaEscaner = new Scanner (System.in); 
         
         System.out.println("======================");
         System.out.println("1) Registrar personas");
         System.out.println("2) Imprimir listado");
         System.out.println("3) Salir"); 
         System.out.println("======================");
         String  opcion = entradaEscaner.nextLine (); 
         
         return opcion;
    }
    
    public static void main(String[] args) {
        String salir = "";
        Scanner entradaEscaner = new Scanner (System.in); 
         
        //arrayList de tipo ClasePersona
         ArrayList <clasePersona> arrayPersonas= new ArrayList <clasePersona> ( ); 
        
        while (salir !="salir") 
            {         
                 switch (Menu()) 
                 {
                     case "1":                                                            
                               if (arrayPersonas.size() <10 )
                               {
                                        int cont=arrayPersonas.size();
                                        while (cont < 10 )
                                         {
                                             //utilizo la funcion llenado de la clase "clasePersona"
                                             String [] returnDatos = clasePersona.llenado(); // recibo los datos en un arreglo
                                             arrayPersonas.add(new clasePersona(returnDatos[0], //primer nombre
                                                                                returnDatos[1], //segundo nombre
                                                                                returnDatos[2], //apellido
                                                                                returnDatos[3], //edad
                                                                                returnDatos[4], //dpi
                                                                                returnDatos[5]) //pais
                                                               );

                                              if (cont<10){ 
                                                 System.out.println ("ingresar otra persona? (n)salir, enter para continuar ");
                                                 salir = entradaEscaner.nextLine (); 
                                              }

                                             if (salir.equals("n")){
                                                 cont=10     ;
                                             } else {
                                                 cont=cont+1;
                                             }

                                         }  
                               }else {
                                   System.out.println ("No puede ingresar mas registros, maximo 10 personas ");
                               }

                              break;
                     case "2":
                             //invoco el metodo imprimir de la clase clasePersona  y mando arrayPersonas de parámetro
                             clasePersona.imprimir(arrayPersonas);
                             
                              break;                             
                     case "3": 
                             salir="salir";
                              break;
                  }
             }                         
    }
}
