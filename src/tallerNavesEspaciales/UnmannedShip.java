package tallerNavesEspaciales;



/*
clase nave no tripulada(UnmannedShip) clase hija de  Spaceship
 */
public class UnmannedShip extends Spaceship{
    public String sign;
    public String studytype;

    /*
        el metodo enterUnmannedShip nos permite ingresar los datos, adiccionales de esta clase
    */
    public void enterUnmannedShip(){
        enterSpaceship();
        System.out.println("ingresar tipo de señal o comunicaion de la nave ");
        sign= entry.nextLine();
        System.out.println("ingresar que estudio va realizar la nave: ");
        studytype = entry.nextLine();
}
    /*
       el metodo enterUnmannedShip nos permite inprimi los datos, adiccionales de esta clase
   */
    public void showDataUnmannedShip(){
        showDataSpaceship();
        System.out.println("tipo de comunicacion con la tirra es: "+sign);
        System.out.println("el tipo de mision es: "+studytype);

    }
}
