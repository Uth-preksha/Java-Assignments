public class LaptopL3{
	
	String brandName;
	int ram;
	int price;
	int battary;
	String model;

	public LaptopL3(){
		System.out.println("No param constructor");

	}

	public LaptopL3(String brandName){
		this();
		this.brandName = brandName;
	}

	public LaptopL3(String brandName,int ram){
		this(brandName);
		this.ram = ram;
	}

	public LaptopL3(String brandName , int ram , int price ){
		this(brandName,ram);
		this.price = price;
	}

	public LaptopL3(String brandName , int ram , int price , int battary){
		this(brandName,ram,price);
		this.battary = battary;


	}
 	
 	public LaptopL3(String brandName , int ram , int price , int battary,String model){

 		this(brandName,ram,price,battary);
 		this.model=model;
 	}

 	public void printDetails(){
 		System.out.println("Brand Name = "+brandName);
 		System.out.println("Ram = "+ram);
 		System.out.println("Price = "+price);
 		System.out.println("Battary = "+battary);
 		System.out.println("Model = "+model);
 	}

}