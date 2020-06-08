import java.math.BigInteger;
import java.util.Scanner;

public class TrabajoEjerciciosCiclicos{
  public static Scanner tecla = new Scanner(System.in);
//1============================================================================
 
 public static void CALCULO_INCREMENTOdeSALARIO(){
   System.out.println("---CALCULO_INCREMENTOdeSALARIO---");
   System.out.println();
  //Declarmos la variables 
   int SalarioInicial, Tiempo;
   double SalarioFinal, SalarioAnual = 0;
  //Datos de Entrada 
   System.out.println("Ingrese el salario inicial del docente");
   SalarioInicial = tecla.nextInt();
   System.out.println("Ingrese los años de servicio");
   Tiempo = tecla.nextInt();
   //Variable que dara inicio a una Interación en base a la variable Tiempo
   int z = 1;
   
   while(z <= Tiempo){
   
    SalarioAnual = SalarioInicial + (SalarioInicial * 0.10);
    
    System.out.println("El salario del año "+z+" es de: S/."+SalarioAnual+" Soles"); 
    z+=1;
  } 

    SalarioAnual = (double)SalarioAnual*Tiempo;
    SalarioFinal = SalarioAnual;
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    System.out.println("--El salario total por los "+Tiempo+" años de servico es de: S/."+SalarioFinal+" Soles--");
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    System.out.println("---Gracias eso es todo---");
 }
//2===========================================================================
 
 public static void COSTOdeHAMBURGUESA(){ 
   System.out.println("---COSTOdeHAMBURGUESA---");
   System.out.println();

   int NumHamburguesa;
   double PrecioHamburguesa = 0;
   double PagoTotal= 0;
   String PagoTarjeta = "NO";

   for(int TipoHam = 1; TipoHam<=3;TipoHam++){
    switch (TipoHam){
     case 1: System.out.println("Ingresa la cantidad de Hamburguesas de tipo simple:"); PrecioHamburguesa = 20; 
     break;
     case 2: System.out.println("Ingresa la cantidad de Hamburguesas de tipo doble:"); PrecioHamburguesa = 25; 
     break;
     case 3: System.out.println("Ingresa la cantidad de Hamburguesas de tipo triple:"); PrecioHamburguesa = 28; 
     break;
     default: System.out.println("Por favor seleccione uno de los tipos de hamburguesa precentados");
   } 
    NumHamburguesa = tecla.nextInt();
    PagoTotal+= PrecioHamburguesa*NumHamburguesa; 
  }
   System.out.println("¿Desea pagar con tarjeta?");  
   PagoTarjeta = tecla.next();
   if(PagoTarjeta.toUpperCase().equals("SI")){
    PagoTotal = PagoTotal + (PagoTotal * 0.05);
  }
  System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
  System.out.println("El costo total a pagar por las Harburguesas es: "+ PagoTotal);
  System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
  System.out.println("---Gracias por probar mi algoritmo---");
 }
//3============================================================================
  
public static void COMPARACIONdeCANTIDADES(){
   System.out.println("---COMPARACIONdeCANTIDADES---");
   System.out.println();

   int Cantidad;
   double Num;

   System.out.println("Ingrese el numero de cantidades que desee comparar con 0");
   Cantidad = tecla.nextInt();

    int z = 1;
  
   while (z <= Cantidad){
    System.out.println("Ingrese la cantidad numero "+z+" que desea comparar con 0");
    Num = tecla.nextInt();

    if( Num < 0 ){
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
     System.out.println("---El numero "+Num +" es menor que 0---");
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
   }else if ( Num == 0){
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
     System.out.println("---El numero "+Num +" es igual a 0---"); 
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
   }else{
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
     System.out.println("---El numero "+Num +" es mayor que 0---");
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
   }
    z++;  
  } 
    System.out.println("---Gracias por probar mi algoritmo---");
 }
//4============================================================================

