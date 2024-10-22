
package Validaciones;

import java.util.ArrayList;
import java.util.Scanner;
import pokearrayprueba.pokemon;


public class validar {
     public void batalla(ArrayList<pokemon> RegistroPoke){
        boolean Encontrado=false;
        Scanner tec=new Scanner(System.in);
        long ID2=0;
        int comprobar=0;
        int r;
        int nivel=0;
        int posicion=0;
        do{
            System.out.println("Ingrese la ID del Pokemon que va a ser enviado a batalla: ");
            do{ 
                r=0;
                try{
                    ID2=tec.nextLong();
                    tec.nextLine();
                    Encontrado=encontrado(RegistroPoke, ID2);
                    if(Encontrado){
                        System.out.println("Pokemon encontrado en el Sistema ");
                        
                    }else{
                        System.out.println("Error. Pokemon no se encuentra en el sistema ");
                    }
                }catch(Exception InputMismatchException){
                    System.out.println("Error. Caracter Invalido ");
                    tec.nextLine();
                }
                
            }while(r==2);
            
        }while(Encontrado==false);
        do{
            do{
                System.out.println("Ingrese el nivel que desea disminuirle al pokemon: ");
                r=0;
               try{
                   nivel=tec.nextInt();
                   for(int i=0;i<RegistroPoke.size();i++){
                       if(ID2==RegistroPoke.get(i).ID){
                           posicion=i;
                       }
                   }
                   comprobar=RegistroPoke.get(posicion).nivel-nivel;
                   if(comprobar>=0){
                       RegistroPoke.get(posicion).nivel=comprobar;
                       System.out.println("Batalla exitosa ");
                   }else{
                       System.out.println("Error, rango no permitido");
                   }
               }catch(Exception InputMismatchException){
                   System.out.println("Error. Caracter invalido ");
                   r=2;
                   tec.nextLine();
               }
            }while(r==2);
        }while(comprobar<0);
    
    }
    
    public void entrenar(ArrayList<pokemon> RegistroPoke){
        boolean Encontrado=false;
        Scanner tec=new Scanner(System.in);
        long ID2=0;
        int comprobar=0;
        int r;
        int nivel=0;
        int posicion=0;
        do{
            System.out.println("Ingrese la ID del Pokemon que va a entrenar: ");
            do{ 
                r=0;
                try{
                    ID2=tec.nextLong();
                    tec.nextLine();
                    Encontrado=encontrado(RegistroPoke, ID2);
                    if(Encontrado){
                        System.out.println("Pokemon encontrado en el Sistema ");
                        
                    }else{
                        System.out.println("Error. Pokemon no se encuentra en el sistema ");
                    }
                }catch(Exception InputMismatchException){
                    System.out.println("Error. Caracter Invalido ");
                    tec.nextLine();
                }
                
            }while(r==2);
            
        }while(Encontrado==false);
        do{
            do{
                System.out.println("Ingrese el nivel que desea aumentarle al pokemon: ");
                r=0;
               try{
                   nivel=tec.nextInt();
                   for(int i=0;i<RegistroPoke.size();i++){
                       if(ID2==RegistroPoke.get(i).ID){
                           posicion=i;
                       }
                   }
                   comprobar=RegistroPoke.get(posicion).nivel+nivel;
                   if(comprobar<=500){
                       RegistroPoke.get(posicion).nivel=comprobar;
                       System.out.println("Entrenamiento exitoso ");
                   }else{
                       System.out.println("Error, rango no permitido");
                   }
               }catch(Exception InputMismatchException){
                   System.out.println("Error. Caracter invalido ");
                   r=2;
                   tec.nextLine();
               }
            }while(r==2);
        }while(comprobar>500);
    
    }
    public static boolean encontrado(ArrayList<pokemon> RegistroPoke, long ID){
        for(pokemon i: RegistroPoke){
            if(ID==i.ID){
                return true;
            }
        }
        return false;
    }
    public boolean carac(String nombre){
        int i=0;
        char c;
        
        for(i=0;i<nombre.length();i++){
            c=nombre.charAt(i);
           if(!(c>='a'&& c<='z'|| c>='A' && c<='Z')){
               return true;
           }
           
        }
        return false;
    }
    public void almacenar(ArrayList<pokemon> RegistroPoke){ 
       
        int r;
        validar pep=new validar();
        Scanner tec=new Scanner(System.in);
        boolean EsCaracter=false;
        boolean Encontrado=false;
        String nombre="";
        int OP=0;
        boolean co=false;
        long ID=0;
        String correo;
        String tipo="";
        int nivel=0;
        do{
            EsCaracter=false;
            System.out.println("Ingrese el nombre del Pokemon ");
            nombre=tec.nextLine(); 
            EsCaracter=pep.carac(nombre);
            if(EsCaracter){
                System.out.println("Error. Valor Invalido ");
            }else{
                System.out.println("Nombre guardado exitosamente ");
            }
            
        }while(EsCaracter==true);
        
        do{
            System.out.println("Ingrese la ID: ");
            do{
                 r=0;
                try{
                    ID=tec.nextLong();   
                    tec.nextLine();
                }catch(Exception InputMismatchException){
                    System.out.println("Error. Caracter invalido ");
                    tec.nextLine();
                    r=1;
                }
            }while(r==1);
           Encontrado=encontrado(RegistroPoke, ID);
           if(Encontrado){
               System.out.println("Error. Pokemon en el sistema ");
           }else{
               System.out.println("ID Guardada exitosamente. ");
           }
            
        }while(Encontrado);
        
        do{
           do{
               System.out.println("Ingrese tipo de Pokemon: ");
               System.out.println("1.-Agua ");
               System.out.println("2.-Fuego ");
               try{
                   OP=tec.nextInt();
                   tec.nextLine();
                   if(OP==1){
                       tipo="Agua";
                   }
                   if(OP==2){
                       tipo="Fuego";
                   }
                   if(OP<1||OP>2){
                       System.out.println("Error. Opcion invalida ");
                   }
               }catch(Exception InputMismatchException){
                   System.out.println("Error. Caracter invalido ");
                   tec.nextLine();
                   r=2;
               }
           }while(r==2);
            
        }while(!(OP>=1 && OP<=2));
        do{
            do{
                r=0;
                System.out.println("Ingrese el nivel del Pokemon: ");
                try{
                    nivel=tec.nextInt();
                    tec.nextLine();
                    if(nivel<0 || nivel>500){
                        System.out.println("Error. Nivel fuera del rango permitido");
                    }else{
                        System.out.println("Nivel Guardado ");
                    }
                    
                }catch(Exception InputMismatchException){
                    System.out.println("Error. Caracter Invalido ");
                    tec.nextLine();
                    r=2;
                }
                
            }while(r==2);
        }while(nivel<0 || nivel>500);
        
       do{
           co=false;
           System.out.println("Ingrese el correo electronico (Solo es valido @gmail.com/@outlook.com");
           correo=tec.nextLine();
           if(!(correo.endsWith("@gmail.com")|| correo.endsWith("@outlook.com"))){
               System.out.println("Error. Direccion Invalida ");
               co=true;
           }else{
               System.out.println("Direccion guardada ");
           }
         pokemon registro=new pokemon(ID, nombre, tipo, nivel, correo); 
         RegistroPoke.add(registro); 
       }while(co);
    }
    }

