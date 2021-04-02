class Main {
  public static void main(String[] args) {
   
  // Cozinha Minera
      Cozinha cozMineira = new Cozinha();
      cozMineira.setTipo("Mineira");
      cozMineira.setTempoPreparo(40); 
      cozMineira.setNumeroPratos(5);
      cozMineira.setHoraDeArbertura(14);
      cozMineira.setHoraDeFechamento(20);
      cozMineira.setPratoPricipal("Feiojada");
      cozMineira.setNumeroCozinheiros(2);
      Ingrediente I = new Ingrediente();
      Funcionario F = new Funcionario();
      // Ingredientes da Cozinha Mineira
          I = new Ingrediente();
          I.setNome("Feijao");
          I.setDataDeValidade("05/09/2021");
          cozMineira.setIngrediente(I);

          I = new Ingrediente();
          I.setNome("Farinha");
          I.setDataDeValidade("05/09/2021");
          cozMineira.setIngrediente(I);

          I = new Ingrediente();
          I.setNome("Arroz");
          I.setDataDeValidade("09/07/2021");
          cozMineira.setIngrediente(I);

          I = new Ingrediente();
          I.setNome("Carne de Porco");
          I.setDataDeValidade("12/06/2021");
          cozMineira.setIngrediente(I);

          I = new Ingrediente();
          I.setNome("Linguiça");
          I.setDataDeValidade("08/11/2021");
          cozMineira.setIngrediente(I); 

      // Funcionarios da Cozinha Mineira

          F = new Funcionario();
          F.setNome("Jorge Augusto da Silva");
          F.setAtividade("Cozinheiro");
          cozMineira.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Maria Rosa de Souza");
          F.setAtividade("Cozinheiro");
          cozMineira.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Julia Souza Soares");
          F.setAtividade("Ajudante");
          cozMineira.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Daniel Gomes Cruz");
          F.setAtividade("Outros");
          cozMineira.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Lucia Cruz da Silva");
          F.setAtividade("Outros");
          cozMineira.setFuncionario(F);


        //Saída 
          cozMineira.imprimir();
          System.out.println("\nIngredientes do Prato Principal: \n"); 
          for(Ingrediente x : cozMineira.getlistIngredientes()){System.out.println(x.getNome()+" | "+x.getDataDeValidade());}

          System.out.println("\nFuncionários da Cozinha: \n"); 

          for(Funcionario x : cozMineira.getlistFuncionarios()){System.out.println(x.getNome()+" | "+x.getAtividade());} 
          System.out.println("----------------------------------------------------------"); 
  
  
  // Cozinha Chinesa
      Cozinha cozChinesa = new Cozinha();
      cozChinesa.setTipo("Chinesa");
      cozChinesa.setTempoPreparo(20); 
      cozChinesa.setNumeroPratos(3);
      cozChinesa.setHoraDeArbertura(10);
      cozChinesa.setHoraDeFechamento(21);
      cozChinesa.setNumeroCozinheiros(1);
      cozChinesa.setPratoPricipal("Yakissoba");
      // Ingredientes da Cozinha Chinesa
          I = new Ingrediente();
          I.nome = "Champignon";
          I.dataDeValidade = "05/10/2021";
          cozChinesa.setIngrediente(I);
          
          I = new Ingrediente();
          I.nome = "Brócolis";
          I.dataDeValidade = "05/09/2021";
          cozChinesa.setIngrediente(I);

          I = new Ingrediente();
          I.nome = "Macarrão";
          I.dataDeValidade = "09/07/2021";
          cozChinesa.setIngrediente(I);

          I = new Ingrediente();
          I.nome = "Carne";
          I.dataDeValidade = "12/06/2021";
          cozChinesa.setIngrediente(I);
      // Funcionarios da Cozinha Chinesa

          F = new Funcionario();
          F.setNome("Augusto da Silva Soares");
          F.setAtividade("Cozinheiro");
          cozChinesa.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Rosa Teixeira Santos");
          F.setAtividade("Ajudante");
          cozChinesa.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Bruno Souza Farias");
          F.setAtividade("Ajudante");
          cozChinesa.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Carlos Gomes Silveira");
          F.setAtividade("Outros");
          cozChinesa.setFuncionario(F);
           
      //Saída 
          cozChinesa.imprimir();
          System.out.println("\nIngredientes do Prato Principal: \n"); 
          for(Ingrediente x : cozChinesa.getlistIngredientes()){System.out.println(x.getNome()+" | "+x.getDataDeValidade());}

          System.out.println("\nFuncionários da Cozinha: \n"); 

          for(Funcionario x : cozChinesa.getlistFuncionarios()){System.out.println(x.getNome()+" | "+x.getAtividade());} 
          System.out.println("----------------------------------------------------------"); 

  // Cozinha Italiana
      Cozinha cozItaliana = new Cozinha();
      cozItaliana.setTipo("Italiana");
      cozItaliana.setTempoPreparo(45); 
      cozItaliana.setNumeroPratos(6);
      cozItaliana.setHoraDeArbertura(13);
      cozItaliana.setHoraDeFechamento(22);
      cozItaliana.setNumeroCozinheiros(1);
      cozItaliana.setPratoPricipal("Yakissoba");
      // Ingredientes da Cozinha Italiana
          I = new Ingrediente();
          I.nome = "Molho";
          I.dataDeValidade = "14/11/2021";
          cozItaliana.setIngrediente(I);
          
          I = new Ingrediente();
          I.nome = "Macarrão";
          I.dataDeValidade = "13/04/2021";
          cozItaliana.setIngrediente(I);

          I = new Ingrediente();
          I.nome = "Carne";
          I.dataDeValidade = "26/08/2021";
          cozItaliana.setIngrediente(I);

      // Funcionarios da Cozinha Italiana

          F = new Funcionario();
          F.setNome("Cleiton Junior Rodrigues");
          F.setAtividade("Cozinheiro");
          cozItaliana.setFuncionario(F);

          F = new Funcionario();
          F.setNome("Pedro Jorge de Souza");
          F.setAtividade("Ajudante");
          cozItaliana.setFuncionario(F);

      //Saída 
          cozItaliana.imprimir();
          System.out.println("\nIngredientes do Prato Principal: \n"); 
          for(Ingrediente x : cozItaliana.getlistIngredientes()){System.out.println(x.getNome()+" | "+x.getDataDeValidade());}

          System.out.println("\nFuncionários da Cozinha: \n"); 

          for(Funcionario x : cozItaliana.getlistFuncionarios()){System.out.println(x.getNome()+" | "+x.getAtividade());} 
          System.out.println("----------------------------------------------------------"); 
  




   


  }
}