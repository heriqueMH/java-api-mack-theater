public class Espetaculo {

    // Atributos
    protected String nome;
    protected String data;
    protected String hora;
    private double preco;
    protected boolean[] assentos;

    // Construtor
    public Espetaculo(String nome, String data, String hora, double preco) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
    }

    // Getters e Setters
    public double getPreco() {
        return preco;
    }


}
