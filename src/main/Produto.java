package main;

/**
 *

 */
public class Produto {

    private String nome;
    private String c�digo;
    private double pre�o;
    private boolean VIP;
    private String tipo;

    

    public Produto(String nome, String c�digo, String tipo , boolean VIP, double pre�o) {
        this.nome = nome;
        this.c�digo = c�digo;
        this.pre�o = pre�o;
        this.VIP = VIP;
        this.tipo = tipo;
    }


	public String getTipo() {
        return tipo;
    }
    
    public String getC�digo() {
    	return c�digo;
    }

    public void setC�digo(String c�digo) {
        this.c�digo = c�digo;
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

    public double getPre�o() {
        return pre�o;
    }

    public void setPre�o(double pre�o) {
        this.pre�o = pre�o;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        return nome + ";" + c�digo + ";" + tipo + ";" + (isVIP() ? "Sim" : "N�o") + ";" + pre�o;
    }

}
