package main;

import java.util.ArrayList;
import java.util.List;
import tools.ManipulaArquivo;

/**
 *
 * @author radames
 */
public class Controle {

    public List<Produto> lista = new ArrayList<>();

    public Controle() { //esse construtor é usado para adicionar alguns dados na lista e 

    }

    public void limparLista() {
        lista.clear();//zera a lista
    }
    public int tamanhoLista() {
    	return lista.size();
    }

    public void adicionar(Produto produto) {
        lista.add(produto);
    }

    public List<Produto> listar() {
        return lista;
    }

    public Produto buscar(String nome) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(nome)) {
                return lista.get(i);
            }
        }
        return null;

    }
    public Produto buscarTipo(String tipo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTipo().equals(tipo)) {
                return lista.get(i);
            }
        }
        return null;

    }
    public Produto buscarCod(String codigo) {
    	for (int i = 0; i < lista.size(); i++) {
    		if (lista.get(i).getTipo().equals(codigo)) {
    			return lista.get(i);
    		}
    	}
    	return null;
    	
    }

    public void alterar(Produto produto, Produto produtoAntigo) {
        lista.set(lista.indexOf(produtoAntigo), produto);

    }

    public void excluir(Produto produto) {
        lista.remove(produto);
    }

    public void gravarLista(String caminho) {
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        List<String> listaDeString = new ArrayList<>();
        for (Produto produto : lista) {
            listaDeString.add(produto.toString());
        }
        manipulaArquivo.salvarArquivo(caminho, listaDeString);
    }

    void carregarDados(String caminho) {
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
        if (!manipulaArquivo.existeOArquivo(caminho)) {
            manipulaArquivo.criarArquivoVazio(caminho);
        }

        List<String> listaDeString = manipulaArquivo.abrirArquivo(caminho);
        //converter de CSV para Trabalhador
        Produto produto;
        for (String string : listaDeString) {
            String aux[] = string.split(";");
            produto = new Produto(aux[0], aux[1], aux[2],(aux[3].equals("Sim") ? true : false), Double.valueOf(aux[4]));
            lista.add(produto);
        }
    }
    
    
    public void printar() {
    	System.out.println(lista);
    }
    
    public Produto rodar(String tipo) {
    	while(true) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTipo().equals(tipo)) {
            	
                return lista.get(i);
            }
            if (lista.size()>i) {
            	break;
            }
        }
        return null;
     
    	}
    }
    
    
    

}
