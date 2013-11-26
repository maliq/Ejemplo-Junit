package cl.usm.ejemplo;

public class Promedio {
	
	public int media(int[] valor, int minimo, int maximo){
		//Interface returns media, total.entrada, total.valido; 
		//Interface acepts valor, mínimo, máximo; 
//		DECLARACIÓN DE TIPOS 
//		 	Type valor[1:100] is SCALAR array; 
//			Type media, total.entrada, total.valido, minimo, máximo, suma is SCALAR; 
//			Type i is INTEGER; 
		//INICIALIZACIÓN DE VARIABLES 
		int i = 1;
		int totalEntrada = 0;
		int totalValido = 0;
		int suma = 0;
		int media = 0;
		//i=1; total.entrada=total.valido=0; suma=0; //Nodo 1 
		//CÓDIGO DE LA FUNCIÓN 
		
		while (valor[i] != -999 //Nodo 2 
				&& totalEntrada<100){ // Nodo 3
			totalEntrada++; //Nodo 4 
			if(valor[i] >=minimo && //Nodo 5 
		 		valor[i] <=maximo){ //Nodo 6 
				totalValido++; //Nodo 7
				suma+=valor[i];
			}  
			 
			i++; //Nodo 8 
		} 
		if(totalValido>0){ //Nodo 9 
			media = suma/totalValido; //Nodo 10 
		}else{
			media = -999; //Nodo 11 
		}
		return media; //Nodo 12
	}

}
