
package pokearrayprueba;

public class pokemon {
    
    public long ID=0;
    public String nombre="";
    public String tipo="";
    public int nivel=0;
    public String email="";
    
    public pokemon(){
        super();
    }
    public pokemon(long ID, String nombre, String tipo, int nivel, String email) {
        this.ID=ID;
        this.nombre=nombre;
        this.tipo=tipo;
        this.nivel=nivel;
        this.email=email;
    }
    public pokemon(long ID, int nivel){
        this.ID=ID;
        this.nivel=nivel;
    }

    @Override
    public String toString() {
        return "pokemon{" + "ID=" + this.ID + ", nombre=" + this.nombre + ", tipo=" + this.tipo + ", nivel=" + this.nivel + ", email=" + this.email + '}';
    }
    
    
    
}
