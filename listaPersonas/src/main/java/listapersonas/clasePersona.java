package listapersonas;
import java.util.ArrayList;
import java.util.Scanner; 

public class clasePersona {

      String nombre1, nombre2, apellido1, edad1,pais1, numIdent1;
    
 // Constructor al que se le pasa los datos
    public clasePersona(String nombre1, String nombre2, String apellido1, String edad1, String pais1, String numIdent1) {
    this.nombre1=nombre1;
    this.nombre2=nombre2;
    this.apellido1=apellido1;
    this.edad1=edad1;
    this.pais1=pais1;
    this.numIdent1=numIdent1;
    }
 
   // funciones para regresar los valores de cada variable
   String getFirstName(){
        return nombre1;
    }   
   String getSecondName(){
        return nombre2;
    }
   String getLastName(){
        return apellido1;
    }
   String getAge(){
        return edad1;
    }
   String getCountry(){
        return pais1;
    }
   String getDpi(){
        return numIdent1;
    }
         
    // funcion para solicitar ingreso de datos y retorna toda la información mediante un array
    static String[] llenado(){
        Scanner entradaEscaner = new Scanner (System.in); 
        String firstName, secondName, lastName, age, dpi, country  ;
 
        System.out.println ("First Name " );  firstName = entradaEscaner.nextLine (); 
        System.out.println ("Second Name ");  secondName = entradaEscaner.nextLine (); 
        System.out.println ("Last Name "  );  lastName = entradaEscaner.nextLine (); 
        System.out.println ("Age "        );  age  = entradaEscaner.nextLine (); 
        System.out.println ("DPI "        );  dpi = entradaEscaner.nextLine (); 
        System.out.println ("Country "    );  country = entradaEscaner.nextLine (); 

        return new String []  {firstName, secondName, lastName,  age, dpi,country};
    }

    
    // método para impresion del arrayList  con la informacion de las personas ingresadas
 public static void imprimir(ArrayList<clasePersona> lista) {
        System.out.println("**********Listado de personas ingresadas*******");
        for (int i=0 ; i< lista.size();i++  ){
            //uso las funciones para retornar los valores 
            System.out.print("#"+(i+1)+" Nombre: "+lista.get(i).getFirstName()+" ");
            System.out.print(lista.get(i).getSecondName()+" ");
            System.out.print(lista.get(i).getLastName()+" ");
            System.out.print("Edad: "+lista.get(i).getAge()+" ");
            System.out.print("DPI: "+lista.get(i).getDpi()+" ");
            System.out.print("Pais: "+lista.get(i).getCountry()+"\n");
            
        }
        
    }

   
}
