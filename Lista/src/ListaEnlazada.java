
public class ListaEnlazada {
	private Nodo NodoInicio;
    private Nodo NodoUltimo;
    private int tamano;
    public ListaEnlazada(){
        this.NodoInicio= null;
        this.NodoUltimo = null;
        this.tamano = 0;               
    }
    
    public boolean vacio()
    {
        return(this.NodoInicio == null);
    }
    public void Agregar(int dato)
    {
        if(vacio())
        {
            Nodo nuevo = new Nodo(dato);
            NodoInicio = nuevo;
            NodoUltimo = nuevo;
           tamano = 1;
        }
        else{
            Nodo nuevo = new Nodo(dato);
           NodoUltimo.nododer = nuevo;
           NodoUltimo = nuevo;
           tamano++;
        }
    }
   public  void AgregarInicio(int dato){
    	 if (vacio())  
    	   { 
    	    NodoInicio=new Nodo(dato); 
    	    tamano=1;
    	   }else{ 
    	   Nodo Nuevo = new Nodo(dato,NodoInicio); 
    	    NodoInicio=Nuevo; 
    	     tamano++;
    	    } 

	}
    public int tamano(){
        return this.tamano;
    }
    public Nodo eliminar(int dato)
    {
        Nodo eliminar = null;
        if(!vacio())
        {      Nodo actual = NodoInicio;
               Nodo  anterior = NodoInicio;
            for(int i =0;i<this.tamano;i++)
            {
                if(actual.dato == dato)
                {
                    if(actual == NodoInicio)
                    {
                        NodoInicio = actual.nododer;
                    }
                    if(actual == NodoUltimo)
                    {
                        NodoUltimo =anterior;
                        if(anterior == null)
                            NodoUltimo = NodoInicio;
                    }else{
                        anterior.nododer = actual.nododer;
                        
                    }
                    this.tamano--;
                }
                anterior = actual;
                actual = actual.nododer;
            }
                            
        }
        return eliminar;
    }
    
    public void EliminaInicio(){
		if(vacio())
		System.out.println("No hay elementos");
		else
		if(NodoInicio.equals(NodoUltimo)){
		NodoInicio=NodoUltimo=null;
		this.tamano--;}
		else{
		NodoInicio=NodoInicio.nododer;
		this.tamano--;
		}
	}
    public void EliminaFinal(){
        if(vacio()) {
        	System.out.println("No hay elementos");
        }
        else{
    		if(NodoInicio.equals(NodoUltimo)){
    		NodoInicio=NodoUltimo=null;
    		this.tamano--;
    		}else{
            Nodo actual = NodoInicio;
            Nodo anterior= NodoInicio;
            while(actual.nododer != null) {
                anterior=actual;
                actual =actual.nododer;
            }
            anterior.nododer=null;
            this.tamano--;
    	}
      }
       
	}
    public String buscar(int dato){
    	Nodo temp=NodoInicio;
    	while(temp!=null){
    		if (temp.dato==dato){
    			return "El numero se ecuentra en la lista";
    		}
    		temp=temp.nododer;
    	}
    	return "El numero no se encuentra en la lista";
    }
    
    public void imprimir()
    {
    	if (vacio()){
			System.out.println("la lista esta Vacia" );
		}
		else{
			Nodo Actual=NodoInicio;
			while(Actual != null){
				System.out.print(Actual.dato+" ");
				Actual=Actual.nododer;
			}
			System.out.println();
		}
    }
    
}
