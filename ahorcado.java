import java.util.Scanner;
import java.util.Arrays;

class Ahorcado{



    public static void main(String[] args){
        int intentos=0;
        String frase = "";
        char letra;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Di la frase");
        frase= entrada.nextLine();

        char[] prueba = new char[frase.length()];

        for(int i = 0; i<frase.length();i++){
            prueba[i] = '_';
        }

        while(intentos<5){
            Boolean acierto = false;
            System.out.println();
            System.out.println("Di la letra");
            System.out.println(prueba);
            System.out.println("\n\n");

            letra = entrada.next().charAt(0);


            for (int i = 0; i<frase.length(); i++){
                if (frase.charAt(i) == letra){
                    prueba[i] = frase.charAt(i);
                    acierto = true;
                }
            }
            if(acierto == false)
                intentos++;
            pintarAhorcado(intentos);
        
            
        }


    }

    public static void pintarAhorcado(int a){
        switch (a) {

/*   ____
 * /     |
 * |     
 * |
 * |
 * |
 * |
 * 
 */
                case 0:
                System.out.println(" _____");
                System.out.println("/     |");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("____  ");





                break;
                case 1:
                    System.out.println(" _____");
                    System.out.println("/     |");
                    System.out.println("|     O");
                    System.out.println("|     ");
                    System.out.println("|     ");
                    System.out.println("|     ");
                    System.out.println("|     ");
                    System.out.println("____  ");
                break;            
                case 2:
                System.out.println(" _____");
                System.out.println("/     |");
                System.out.println("|     O");
                System.out.println("|     |");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("____  ");
                break;
                case 3:
                System.out.println(" _____");
                System.out.println("/     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("____  ");
                break;
                case 4:
                System.out.println(" _____");
                System.out.println("/     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|    / \\");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("____  ");
                break;       
            default:
                break;
        }

    }
}

