package tallerNavesEspaciales;

import java.util.Scanner;

/*
clase nave tripulada(MannedShip) extiende con CrewMember
 */
public class MannedShip extends CrewMember {
    public String name;
    protected String engines;
    public  String missionType ;

    Scanner entry =new Scanner(System.in);

    /*
    el metodo enterMissionType se sobre escribe de la clase madre CrewMember es el comportamiento de la nave ,
    o la mision que hara fuera del espacio es como un contrato por que una nave sin mission ni tripulante no puede ser creada
    tonces nos permite crear ingresar la mision que tendra la nave y los  tripulantes
     */
    @Override
    public void enterMissionType(){
        System.out.println("ingresar mision de la nave: ");
        missionType= entry.nextLine();
    }

    /*
    el metodo enterMannedShip nos permite ingresar los datos, de la nave
    */
    public void enterMannedShip(){
        enterMissionType();
        System.out.println("ingresar nombre de la nave: ");
        name= entry.nextLine();
        System.out.println("ingresar Tipo de motor: ");
        engines = entry.nextLine();
        enterCrewMember();//este metodo se hereda de clase CrewMember cuyo fin es ingresar los datos del tripulante
    }

    /*
    el metodo enterMissionType se sobre escribe de la clase madre CrewMember es el comportamiento de la nave ,
    o la mision que hara fuera del espacio es como un contrato por que una nave sin mission ni tripulante no puede ser creada
    entonces nos permite inprimir que tipo de mision hara en el espacio
     */
    @Override
    public void showMissionType(){
        System.out.println("la mision es: "+missionType);
    }

    /*
   el metodo enterMannedShip nos permite inprimir los datos, de la nave
   */
    public void showDataMannedShip(){
        System.out.println("nombre de la nave es: "+name);
        System.out.println("el nombre del motor es: "+engines);
        showMissionType();
        showDataCrewMember();

    }

}
