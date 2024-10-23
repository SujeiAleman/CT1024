package SujeiPackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AreaDeUnCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f;
		f=new JFrame();
		
		double A;
		double r=0;
		r=Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor del radio del cículo"));
		double pi=3.14;
		A=((pi)*(r*r));
		
		System.out.println("El área del círculo es " +  A);
		
		
		

	}

}
