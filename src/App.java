public class App {
    public static void main(String[] args) throws Exception {
       
Veiculo panamera = new Veiculo(1, "Sport", "Porche", 8000.0);

Acessorio rodas = new Acessorio(1, "Rodas esportivas", 300.0);
Acessorio farol = new Acessorio(2, "Farol led", 450.0);
Acessorio retrovisor = new Acessorio(3, "Retrovisor eletronico", 370.0);

Orcamento orcamento = new Orcamento(panamera);
orcamento.adicionarAcessorio(rodas);
orcamento.adicionarAcessorio(farol);
orcamento.adicionarAcessorio(retrovisor);


System.out.println("Total: R$ " + orcamento.calcularTotal());
    }
}

//Acessorio rodas = new Acessorio(1, "Rodas esportivas", 3000.0);
//orcamento.adicionarAcessorio(rodas);