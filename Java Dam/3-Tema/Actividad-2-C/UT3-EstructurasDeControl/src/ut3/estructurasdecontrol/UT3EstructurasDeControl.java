package ut3.estructurasdecontrol;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UT3EstructurasDeControl {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        boolean condition = true;

        while (condition) {
            
            System.out.println("Introduce un valor Por favor.");
            num = entrada.nextInt();
            
            switch (num) {

                case 1:
                    function1();
                    condition = false;
                    break;
                case 2:
                    function2();
                    condition = false;
                    break;
                case 3:
                    function3();
                    condition = false;
                    break;
                case 4:
                    function4();
                    condition = false;
                    break;
                case 5:
                    function5();
                    condition = false;
                    break;
                case 6:
                    function6();
                    condition = false;
                    break;
                case 7:
                    function7();
                    condition = false;
                    break;
                case 8:
                    function8();
                    condition = false;
                    break;
                case 9:
                    function9();
                    condition = false;
                    break;
                case 10:
                    function10();
                    condition = false;
                    break;
                case 11:
                    function11();
                    condition = false;
                    break;

                case 12:
                    function12();
                    condition = false;
                    break;

                case 13:
                    function13();
                    condition = false;
                    break;

                case 14:
                    function14();
                    condition = false;

                    break;

                default:
                    System.out.println("Introduce un valor entre el 1 y el 14.");

            }
        }
        System.out.println("Se finalizo el programa sin problemas.");

    }

    public static void function1() {
        double numero = 1;
        boolean condition1 = true;

        while (condition1) {
            Scanner entrada = new Scanner(System.in);
            if (numero > 0) {
                System.out.print("Introduce un numero:");
                numero = entrada.nextDouble();
                if (numero > 0) {
                    System.out.println("Cuadrado de entrada " + Math.pow(numero, 2));
                }

                condition1 = true;
            } else {
                condition1 = false;
            }
        }

    }

    public static void function2() {
        Scanner entrada = new Scanner(System.in);
        boolean condition2 = true;
        double numero = 1;
        while (condition2) {
            System.out.print("Introduce un numero:");
            numero = entrada.nextDouble();
            if (numero > 0) {

                if (numero > 0) {
                    System.out.println("El numero es positivo");
                }

            } else if (numero < 0) {
                System.out.println("El numero es negativo");
            } else if (numero == 0) {
                condition2 = false;
            }
        }

    }

    public static void function3() {
        Scanner entrada = new Scanner(System.in);
        boolean condition3 = true;
        double numero = 1;

        while (condition3) {
            System.out.print("Introduce un numero:");
            numero = entrada.nextDouble();
            if (numero % 2 == 0 && numero != 0) {
                System.out.println("Numero Par");
            } else if (numero % 2 == 1 && numero != 0) {
                System.out.println("El numero es impar");
            } else if (numero == 0) {

                condition3 = false;
            }
        }

    }

    public static void function4() {
        Scanner entrada = new Scanner(System.in);
        boolean condition = true;
        int numero = 0, i = 0;

        while (condition) {

            System.out.print("Introduce un numero:");
            numero = entrada.nextInt();
            i++;

            if (numero < 0) {
                condition = false;
            }

        }
        System.out.println("Se han introducido: " + i + " veces");

    }

    public static void function5() {

        Scanner entrada = new Scanner(System.in);
        boolean condition = true;
        int numero = 0, total = 0;

        while (condition) {

            System.out.print("Introduce un numero:");
            numero = entrada.nextInt();
            total += numero;

            if (numero == 0) {
                condition = false;
            }

        }
        System.out.println("La suma de todos los numero es: " + total);
    }

    public static void function6() {

        Scanner entrada = new Scanner(System.in);
        boolean condition = true;
        int numero = 1, total = 0, i = 0;

        while (condition) {

            if (numero > 0) {
                System.out.print("Introduce un nuevo número: ");
                numero = entrada.nextInt();
                if ((numero > 0)) {
                    total = total + numero;
                    i++;
                } else {
                    condition = false;
                }

            }

        }
        System.out.println("La media de todos los numero es: " + total / i);
    }

    public static void function7() {

        Scanner entrada = new Scanner(System.in);
        boolean condition = true;
        int eleccion, i = 1;
        double numeroRandom = Math.random() * 100;

        numeroRandom = Math.round(numeroRandom);

        System.out.println(numeroRandom);

        while (condition) {

            System.out.println("Introduce un numero");
            eleccion = entrada.nextInt();

            if (eleccion < numeroRandom) {
                System.out.println("Número más alto");
                i++;
            } else if (eleccion > numeroRandom) {
                System.out.println("Numero más pequeño");
                i++;
            } else {
                System.out.println("Número correcto, a necesitado un total de " + i + " intentos");
                condition = false;
            }

        }

    }

    public static void function8() {

        Scanner entrada = new Scanner(System.in);
        int num = 0;

        System.out.println("Introduce un numero");
        num = entrada.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

    }

    public static void function9() {

        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }

    }

    public static void function10() {

        Scanner entrada = new Scanner(System.in);
        double num = 0, total = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print((1 + i) + ". introduce un numero:");
            num = entrada.nextDouble();

            total += num;

        }
        System.out.println(" La suma total es: " + total);
    }

    public static void function11() {

        Scanner entrada = new Scanner(System.in);
        double num = 0, mediaPos = 0, mediaNeg = 0;
        int ceros = 0, contadorPos = 0, contadorNeg = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print((1 + i) + ". Introduce un numero:");
            num = entrada.nextDouble();

            if (num > 0) {
                mediaPos += num;
                contadorPos++;
            } else if (num < 0) {
                mediaNeg += num;
                contadorNeg++;
            } else if (num == 0) {
                ceros++;
            }

        }
        System.out.println("La media de los numeros positivos es: " + (mediaPos / contadorPos));
        System.out.println("La media de los numeros negativos es: " + (mediaNeg / contadorNeg));
        System.out.println("El numero total de ceros es: " + ceros);

    }

    public static void function12() {

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        boolean condition = true;

        while (condition) {

            System.out.print("Introduce un numero entre el 0 y el 10. ");
            num = entrada.nextInt();

            if (num >= 0 && num <= 10) {

                condition = false;

            } else {
                condition = true;
            }
        }

        for (int i = 0; i <= 10; i++) {

            System.out.print(num + " * " + i + " = ");
            System.out.println(num * i);
        }

    }

    public static void function13() {

        Scanner entrada = new Scanner(System.in);
        int num = 0;
        double numS = 0, numMayor = 0, acu = 0;

        System.out.print("Introduce un numero: ");
        num = entrada.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.print((1 + i) + ". Introduce un numero: ");
            numS = entrada.nextDouble();

            if (numS > acu) {
                numMayor = numS;

            }
            acu = numS;

        }
        System.out.println("El numero mayor es:  " + numMayor);

    }

    public static void function14() {

        Scanner entrada = new Scanner(System.in);
        int num = 0, numNeg = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println((1 + i) + ". Introduce un numero: ");
            num = entrada.nextInt();

            if (num < 0) {
                numNeg++;

            }

        }

        System.out.println("Se han introducido un total de " + numNeg);

    }
}

/*







Por último, en el método main (principal). Deberás pedir al usuario que introduzca un número
de 0 a 14, si el usuario introduce el número 0, se finalizará la ejecución del programa, en caso
contrario, se invocará a la función asociada a su número.
        
 */
