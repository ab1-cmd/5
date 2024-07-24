/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anilkali;
import java.net.URL;
/**
 *
 * @author anilk
 */
public class URLMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
{
URL url = new URL("https://www.example.com/path/to/file.html?key=value#fragment");
         	System.out.println("Protocol: " + url.getProtocol());
        	 System.out.println("Host: " + url.getHost());
        	 System.out.println("Port: " + url.getPort());
         	System.out.println("Path: " + url.getPath());
         	System.out.println("Query: " + url.getQuery());
        	 System.out.println("Fragment: " + url.getRef());
     	 } 
catch (Exception e) 
{
        	 System.out.println("Error: " + e.getMessage());
      	}

    }
    
}
