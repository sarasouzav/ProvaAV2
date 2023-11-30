class PedidoItem {
    private String nomeEvento;
    private int qtdeIngresso;
    private double precoIngresso;
    private double valorTotal;

    public PedidoItem(String nomeEvento, int qtdeIngresso, double precoIngresso) {
        this.nomeEvento = nomeEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.precoIngresso = precoIngresso;
    }

    // Getters e Setters

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    // Método para atualizar estoque de ingressos do evento
    public boolean atualizaEstoqueIngresso(Evento evento) {
        if (evento.getQtdIngresso() >= this.qtdeIngresso) {
            evento.setQtdIngresso(evento.getQtdIngresso() - this.qtdeIngresso);
            return true;
        } else {
            return false;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }
}