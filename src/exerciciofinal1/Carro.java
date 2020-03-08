
package exerciciofinal1;
/**
 *
 * @author amanda cleto
 */
public class Carro {
    public int qtdePessoas;

    public Carro(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }
    
    public int addQtdePessoas(int qtdePessoas) {
        return (this.qtdePessoas = this.qtdePessoas + qtdePessoas);
    } 
    
    public int removeQtdePessoas(int qtdePessoas) {
        return (this.qtdePessoas = this.qtdePessoas - qtdePessoas);
    } 
}
