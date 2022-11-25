package Zapatos;

public class Zapacalculo implements Operazapateria{
	
	@Override
	  public int Suma(int p, int q){
	     return p+q;
	  }

	 @Override
	  public int Resta(int p, int q){
	    return p-q;
	  }

	 @Override
	  public int Multiplicacion(int p, int q){
	       return p*q;
	   }

	 @Override
	  public double Division(int p, int q){
	     return p/q;
	  }



}


