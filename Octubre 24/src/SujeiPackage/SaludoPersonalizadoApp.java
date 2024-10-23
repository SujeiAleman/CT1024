package SujeiPackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SaludoPersonalizadoApp {

	public static void main(String[] args) {
		//  4 Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
		JFrame f;
		f=new JFrame();
		
		String name;
		name=JOptionPane.showInputDialog("Introduce name");
		
		System.out.println(name);
	}

}
