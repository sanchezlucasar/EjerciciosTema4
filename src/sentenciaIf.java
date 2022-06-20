public class sentenciaIf {


    public static void main(String[] args) {
        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo,
        negativo, o 0. Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
        int numeroIf=-1;
        tipoDeNumero(numeroIf);

    }

    public static void tipoDeNumero(int numero){
        String respuesta ;
        if ( numero > 0 ){
            respuesta = "positivo" ;
        }
        else if(numero<0){
            respuesta =  "negativo";
        }else respuesta = "cero";

        System.out.println(respuesta);
    }


}
