
package unidad1;

import java.util.Scanner;

public class Boleto {
    
    private int id;
    private String nombre;
    private double precio;
    private int tipo;
    private String fecha;
    private String destino;
    
    
    //Constructor vacio
public Boleto(){
  this.id = 1;
  this.nombre = "victor";
  this.precio = 300.2;
  this.tipo = 1;
  this.fecha = "23/04/2022";
  this.destino = "Mazatlan";
}
    //Constructor parametros
public Boleto(int id, String nombre, double precio, int tipo,String fecha, String destino){
  this.id = id;
  this.nombre = nombre;
  this.precio = precio;
  this.tipo = tipo;
  this.fecha = fecha;
  this.destino = destino;
}
//Constructor de copia
public Boleto(Boleto boleto){
  this.id = boleto.id;
  this.nombre = boleto.nombre;
  this.precio = boleto.precio;
  this.tipo = boleto.tipo;
  this.fecha = boleto.fecha;
  this.destino = boleto.destino;
}
// Get y Set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    //Metodos
   public void capturarInformacion(){
       Scanner sca = new Scanner (System.in);
       System.out.println("Nombre:");
       String nnombre = sca.nextLine();
       setNombre(nnombre);
       System.out.println("Numero de boleto:");
       int Id = sca.nextInt();
       setId(Id);
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
       if(this.tipo == 2){
          double sub= this.precio + (this.precio*.8);
          return sub;
       }
       else{
           return this.precio;
       }
       
   }
   public double mostrarImpuesto(){
       if(this.tipo == 2){
          double sub= (this.precio + (this.precio*.8)) *.16;
          return sub;
       }
       else{
           return this.precio *.16;
       }
       

   }
   public double mostrarDescuento(int Edad){
       if(Edad >= 60){
          if(this.tipo == 2){
          double sub= ((this.precio + (this.precio*.8))/2);
          return sub;
       }
       else{
           return this.precio /2;
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
       System.out.println("No.Boleto: "+ this.id);
       System.out.println("Fecha: "+ this.fecha);
       System.out.println("Nombre del cliente: "+ this.nombre);
       System.out.println("Destino: "+ this.destino);
       System.out.println("Tipo de viaje: "+ this.tipo);
       System.out.println("Precio: "+ this.precio);
       System.out.println("Subtotal: "+ mostrarSubtotal());
       System.out.println("Impuesto: "+ mostrarImpuesto());
       System.out.println("Descuento: "+ mostrarDescuento(eda));
       System.out.println("Total a Pagar: "+ (mostrarTotal()-mostrarDescuento(eda)));
   }





}
