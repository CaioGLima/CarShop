//public: a classe pode ser acessada de qualquer lugar
//class Veiculo: nome da classe
//private: ninguém de fora da classe consegue acessar diretamente
/**
    *Representa um veiculo disponivel para orçamento
*/
public class Veiculo {
   private int id;
   private String modelo;
   private String marca;
   private double precoBase;

//Construtor
//this: diferencia o atributo da classe, ja que os 2 tem o msm nome
/**
    *Acessa a classe e cria algo
    *@param id identificador unico do veiculo
    *@param modelo modelo do veiculo
    *@param marca marca do veiculo
    *@param precoBase preço base do veiculo em reais
*/
public Veiculo(int id, String modelo, String marca, double precoBase)   {
    this.id = id;
    this.modelo = modelo;
    this.marca = marca;
    this.precoBase = precoBase;
}

//Getter 
//get + nome : permite a leitura dos atributos priavados
/**
    *Retorna o numero do veiculo.
    *@return id do veiculo
*/
public int getId(){
    return id;
}

/**
    *Retorna o modelo do veiculo.
    *@return modelo do veiculo
*/
public String getModelo(){
    return modelo;
}

/**
    *Retorna a marca do veiculo.
    *@return marca do veiculo
*/
public String getMarca(){
    return marca;
}

/**
    *Retorna o ppreço base do veiculo.
    *@return precoBase do veiculo
*/
public Double getPrecoBase(){
    return precoBase;
}
}

