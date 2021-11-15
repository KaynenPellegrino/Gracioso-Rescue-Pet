import java.util.Scanner;

public class Pet {
	Scanner input = new Scanner(System.in); /**so i tried to replicate the scanner input, and I used the book examples as well as**/
	private String petType; 				/** google to try to figure out the best way to do these attributes.**/
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue;
	
	public Pet() { 							/**I believe I wrote the modules correctly, but looking at them, I fear I did it wrong.**/
		petType = "Unknown";
		petName = "NoName";	
		petAge = 0;	
		dogSpace = 0;	
		catSpace = 0;	
		daysStay = 0;	
		amountDue = 0.0;	
		
	}

	public void printPet() {
		// TODO Auto-generated method stub
		
	}

	public String getpetType() {
		return petType;
	}

	public void setpetType(String petType) {
		this.petType = input.next();
	}
	
	public String getpetName() {
		return petName;
	}

	public void setpetName(String petName) {
		this.petName = input.next();
	}
	
	public int getpetAge() {
		return petAge;
	}

	public void setpetAge(int petAge) {
		this.petAge = input.nextInt();
	}
	
	
	public int getdogSpace() {
		return dogSpace;
	}

	public void setdogSpace(int dogSpace) {
		this.dogSpace = input.nextInt();
	}
	
	
	public int getcatSpace() {
		return catSpace;
	}

	public void setcatSpace(int catSpace) {
		this.catSpace = input.nextInt();
	}
	
	public int daysStay() {
		return daysStay;
	}

	public void daysStay(int daysStay) {
		this.daysStay = input.nextInt();
	}
	
	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = input.nextDouble();
	}
	
	public void checkIn() {
	
	}
	public void checkOut() {
	
	}
	public void getPet() {
		
		
	}
	public void createPet() {

	}
	public void updatePet() {
		
	}


public class Dog extends Pet{
	public int dogSpaceNbr;
	public double dogWeight;
	public String grooming;

	//constructor
	public Dog() {
	dogSpaceNbr = -1;
	dogWeight = -1;
	grooming = "Unknown";
	}

	//setters
	public void setDogSpaceNbr(int space) {
	dogSpaceNbr = space;
	}
	public void setDogWeight(double weightOfDog) {
	dogWeight = weightOfDog;
	}
	public void setGrooming(String groom) {
	grooming = groom;
	}

	//getters
	public int getDogSpaceNbr() {
	return dogSpaceNbr;
	}
	public double getDogWeight() {
	return dogWeight;
	}
	public String getGrooming( ) {
	return grooming;
	}

	//prints dog information
	@Override
	public void printPet() {
	System.out.println("Pet Type: " + petType);
	System.out.println("Dog space available? :" + dogSpace);
	System.out.println("Dog Name: " + petName);
	System.out.println("Dog Age: " + petAge);
	System.out.println("Dog Space Number: " + dogSpaceNbr);
	System.out.println("Dog Weight: " + dogWeight);
	System.out.println("Days Staying: " + daysStay);
	System.out.println("Grooming required? " + grooming);
	System.out.println("Amount Due: " + amountDue);
	}
	}

		
	}
	class Cat extends Pet{						/**but, because I am an over-achiever and a mild perfectionist, I also did the 6 line**/
		private int catSpaceNbr;				/**cat class as well. I hope I did it decently, please give me any advice you can.**/
												/**also, if something on here was done incorrectly, please let me know what I did wrong**/
		public int getCatSpaceNbr() {			/**as I am not a good learner when it comes to teaching myself as much as being told**/
			return catSpaceNbr;
		}

		public void setCatSpaceNbr(int catSpaceNbr) {
			this.catSpaceNbr = input.nextInt();
		}
	}