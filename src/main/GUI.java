package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;



public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	Container cp;
	
	Controle control = new Controle();
	
	int x;
	int y;
	int z;
	int a;
	int b;
	
	JTabbedPane abas = new JTabbedPane();
	
	JPanel panelN = new JPanel();
	JPanel panelS = new JPanel();
	JPanel panelC = new JPanel();
	JPanel panelW = new JPanel();
	JPanel panelE = new JPanel();
	JPanel panelBebidas = new JPanel();
	JPanel panelPratoPrincipal = new JPanel();
	JPanel panelAperitivos = new JPanel();
	JPanel panelCombos = new JPanel();
	JPanel panelEstoque = new JPanel();
	
	JPanel panelT1 = new JPanel();
	JPanel panelT2 = new JPanel();
	JPanel panelT3 = new JPanel();
	JPanel panelT4 = new JPanel();
	JPanel panelT5 = new JPanel();
	JPanel panelT6 = new JPanel();
	JPanel panelT7 = new JPanel();
	JPanel panelT8 = new JPanel();
	JPanel panelT9 = new JPanel();
	JPanel panelT10 = new JPanel();
	JPanel panelT11 = new JPanel();
	JPanel panelT12 = new JPanel();
	JPanel panelT13 = new JPanel();
	JPanel panelT14 = new JPanel();
	JPanel panelT15 = new JPanel();
	JPanel panelT16 = new JPanel();
	JPanel panelPesquisa = new JPanel();
	
	ImageIcon img = new ImageIcon("src/icon.png");
	ImageIcon icon_T = new ImageIcon("src/iconT.png");
	ImageIcon icon_close = new ImageIcon("src/fechar.png");
	ImageIcon icon_mini = new ImageIcon("src/minimizar.png");
	
	
	JLabel close = new JLabel(icon_close);
	JLabel mini = new JLabel(icon_mini);
	JLabel centro = new JLabel();
	JLabel icon = new JLabel(icon_T);
	JLabel title = new JLabel("    Hamburgão Lanches                                                                                             ");
	
	JLabel pesquisa = new JLabel("                  Pesquisa");
	JTextPane campo_pesq = new JTextPane();
	JButton pesquisar = new JButton(">");
	
	JLabel vazio = new JLabel("                NOME");
	JLabel vazio2 = new JLabel();
	JLabel vazio3 = new JLabel();
	JLabel vazio4 = new JLabel("               CÓDIGO");
	JLabel vazio5 = new JLabel();
	JLabel vazio6 = new JLabel();
	JLabel vazio7 = new JLabel("                VIP");
	JLabel vazio8 = new JLabel();
	JLabel vazio9 = new JLabel();
	JLabel vazio10 = new JLabel("               PREÇO");
	JLabel vazio11 = new JLabel();
	JLabel vazio12 = new JLabel();
	JLabel vazio13 = new JLabel();
	JLabel vazio14 = new JLabel();
	JLabel vazio15 = new JLabel();
	
	JPanel panelAdd = new JPanel();
	String[] tipos = { "Bebida", "Hamburger", "Aperitivo"};
	
	JCheckBox check  = new JCheckBox();
	JLabel labelCheck = new JLabel("                                    VIP >>");
	JTextField preço = new JTextField(10);
	JLabel  labelPreço= new JLabel("                                 PREÇO >>");
	JTextField nome = new JTextField(10);
	JLabel labelNome = new JLabel("                                  NOME >>");
	JTextField codigo = new JTextField(10);
	JLabel labelCodigo = new JLabel("                                 CÓDIGO >>");
	@SuppressWarnings("unchecked")
	JComboBox tipol = new JComboBox(tipos);
	JLabel labelTipo = new JLabel("                                   TIPO >>");
	JButton add = new JButton("ADICIONAR");

	Color coca = Color.decode("#ed1c16");
	Color Red = Color.decode("#ffcccb");
	Color branco = Color.decode("#ffffff");
	Color trans = Color.decode("#00FFFFFF");
	
	Font font = new Font("Arial", Font.CENTER_BASELINE, 20);
	
	
	public GUI() {
		cp = getContentPane();
		cp.setLayout(new BorderLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		String caminho = "Produto.csv";
		control.carregarDados(caminho);
		
		//__________Declarações__________
		cp.add(panelC, BorderLayout.CENTER);
		cp.setBackground(Red);
		
		
	
		
		cp.add(panelN, BorderLayout.NORTH);
		panelN.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelN.add(icon);
		panelN.add(title);
		panelN.add(mini);
		panelN.add(close);
		
		title.setForeground(coca);
		
		panelN.setBackground(Red);
		panelN.setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, coca));
		
		cp.add(BorderLayout.CENTER,abas);
		abas.setBackground(coca);
		abas.setForeground(branco);
		abas.addTab("Bebidas", panelBebidas);
		abas.addTab("Aperitivos", panelAperitivos);
		abas.addTab("Pratos",panelPratoPrincipal);
		abas.addTab("Estoque",panelEstoque);
		abas.addTab("Pesquisa",panelPesquisa);
		abas.addTab("Adicionar",panelAdd);

		
		//_________________PESQUISA_______________
		panelPesquisa.setLayout(new GridLayout(6,3));
		panelPesquisa.setBackground(Red);
		panelPesquisa.add(pesquisa);
		panelPesquisa.add(campo_pesq);
		panelPesquisa.add(pesquisar);
		panelPesquisa.add(vazio);
		panelPesquisa.add(vazio2);
		panelPesquisa.add(vazio3);
		panelPesquisa.add(vazio4);
		panelPesquisa.add(vazio5);
		panelPesquisa.add(vazio6);
		panelPesquisa.add(vazio7);
		panelPesquisa.add(vazio8);
		panelPesquisa.add(vazio9);
		panelPesquisa.add(vazio10);
		panelPesquisa.add(vazio11);
		panelPesquisa.add(vazio12);
		panelPesquisa.add(vazio13);
		panelPesquisa.add(vazio14);
		panelPesquisa.add(vazio15);
		
		vazio.setForeground(coca);
		vazio2.setForeground(coca);
		
		vazio4.setForeground(coca);
		vazio5.setForeground(coca);
		
		vazio7.setForeground(coca);
		vazio8.setForeground(coca);
		
		vazio10.setForeground(coca);
		vazio11.setForeground(coca);
	
		vazio13.setForeground(coca);
		vazio14.setForeground(coca);
		
		vazio.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, branco));
		vazio4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, branco));
		vazio7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, branco));
		vazio10.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, branco));
		vazio13.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, branco));
		
		vazio3.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, branco));
		vazio6.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, branco));
		vazio9.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, branco));
		vazio12.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, branco));
		vazio15.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, branco));
		
		pesquisa.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, branco));
		
		
		pesquisa.setForeground(coca);
		pesquisar.setBackground(coca);
		pesquisar.setForeground(branco);

		
		
		
		
		
		
		
		
		
		//________Bebidas_______________
		panelBebidas.setLayout(new GridLayout(x, 4));
		panelBebidas.setBackground(branco);
		
		panelBebidas.setLayout(new GridLayout(1,4));
		panelBebidas.setBackground(Red);
		panelBebidas.add(panelT1);
		panelT1.setBackground(Red);
		panelBebidas.add(panelT2);
		panelT2.setBackground(Red);
		panelBebidas.add(panelT3);
		panelT3.setBackground(Red);
		panelBebidas.add(panelT4);
		panelT4.setBackground(Red);
		
		panelT1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "nome", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           		panelT2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "vip", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "código", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		
		
		panelT1.setForeground(branco);
		
		
		
		
		//_________Aperitivos_______________
		panelAperitivos.setLayout(new GridLayout(y, 4));
		panelAperitivos.setBackground(branco);
		
		panelAperitivos.setLayout(new GridLayout(1,4));
		panelAperitivos.setBackground(Red);
		panelAperitivos.add(panelT5);
		panelT5.setBackground(Red);
		panelAperitivos.add(panelT6);
		panelT6.setBackground(Red);
		panelAperitivos.add(panelT7);
		panelT7.setBackground(Red);
		panelAperitivos.add(panelT8);
		panelT8.setBackground(Red);
		
		panelT5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "nome", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           		panelT2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT7.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "vip", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "código", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		
		
		panelT5.setForeground(branco);
		
		
		//_________Pratos_______________
		panelPratoPrincipal.setLayout(new GridLayout(z, 4));
		panelPratoPrincipal.setBackground(branco);
	
		
		panelPratoPrincipal.add(panelT9);
		panelT9.setBackground(Red);
		panelPratoPrincipal.add(panelT10);
		panelT10.setBackground(Red);
		panelPratoPrincipal.add(panelT11);
		panelT11.setBackground(Red);
		panelPratoPrincipal.add(panelT12);
		panelT12.setBackground(Red);
		
		panelT9.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "nome", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           		panelT2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "vip", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT12.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "código", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		
		
		panelT9.setForeground(branco);
		
		//____________________________________________________________________________________
		List<Produto> produtos = control.listar();
		
		panelT1.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT2.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT3.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT4.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT5.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT6.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT7.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT8.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT9.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT10.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT11.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT12.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT13.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT14.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT15.setLayout(new GridLayout(control.tamanhoLista(),1));
		panelT16.setLayout(new GridLayout(control.tamanhoLista(),1));
		
		for(int i = 0; i < control.tamanhoLista(); i++) {
			String tipo = String.valueOf(produtos.get(i).getTipo());
			String tipo2 = tipo;
			System.out.println(tipo);
			   if(tipo2.equals(tipos[0])) {
				  
				JLabel ok = new JLabel((produtos.get(i).getNome()));
				ok.setForeground(branco);
				panelT1.add(ok);
			
			 }
			   
			}
			for( int i = 0; i < control.tamanhoLista(); i++) {
				    String tipo = String.valueOf(produtos.get(i).getTipo());
				    String tipo2 = tipo;
				   System.out.println(tipo);
				   if(tipo2.equals(tipos[0])) {
					   
					   JLabel ok = new JLabel((String.valueOf(produtos.get(i).getPreço())));
					   ok.setForeground(branco);
					   panelT2.add(ok);
					   
				   }
			}
			for( int i = 0; i < control.tamanhoLista(); i++) {
				String tipo = String.valueOf(produtos.get(i).getTipo());
				String tipo2 = tipo;
				System.out.println(tipo);
				if(tipo2.equals(tipos[0])) {
					
					if(produtos.get(i).isVIP() == true) {
					JLabel ok = new JLabel("sim");
					ok.setForeground(branco);
					panelT3.add(ok);
					}else {
						JLabel ok = new JLabel("não");
						ok.setForeground(branco);
						panelT3.add(ok);
					}
				}
			}
				for( int i = 0; i < control.tamanhoLista(); i++) {
					String tipo = String.valueOf(produtos.get(i).getTipo());
					String tipo2 = tipo;
					System.out.println(tipo);
					if(tipo2.equals(tipos[0])) {
							JLabel ok = new JLabel(produtos.get(i).getCódigo());
							ok.setForeground(branco);
							panelT4.add(ok);
					}
			}
	
				for(int i = 0; i < control.tamanhoLista(); i++) {
					String tipo = String.valueOf(produtos.get(i).getTipo());
					String tipo2 = tipo;
					System.out.println(tipo);
					   if(tipo2.equals(tipos[1])) {
						  
						JLabel ok = new JLabel((produtos.get(i).getNome()));
						ok.setForeground(branco);
						panelT5.add(ok);
					
					 }
			   
					}
					for( int i = 0; i < control.tamanhoLista(); i++) {
						    String tipo = String.valueOf(produtos.get(i).getTipo());
						    String tipo2 = tipo;
						   System.out.println(tipo);
						   if(tipo2.equals(tipos[1])) {
							   
							   JLabel ok = new JLabel((String.valueOf(produtos.get(i).getPreço())));
							   ok.setForeground(branco);
							   panelT6.add(ok);
							   
						   }
					}
					for( int i = 0; i < control.tamanhoLista(); i++) {
						String tipo = String.valueOf(produtos.get(i).getTipo());
						String tipo2 = tipo;
						System.out.println(tipo);
						if(tipo2.equals(tipos[1])) {
							
							if(produtos.get(i).isVIP() == true) {
							JLabel ok = new JLabel("sim");
							ok.setForeground(branco);
							panelT7.add(ok);
							}else {
								JLabel ok = new JLabel("não");
								ok.setForeground(branco);
								panelT7.add(ok);
							}
						}
					}
						for( int i = 0; i < control.tamanhoLista(); i++) {
							String tipo = String.valueOf(produtos.get(i).getTipo());
							String tipo2 = tipo;
							System.out.println(tipo);
							if(tipo2.equals(tipos[1])) {
									JLabel ok = new JLabel(produtos.get(i).getCódigo());
									ok.setForeground(branco);
									panelT8.add(ok);
							}
					}
						
						
						
			
						
						for(int i = 0; i < control.tamanhoLista(); i++) {
							String tipo = String.valueOf(produtos.get(i).getTipo());
							String tipo2 = tipo;
							System.out.println(tipo);
							   if(tipo2.equals(tipos[2])) {
								  
								JLabel ok = new JLabel((produtos.get(i).getNome()));
								ok.setForeground(branco);
								panelT9.add(ok);
							
							 }
							   
							}
							for( int i = 0; i < control.tamanhoLista(); i++) {
								    String tipo = String.valueOf(produtos.get(i).getTipo());
								    String tipo2 = tipo;
								   System.out.println(tipo);
								   if(tipo2.equals(tipos[2])) {
									   
									   JLabel ok = new JLabel((String.valueOf(produtos.get(i).getPreço())));
									   ok.setForeground(branco);
									   panelT10.add(ok);
									   
								   }
							}
							for( int i = 0; i < control.tamanhoLista(); i++) {
								String tipo = String.valueOf(produtos.get(i).getTipo());
								String tipo2 = tipo;
								System.out.println(tipo);
								if(tipo2.equals(tipos[2])) {
									
									if(produtos.get(i).isVIP() == true) {
									JLabel ok = new JLabel("sim");
									ok.setForeground(branco);
									panelT11.add(ok);
									}else {
										JLabel ok = new JLabel("não");
										ok.setForeground(branco);
										panelT11.add(ok);
									}
								}
							}
								for( int i = 0; i < control.tamanhoLista(); i++) {
									String tipo = String.valueOf(produtos.get(i).getTipo());
									String tipo2 = tipo;
									System.out.println(tipo);
									if(tipo2.equals(tipos[2])) {
											JLabel ok = new JLabel(produtos.get(i).getCódigo());
											ok.setForeground(branco);
											panelT12.add(ok);
									}
							}
						
						
						
		
		//_________Estoque_______________________________________________________________________
		panelEstoque.setLayout(new GridLayout(1,4));
		panelEstoque.setBackground(Red);
		panelEstoque.add(panelT13);
		panelT13.setBackground(Red);
		panelEstoque.add(panelT14);
		panelT14.setBackground(Red);
		panelEstoque.add(panelT15);
		panelT15.setBackground(Red);
		panelEstoque.add(panelT16);
		panelT16.setBackground(Red);
		
		
		
		panelT13.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "nome", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT14.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           		panelT2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "preço", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT15.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "vip", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		panelT16.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(00, 2, 2, 2, coca), "código", TitledBorder.TOP, TitledBorder.CENTER , font, branco));                           
		
		
		panelT13.setForeground(branco);
		
		//______________________________________
		
		panelAdd.setLayout(new GridLayout(6,2));
		panelAdd.add(labelNome);
		panelAdd.add(nome);
		panelAdd.add(labelPreço);
		panelAdd.add(preço);
		panelAdd.add(labelCodigo);
		panelAdd.add(codigo);
		panelAdd.add(labelCheck);
		panelAdd.add(check);
		panelAdd.add(labelTipo);
		panelAdd.add(tipol);
		panelAdd.add(add);
		
		
		
		
		
		
		
		
		
		//-------------------------------------------------------------------------
		close.addMouseListener(new MouseAdapter() {
			  @Override
			  public void mouseClicked(MouseEvent e) {
			     System.exit(0);
			  }
			});
		mini.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		
				
		control.carregarDados(caminho);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nomeG = null;
				double preçoG = 0;
				String tipoG = null;
				String codG = null;
				boolean vipG = false;
				Produto produto = new Produto(nomeG, codG, tipoG, vipG, preçoG);
				
				
				Produto CODIGO = control.buscarCod(codigo.getText());
				Produto CODIG = control.buscar(codigo.getText());
				if (CODIGO != null || CODIG != null) {
				System.out.println("OPA");
					
				}else {
					 nomeG = (nome.getText());
					 preçoG = (Double.valueOf(preço.getText()));
					 tipoG = (String.valueOf(tipol.getSelectedItem()));
					 codG = (codigo.getText());
					 vipG = (check.isSelected());
					 produto.setNome(nomeG);
					 produto.setCódigo(codG);
					 produto.setPreço(preçoG);
					 produto.setTipo(tipoG);
					 produto.setVIP(vipG);
					 
					 control.adicionar(produto);
					 control.gravarLista(caminho);
					
				}
				
			}
		});
		
		//------------------------------------------------------------------------------------------
			pesquisar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Produto produto = control.buscar(campo_pesq.getText()); 
					if (produto!= null) {
						vazio2.setText(produto.getNome());
						vazio5.setText(produto.getCódigo());
						vazio8.setText(Boolean.toString(produto.isVIP()));
						vazio11.setText(String.valueOf(produto.getPreço()));
					}else {
						vazio2.setText("  NÃO FOI POSSIVEL ACHAR");
						
						
					}
					
				}
			});
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setIconImage(img.getImage());
		setUndecorated(true);

		setVisible(true);
		
	}

	

}  