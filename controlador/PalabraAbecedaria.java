package controlador;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PalabraAbecedaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Texto = "";
		String Txt;
		int numeroLineas =0;
		//int[] resultado = new int[numeroLineas];
		String resultado="";
		char Caracter;
		Boolean Condicion = false;
		int nPlabrasABC = 0;
		int nPalabras;
		
		
		Txt = JOptionPane.showInputDialog(" sin signos de puntuación ni caracteres especiales. La longitud máxima del texto que se admite por cada línea es de 1000. Una línea con el texto “ABCD” indica el fin de la entrada. ");
				
		while (!Txt.equals("ABCD") && Txt != null && !Txt.equals("")) {
			
			numeroLineas++;
			
			String[] palabras = Txt.split(" ");
			//Texto = Texto  + Txt.toLowerCase() + "\n"; 
			
			for (int i=0; i < palabras.length; i++) {
				
				Condicion = false;
				//System.out.println( nPalabras = palabras[i].length()-1);
				
				for ( int x= 0; x < (palabras[i].length() ); x++) {
					String palabra = palabras[i].toLowerCase();
					System.out.print((int)palabra.charAt(x));
					System.out.println(palabra.charAt(x));
					if ( x  < (palabras[i].length()-1)) {if ((int)palabra.charAt(x) < (int)palabra.charAt(x+1)) {
						Condicion=true;
						System.out.println("        " + Condicion);
					} else {Condicion=false; x= palabras[i].length()-1;System.out.println(Condicion);}
					}
					
															
				}
				System.out.println("");
				if (Condicion==true) {nPlabrasABC++; System.out.println("                        " + nPlabrasABC );}
				
			}
			
			resultado = resultado + nPlabrasABC + "\n";
			nPlabrasABC = 0;
			
			Txt = JOptionPane.showInputDialog("introduce otra linea");
					
		}
		
		System.out.println( resultado);
		
		
		
		/*for (int i=0; i< palabras.length; i++ ) {
			System.out.println(palabras[i]);
		}*/
		
		/*for (int i = 0; i < Texto.length(); i++) {
			
			if (Texto.charAt(i) == '\n') {System.out.println("salto de linea");}
			else if (Texto.charAt(i) == ' ') {System.out.println("espacio");}
			else {System.out.println(Texto.charAt(i));}
			
		}*/
		
	}
	
	

}
