import java.util.ArrayList;

class Cozinha{

  private int numeroPratos;
  String tipo;
  int numeroCozinheiros;
  int tempoPreparo;
  int horaDeAbertura;
  int horaDeFechamento;
  String pratoPrincipal;
  ArrayList<Ingrediente> listIngredientes = new ArrayList<Ingrediente>();
  ArrayList<Funcionario> listFuncionarios = new ArrayList<Funcionario>();
 

  // Setters

    void setTipo(String p){
      tipo = p;
    }

    void setTempoPreparo(int t){
      tempoPreparo = t;
    }

    void setNumeroCozinheiros(int n){
      numeroCozinheiros = n;
    }

    void setNumeroPratos(int n){
      numeroPratos = n;
    }
    
    void setHoraDeArbertura(int h){
      horaDeAbertura = h;
    }

    void setHoraDeFechamento(int h){
      horaDeFechamento = h;
    }
    void setPratoPricipal(String p){
      pratoPrincipal = p;
    }

    void setIngrediente(Ingrediente a){
      this.listIngredientes.add(a);
    }

    void setFuncionario(Funcionario b){
      this.listFuncionarios.add(b);
    }

  // Getters

    String getTipo(){
      return tipo;
    }

    int getNumeroCozinheiros(){
      return numeroCozinheiros;
    }

    int getNumeroPratos(){
      return numeroPratos;
    }

    int getTempoPreparo(){
      return tempoPreparo;
    }

    int getHoraDeAbertura(){
      return horaDeAbertura;
    }
    int getHoraDeFechamento(){
      return horaDeFechamento;
    }
    String getpratoPrincipal(){
      return pratoPrincipal;
    }

    ArrayList<Ingrediente> getlistIngredientes(){
      return listIngredientes;
    }

    ArrayList<Funcionario> getlistFuncionarios(){
      return listFuncionarios;
    }

    void prepararPratos(){
    //O que eu preciso fazer para preparar um prato?
    }

    void lavarLouca(){

    }
    void imprimir(){
      System.out.println("\nCozinha "+getTipo()+
                        "\n\nHorario de Abertura: "+getHoraDeAbertura()+" horas."+
                        "\nHorario de Fechamento: "+getHoraDeFechamento()+" horas."+
                        "\nTempo Médio de Preparo: "+getTempoPreparo()+" minutos."+
                        "\nNumero de Pratos: "+getNumeroPratos()+
                        "\nNumero de Cozinheiros: "+getNumeroCozinheiros()+
                        "\n\nPrato Principal: "+getpratoPrincipal()+".");
    }


}