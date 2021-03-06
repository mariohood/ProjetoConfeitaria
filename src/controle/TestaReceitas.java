
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
import model.BoloCoberturaDAO;
import model.BoloVegano;
import model.BoloVeganoDAO;
import model.Sabor;
import model.TortaDAO;


public class TestaReceitas {
    public static void main(String[] args){
    
    //usando Scaner para receber mensagens de Usuario
    Scanner scan = new Scanner(System.in);
       
    //para usar só duas casa decimais
    DecimalFormat df = new DecimalFormat("##.##");
    
    // Instanciar os Produtos
    Produto farinha, aveia, leite, manteiga, acucar, ovos, cacao, leiteDeCoco,
            milho, laranja, cenoura, chocolate, cremeDeLeite, oleoVegetal, fermento;
    
    farinha = new Produto("Farinha",0.1f, 0.2f, 0.3f);
    aveia = new Produto("Aveia", 0.3f, 0.2f, 0.3f);
    leite = new Produto("Leite",0.2f ,0.3f, 0.4f);
    manteiga = new Produto("Manteiga", 0.3f, 0.4f, 0.5f);
    acucar = new Produto("Açucar", 0.3f, 0.2f, 0.1f);
    ovos = new Produto ("Ovos", 0.1f, 0.1f, 0.2f);
    cacao = new Produto("Cacao", 0.2f, 0.2f, 0.3f);
    leiteDeCoco = new Produto ("Leite de Coco", 0.1f, 0.2f, 0.2f);
    milho = new Produto ("Milho", 0.2f, 0.1f, 0.2f);
    laranja = new Produto("Laranja", 0.2f, 0.2f, 0.2f);
    cenoura = new Produto("Cenoura", 0.2f, 0.3f, 0.1f);
    chocolate = new Produto("Chocolate", 0.3f, 0.5f, 0.6f);
    cremeDeLeite = new Produto("Creme de Leite", 0.2f, 0.3f, 0.3f);
    oleoVegetal = new Produto("Oleo Vegetal", 0.1f, 0.1f, 0.2f);
    fermento = new Produto("Fermento", 0.05f, 0.05f, 0.04f);
    
    //Lista de Produtos
    List<Produto> produtos = new ArrayList<Produto>();
    produtos.add(farinha);
    produtos.add(aveia);
    produtos.add(leite);
    produtos.add(manteiga);
    produtos.add(acucar);
    produtos.add(ovos);
    produtos.add(cacao);
    produtos.add(leiteDeCoco);
    produtos.add(milho);
    produtos.add(laranja);
    produtos.add(cenoura);
    produtos.add(chocolate);
    produtos.add(cremeDeLeite);
    produtos.add(oleoVegetal);
    produtos.add(fermento);
      
    //Criando as coleções DAO
    BoloCoberturaDAO bcd = new BoloCoberturaDAO();
    BoloVeganoDAO bvd = new BoloVeganoDAO();
    TortaDAO td = new TortaDAO();
       
    //Instanciar os receitas de Bolo e colocar ingredientes na Lista 
    Bolo bolo1, bolo2, bolo3, bolo4, bolo5, bolo6;
    
    //Bolo de Milho Cobertura Chocolate
    bolo1 = new BoloCobertura (100,"Bolo de Milho Cobertura Chocolate");
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
    bolo2 = new BoloCobertura (101,"Bolo de Laranja Cobertura Leite Condensado");
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
    bolo3 = new Torta (200,"Torta Martha Rocha");
    Ingrediente ingB3_1,ingB3_2,ingB3_3, ingB3_4,ingB3_5,ingB3_6,ingB3_7;
    ingB3_1 = new Ingrediente(90,farinha);
    ingB3_2 = new Ingrediente(60,leite);
    ingB3_3 = new Ingrediente(40,manteiga);
    ingB3_4 = new Ingrediente(60,acucar);
    ingB3_5 = new Ingrediente(30,ovos);
    ingB3_6 = new Ingrediente(60,chocolate);
    ingB3_7 = new Ingrediente(30,cremeDeLeite);
    
    bolo3.adicionaIngrediente(ingB3_1);
    bolo3.adicionaIngrediente(ingB3_2);
    bolo3.adicionaIngrediente(ingB3_3);
    bolo3.adicionaIngrediente(ingB3_4);
    bolo3.adicionaIngrediente(ingB3_5);
    bolo3.adicionaIngrediente(ingB3_6);
    bolo3.adicionaIngrediente(ingB3_7);
    
    //Torta Floresta Negra
    bolo4 = new Torta (201,"Torta Floresta Negra");
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
  
    
    //Bolo Vegano de Cenoura
    bolo5 = new BoloVegano (300,"Bolo Vegano de Cenoura");
    Ingrediente ingB5_1,ingB5_2,ingB5_3, ingB5_4, ingB5_5;
    ingB5_1 = new Ingrediente(60,farinha);
    ingB5_2 = new Ingrediente(30,oleoVegetal);
    ingB5_3 = new Ingrediente(5,fermento);
    ingB5_4 = new Ingrediente(60,acucar);
    ingB5_5 = new Ingrediente(70,cenoura);
    bolo5.adicionaIngrediente(ingB5_1);
    bolo5.adicionaIngrediente(ingB5_2);
    bolo5.adicionaIngrediente(ingB5_3);
    bolo5.adicionaIngrediente(ingB5_4);
    bolo5.adicionaIngrediente(ingB5_5);
    
    //Bolo Vegano de Chocolate com Aveia
    bolo6 = new BoloVegano (301,"Bolo Vegano de Chocolate com Aveia");
    Ingrediente ingB6_1,ingB6_2,ingB6_3, ingB6_4, ingB6_5, ingB6_6, ingB6_7;
    ingB6_1 = new Ingrediente(40,farinha);
    ingB6_2 = new Ingrediente(20,leiteDeCoco);
    ingB6_3 = new Ingrediente(30,aveia);
    ingB6_4 = new Ingrediente(50,acucar);
    ingB6_5 = new Ingrediente(30,cacao);
    ingB6_6 = new Ingrediente(30,oleoVegetal);
    ingB6_7 = new Ingrediente(5,fermento);
    bolo6.adicionaIngrediente(ingB6_1);
    bolo6.adicionaIngrediente(ingB6_2);
    bolo6.adicionaIngrediente(ingB6_3);
    bolo6.adicionaIngrediente(ingB6_4);
    bolo6.adicionaIngrediente(ingB6_5);
    bolo6.adicionaIngrediente(ingB6_6);
    bolo6.adicionaIngrediente(ingB6_7);
    /*
    JOptionPane.showMessageDialog(null,"Confeitaria Três Amigos");
    String nome = JOptionPane.showInputDialog("Qual o seu nome ?");
       
        ArrayList <BoloCobertura> bolosCob = bcd.getBolosCobertura();
        int tamCob = bcd.getBolosCobertura().size(); 
        ArrayList <BoloVegano> bolosVeg = bvd.getBolosVeganos();
        int tamVeg = bvd.getBolosVeganos().size();
        ArrayList <Torta> bolosTor = td.getTortas();
        int tamTor = td.getTortas().size();
 
        ArrayList <Bolo> totalBolos = new ArrayList(); // api metodo addAll
        totalBolos.addAll(bolosCob); // concatenando listas completas
        totalBolos.addAll(bolosVeg); // concatenando listas completas
        totalBolos.addAll(bolosTor); // concatenando listas completas
        
        int tamanho = tamCob + tamVeg + tamTor;
        String[] opcoes = new String[tamanho];
        System.out.println("Tamanho: " + tamanho);
        
        for(int i = 0 ; i < tamanho ; i++){
            opcoes[i] = totalBolos.get(i).getNome();
        }
        
        */
          String opcaoInicial = JOptionPane.showInputDialog
                ("Selecione a opção desejada:\n"
                    + "1-Inserir\n"
                    + "2-Excluir\n"
                    + "3-Editar\n"
                    + "4-Pesquisar\n");

            switch(opcaoInicial){

                case "1":
                    
                String opcaoBolosInserir = JOptionPane.showInputDialog
                ("Selecione o bolo que deseja inserir:\n"
                    + "101-Bolo de Milho Cobertura Chocolate\n"
                    + "102-Bolo de Laranja Cobertura Leite Condensado\n"
                    + "103-Torta Martha Rocha\n"
                    + "104-Torta Floresta Negra\n"
                    + "105-Bolo Vegano de Cenoura\n"
                    + "106-Bolo Vegano de Chocolate com Aveia\n");
                
                switch(opcaoBolosInserir){
                    
                    case "101":
                        bcd.inserir(bolo1);
                        break;
                    case "102":
                        bcd.inserir(bolo2);
                        break;
                    case "103":
                        bcd.inserir(bolo3);
                        break;
                    case "104":
                        bcd.inserir(bolo4);
                        break;
                    case "105":
                        bcd.inserir(bolo5);
                        break;
                    case "106":
                        bcd.inserir(bolo6);
                        break;
                    default:
                        ;
                 
                }
                    
                case "2":
                    
                String opcaoBolosExcluir = JOptionPane.showInputDialog
                ("Selecione o bolo que deseja excluir:\n"
                    + "101-Bolo de Milho Cobertura Chocolate\n"
                    + "102-Bolo de Laranja Cobertura Leite Condensado\n"
                    + "103-Torta Martha Rocha\n"
                    + "104-Torta Floresta Negra\n"
                    + "105-Bolo Vegano de Cenoura\n"
                    + "106-Bolo Vegano de Chocolate com Aveia\n");
                
                switch(opcaoBolosExcluir){
                    
                    case "101":
                        bcd.excluir(bolo1);
                        break;
                    case "102":
                        bcd.excluir(bolo2);
                        break;
                    case "103":
                        bcd.excluir(bolo3);
                        break;
                    case "104":
                        bcd.excluir(bolo4);
                        break;
                    case "105":
                        bcd.excluir(bolo5);
                        break;
                    case "106":
                        bcd.excluir(bolo6);
                        break;
                    default:
                        ;
                }   
                    break;
                case "3":
                String opcaoBolosEditar = JOptionPane.showInputDialog
                ("Selecione o bolo que deseja editar:\n"
                    + "101-Bolo de Milho Cobertura Chocolate\n"
                    + "102-Bolo de Laranja Cobertura Leite Condensado\n"
                    + "103-Torta Martha Rocha\n"
                    + "104-Torta Floresta Negra\n"
                    + "105-Bolo Vegano de Cenoura\n"
                    + "106-Bolo Vegano de Chocolate com Aveia\n");
                
                switch(opcaoBolosEditar){
                    
                    case "101":
                        BoloCobertura bc1;
                        bc1 = bcd.buscarBolo(101);
                        String novoPreco1 = JOptionPane.showInputDialog
                        ("Digite o novo preço:\n");
                        double np1 = Double.parseDouble(novoPreco1);
                        bc1.setPreco(np1);
                        bcd.editar(bc1);
                        break;
                    case "102":
                        BoloCobertura bc2;
                        bc2 = bcd.buscarBolo(102);
                        String novoPreco2 = JOptionPane.showInputDialog
                        ("Digite o novo preço:\n");
                        double np2 = Double.parseDouble(novoPreco2);
                        bc2.setPreco(np2);
                        bcd.editar(bc2);
                        break;
                    case "103":
                        Torta bt3;
                        bt3 = td.buscarBolo(103);
                        String novoPreco3 = JOptionPane.showInputDialog
                        ("Digite o novo preço:\n");
                        double np3 = Double.parseDouble(novoPreco3);
                        bt3.setPreco(np3);
                        td.editar(bt3);
                        break;
                    case "104":
                        Torta bt4;
                        bt4 = td.buscarBolo(104);
                        String novoPreco4 = JOptionPane.showInputDialog
                        ("Digite o novo preço:\n");
                        double np4 = Double.parseDouble(novoPreco4);
                        bt4.setPreco(np4);
                        td.editar(bt4);
                        break;
                    case "105":
                        BoloVegano bv5;
                        bv5 = bvd.buscarBolo(105);
                        String novoPreco5 = JOptionPane.showInputDialog
                        ("Digite o novo preço:\n");
                        double np5 = Double.parseDouble(novoPreco5);
                        bv5.setPreco(np5);
                        bvd.editar(bv5);
                        break;
                    case "106":
                        BoloVegano bv6;
                        bv6 = bvd.buscarBolo(106);
                        String novoPreco6 = JOptionPane.showInputDialog
                        ("Digite o novo preço:\n");
                        double np6 = Double.parseDouble(novoPreco6);
                        bv6.setPreco(np6);
                        bvd.editar(bv6);
                        break;
                    default:
                        ;
                }
                    break;
                case "4":
                    String opcaoBolosPesquisar = JOptionPane.showInputDialog
                ("Selecione o bolo que deseja pesquisar:\n"
                    + "101-Bolo de Milho Cobertura Chocolate\n"
                    + "102-Bolo de Laranja Cobertura Leite Condensado\n"
                    + "103-Torta Martha Rocha\n"
                    + "104-Torta Floresta Negra\n"
                    + "105-Bolo Vegano de Cenoura\n"
                    + "106-Bolo Vegano de Chocolate com Aveia\n");
                
                switch(opcaoBolosPesquisar){
                    
                    case "101":
                        bcd.pesquisar(bolo1);
                        break;
                    case "102":
                        bcd.pesquisar(bolo2);
                        break;
                    case "103":
                        bcd.pesquisar(bolo3);
                        break;
                    case "104":
                        bcd.pesquisar(bolo4);
                        break;
                    case "105":
                        bcd.pesquisar(bolo5);
                        break;
                    case "106":
                        bcd.pesquisar(bolo6);
                        break;
                    default:
                        ;
                 
                }
                default:
                    ;

            }
        
        
        
        

        
                 
        
    
    }//Fim main
}//Fim TestaReceitas
