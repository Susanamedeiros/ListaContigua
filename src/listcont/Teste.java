package listcont;

import javax.swing.JOptionPane;

public class Teste {

	
	public static void main(String[] args) {
		
		//1� null, 2� Mensagem
		JOptionPane.showMessageDialog(null, "Thiago Goldoni");
		
		//1� null, 2� Mensagem, 3� T�tulo, 4� �cone
		JOptionPane.showMessageDialog(null, "Thiago Goldoni","Menu Principal",JOptionPane.QUESTION_MESSAGE);
			
		//1� null, 2� Mensagem
		int a;
		a = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa ?");
	
		//1� null, 2� Mensagem, 3� T�tulo, 4� JOptionPane.YES_NO_CANCEL_OPTION, 5� JOptionPane.PLAIN_MESSAGE, 6� null
		int b;
		b = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa ?", "Menu de Confirma��o", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);
	
		//1� null, 2� Mensagem
		String c;
		c = JOptionPane.showInputDialog(null,"Digite Seu Nome : ");
	
		//1� Mensagem, 2� Componente Pr�-Definido
		String d;
		d = JOptionPane.showInputDialog("Digite Seu Nome : ", "Thiago Goldoni");
		
		//1� null, 2� Mensagem, 3� T�tulo, 4� �cone
		String e;
		e = JOptionPane.showInputDialog(null, "Digite Seu nome","T�tulo",JOptionPane.ERROR_MESSAGE);
	
		//1� null, 2� Mensagem, 3� T�tulo, 4� JOptionPane.YES_NO_OPTION, 5� JOptionPane.PLAIN_MESSAGE, 6� �cone, 7� Op��es dos Bot�es, 8� null
		int f;
		String []op={"Cadastrar","Alterar","Exclui","Sair"};
		f = JOptionPane.showOptionDialog(null, "Escolha Uma Op��o :", "Menu Principal", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, op, null);
	
	}
}