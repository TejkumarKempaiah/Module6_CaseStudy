package medicalProject;
//Module 6: Case Study
public class ShipmentService 
{
	
	public static void main(String[] args)
	{
		System.out.println("----Printing the Shipment Servie Details----");System.out.println("");
		System.out.println("Shipment ID = 100");
		System.out.println("Order ID = 101");
		System.out.println("Resource ID = 1234");
		System.out.println("Shipment location = Bangalore");
		System.out.println("Firstname = Tejkumar");
		System.out.println("Lastname = Kempaiah");
		System.out.println("Postal Address = Dwaraka Apartment, Bangalore");
		System.out.println("Shipment Date: 11th March 2020");
		System.out.println("Expired Date: 11th March 2025");
		System.out.println("Delivery Text - Edureka Delivery");
		System.out.println("Delivery Date: 13th March 2020");
		System.out.println("Tracking number = Invoice12345");
		System.out.println("Charged Amount = 200USD");
		
		System.out.println("");
	
		//method invoking
		System.out.println("---- SHIPMENT SERVICE : STARTS----");System.out.println("");
		
		addShipment();
		deleteShipment();
		getShipment();
		inMemoryOperations();
		
		System.out.println("");
		System.out.println("---- SHIPMENT SERVICE : ENDS----");
	}
	
	public static void addShipment()
	{
		System.out.println("SHIPMENT ADDED SUCCESSFULLY");
	}
	
	public static void deleteShipment()
	{
		System.out.println("SHIPMENT DELETED SUCCESSFULLY");
	}
	
	public static void getShipment()
	{
		System.out.println("SHIPMENT DETAILS ARE FETCHED SUCCESSFULLY");
	}
	
	public static void inMemoryOperations()
	{
		System.out.println("In Memory Operations Completed Successfully");
	}
}
