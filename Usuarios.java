// Classe Abstrata com os parâmtros necessários para não ser instanciada
abstract class Usuarios {
    protected int id;
    protected String nome;


    //  Construtor da classe concreta
    public Usuarios(int id, String nome){
        this.id = id;
        this.nome = nome;

    }


    // Getter e Setter
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
