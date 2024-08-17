package program1.p5.p5;
import java.net.URL;

public class URLMain {

    public static void main(String[] args) {
        try 
{
URL url = new URL("https://www.google.com/search?q=google&rlz=1C1ONGR_enIN1100IN1100&oq=google&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTITCAEQLhiDARjHARixAxjRAxiABDIGCAIQRRg8MgYIAxBFGDwyBggEEEUYPDIGCAUQRRhBMgYIBhBFGEEyBggHEEUYQdIBCDI1NTVqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
         	System.out.println("Protocol: " + url.getProtocol());
        	 System.out.println("Host: " + url.getHost());
        	 System.out.println("Port: " + url.getPort());
         	System.out.println("Path: " + url.getPath());
         	System.out.println("Query: " + url.getQuery());
        	 System.out.println("Fragment: " + url.getRef());
     	 } 
catch (Exception e) 
{
        	 e.printStackTrace();
      	}

    }
}
