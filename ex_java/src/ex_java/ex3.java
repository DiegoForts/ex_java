package ex_java;
import javax.swing.JOptionPane;
public class ex3 {
	
	public static void main(String[] args) {
	try { 
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"))
		System.out.println("i = " + i);
	}catch(Exception e) {
		e.printStackTrace(s);
  }
	}
}
