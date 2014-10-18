
public class Nodo {
	Nodo nododer;
    int dato;
    
    public Nodo(int d)
    {
        this.dato = d;
        this.nododer = null;
    }
    public Nodo (int d, Nodo union){ 
        this.dato= d;
        nododer = union; 
        } 

}
