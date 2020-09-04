public class ItemPedido {
    private Long id;
    private String forma;
    private String tipoPizza;
    private String nome;
    private String Situacao = "Aberto";
    private double tamanho;
    private double precoItem;
    private double precoSimples = 1.00;
    private double precoEspecial = 1.00;
    private double precoPremium = 1.00;
    
    public ItemPedido(Long id, String nome,String forma, String tipoPizza, double tamanho, double precoItem){
        this.id = id;
        this.nome = nome;
        this.forma = forma;
        this.tipoPizza = tipoPizza;
        this.tamanho = tamanho;
        this.precoItem = precoItem;
    }
    public ItemPedido(Long id, String forma, String tipoPizza, double tamanho, double precoItem){
        this.id = id;
        this.forma = forma;
        this.tipoPizza = tipoPizza;
        this.tamanho = tamanho;
        this.precoItem = precoItem;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getForma(){
        return forma;
    }
    
    public void setForma(String forma){
        this.forma = forma;
    }
    
    public String getTipoPizza(){
        return tipoPizza;
    }
    
    public void setTipoPizza(String tipoPizza){
        this.tipoPizza = tipoPizza;
    }
    
    public double getTamanho(){
        return tamanho;
    }
    
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    
    public void atualizaPrecos(double precoNovo){
        switch (getTipoPizza()) {
            case "Simples":
                precoSimples = precoNovo;
                break;
            case "Especial":
                precoEspecial = precoNovo;
                break;
            default:
                precoPremium = precoNovo;
                break;
        }
    }
    
    public double getPrecoSimples(){
        return precoSimples;
    }
    
    public void setPrecoSimples(double precoComum){
        this.precoSimples = precoComum;
    }
    
    public double getPrecoEspecial(){
        return precoEspecial;
    }
    
    public void setPrecoEspecial(double precoEspecial){
        this.precoEspecial = precoEspecial;
    }
    
    public double getPrecoPremium(){
        return precoPremium;
    }
    
    public void setPrecoPremium(double precoPremium){
        this.precoPremium = precoPremium;
    }
    
    public double getPrecoItem(){
        return precoItem;
    }
    
    public void setPrecoItem(double precoItem){
        this.precoItem = precoItem;
    }
    
    public void calculaPrecoItem(double precoItem){
        this.precoItem = precoItem * this.tamanho;
    }
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

}
