package Zapatos;

public class variables {
	
	 int a, b;
	  String []cl;
	  String []des;
	  String []za;
	  String []desza;
	  double []m;
	 int m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16;
	 public variables(){}
	 public variables (int a, int b, String []cl, String []des, double []m, int m1, int m2, int m3,int m4, int m5, int m6,int m7,int m8, int m9, int m10, int m11,int m12, int m13, int m14, int m15, int m16){
	       this.a=a;
	       this.b=b;
	       this.cl=cl;
	       this.des=des;
	       this.m=m;
	       this.m1=m1; 
	       this.m2=m2;
	       this.m3=m3;
	       this.m4=m4; 
	       this.m5=m5;
	       this.m6=m6;
	       this.m7=m7; 
	       this.m8=m8;
	       this.m9=m9;
	       this.m10=m10; 
	       this.m11=m11;
	       this.m11=m11;
	       this.m12=m12; 
	       this.m13=m13;
	       this.m14=m14; 
	       this.m15=m15; 
	       this.m16=m16;
	   }

	 public void seta(int a){this.a=a;}
	 public int geta(){return a;}

	 public void setb(int b){this.b=b;}
	 public int getb(){return b;}

	 public void setcl(String []cl){this.cl=cl;}
	 public String []getcl(){return cl;}

	 public void setdes(String []des){this.des=des;}
	 public String []getdes(){return des;}

	 public void setm(double []m){this.m=m;}
	 public double []getm(){return m;}

	 public void setza(String []za){this.za=za;}
	 public String []getza(){return za;}

	 public void setdesza(String []desza){this.desza=desza;}
	 public String []getdesza(){return desza;}

	public void setm1(int m1){this.m1=m1;}
	 public int getm1(){return m1;}

	 public void setm2(int m2){this.m2=m2;}
	 public int getm2(){return m2;}

	 public void setm3(int m3){this.m3=m3;}
	 public int getm3(){return m3;}

	 public void setm4(int m4){this.m4=m4;}
	 public int getm4(){return m4;}

	 public void setm5(int m5){this.m5=m5;}
	 public int getm5(){return m5;}

	 public void setm6(int m6){this.m6=m6;}
	 public int getm6(){return m6;}

	 public void setm7(int m7){this.m7=m7;}
	 public int getm7(){return m7;}

	 public void setm8(int m8){this.m8=m8;}
	 public int getm8(){return m8;}

	  public void setm9(int m9){this.m9=m9;}
	 public int getm9(){return m9;}

	 public void setm10(int m10){this.m10=m10;}
	 public int getm10(){return m10;}

	 public void setm11(int m11){this.m11=m11;}
	 public int getm11(){return m11;}

	 public void setm12(int m12){this.m12=m12;}
	 public int getm12(){return m12;}

	 public void setm13(int m13){this.m13=m13;}
	 public int getm13(){return m13;}

	 public void setm14(int m14){this.m14=m14;}
	 public int getm14(){return m14;}

	 public void setm15(int m15){this.m15=m15;}
	 public int getm15(){return m15;}

	 public void setm16(int m16){this.m16=m16;}
	 public int getm16(){return m16;}

	 public void menu(){
	     System.out.println("                        Menu de opciones");
	     System.out.println("");
	     System.out.println("1.- Registro de clientes 2.-Catalogo 3.-Balance General 4.-Calculadora 5.-Pedidos 6.-Salir");
	  }

	  public void menu2(){
	    System.out.println("               Zapateria Davila");
	    System.out.println("                Balance General "); 
	    System.out.println("         Del 20 al 24 de diciembre del 2022"); 
	    System.out.println(" ");
	    System.out.println(" Activos ");
	    System.out.println(" ");
	    System.out.println(" Activo Circulante "); 
	 }
	   
	 public void menu3(){
	 System.out.println("\t 1.- Sumar 2.- Restar 3.- Multiplicar 4.- Dividir ");

	  }
	 public void menu4(){

		System.out.println("\tSandalias de fiestas, corte Sint, grabado, altura 12 cm.");
		System.out.println("\tElegantes sandalias de plataforma, tiene pedreria en tiras, suela antiderrapante.");
		System.out.println("\tJuveniles sandalias tipo gladiador.");
		System.out.println("\tSandalias juveniles tamaño plataforma");
	        System.out.println("\tSandalias paras salir juveniles, tacon de 8cm");

	 }

	 public void clear(){
	  try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) 
		    {

	            }
	 }
				



	}





