
package controle;

import java.util.ArrayList;
import java.util.List;
import model.Bolo;
import model.BoloCobertura;
import model.Ingrediente;
import model.Produto;
import java.text.DecimalFormat;
import model.Torta;
import view.Tela;
import java.util.Scanner;
import javax.swing.*;


public class TestaReceitas {
    public static void main(String[] args){
    
    //usando Scaner para receber mensagens de Usuario
    Scanner scan = new Scanner(System.in);
    // Comentario de Rafa
    // segundo teste
    // tercer teste
    
     // usando a classe Javax.Swing
     
      JOptionPane.showMessageDialog(null,"Bom Dia!");
        String nome = JOptionPane.showInputDialog("Qual o seu nome ?");
        JOptionPane.showMessageDialog(null,"Bem vindo à Confiteiria Três Amigos Sr(a) " + nome);
        //String ano = 
        JOptionPane.showMessageDialog(null,"Em que podemos atenderlo(a)");
        //Integer i = new Integer(ano);
        //int a = i.intValue();
        //int a = Integer.parseInt(ano);
        //int idade = 2019 - a;
        //JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos");
        String pedido = JOptionPane.showInputDialog("Qual é seu pedido:");
        
        
        
    //para usar só duas casa decimais
    DecimalFormat df = new DecimalFormat("##.##");
    
    // Instanciar los Produtos
    Produto farinha, leite, manteiga, acucar, ovos, cacao, leiteCoco,
            milho, laranja, chocolate, cremeDeLeite;
    farinha = new Produto("Farinha",0.1f, 0.2f, 0.3f);
    leite = new Produto("Leite",0.2f ,0.3f, 0.4f);
    manteiga = new Produto("Manteiga", 0.3f, 0.4f, 0.5f);
    acucar = new Produto("Açucar", 0.3f, 0.2f, 0.1f);
    ovos = new Produto ("Ovos", 0.1f, 0.1f, 0.2f);
    cacao = new Produto("Cacao", 0.2f, 0.2f, 0.3f);
    leiteCoco = new Produto ("Leite de Coco", 0.1f, 0.2f, 0.2f);
    milho = new Produto ("Milho", 0.2f, 0.1f, 0.2f);
    laranja = new Produto("Laranja", 0.2f, 0.2f, 0.2f);
    chocolate = new Produto("Chocolate", 0.3f, 0.5f, 0.6f);
    cremeDeLeite = new Produto("Creme de Leite", 0.2f, 0.3f, 0.3f);
    //Lista de Produtos
    List<Produto> produtos = new ArrayList<Produto>();
    produtos.add(farinha);
    produtos.add(leite);
    produtos.add(manteiga);
    produtos.add(acucar);
    produtos.add(ovos);
    produtos.add(cacao);
    produtos.add(leiteCoco);
    produtos.add(milho);
    produtos.add(laranja);
    
    //Instanciar os receitas de Bolo e colocar ingredientes na Lista 
    Bolo bolo1, bolo2, bolo3, bolo4, bolo5, bolo6;
    
    //Bolo de Milho Cobertura Chocolate
    bolo1 = new BoloCobertura ("Bolo de Milho Cobertura Chocolate");
    Ingrediente ingB1_1,ingB1_2,ingB1_3, ingB1_4, ingB1_5;
    ingB1_1 = new Ingrediente(60,farinha);
    ingB1_2 = new Ingrediente(80,leite);
    ingB1_3 = new Ingrediente(50,manteiga);
    ingB1_4 = new Ingrediente(60,acucar);
    ingB1_5 = new Ingrediente(40,milho);
    bolo1.adicionaIngrediente(ingB1_1);
    bolo1.adicionaIngrediente(ingB1_2);
    bolo1.adicionaIngrediente(ingB1_3);
    bolo1.adicionaIngrediente(ingB1_4);
    bolo1.adicionaIngrediente(ingB1_5);
    
    //Bolo de Laranja Cobertura Leite Condensado
    bolo2 = new BoloCobertura ("Bolo de Laranja Cobertura Leite Condensado");
    Ingrediente ingB2_1,ingB2_2,ingB2_3, ingB2_4, ingB2_5;
    ingB2_1 = new Ingrediente(90,farinha);
    ingB2_2 = new Ingrediente(60,leite);
    ingB2_3 = new Ingrediente(40,manteiga);
    ingB2_4 = new Ingrediente(60,acucar);
    ingB2_5 = new Ingrediente(30,laranja);
    bolo2.adicionaIngrediente(ingB2_1);
    bolo2.adicionaIngrediente(ingB2_2);
    bolo2.adicionaIngrediente(ingB2_3);
    bolo2.adicionaIngrediente(ingB2_4);
    bolo2.adicionaIngrediente(ingB2_5);

    //Torta Martha Rocha
    

    //Torta Floresta Negra
    bolo4 = new Torta ("Torta Floresta Negra");
    Ingrediente ingB4_1,ingB4_2,ingB4_3, ingB4_4,ingB4_5,ingB4_6,ingB4_7;
    ingB4_1 = new Ingrediente(90,farinha);
    ingB4_2 = new Ingrediente(60,leite);
    ingB4_3 = new Ingrediente(40,manteiga);
    ingB4_4 = new Ingrediente(60,acucar);
    ingB4_5 = new Ingrediente(30,ovos);
    ingB4_6 = new Ingrediente(60,chocolate);
    ingB4_7 = new Ingrediente(30,cremeDeLeite);
    bolo4.adicionaIngrediente(ingB4_1);
    bolo4.adicionaIngrediente(ingB4_2);
    bolo4.adicionaIngrediente(ingB4_3);
    bolo4.adicionaIngrediente(ingB4_4);
    bolo4.adicionaIngrediente(ingB4_5);
    bolo4.adicionaIngrediente(ingB4_6);
    bolo4.adicionaIngrediente(ingB4_7);
    //Bolo Vegano de Coco
    

    //Bolo Vegano de Fuba
    
    
    
    
    //Lista de Bolos
    List<Bolo> bolos = new ArrayList<Bolo>();
    bolos.add(bolo1);
    bolos.add(bolo2);
    //bolos.add(bolo3);
    bolos.add(bolo4);
    //bolos.add(bolo5);
    //bolos.add(bolo6);
    
    System.out.println("Nome -    " + "\tCarboidratos - Proteinas - Gordura - Calorias");
    for(Produto prod : produtos){
        System.out.println(prod.getNome() + "\t -\t\t" + df.format(prod.getCarboidrato()) + " -\t" + df.format(prod.getProteina()) +
                " - \t\t" + df.format(prod.getGordura()) + " - \t" + df.format(prod.calorias()));
    }
    System.out.println("-------------------------------------------------------");
    
    //Imprime Bolo
    System.out.println("Nome: " + bolo1.getNome());
    
     System.out.println("-------------------------------------------------------");
     
    Tela tela = new Tela();
    
    System.out.println("Imprime Lista de Bolos");
    System.out.println();
    tela.imprimeBolos(bolos);
    
    
    }//Fim main
}//Fim TestaReceitas
