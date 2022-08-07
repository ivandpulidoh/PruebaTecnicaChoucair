package starter.utils;

public class FormatoFechas {

    public static String extraerMes(String fecha){
        return fecha.substring(3,9);
    }

    public static String extraerDia(String fecha){
        return fecha.substring(0,2);
    }

    public static String extraerAnio(String fecha){
        return fecha.substring(10,14);
    }
}
