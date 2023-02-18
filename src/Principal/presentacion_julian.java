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

        int[][] objetos= new int[5][3];
        objetos[0][1]=45000;
        objetos[1][1]=90000;
        objetos[2][1]=950000;
        objetos[3][1]=125000;
        objetos[4][1]=280000;
        int opc2;
        do {
            System.out.println("¿que quieres hacer?");
            System.out.println("1. comprar ");
            System.out.println("2. factura ");
            System.out.println("3. salir ");
            System.out.printf("opcion: ");
            int opc=entrada.nextInt();
            opc2=opc;

            if (opc==1){
                System.out.println("1. mouse $45.000 ");
                System.out.println("2. teclado $90.000 ");
                System.out.println("3. monitores $950.000 ");
                System.out.println("4. ram $125.000 ");
                System.out.println("5. disco duro $280.000 ");
                System.out.println();
                System.out.printf("numero perisferico: ");
                int perisferico=entrada.nextInt();
                if (perisferico>=1&&perisferico<=5){
                    System.out.printf("unidades: ");
                    int unidades=entrada.nextInt();
                    switch (perisferico){
                        case 1:{
                            objetos[0][0]=objetos[0][0]+unidades;
                            break;
                        }
                        case 2:{
                            objetos[1][0]=objetos[1][0]+unidades;
                            break;
                        }
                        case 3:{
                            objetos[2][0]=objetos[2][0]+unidades;
                            break;
                        }
                        case 4:{
                            objetos[3][0]=objetos[3][0]+unidades;
                            break;
                        }
                        case 5:{
                            objetos[4][0]=objetos[4][0]+unidades;
                            break;
                        }
                }
                    System.out.println();
                }else{
                    System.out.println("perisferico no encontrado");
                }
            } else if (opc==2) {

                System.out.println("nombre: "+nombre+" Nit: "+nit);
                System.out.println("direccion: "+direccion+" correo: "+correo);
                System.out.println();

                objetos[0][2]=objetos[0][0]*objetos[0][1];
                objetos[1][2]=objetos[1][0]*objetos[1][1];
                objetos[2][2]=objetos[2][0]*objetos[2][1];
                objetos[3][2]=objetos[3][0]*objetos[3][1];
                objetos[4][2]=objetos[4][0]*objetos[4][1];
                String item="nada seleccionado";
                int total=0;
                for (int i=0;i<5;i++){
                    if (objetos[i][0]>0){
                        total+=objetos[i][2];
                        switch (i){
                            case 0:{
                                item="mouse";
                                break;
                            }
                            case 1:{
                                item="teclado";
                                break;
                            }
                            case 2:{
                                item="monitores";
                                break;
                            }
                            case 3:{
                                item="ram";
                                break;
                            }
                            case 4:{
                                item="disco duro";
                                break;
                            }
                        }

                        System.out.println(item+" "+objetos[i][0]+" "+objetos[i][1]+" "+objetos[i][2]);
                    }

                }
                if (total>0){
                    double iva=total*0.16;
                    double totalcon=total+iva;
                    System.out.println();
                    System.out.println("total sin iva: "+total);
                    System.out.println("iva (16%): "+iva);
                    System.out.println("total con iva: "+totalcon);
                    System.out.println();
                }

            }else if (opc==3) {
                break;

            }else{
                System.out.printf("opcion invalida");
            }

        }while (opc2!=3);

    }
}
