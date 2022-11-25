package Zapatos;

import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class EjemploA{
 public static int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12,a13,a14,a15,a16,m,n,opc5,num1, num2;
 public static int total1, total2, total13,TA,TPC,TP,CP,TCP;
 public static String cu1 = "Caja", cu2="Mercancia", cu3="Propaganda y publicidad", cu4="Papeleria y utiles",  cu5="Mobiliario", cu6="Moto", cu7="Depreciacion acumulada", cu10="Sueldo de empleados", cu11="Articulos de empaque", cu12="Proveedores", cu13="Acreedores", cu14="Intereses Cobrados", cu15="Perdida de mercancía"; 
public static variables v= new variables();

public static void main(String args[]){
 Scanner in= new Scanner (System.in);
   Operazapateria op= new Zapacalculo();
String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
 String num= " ", desconocido= "", a="\t",b="\t\t",c="\n",desdeuda="", deuda="",d="C$", pedido="", desconocido2="",ped="     Pedido Realizado: ", semana= " ";
 int us, pass, opc=0,numdescrip, opc1=0,tipocl=0,opcpedido=0, opcatalogo=0, peddd=0;
 String cliente= " ", apellido= "", descripcion=" ", des="",sub="Clientes", mercancia="";
     
     BufferedWriter bw = null;
     FileWriter fw = null;
 

 System.out.println("");
   System.out.println("Zapateria Magdaleno");
   System.out.println("    REGISTRO");

   do{ 
   System.out.println("Ingrese su usuario: ");
     while(!in.hasNextInt()){
    in.next();System.out.println("Usuario incorrecto, intente de nuevo");
    }
     us=in.nextInt();
     }while(us != 85974633);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         do{
   System.out.println("Ingrese su contraseña: ");
     while(!in.hasNextInt()){
    in.next();System.out.println("Contraseña incorrecto, intente de nuevo");
    }
     pass=in.nextInt();
     }while(pass != 12345);   
                 
	  v.clear();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
  System.out.println(" ");
  System.out.println("                      Te damos la Bienvenida");
    System.out.println(" ");
 
  do{
         v.menu();
       System.out.println("Seleccione su opcion");
    while(!in.hasNextInt()){
    in.next();System.out.println("Intente de nuevo");
    }
    opc=in.nextInt();
	v.clear();
   switch(opc){    

     case 1:
     
       System.out.println("Digite el tipo de cliente que desea registrar: ");
     		do{
      		 System.out.println("1.-Cliente nuevo            2.-Cliente a cobrar"); 
               while(!in.hasNextInt()){
       		in.next();System.out.println("Vuelva a ingresar el tipo de cliente");
        	  }
           	tipocl=in.nextInt();
 		}while(tipocl<=0 || tipocl>=3);
			v.clear();
           switch(tipocl){
              case 1:
      		try {
       		   System.out.println("");
         		desconocido=in.nextLine();
     	            System.out.println("\t\nDigite el nombre del cliente\t\t ");
           		cliente=in.nextLine();
			
     
      		System.out.println("");
   					v.clear();
    		  System.out.println("\t\t\tDigite si desea agregar informacion del cliente");
     			 do{  
      			 System.out.println("\t1.- Agregar informacion al cliente            2.-Salir ");
      			while(!in.hasNextInt()){
       			in.next();System.out.println("Eligar una de las opciones disponibles");
        	        }
          		numdescrip=in.nextInt();
      		   }while(numdescrip<=0 || numdescrip>=3);
				v.clear();
       	 		  switch(numdescrip){
          			   case 1:
              			 	 System.out.println("");
                			 des=in.nextLine();
            			  	 System.out.println("\t\tDescripcion del cliente\t\t\n");
                 			descripcion=in.nextLine();
							v.clear();
                                       do{
 					 System.out.println("         Digite si "+ cliente + " ha ingresado hizo pedido");
					  System.out.println("   1.-Si hizo pedido            2.- No hizo pedido ");
					    while(!in.hasNextInt()){
       					     in.next();System.out.println("Digite de nuevo su opcion: ");
        	 			   }
					     opcpedido=in.nextInt();
					  }while(opcpedido<=0 || opcpedido>=3);

                                                     if(opcpedido==1){
							System.out.println("");
							desconocido2=in.nextLine();
    					  		 System.out.println("Describa el pedido:");
							      pedido=in.nextLine();	
								}else if(opcpedido==2){
									  System.out.println(" ");
							     			 pedido=in.nextLine();	
										}else{
											 System.out.println(" ");
							     					 pedido=in.nextLine();	
											v.clear();
									}
 								    
 							
                                         
                    				    break;

										
             			 case 2:
                  			 System.out.println(" ");
                    			  pedido=in.nextLine();

                                       do{
 					 System.out.println("         Digite si el cliente ingresado hizo pedido");
					  System.out.println("   1.-Si hizo pedido            2.- No hizo pedido ");
					    while(!in.hasNextInt()){
       					     in.next();System.out.println("Digite de nuevo su opcion: ");
        	 			   }
					     opcpedido=in.nextInt();
					  }while(opcpedido<=0 || opcpedido>=3);

                                                     if(opcpedido==1){
							System.out.println("");
							desconocido2=in.nextLine();
										
    					  		 System.out.println("Describa el pedido:");
							      pedido=in.nextLine();	
								}else if(opcpedido==2){
									  System.out.println(" ");
							     			 pedido=in.nextLine();	
										}else{
											 System.out.println(" ");
							     					 pedido=in.nextLine();	
									}
 								    
                      			 break;
         			 }

  										

       		 File file = new File("Cliente nuevo.txt");
        	// Si el archivo no existe, se crea!
        	if (!file.exists()) {
         	   file.createNewFile();
       		 }
      	  // flag true, indica adjuntar información al archivo.
        	fw = new FileWriter(file.getAbsoluteFile(), true);
       		 bw = new BufferedWriter(fw);
       		 bw.write(a);
       		 bw.write(cliente);
       		 bw.write(b);
      		  bw.write(descripcion);
      		  bw.write(b);
      		  bw.write(ped);
      		  bw.write(b);
      		  bw.write(pedido);
      		  bw.write(b);
		  bw.write(dtf.format(LocalDateTime.now()));
      		  bw.write(c);
				
            System.out.println("Agreado con exito");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
                        //Cierra instancias de FileWriter y BufferedWriter
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
				v.clear();
      					break;
      }
    								
      case 2: 
             	try{
			System.out.println(" ");
		          des=in.nextLine();
		         System.out.println("Digite el nombre del cliente: ");
                            cliente=in.nextLine();
					v.clear();
                         System.out.println("Digite la descripcion de la deuda: ");
                              desdeuda=in.nextLine();
					v.clear();
			  System.out.println("Digite el monto que debe");
				deuda=in.nextLine();
					v.clear();
		        File file = new File("Deudores.txt");
  	      		// Si el archivo no existe, se crea!
        		if (!file.exists()) {
        		    file.createNewFile();
       		 }
        		// flag true, indica adjuntar información al archivo.
        		fw = new FileWriter(file.getAbsoluteFile(), true);
        		bw = new BufferedWriter(fw);
  		       bw.write(a);
 		       bw.write(cliente);
		       bw.write(b);
 		       bw.write(desdeuda);
		       bw.write(b);
		       bw.write(d);
 		       bw.write(deuda);
		       bw.write(b);
		       bw.write(timeStamp);
		       bw.write(c);
	            	System.out.println("Agreado con exito");
   			 } catch (IOException e) {
        		e.printStackTrace();
    			} finally {
        		try {
                        //Cierra instancias de FileWriter y BufferedWriter
            		if (bw != null)
             		   bw.close();
          		  if (fw != null)
           		     fw.close();
        	} catch (IOException ex) {
            ex.printStackTrace();
        }
     }
 
    }//Este cierra el tipocl
           				

					 break;
						

     case 2: 

        try{

         	System.out.println("		              El catalogo actual es el siguiente:");
                System.out.println("---------------------------------------------------------------------------------------------------");
                   v.menu4();

	        System.out.println("");
                System.out.println("               Digite si desea registrar una nueva sandalia al catalogo"); 
	        System.out.println("");
 		System.out.println("1.- Deseo agregar un nuevo producto                       2.-No deseo agregar ");
	              opcatalogo=in.nextInt();
					v.clear();
                      switch(opcatalogo){
			 case 1:
	                     System.out.println("");
                   	       des=in.nextLine();
			   System.out.println("Digite la descripcion del nuevo producto");
                              mercancia=in.nextLine();
					v.clear();
                                  break;
			 case 2:
                          System.out.println("   ");
                              mercancia=in.nextLine();
					v.clear();
				break;
                             } 
                        

       		 File file = new File("Catalogo.txt");
       		 // Si el archivo no existe, se crea!
        	if (!file.exists()) {
            	file.createNewFile();
        	}
        	// flag true, indica adjuntar información al archivo.
  		fw = new FileWriter(file.getAbsoluteFile(), true);
               bw = new BufferedWriter(fw);
  
	           bw.write(mercancia);

	            System.out.println("Agreado con exito");
 		   } catch (IOException e) {
       		 e.printStackTrace();
  		  } finally {
       		 try {
         //Cierra instancias de FileWriter y BufferedWriter
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
     }
			break;

     case 3:

              do{ 
   System.out.println(cu1);
   System.out.println("Digite el monto: ");
    while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
         a1=in.nextInt();
          v.setm1(a1);
    }while(a1<=0);

  System.out.println(cu2);
  do{
   System.out.println("Digite el monto: ");
    while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
         a2=in.nextInt();
          v.setm2(a2);
    }while(a2<=0);

   System.out.println(cu3);
  do{
   System.out.println("Digite el monto: ");
     while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
         a3=in.nextInt();
          v.setm3(a3);
    }while(a3<=0); 

    System.out.println(cu4);
    do{
   System.out.println("Digite el monto: ");
     while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
         a4=in.nextInt();
          v.setm4(a4);
    }while(a4<=0); 

    total1=a1+a2+a3+a4;
 
    System.out.println(" Activo Fijo ");
    System.out.println(cu5);  
     do{
    System.out.println("Digite el monto: ");
      while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
         a5=in.nextInt();
           v.setm5(a5);
       }while(a5<=0); 

     System.out.println(cu6);
      do{
     System.out.println("Digite el monto: ");
       while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
         a6=in.nextInt();
          v.setm6(a6);
      }while(a6<=0); 

      System.out.println(cu7);
        do{
      System.out.println("Digite el monto de la depreciacion: ");
         while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto de depreciacion nuevamente: ");
    }
        a7=in.nextInt();
          v.setm7(a7);
    }while(a7<=0);  

     System.out.println(cu10);
        do{
      System.out.println("Digite el monto: ");
        while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
        a10=in.nextInt();
          v.setm10(a10);
    }while(a10<=0);  

    System.out.println(cu11);
        do{
      System.out.println("Digite el monto: ");
       while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
        a11=in.nextInt();
          v.setm11(a11);
    }while(a11<=0);  

 //Pasivos 
 System.out.println(cu12);
        do{
      System.out.println("Digite el monto: ");
     while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
        a12=in.nextInt();
          v.setm12(a12);
    }while(a12<=0); 

 System.out.println(cu13);
        do{
      System.out.println("Digite el monto: ");
   while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
        a13=in.nextInt();
          v.setm13(a13);
    }while(a13<=0); 

 System.out.println(cu14);
        do{
      System.out.println("Digite el monto: ");
  while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
        a14=in.nextInt();
          v.setm14(a14);
    }while(a14<=0); 

 System.out.println(cu15);
        do{
      System.out.println("Digite el monto: ");
while(!in.hasNextInt()){
    in.next();System.out.println("Digite el monto nuevamente");
    }
        a15=in.nextInt();
          v.setm15(a15);
    }while(a15<=0); 

			v.clear();		

   System.out.println(" ");
   System.out.println(" ");
   v.menu2();
   System.out.println(" ");
 System.out.println(" "+cu1 + "\t\t\t\t\tC$" + a1);
 System.out.println(" "+cu2 + "\t\t\t\tC$" + a2);
 System.out.println(" "+cu3 + "\t\tC$" + a3);
 System.out.println(" "+cu4 + "\t\t\tC$" + a4);
 System.out.println(" "+"Total de activo circulante " + "                           C$ " + total1);
 
   System.out.println("");
   System.out.println(" Activo Fijo");
   System.out.println("");

 System.out.println(" "+cu5 + "\t\t\t\tC$" + a5);
 System.out.println(" "+cu6 + "\t\t\t\t\tC$" + a6);
 System.out.println(" "+cu7 + "\t\t\tC$" + a7);
    total2=a5+a6-a7;
 System.out.println(" "+ "Total activo Fijo" + "\t\t\t\t\tC$" +total2);
 System.out.println("");
 System.out.println("Activo Diferido");
 System.out.println("");
 System.out.println(" "+cu10 + "\t\t\tC$" + a10);
 System.out.println(" "+cu11+ "\t\t\tC$" + a11);
   total13=a10+a11;
    System.out.println("");
 System.out.println(" "+ "Total activo Diferido" + "\t\t\t\t\tC$" +total13);
    TA=total1+total2+total13;
     System.out.println("");
 System.out.println("      TOTAL ACTIVOS  \t\t\t\t\t\t\tC$" + TA);

    System.out.println(" ");
    System.out.println(" Pasivos");
    System.out.println(" Pasivo Corriente");
    System.out.println(" ");
    System.out.println(cu12 + "\t\t\t\tC$" + a12);
    System.out.println(cu13 + "\t\t\t\tC$" + a13);
    System.out.println(cu14 + "\t\t\tC$" + a14);
     TPC=a12+a13+a14;
    System.out.println("Total Pasivo Corriente\t\t\t\t\tC$" +TPC);
    System.out.println(cu15 + "\t\t\tC$" + a15);
    System.out.println("");
    System.out.println("Total Otros Pasivos\t\t\t\t\tC$" +a15);
    System.out.println("");
    TP=TPC+a15;
    System.out.println("Total Pasivos \t\t\t\t\t\t\t\tC$"+TP);
    System.out.println("");
    CP=TA-TP;
    System.out.println("Capital \t\t\t\t\t\t\t\tC$"+CP);
    System.out.println("");
    TCP=TP+CP;
    System.out.println("TOTAL CAPITAL + PASIVO \t\t\t\t\t\t\tC$"+TCP);
    System.out.println("");
    desconocido=in.nextLine();
   System.out.println("");
    des=in.nextLine();
        v.clear();
				break;
			
    
  case 4:
          do{
        System.out.println("Digite el primer numero: ");   
        while(!in.hasNextInt()){
       in.next();System.out.println("Digite el numero nuevamente");
      }
       num1=in.nextInt();
       }while(num1<=0);
     
       do{
         System.out.println("Digite el segundo valor: ");
             while(!in.hasNextInt()){
        in.next();System.out.println("Digite el numero nuevamente");
      }
          num2=in.nextInt();
         }while(num2<=0);

        v.menu3();
    do{
      System.out.println("Digite la operacion a realizar");
          while(!in.hasNextInt()){
        in.next();System.out.println("Digite la operacion a realizar");
      }
        opc5=in.nextInt();
       }while(opc5<=0);

        switch(opc5){
           case 1:
              System.out.println("La suma es: "+op.Suma(num1,num2));
                break;   
            case 2:
    		System.out.println("La resta es: "+op.Resta(num1,num2));
               break;   
            case 3:
            System.out.println("La multiplicacion es: "+op.Multiplicacion(num1,num2));
                break;   
            case 4:
              System.out.println("La division es: "+op.Division(num1,num2));
               
          }
			   break; 		
        case 5:
        try{
            System.out.println("       Hubo pedidos hoy");
            System.out.println("      1.- Si    2.- No");
             peddd=in.nextInt();
              switch(peddd){
	               case 1:
		System.out.println(" ");
                    des=in.nextLine();
                  System.out.println("Digite el pedido:");
                    semana=in.nextLine();
                         break;
                case 2:
 		           System.out.println("");
                    		semana=in.nextLine();
         				break;    
         }

 				
       		 File file = new File("pedido.txt");
       		 // Si el archivo no existe, se crea!
        	if (!file.exists()) {
            	file.createNewFile();
        	}
        	// flag true, indica adjuntar información al archivo.
  		fw = new FileWriter(file.getAbsoluteFile(), true);
               bw = new BufferedWriter(fw);
  
	           bw.write(semana);

	            System.out.println("Agreado con exito");
 		   } catch (IOException e) {
       		 e.printStackTrace();
  		  } finally {
       		 try {
         //Cierra instancias de FileWriter y BufferedWriter
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
       }
		   v.clear();		
      }while(opc!=6);

    System.out.println("El programa ha finalizado");
  }




}
	
	


