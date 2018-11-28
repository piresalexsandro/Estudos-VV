package entidade;

public class CartaoCredito {
	private String nroCartao;
	private String validade;
	private Cliente cliente;
	
	public CartaoCredito() {
		// TODO Auto-generated constructor stub
	}
	
	public CartaoCredito(String nroCartao, String validade, Cliente cliente) {
		// TODO Auto-generated constructor stub
	}
	
	public String getNroCartao() {
		return nroCartao;
	}
	public void setNroCartao(String nroCartao) {
		this.nroCartao = nroCartao;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
			
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cliente + "\n" + "Numero do Cartao: " + getNroCartao() + ", Validade: " + getValidade();
	}

}
