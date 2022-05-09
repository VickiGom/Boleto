
package unidad1;

import java.util.Scanner;

public class Boleto {
    
    private int ID;
    private String Nombre;
    private double Precio;
    private int Tipo;
    private String Fecha;
    private String Destino;
    
    
    //Constructor vacio
public Boleto(){
  this.ID = 1;
  this.Nombre = "victor";
  this.Precio = 300.2;
  this.Tipo = 1;
  this.Fecha = "23/04/2022";
  this.Destino = "Mazatlan";
}
    //Constructor parametros
public Boleto(int ID, String Nombre, double Precio, int Tipo,String Fecha, String Destino){
  this.ID = ID;
  this.Nombre = Nombre;
  this.Precio = Precio;
  this.Tipo = Tipo;
  this.Fecha = Fecha;
  this.Destino = Destino;
}
//Constructor de copia
public Boleto(Boleto boleto){
  this.ID = boleto.ID;
  this.Nombre = boleto.Nombre;
  this.Precio = boleto.Precio;
  this.Tipo = boleto.Tipo;
  this.Fecha = boleto.Fecha;
  this.Destino = boleto.Destino;
}
// Get y Set
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    //Metodos
   public void capturarInformacion(){
       Scanner sca = new Scanner (System.in);
       System.out.println("Nombre:");
       String nombre = sca.nextLine();
       setNombre(nombre);
       System.out.println("Numero de boleto:");
       int Id = sca.nextInt();
       setID(Id);
       sca.nextLine();
       System.out.println("Destino:");
       String des = sca.nextLine();
       setDestino(des);
       System.out.println("Tipo de viaje:");
       int tip = sca.nextInt();
       setTipo(tip);
       sca.nextLine();
       System.out.println("Precio:");
       double pres = sca.nextDouble();
       setPrecio(pres);
       sca.nextLine();
       System.out.println("Fecha:");
       String fech = sca.nextLine();
       setFecha(fech);   
   }
   public double mostrarSubtotal(){
       if(this.Tipo == 2){
          double sub= this.Precio + (this.Precio*.8);
          return sub;
       }
       else{
           return this.Precio;
       }
       
   }
   public double mostrarImpuesto(){
       if(this.Tipo == 2){
          double sub= (this.Precio + (this.Precio*.8)) *.16;
          return sub;
       }
       else{
           return this.Precio *.16;
       }
       

   }
   public double mostrarDescuento(int Edad){
       if(Edad >= 60){
          if(this.Tipo == 2){
          double sub= ((this.Precio + (this.Precio*.8))/2);
          return sub;
       }
       else{
           return this.Precio /2;
       } 
       }else{
           return 0;
       }
       
   }
   public double mostrarTotal(){
       double total = mostrarSubtotal() + mostrarImpuesto();
       return total;
   }
   public void imprimir(){
       Scanner sca = new Scanner (System.in);
       System.out.println("Edad:");
       int eda = sca.nextInt();
       System.out.println("No.Boleto: "+ this.ID);
       System.out.println("Fecha: "+ this.Fecha);
       System.out.println("Nombre del cliente: "+ this.Nombre);
       System.out.println("Destino: "+ this.Destino);
       System.out.println("Tipo de viaje: "+ this.Tipo);
       System.out.println("Precio: "+ this.Precio);
       System.out.println("Subtotal: "+ mostrarSubtotal());
       System.out.println("Impuesto: "+ mostrarImpuesto());
       System.out.println("Descuento: "+ mostrarDescuento(eda));
       System.out.println("Total a Pagar: "+ (mostrarTotal()-mostrarDescuento(eda)));
   }





}
