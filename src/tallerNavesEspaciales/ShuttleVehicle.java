package tallerNavesEspaciales;



/*
clase nave vehiculo lanzadera(ShuttleVehicle) clase hija de  Spaceship
 */
public class ShuttleVehicle extends Spaceship{
    public String typeLoad;
    public String loadWeight;

    /*
    el metodo enterShuttleVehicle nos permite ingresar los datos, adiccionales de esta clase
     */
    public void enterShuttleVehicle(){
        enterSpaceship();
        System.out.println("ingresar que carga llevaras: ");
        typeLoad= entry.nextLine();
        System.out.println("ingresar peso de la carga en kg ");
        loadWeight = entry.nextLine();

}
    /*
    el metodo enterShuttleVehicle nos permite inprimir los datos, adiccionales de esta clase
    */
    public void showDataShuttleVehicle(){
        showDataSpaceship();
        System.out.println("El tipo de carga es: "+typeLoad);
        System.out.println("El peso es: "+loadWeight+"Kg");

    }
}
