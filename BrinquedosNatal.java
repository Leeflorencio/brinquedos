import java.util.ArrayList;
import java.util.Scanner;

public class BrinquedosNatal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cartas = 0;
        String nome = "";
        String sexo = "";
        int carrinho = 0;
        int boneca = 0;

        System.out.println("Digite o número de crianças que enviaram cartinhas: ");
        cartas = sc.nextInt();

        ArrayList<String> nomes = new ArrayList<>(cartas);


        if(cartas > 0 && cartas <= 1000){
            System.out.println("Digite o nome e o sexo das crianças: ");
            for (int i = 0; i < cartas; i++){
                nome = sc.next(); sexo = sc.next();
                nomes.add(nome);

                if (sexo.equalsIgnoreCase("f")) {
                    boneca++;
                }else {
                    carrinho++;
                }
            }
        } else{
            System.out.println("O limite de cartinhas é de 1 até 1000");
        }

        System.out.println(carrinho + " carrinhos");
        System.out.println(boneca + " bonecas");
    }
}
