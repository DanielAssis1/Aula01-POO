class Funcionario{
  String nome;
  String atividade;

  //Construtor
  
    Funcionario(){
    nome = "";
    atividade = "";
    }

  // Setters

    void setNome(String n){
    nome = n;
    }

    void setAtividade(String a){
    atividade = a;
    }

  // Getters

    String getNome(){
    return nome;
    }

    String getAtividade(){
    return atividade;
    }
}