package tallerNavesEspaciales;

import java.util.Random;
import java.util.Scanner;

/*
clase nave control remoto(RemoteShip) implementa de fly
 */
public class RemoteShip implements Fly{
    public String name;
    public String engines;
    public  int typeLand=1;
    /*
    aqui inicio el objeto aleatorio

    */
    Scanner entry =new Scanner(System.in);
    Random r = new Random();
    int randomLand= r.nextInt(3);
    /*
    metodo enterRemoteShip me permite ingresar los datos de la nave
    */
    public void enterRemoteShip(){
        System.out.println("ingresar nombre de la nave: ");
        name= entry.nextLine();
        System.out.println("ingresar tipo de motor: ");
        engines = entry.nextLine();
    }

    /*
    metodo takeShip me permite simular despegue de la nave
    */
    @Override
    public void takeShip() {
        System.out.println("la nave despega correctamente............");
    }

    /*
    metodo takeShip me permite simular y calcular con el objeto Random
    un numnero aleatorio el cual se va comparar con la costante typeAterrisaje
    que contiene el unico numero que se acepta para que se de un aterrisaje correcto de la nave
    donde su probabilidad de aterrisaje exitoso es de 33.3%.
    numero aleatorio va de 0 a 2 y el numero correcto es 1 para generar un buen aterrisaje
    */
    @Override
    public void landShip() {
        if(randomLand==typeLand){
            System.out.println("la nave aterrizo  correctamente");
        }else{
            System.out.println("la nave no aterrizo correctamente");
        }
    }

    /*
    metodo mission contiene el texto para informar el funcionamiento o uso de la nave
    */
    @Override
    public void mission() {
        System.out.println("Esta nave solo se usa para simulaciones de aterrisajes " +
                "con el fin de mermar costos y preservar  la vida de los astronautas");
    }

    /*
    metodo showRemoteship me permite inprimir los datos de la nave
    */
    public void showRemoteship(){
        System.out.println("El nombre de la nave es: "+name);
        System.out.println("El tipo de motos es: "+engines);
        takeShip();
        landShip();
        mission();

    }
}

