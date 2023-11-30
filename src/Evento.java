import java.util.ArrayList;
import java.util.Date;

class Evento {
    private String nomeEvento;
    private Date dataEvento;
    private double precoEvento;
    private String descEvento;
    private int qtdIngresso;
    private Categoria categoria;

    public Evento(String nomeEvento, Date dataEvento, double precoEvento, String descEvento, int qtdIngresso, Categoria categoria) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.precoEvento = precoEvento;
        this.descEvento = descEvento;
        this.qtdIngresso = qtdIngresso;
        this.categoria = categoria;
    }

    // Getters e Setters

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public double getPrecoEvento() {
        return precoEvento;
    }

    public void setPrecoEvento(double precoEvento) {
        this.precoEvento = precoEvento;
    }

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public int getQtdIngresso() {
        return qtdIngresso;
    }

    public void setQtdIngresso(int qtdIngresso) {
        this.qtdIngresso = qtdIngresso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método para buscar evento
    public boolean buscarEvento(Evento evento) {
        return this.nomeEvento.equals(evento.getNomeEvento());
    }

    // Método para inserir evento
    public void inserirEvento(Evento evento) {
        // Implementação do método
    }
}