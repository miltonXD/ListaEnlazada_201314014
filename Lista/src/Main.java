import java.util.Scanner;

//Made by Milton Navarro
public class Main {
	
	
	private static Scanner sc;

	public static void main(String[] args) {
	ListaEnlazada lista = new ListaEnlazada();
	  sc = new Scanner(System.in);
	   int dato;
	   int n;
	   System.out.println("***********Bienvenido a Lista Enlazada Simple************");
       do{
    	   System.out.println("1.Agregar un numero en la lista");
           System.out.println("2.Eliminar numero de la lista "); 
           System.out.println("3 Mostrar tamallo de la lista ");
           System.out.println("4 Elimina inicio de la lista");
           System.out.println("5 Elimina final de la lista");
           System.out.println("6.Mostrar la lista ");
           System.out.println("7.Buscar numero en la lista");
           System.out.println("8.Agregar al inicio");
           System.out.println("9.Salir del programa");
    	   System.out.println("ingrese la opcion que desea (1-7)") ;  
    	   n = sc.nextInt(); 
    	    switch(n){ 
                  case 1: 
                	  System.out.println("ingrese un numero");
                	  dato=sc.nextInt();
                	  lista.Agregar(dato);
                	  System.out.println("Se ha agradado un numero a la lista");
                	  System.out.println();
                      break;
                  case 2: 
                	  System.out.println("ingrese un numero");
                	  dato=sc.nextInt();
                	  lista.eliminar(dato);
                      break;
                  case 3: 
                	  System.out.println("El tamano de la lista es: "+ lista.tamano());
                      break;
                  case 4: 
                	  lista.EliminaInicio();
                	  System.out.println("Se ha eliminado el inicio");
                      break;
                  case 5: 
                	  lista.EliminaFinal();
                	  System.out.println("Se ha eliminado el final");
                      break;
                  case 6:
                	  System.out.print("La lista contiene: ");
                	  lista.imprimir();
                	  break;
                  case 7: 
                	  System.out.println("ingrese un numero");
                	  dato=sc.nextInt();
                	  System.out.println(lista.buscar(dato));
                      break;
                  case 8:
                	  System.out.println("ingrese un numero");
                	  dato=sc.nextInt();
                       lista.AgregarInicio(dato);
                      break;
                  case 9: 
                	  System.exit(1);
                      break;
                  default: System.out.println("numero invalido eliga una opcion correcta");
    	    }
        }while(n!=9);

   }
}
	
