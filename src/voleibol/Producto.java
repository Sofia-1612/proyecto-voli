package voleibol;

public class Producto

{
 private String nombreProducto;
 private double precio;
 private double cantidad;
 
 public Producto(String nombreProducto, double precio, int cantidad){
    this.nombreProducto = nombreProducto;
    this.precio = precio;
    this.cantidad = cantidad;
    }

    public String getNombre (){
    return nombreProducto;
    }
    
    public double getPrecio (){
    return precio;
    }
    
    public Double getCantidad (){
    return cantidad;
    }
    
       public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
