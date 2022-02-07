package tallerNavesEspaciales;


import java.util.Scanner;

/*
clase tripulante que se astrae con MannedShip
 */
public abstract class  CrewMember {
    public String name;
    public String age;

    Scanner entry =new Scanner(System.in);
    /*
    metodo  enterCrewMember nos permite ingresar datos para clase astronauta
    esta sellama  o se usa en clase MannedShip
    */
    public void enterCrewMember(){
        System.out.println("ingresar nombre del astronauta: ");
        name= entry.nextLine();
        System.out.println("Ingresar edad del astronauta: ");
        age = entry.nextLine();
    }

    /*
    metodo  enterCrewMember nos inprimir ingresar datos para clase astronauta
    sta sellama  o se usa en clase MannedShip
    */
    public void showDataCrewMember(){
        System.out.println("Nombre del astronauta es: "+name);
        System.out.println("La edad del astronauta es: "+age);
    }

    /*
    metodo  enterMissionType ShowMissionType se sobre escribe en la clase MannedShip
    */
    public abstract void  enterMissionType();
    public abstract void  showMissionType();

}
