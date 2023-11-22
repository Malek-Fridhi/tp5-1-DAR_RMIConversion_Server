package rmiServer;

import rmiService.ConversionImpl;	
import java.net.MalformedURLException;
import java.rmi.Naming;		 
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;	

 public class ConversionServer {

	public static void main(String[] args) {
		 try {	
			 	// Creation du registre locale sur le port 8088
	            LocateRegistry.createRegistry(8088);
	            //instantiation de la methode ConversionImpl implimentée par l'inerface Iconversion 
	            ConversionImpl od = new ConversionImpl();
	            //Affichage de l'objet distant 
	            System.out.println(od.toString());
	            //Liaison de l'objet distant et son no dans le Registre RMI 
	            Naming.rebind("rmi://localhost:8088/ConversionObject",od);
	        } catch (RemoteException | MalformedURLException e) {
	            throw new RuntimeException(e);// Exception en cas d'erreurs 
	        }
	}

}