/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Jessy
 */
public class Main {

    public static void main(String[] args) {       
	Main hello = new Main();
        int number = hello.sayHello(args[0]);
        System.out.println("Anzahl der ausgegebenen Zeichen: " + number);
    }

    public int sayHello(String name) {
        String msg = "Hello " + name + "!";
        System.out.println(msg);
        return msg.length();
    }
}
