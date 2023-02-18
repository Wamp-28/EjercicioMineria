package Principal;
import java.util.Scanner;
public class presentacion_julian {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.printf("ingrese su nombre: ");
        String nombre=entrada.next();
        System.out.printf("ingrese su nit: ");
        int nit=entrada.nextInt();
        System.out.printf("ingrese su direccion: ");
        String direccion=entrada.next();
        System.out.printf("ingrese su correo: ");
        String correo=entrada.next();
        int opc2;
        do {
            System.out.println("¿que quieres hacer?");
            System.out.println("1. comprar ");
            System.out.println("2. factura ");
            System.out.println("3. salir ");
            int opc=entrada.nextInt();
            opc2=opc;
            if (opc==1){
                System.out.printf("1. mouse $45.000 ");
                System.out.printf("2. teclado $90.000 ");
                System.out.printf("3. monitores $950.000 ");
                System.out.printf("4. ram $125.000 ");
                System.out.printf("5. disco duro $280.000 ");
                /*aca*/
            } else if (opc==2) {

            }else if (opc==3) {
                break;

            }else{
                System.out.printf("opcion invalida");
            }

        }while (opc2>=1&&opc2<=3);

    }
}
