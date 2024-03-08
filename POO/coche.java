import java.io.*;
class coche
{
//atributos
String color;
String marca;
int km;

//metodo

public static void main(String[] args)
{
//crear objeto

coche coche1=new coche();
//modificar atributos

coche1.color="rojo";
coche1.marca="mitsubichi";
coche1.km=0;
//mostrar por pantalla valores del objeto

System.out.println("el valor del coche es:"+coche1.color);
System.out.println("la marca del coche es:"+coche1.marca);
System.out.println("el km del coche es:"+coche1.km);
}

}
