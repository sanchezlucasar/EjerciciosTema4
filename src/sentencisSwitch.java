public class sentencisSwitch {
    /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
     estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
     consola informando de la estación en la que está. También habrá que poner un default para cuando
     el valor de la variable no sea una estación.
    * */
    public static void main(String[] args) {
        String estacion = "junio";
        switch (estacion){
            case "invierno": System.out.println("invierno");
                 break;
            case "verano": System.out.println("verano");
                break;
            case "otoño": System.out.println("otoño");
                break;
            case "primavera": System.out.println("primavera");
                break;
            default: System.out.println("eso no es una estacion");
                break;

        }

    }
}
