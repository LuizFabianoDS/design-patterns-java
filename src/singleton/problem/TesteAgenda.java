package singleton.problem;

import singleton.solution.AgendaSingletonEAGER;
import singleton.solution.AgendaSingletonEnum;
import singleton.solution.AgendaSingletonLAZY;

public class TesteAgenda
{

    
    public static void main(String[] args) {

        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();


        System.out.println(agenda.hashCode());
        System.out.println(agenda2.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");


    }

    public static void reservaDiaEAGER(String dia)
    {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia)
    {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaEnum(String dia)
    {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
