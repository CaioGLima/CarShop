import java.util.ArrayList;
import java.util.List;

/**
    *Representa o orçamento do veiculo e acessorio
*/
public class Orcamento {
    private Veiculo veiculo;
    private List<Acessorio> acessorios;

/**
    *Acessa a classe e cria algo
    *@param veiculo veiculo base do orçamento
*/
  public Orcamento(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.acessorios = new ArrayList<>();
    }

/*
    modelo método:
    tipo de retorno nomeDoMetodo(parametros){
        //corpo
        //instrução
        //retorno, se tiver
    }
*/

/**
 * Adiciona um acessorio ao orçamento
 * @param acessorio acessorio para ser adicionado 
*/
public void adicionarAcessorio(Acessorio acessorio){
    acessorios.add(acessorio);
}
//o metodo recebe um objeto"acessorio" ja pronto, ent não é necessario "detalhar" os parametros 
/* 
    Aqui ele vai pegar os itens da lista e vai colocando no "carrinho", para depois fazer a soma total
*/

/**
 * Calcula valor total do orçamento somando o preço base com os acessorios adicionais
 * @return total retorna o valor total do orçamento em Reais
 */
//calcularTotal
public double calcularTotal(){
    double total = veiculo.getPrecoBase();
    for (Acessorio a : acessorios){
        total += a.getPrecoAdicional();
    }
    return total;
}
/* 
    Ele vai pegar o valor base do veiculo e somar com os itens adicionados da lista de acessorios,
    como o preço dos acessorios são private, a gente pega os valores pelo getter
*/

}

