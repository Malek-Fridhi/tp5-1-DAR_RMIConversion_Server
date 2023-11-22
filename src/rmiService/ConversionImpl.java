package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Implémentation de l'interface distante IConversion
public class ConversionImpl extends UnicastRemoteObject implements IConversion {
	// Méthode de conversion de montant
    @Override
    public double convertirMontant(double mt) {
        return mt*3.3;
    }
    
    // Constructeur par défaut nécessaire pour l'exportation de l'objet distant
    public ConversionImpl() throws RemoteException {
    	// Lève une exception RemoteException en cas d'erreur lors de la création de l'objet distant
    }

}