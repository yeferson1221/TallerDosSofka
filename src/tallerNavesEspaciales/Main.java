package tallerNavesEspaciales;

import java.util.Scanner;

/*
  la clase main con su metodo  tiene las creacion de los objetos(naves)
 */
public class Main {
    public static void  main(String[] args) {
        Scanner scan =new Scanner(System.in);

        /*
        condicion y bucle que nos muestra toda la interfas,  esta consume los metodos de las clases
        para ingresar y mostrar la informacion de las naves.
        */
        int option=0;
        int optionBucle=5;
        while (optionBucle == 5){
            System.out.println("Hola Tripulante con este sistema aprenderas hacerca de naves ESPACIALES sigue los pasos para ver que tipo de nave creas");
            System.out.println("[*************PUEDES CREAR CUATRO TIPOS DE NAVE ESCOGE UNA OPCION************]");
            System.out.println("Opcion [(1)NAVE TRIPULADA] Opcion** [(2)NAVE NO TRIPULADA] Opcion " +
                    "** [(3)VEHICULO LANZADERA] *****[(4)NAVE REMOTA]");
            System.out.println("Ingresar Opcion::: ");
            option= scan.nextInt();

            System.out.println("----------------------------------------------------------------------------------------------------------------");
            if (option == 1) {
                MannedShip spaceShip1 = new MannedShip();
                spaceShip1.enterMannedShip();
                spaceShip1.showDataMannedShip();

            } else if (option == 2) {
                UnmannedShip spaceShip2 = new UnmannedShip();
                spaceShip2.enterUnmannedShip();
                spaceShip2.showDataUnmannedShip();

            } else if (option == 3) {
                ShuttleVehicle spaceShip3 = new ShuttleVehicle();
                spaceShip3.enterShuttleVehicle();
                spaceShip3.showDataShuttleVehicle();

            } else if (option == 4) {
                RemoteShip spaceShip4 = new RemoteShip();
                spaceShip4.enterRemoteShip();
                spaceShip4.showRemoteship();

            }else {
                System.out.print("Error opcion incorrecta porfavor ingrese una opcion valida ");
            }

            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println(" ESCRIBE 5 PARA CONTINUAR Y CUALQUIER OTRO NUMERO PARA SALIR : ");
            optionBucle= scan.nextInt();



        }

    }

}
