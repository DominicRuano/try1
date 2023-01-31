public class Main {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 4;
        int result = 0;
        int val = 5;

        if (val == 1){
            result = num1 + num2;
            System.out.println("El resultado de la suma es: " + result);
        }else if (val == 2){
            result = num1 - num2;
            System.out.println("El resultado de la resta es: " + result);
        }else if (val == 3) {
            result = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + result);
        }else if (val == 4) {
            result = num1 / num2;
            System.out.println("El resultado de la divion es: " + result);
        }else {
            System.out.println("La opcion elegida no existe.");
        }
        // System.out.println("Ingrese:\n 1 para sumar. \n 2 para restar.\n 3 para multiplicar.\n 4 para dividir." );


    }
}