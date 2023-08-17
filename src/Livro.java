public class Livro {
    private String nome, autor, ISBN, ano, editora, prateleira, seção, cdd;
    private int edição;

    void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getSeção() {
        return seção;
    }

    public void setSeção(String seção) {
        this.seção = seção;
    }

    public String getCdd() {
        return cdd;
    }

    public void setCdd(String cdd) {
        this.cdd = cdd;
    }

    public int getEdição() {
        return edição;
    }

    public void setEdição(int edição) {
        this.edição = edição;
    }
}
