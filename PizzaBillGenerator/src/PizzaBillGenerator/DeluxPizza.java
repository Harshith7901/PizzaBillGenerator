package PizzaBillGenerator;

public class DeluxPizza extends Pizza {

	public DeluxPizza(Boolean veg) {
		super(veg);
		// TODO Auto-generated constructor stub
		super.addExtraCheese();
		super.addExtraToppings();
	}

	@Override
	public void addExtraCheese() {
		// TODO Auto-generated method stub
//		1.This are empty methods, so user can't add Extra cheese nd toppings 
//		  bcz Delux pizza is already has Extra nd Toppings
//		2.By writhing this empty methods we can make 
//		  dp.addExtraCheese(); nd dp.addExtraToppings(); as empty
//		  nd this method does'nt perform any thing
	}

	@Override
	public void addExtraToppings() {
		// TODO Auto-generated method stub
//		This are empty methods, so user can't add Extra cheese nd toppings 
//		bcz Delux pizza is already has Extra nd Toppings
	}

}