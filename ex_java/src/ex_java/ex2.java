package ex_java;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog ("Digite um n�mero:"));
		double d = Double.parseDouble(JOptionPane.showInputDialog ("Digite um n�mero:"));
		
		System.out.println("i = " + i);
		System.out.println("d = " + d);

	}

}
