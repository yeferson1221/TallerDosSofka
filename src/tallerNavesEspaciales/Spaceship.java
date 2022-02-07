package tallerNavesEspaciales;
/*
aqui se importo la libreria aleatoria
 */
import java.util.Scanner;
import java.util.Random;

/*
super clase nave espacial
 */
public class Spaceship {
    /*
   el objeto Randon nos permite crear un numero aleatorio en la variable serialNumber
    */
    public String name;
    protected String engines;
    protected String  shipFunction;

    Scanner entry =new Scanner(System.in);
    Random r = new Random();
    int serialNumber1= r.nextInt(100);
    private  int serialNumber=serialNumber1;

    /*
    el metodo getSerialNumber nos permite  acceder  parametro serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /*
    el metodo setSerialNumber nos permite  modificar parametro serialNumber
    */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /*
    el metodo enterSpaceship nos permite ingresar los datos, este parametro se comparte con las clase hijas
    ShuttleVehicle y UnmannedShip
    */
    public void enterSpaceship(){
        System.out.println("ingresar nombre de la nave: ");
        name= entry.nextLine();
        System.out.println("ingresar Tipo de motor: ");
        engines = entry.nextLine();
        System.out.println("ingresar funsion de la nave: ");
        shipFunction = entry.nextLine();

    }

    /*
     el metodo enterSpaceship nos permite inprimir los datos, este parametro se comparte con las clase hijas
     ShuttleVehicle y UnmannedShip
    */
    public void showDataSpaceship(){
        System.out.println("nombre de la nave es: "+name);
        System.out.println("numero de serial de la nave es: "+getSerialNumber());
        System.out.println("el nombre del motor es: "+engines);
        System.out.println("la funcion de esta nave es: "+shipFunction);


    }


}
