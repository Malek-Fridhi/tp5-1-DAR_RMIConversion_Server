package rmiService;

import java.rmi.Remote; 

import java.rmi.RemoteException;

//Interface définissant les méthodes qui peuvent être invoquées à distance
public interface IConversion extends Remote {
	// Méthode de conversion de montant, peut être invoquée à distance
	double convertirMontant(double mt) throws RemoteException;

}
