package listcont;

import javax.swing.JOptionPane;

public class Teste {

	
	public static void main(String[] args) {
		
		//1º null, 2º Mensagem
		JOptionPane.showMessageDialog(null, "Thiago Goldoni");
		
		//1º null, 2º Mensagem, 3º Título, 4º Ícone
		JOptionPane.showMessageDialog(null, "Thiago Goldoni","Menu Principal",JOptionPane.QUESTION_MESSAGE);
			
		//1º null, 2º Mensagem
		int a;
		a = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa ?");
	
		//1º null, 2º Mensagem, 3º Título, 4º JOptionPane.YES_NO_CANCEL_OPTION, 5º JOptionPane.PLAIN_MESSAGE, 6º null
		int b;
		b = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa ?", "Menu de Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);
	
		//1º null, 2º Mensagem
		String c;
		c = JOptionPane.showInputDialog(null,"Digite Seu Nome : ");
	
		//1º Mensagem, 2º Componente Pré-Definido
		String d;
		d = JOptionPane.showInputDialog("Digite Seu Nome : ", "Thiago Goldoni");
		
		//1º null, 2º Mensagem, 3º Título, 4º ícone
		String e;
		e = JOptionPane.showInputDialog(null, "Digite Seu nome","Título",JOptionPane.ERROR_MESSAGE);
	
		//1º null, 2º Mensagem, 3º Título, 4º JOptionPane.YES_NO_OPTION, 5º JOptionPane.PLAIN_MESSAGE, 6º Ícone, 7º Opções dos Botões, 8º null
		int f;
		String []op={"Cadastrar","Alterar","Exclui","Sair"};
		f = JOptionPane.showOptionDialog(null, "Escolha Uma Opção :", "Menu Principal", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, op, null);
	
	}
}