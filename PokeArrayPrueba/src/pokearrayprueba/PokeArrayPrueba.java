
package pokearrayprueba;
import Validaciones.*;
import java.util.ArrayList;
import java.util.Scanner;


public class PokeArrayPrueba {
    public static void imprimir(ArrayList<pokemon> RegistroPoke){
         for(pokemon i:RegistroPoke){
                        System.out.println("ID: "+i.ID);
                        System.out.println("Nombre: "+i.nombre);
                        System.out.println("Tipo: "+i.tipo);
                        System.out.println("Nivel: "+i.nivel);
                        System.out.println("Email de entrenador: "+i.email);
                        System.out.println("   ");
                        System.out.println("---------");
                    }
    }
    
    public static void menu(){
        int rsta=0;
        validar pep=new validar();
        boolean r=true;
        Scanner tec=new Scanner(System.in);
        ArrayList<pokemon> RegistroPoke=new ArrayList<pokemon>();
         pokemon pe=new pokemon(10001,"Pikachu","Electrico",100,"Usuario@gmail.com");
        pokemon pe2=new pokemon(10002,"Charizard","Fuego/Dragon",100,"Usuario@gmail.com");
         pokemon pe3=new pokemon(10003,"Silveon","Hada",100,"Usuario@gmail.com");
         pokemon p4=new pokemon(10004,"Eve","Normal",100,"Usuario@gmail.com"); 
        pokemon p5=new pokemon(10005,"Lucario","Lucha/hierro",100,"Usuario@gmail.com"); 
        RegistroPoke.add(pe);
        RegistroPoke.add(pe2); 
        RegistroPoke.add(pe3);
        RegistroPoke.add(p4);
        RegistroPoke.add(p5);
        do{ 
            do{
            r=true;
            System.out.println("1.-Registrar Pokemon ");
            System.out.println("2.-Mostrar lista de Pokemon y niveles ");
            System.out.println("3.-Entrenar Pokemon (Aumentar nivel) ");
            System.out.println("4.-Batalla Pokemon (Reducir nivel");
            System.out.println("5.-Salir del sistema "); 
            try{
                rsta=tec.nextInt();
                if(rsta<=0 ||rsta>5){
                    System.out.println("Error. Opcion invalida ");
                }
            }catch(Exception InputMismatchException){
                System.out.println("Error. Vuelve a ingresar una opcion ");
                System.out.println(rsta);
                r=false; 
                tec.nextLine(); 
            }
        }while(rsta<=0 || rsta>5 || r==false); 
            System.out.println(rsta);
            switch(rsta){ 
                case 1: System.out.println("---REGISTRO---"); 
                pep.almacenar(RegistroPoke);
                    break;
                case 2: System.out.println("---BASE DE DATOS---");
                    System.out.println("Pokemon Registrados: ");
                   imprimir(RegistroPoke);
                    break;
                case 3: System.out.println("---ENTRENAR POKEMON---");
                pep.entrenar(RegistroPoke);
                    break;
                case 4: System.out.println("---BATALLA POKEMON---");
                pep.batalla(RegistroPoke);
                    break;
                case 5: System.out.println("Cerrando programa...");
                    break;
            }
    
        }while(rsta!=5);
    }

    public static void main(String[] args) {
        menu();
    }
    
}
