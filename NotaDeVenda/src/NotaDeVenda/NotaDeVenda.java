package NotaDeVenda;

import java.util.ArrayList;
import java.util.List;

class Produto {
    String nome;
    double precoUnitario;
    int quantidade;

    public Produto(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularPrecoTotal() {
        return precoUnitario * quantidade;
    }
}

public class NotaDeVenda {
    public static void main(String[] args) {
      
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz 5kg", 20.00, 2));
        produtos.add(new Produto("Feijão 1kg", 8.50, 3));
        produtos.add(new Produto("Macarrão 500g", 4.00, 5));
        produtos.add(new Produto("Óleo 900ml", 9.99, 2));

        
        System.out.println("========= NOTA DE VENDA =========");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Produto", "Qtd", "Preço Unit.", "Total");
        double valorTotal = 0;

        for (Produto produto : produtos) {
            double precoTotal = produto.calcularPrecoTotal();
            System.out.printf("%-20s %-10d R$%-10.2f R$%-10.2f%n", 
                              produto.nome, produto.quantidade, produto.precoUnitario, precoTotal);
            valorTotal += precoTotal;
        }

        System.out.println("=================================");
        System.out.printf("VALOR TOTAL DA VENDA: R$%.2f%n", valorTotal);
    }
}