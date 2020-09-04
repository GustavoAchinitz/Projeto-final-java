import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private long id;
    private String telefoneCliente;
    private String nome;
    private List<ItemPedido> itens = new ArrayList();
    private double valorTotal;
    
    public Pedido(Long id,String nome,String telefone, List<ItemPedido> itens, double valorTotal){
        this.id = id;
        this.telefoneCliente = telefone;
        this.nome = nome;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getTelefoneCliente(){
        return telefoneCliente;
    }
    
    public void setTelefoneCliente(String telefone){
        this.telefoneCliente = telefone;
    }
    
    public List<ItemPedido> getItens(){
        return itens;
    }
    
    public void setItens(List<ItemPedido> itens){
        this.itens = itens;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
}
