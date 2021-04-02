import java.util.Date;

class Ingrediente{

  String nome;
  String dataDeValidade;

  //Construtor

    Ingrediente(){
    nome = "";
    dataDeValidade = "";
    }

  // Setters

    void setNome(String n){
    nome = n;
    }

    void setDataDeValidade(String a){
    dataDeValidade = a;
    }

  // Getters

    String getNome(){
    return nome;
    }

    String getDataDeValidade(){
    return dataDeValidade;
    }
}