  public static void CELECCIONdeFOCOS(){
   System.out.println("---CELECCIONdeFOCOS---");
   System.out.println();

  int NumFocos, Blanco = 0, Verde = 0, Rojo = 0;
  String Color = "B, V, R";

  System.out.println("Ingrese la cantidad del lote de focos");
  NumFocos = tecla.nextInt();
  System.out.println("Los focos se clasifican en base a los siguientes colores:");
  System.out.println("Blanco = B");
  System.out.println("Verde = V");
  System.out.println("Rojo = R");

  int z = 1;

 while(z <= NumFocos){
    System.out.println("Por favor ingrese la letra del color para el foco numero "+z);
    Color = tecla.next();
   
    if(Color.toUpperCase().equals("B")){
     Blanco = Blanco + 1;
   }else if(Color.toUpperCase().equals("V")){
     Verde = Verde + 1;
   }else{
     Rojo = Rojo + 1;
   }
    z++;
  }
   System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
   System.out.println("---El numero de focos de color Blanco es: "+Blanco);
   System.out.println("---El numero de focos de color Verde es: "+Verde);
   System.out.println("---El numero de focos de color Rojo es: "+Rojo);
   System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
   System.out.println("---Gracias por probar mi algoritmo---");
 }
//5============================================================================

  public static void CALCULOdeAHORRO_ANUAL(){

  System.out.println("---CALCULOdeAHORRO_ANUAL---");
  System.out.println();

   BigInteger ahorroAnual=BigInteger.valueOf(0), ahorroDia, progresion;
  
   int tiempoAnho;
    
   BigInteger razon=BigInteger.valueOf(3), X=BigInteger.valueOf(0);
 

   System.out.println("Ingrese el Tiempo total de dias de ahorro");
      
   tiempoAnho=tecla.nextInt();
  

   String mesTexto="Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Setiembre, Octubre, Noviembre, Diciembre";
     
   String[] mes=mesTexto.split(",");
     

   int mesNum=0, mesNumContador=0;

  
   int z=1;
   
  
   while(z<=tiempoAnho && mesNum<12){
  
      X=BigInteger.valueOf(3).pow(z-1);
       
     
   ahorroDia=razon.multiply(X);
    
        System.out.println("El ahorro total del dia "+z+" es:"+ahorroDia);
  
        z++;
          
        mesNumContador++;

  
   if(mesNumContador==30){
     
     System.out.println("El ahorro total del Mes "+mes[mesNum]+" es:"+ahorroDia);
  
     mesNum++;
       
     mesNumContador=0;
      
     }           
 
   }
     
    X=BigInteger.valueOf(3).pow(tiempoAnho-1);
      
    ahorroAnual=razon.multiply(X);

   
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    System.out.println("---Ahorro anual total es de: "+ahorroAnual+" Pesos ");
  
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    System.out.println("---Gracias por probar mi algoritmo---");
  }
//6============================================================================
    
  public static void COSTOdeARTICULOS(){
  
    System.out.println("---COSTOdeARTICULOS---");
    System.out.println();
  //Declaramos las Variables
     int NumArt;
     double PagoTotal = 0, CostoArt, Descuento = 0;
     double CostoArt1= 0, CostoArt2 = 0, CostoArt3 = 0;
  //Datos de Entrada
     System.out.println("Ingrese el numero de articulos que desee costear");
     NumArt = tecla.nextInt();
  //Valor que dara paso a una iteración
     int i = 1;
  //Proceso y datos de entarda
     while(i <= NumArt){
     System.out.println("Ingrese el costo del articulo numero "+i);
     CostoArt = tecla.nextDouble();
   // Proceso de costeo de cada articulo
    if(CostoArt >= 200){
     Descuento = CostoArt*0.15;
     CostoArt1 = CostoArt - Descuento; 
    }else if(CostoArt > 100 && CostoArt< 200){
     Descuento = CostoArt*0.12;
     CostoArt2 = CostoArt -  Descuento;
   }else{
     Descuento = CostoArt * 0.10;
    CostoArt3 = CostoArt - Descuento;
   }
     System.out.println("El costo del articulo numero "+i+" es de: S/."+CostoArt+" Soles, y su descuento es de: S/."+Descuento+" Soles");
     System.out.println("=======================================================================================");
    i ++;
  }
 //Datos de Saida
   PagoTotal = CostoArt1 + CostoArt2 + CostoArt3;
   System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
   System.out.println("El pago total por compra de los "+NumArt+" es de: S/."+PagoTotal+" Soles");
   System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
   System.out.println("---Gracias por probar mi algoritmo---");
 }

//7============================================================================

