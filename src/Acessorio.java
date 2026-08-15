/**
    *Representa os acessórios disponiveis para o veiculo
*/
public class Acessorio {
    private int id;
    private String nome;
    private double precoAdicional;

//Construtor
/**
    *Acessa a classe e cria algo
    *@param id identificador unico do acessorio
    *@param nome nome do acessorio
    *@param precoAdicional preço adicional do acessorio
*/
public Acessorio(int id, String nome, double precoAdicional)   {
    this.id = id;
    this.nome = nome;
    this.precoAdicional = precoAdicional;
}   

//Getter
/**
    *Retorna o id do acessorio.
    *@return id do acessorio
*/
public int getId(){
    return id;
}
/**
    *Retorna o nome do acessorio.
    *@return nome do acessorio
*/
public String getNome(){
    return nome;
}
/**
    *Retorna o precoAdicional do acessorio
    *@return precoAdicional do acessorio
*/
public Double getPrecoAdicional(){
    return precoAdicional;
}
}
