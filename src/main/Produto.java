package main;

/**
 *

 */
public class Produto {

    private String nome;
    private String código;
    private double preço;
    private boolean VIP;
    private String tipo;

    

    public Produto(String nome, String código, String tipo , boolean VIP, double preço) {
        this.nome = nome;
        this.código = código;
        this.preço = preço;
        this.VIP = VIP;
        this.tipo = tipo;
    }


	public String getTipo() {
        return tipo;
    }
    
    public String getCódigo() {
    	return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }
    
    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        return nome + ";" + código + ";" + tipo + ";" + (isVIP() ? "Sim" : "Não") + ";" + preço;
    }

}