     public static void CALCULOdeINVERSION(){
  
     System.out.println("---CALCULOdeINVERSION---");
     System.out.println();
  //Declaromos variables 
     int DepositoMensual, DepositoAnual = 0, TiempoInversion;
     double InteresAnual = 0, InversionFinalAnual = 0, InversionFinalTotal = 0; 
  //Datos de Entrada
     System.out.println("Ingrese el tiempo en años que invertira en este banco");
     TiempoInversion = tecla.nextInt();
     System.out.println("Ingrese el monto mensual que depositara en el banco");
     DepositoMensual =  tecla.nextInt();
  //Variable que dara paso a una iteración
     int i = 1;
  //Proceso
    while(i <= TiempoInversion){
    DepositoAnual = DepositoMensual * 12;
    InteresAnual = DepositoAnual * 0.10;
    InversionFinalAnual = InteresAnual + DepositoAnual;
   //Dato de Salida en la estructura ciclica
    System.out.println("");
    System.out.println("La inversion final anual de año "+i+" es de: S/."+InversionFinalAnual+" Soles"); 
    System.out.println("----------------------------------------------------------");
     i++;
    }
  //Proceso final
    InversionFinalTotal = InversionFinalAnual * TiempoInversion;
   //Dato de Salida
    System.out.println("");
    System.out.println("==========================================================================================");
    System.out.println("La inversion final de los "+TiempoInversion+" años mas el interes del 10% por  cada año es de:S/."+InversionFinalTotal+" Soles");
    System.out.println("==========================================================================================");
  System.out.println("---Gracias por probar mi algoritmo---");
  }

//8============================================================================

  public static void CALCULOdeNOTAS(){
  
  System.out.println("---CALCULOdeNOTAS---"); 
  System.out.println(); 
  //Declaramos las variables
  int Nota, Alumnos, Alumno1 = 0, Alumno2 = 0;
  double  Aprobado = 0;
   //Datos de entrada
    System.out.println("Ingrese el numero de alumnos");
    Alumnos = tecla.nextInt();
    System.out.println("Ingrese la nota minima aprobatoria");
    Aprobado = tecla.nextDouble();
   //Variable que 
    int z =1;

    while(z <= Alumnos){
      System.out.println("Ingrese la nota del alumno numero "+z);
      Nota = tecla.nextInt();
  
   if(Nota >= Aprobado){
     Alumno1 = Alumno1 + 1;
     
   }else{
     Alumno2 = Alumno2 + 1;
   }
    z++;
  }
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    System.out.println("Son "+Alumno1+" los alumnos APROBADOS");
    System.out.println("-----Y-----");
    System.out.println("Son "+Alumno2+" los alumnos REPROBADOS");
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    System.out.println("---Gracias por probar mi algoritmo---");
 }
//9============================================================================

     public static long NumFactorial(int numero){
    //Declaración de variables
     int contador=1;
     long resultado=1;
    //Proceso
    if(numero>0){
    while(contador<numero){
      contador++;    
      resultado=resultado*contador;        
     }
   }    
     return resultado;
  }

    public static void CALCULO_FUNCION_EXPONENCIAL(){
    System.out.println("---CALCULO_FUNCION_EXPONENCIAL---");
    System.out.println();

 //Declaramos las variables
    int NumX;
    double ResultadoFE = 1;
 //Dato de Entrada
    System.out.println("Ingrese el número X de FE: ");
    NumX = tecla.nextInt();
 //Proceso
    for(int Contador = 1; Contador <= NumX; Contador++){
     ResultadoFE += Math.pow(NumX, Contador)/NumFactorial(Contador);
  }  
 //Dato de Salida 
  System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
  System.out.println("----La función exponecial de "+ NumX +" es: "+ResultadoFE);
  System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
  System.out.println("---Gracias por probar mi codigo---");
 }
//10===========================================================================
  
