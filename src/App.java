import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        boolean num = true;
        while(num==true){
            System.out.println("=====BIENVENIDO A MUNDO MASCOTAS======");
            System.out.println("1. Insertar Mascota");
            System.out.println("2. Actualizar Mascota");
            System.out.println("3. Eliminar Mascota");
            System.out.println("4. Buscar Mascota");
            System.out.println("5. Listar Mascotas");
            System.out.println("6. Finalizar");
            Scanner input= new Scanner(System.in);
            System.out.print("Ingresa una opcion: ");

            byte control= input.nextByte();
            

            Base base= new Base();
            switch(control){
                case 1:
                    System.out.flush();
                    base.AñadirMascota();
                    break;
                case 5:
                    base.Listar();
                    break;
                case 6:
                 num=false;
                 break;
                
                default:
                    System.out.println("Opcion invalida");
                    break;
                


            }
        }
    }
}
    

