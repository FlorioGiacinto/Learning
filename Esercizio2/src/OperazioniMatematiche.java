
public class OperazioniMatematiche {

	public Numero cambiaSegno(Numero n) {
		int num = n.getNumeratore();
		int den = n.getDenominatore();
		n.setNumeratore(num*=-1);
		n.setDenominatore(den*=-1);
		
		return n;
	}
	
	public Numero somma(Numero n1 , Numero n2) {
		int num1 = n1.getNumeratore();     int num2 = n2.getNumeratore();
		int den1 = n1.getDenominatore();   int den2 = n2.getDenominatore();
		
		n1.setNumeratore(num1+num2);   
			
			if(den1!=1 && den2!=1)
				n1.setDenominatore(den1+den2);
			else
				n1.setDenominatore(1);
			
			return n1;
	}
	
	public Numero sottrazione(Numero n1 , Numero n2) {
		int num1 = n1.getNumeratore();     int num2 = n2.getNumeratore();
		int den1 = n1.getDenominatore();   int den2 = n2.getDenominatore();
		
		n1.setNumeratore(num1-num2);   

		if(den1!=1 && den2!=1)
			n1.setDenominatore(den1-den2);
		else
			n1.setDenominatore(1);
		
		return n1;
	}
	
	public Numero moltiplicazione(Numero n1 , Numero n2) {
		int num1 = n1.getNumeratore();     int num2 = n2.getNumeratore();
		int den1 = n1.getDenominatore();   int den2 = n2.getDenominatore();
		
		n1.setNumeratore(num1*num2);   n1.setDenominatore(den1*den2);
		
		return n1;
	}

	public Numero divisione(Numero n1 , Numero n2) {
		int num1 = n1.getNumeratore();     int num2 = n2.getNumeratore();
		int den1 = n1.getDenominatore();   int den2 = n2.getDenominatore();
		
		if(den1==1 || den2==1) {
			n1.setNumeratore(num1*num2); 
			n1.setDenominatore(den1*den2);
		}
		else {
			n1.setNumeratore(num1*den2);   n1.setDenominatore(den1*num2);
		}
		
		return n1;
		
	}



	public static void main(String[] args) {
		
		Numero num = new NumeroIntero(2);
		System.out.println(num.getNumeratore());
		
		Numero numRaz = new NumeroRazionale(2, 1);
		System.out.println(numRaz.getNumeratore() + " / " + numRaz.getDenominatore());
		
		
	}
	
	
	/*public Numero moltiplicazione(Numero numero1,Numero numero2) {   //moltiplica il primo per il secondo
		
		if(numero1 instanceof NumeroRazionale)							//solo il primo è razionale
		{ double tmp =((NumeroRazionale) numero1).getNumeratore();
			((NumeroRazionale) numero1).setNumeratore(tmp*numero2.numero);
			return numero1;
		}
			else if(numero2 instanceof NumeroRazionale)							//solo il secondo è razionale
			{ double tmp =((NumeroRazionale) numero2).getNumeratore();
				((NumeroRazionale) numero2).setNumeratore(tmp*numero1.numero);
				return numero2;
			}
				else if(numero1 instanceof NumeroRazionale && numero2 instanceof NumeroRazionale )		//sono entrambi razionali
				{ 
					double num1 =((NumeroRazionale) numero1).getNumeratore();
					double num2 =((NumeroRazionale) numero2).getNumeratore();
					double den1 =((NumeroRazionale) numero1).getDenominatore();
					double den2 =((NumeroRazionale) numero2).getDenominatore();
					
					
				}
		else														//sono tutti e 2 numeri reali
		numero1.numero *= numero2.numero;
		return numero1;
	}
	*/
}
