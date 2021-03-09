/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopractica;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class InicializarSistema {

   

    public InicializarSistema() {
    }
    
    public void  inicializarSistema(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Programa");
        System.out.println("1.Negocio");
        System.out.println("2.Servicios");
        System.out.println("3.Empleados");
        System.out.println("4.Clientes");
        System.out.println("5.Citas");
        System.out.println("6.Atenciones");
        System.out.println("7.Salir");
        System.out.println("Escoja una opcion");
        int opcionmenu=comprobarOpcion();
        switch (opcionmenu) {
            case 1:System.out.println("menu neogcio");;break;
            case 2: System.out.println("menu servicio");break;
            case 3:System.out.println("menu empleados");break;
            case 4: System.out.println("menu clientes");break;
            case 5:System.out.println("menu citas"); break;
            case 6: System.out.println("menu atenciones"); break;
            case 7:System.out.println("salir");break;
        }
     }
  

    public static boolean esEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
   public  int comprobarOpcion() {
        Scanner sc= new Scanner(System.in);
        String comodin;
        do {
            System.out.print("Ingrese la opción: ");
               comodin = sc.nextLine();
            if (esEntero(comodin) == false) {
                System.out.println("La opción no es válida.\nIngrese nuevamente: ");
            }
        } while (esEntero(comodin) == false);
        int opcionComodin = Integer.parseInt(comodin);
        return opcionComodin;
    }
        
    }
    


