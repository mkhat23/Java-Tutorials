package bucky;

public class tuna {

	// public void simpleMessage(){
	//
	// System.out.println("Hello, is it me you are looking for");
	// }

	// public void simpleMessage(String name){
	// System.out.println("Hello " + name);
	// }

	private String girlName;

	public tuna(String name) {

		girlName = name;
	}

	public void setName(String name) {
		girlName = name;
	}

	public String getName() {
		return girlName;
	}

	public void saying() {
		System.out.printf("Your first girlfriend was: %s", getName());
	}

}
