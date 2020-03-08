
package exerciciofinal1;

import java.util.Scanner; // 1. import of Scanner class

/**
 *
 * @author amanda cleto
 */
public class ExercicioFinal1 {
    public static void main(String[] args) {
       //instantiation
       Scanner leia = new Scanner(System.in);
        
       int qtde, opcao;
       
       //in this example, the maximum amount of people inside this car will be 5.
       Carro carroConvencional = new Carro(1);
      
       //Print the amount of people inside the car
        System.out.println("Quantidade de pessoas dentro do carro: " + carroConvencional.getQtdePessoas());
        
      
       do {
            //Ask the user which option it wants
             System.out.println("----- Adicionar ou Remover Pessoas -----" 
                                + "\n" + "Digite 1 - para adicionar pessoas ao carro." 
                                + "\n" + "Digite 2 - para remover pessoas ao carro."
                                + "\n" + "Digite 3 - para saber a quantidade de pessoas no carro;"
                                + "\n" + "Digite 4 - para sair." + "\n");
             
             //read the option
             opcao = leia.nextInt();
             
            switch(opcao) {
                case 1:
                    System.out.println("Digite a quantidade de pessoas que você deseja adicionar ao carro: ");
                    qtde = leia.nextInt();
                    
                    //verify if the amount is possible
                    if (qtde + carroConvencional.getQtdePessoas() > 5) {
                         System.out.println("Infelizmente nÃ£o cabe: " + (qtde + carroConvencional.getQtdePessoas())
                                 + " pessoas dentro do carro convencional. A quantidade máxima de pessoas que cabe no carro "
                                 + "convencional Ã© 5.");
                         break;
                    }
                    
                    carroConvencional.addQtdePessoas(qtde);
                    System.out.println("A quantidade de pessoas no carro agora é: " + carroConvencional.getQtdePessoas());
                    break;

                case 2:
                    System.out.println("Digite a quantidade de pessoas que você deseja remover do carro: ");
                    qtde = leia.nextInt();
                    
                    //verify if the amount is possible
                    if (qtde > carroConvencional.getQtdePessoas()) {
                         System.out.println("Infelizmente essa quantidade é impossivel de ser retirada");
                         break;
                    }
                    carroConvencional.removeQtdePessoas(qtde);
                    System.out.println("A quantidade de pessoas no carro agora é: " + carroConvencional.getQtdePessoas());   
                    break;
                
                case 3:
                    System.out.println("A quantidade de pessoas no carro é: " + carroConvencional.getQtdePessoas());
                    break;
                    
                case 4:
                    break;
            }
        } while (opcao < 4);
    }
    
}