    public static void CONTEOdeVENTAS(){
  
    System.out.println("---CONTEOdeVENTAS---");
    System.out.println(); 
//Declaración de variables 
    int Venta1= 0, Venta2 = 0, Venta3 = 0, Venta = 0;
    int NumVentas, VentaGlobal = 0;
//Datos de entrada
   System.out.println("Ingrese el numero de ventas que realizo");
   NumVentas = tecla.nextInt();
 //Variable que dara paso a una iteración 
   int i = 1;
 //Proceso y datos de entrada
   while( i <= NumVentas){
   
    System.out.println("Ingrese la ganacia de la venta numero "+i);
    Venta = tecla.nextInt();
 
    if(Venta <= 10000){
     
     Venta1 = Venta1 + Venta;
   }else if( Venta > 10000 && Venta <= 20000){
 
      Venta2 = Venta2 + Venta;
  }else{
      Venta3 = Venta3 + Venta;
 }
 i++;
}
 //Proceso final
     VentaGlobal = Venta1 + Venta2 + Venta3;
 //Datos de salida
    System.out.println();
    System.out.println("El monto total por las vetas menores o iguales a 10,000 es de: S/."+Venta1+" Soles");
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("El monto total por las vetas mayores a 10,000 pero menores a 20,000 es de: S/."+Venta2+" Soles");
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("El monto total por las vetas mayores a 20,000 es de: S/."+Venta3+" Soles");
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();
    System.out.println("El ingreso total por cada una de las ventas es de: S/."+VentaGlobal+" Soles");
    System.out.println("===================================================================");
    System.out.println("---Gracias por probar mi algoritmo---");
 }
  
//======================Sección de control========================================

public static void main(String args[]){
  
  char Opcion = 'S';
  String NumAlgorit = "1";

   do{
    System.out.println("Ingrese el número del Algoritmo que desea ejecutar:");
    System.out.println();
    System.out.println("CALCULO_INCREMENTOdeSALARIO = 1");
    System.out.println("COSTOdeHAMBURGUESA = 2");
    System.out.println("COMPARACIONdeCANTIDADES = 3");
    System.out.println("CELECCIONdeFOCOS = 4");
    System.out.println("CALCULOdeAHORRO_ANUAL = 5");
    System.out.println("COSTOdeARTICULOS = 6");
    System.out.println("CALCULOdeINVERSION = 7");
    System.out.println("CALCULOdeNOTAS = 8");
    System.out.println("CALCULO_FUNCION_EXPONENCIAL = 9");
    System.out.println("CONTEOdeVENTAS = 10");
    NumAlgorit = tecla.next();
       
    switch(NumAlgorit){
     case "1": CALCULO_INCREMENTOdeSALARIO(); break;
     case "2": COSTOdeHAMBURGUESA(); break;
     case "3": COMPARACIONdeCANTIDADES(); break;
     case "4": CELECCIONdeFOCOS(); break;
     case "5": CALCULOdeAHORRO_ANUAL(); break;
     case "6": COSTOdeARTICULOS(); break;
     case "7": CALCULOdeINVERSION(); break;
     case "8": CALCULOdeNOTAS(); break;
     case "9": CALCULO_FUNCION_EXPONENCIAL(); break;
     case "10": CONTEOdeVENTAS(); break;
 
     default: System.out.println("Esa opcion -NO EXISTE- Por favor debe seleccionar una de las opciones precentadas");
     System.out.println();
   }
    System.out.println();
    System.out.println("---¿Desea ejecutar más algoritmos?---");
    System.out.println();
    System.out.println("Si = S");
    System.out.println("No = N");
    System.out.println();
    Opcion = tecla.next().toUpperCase().charAt(0);
  }while(Opcion == 'S');  
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
     System.out.println("zzz---GRACIAS ESO ES TODO :D---zzz");
     System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
 }
}