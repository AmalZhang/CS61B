public class Car {
   public String model;
   public int gas;

   public Car(String m) {
       model = m;
       gas = 5;
   }

   public void drive() {
       if (gas < 5) {
           System.out.println("Cannot drive!");
           return;
       }
       gas -= 5;
       System.out.println(model + " goes vroom!");
   }

   public int gasLeft() {
       return gas;
   }

   public void addGas(int amount) {
       gas = gas + amount;
   }

   public static void main(String[] args) {
       Car c1;
       Car c2;

       c1 = new Car("Honda Civic");
       c2 = new Car("Model T");

       System.out.println(c1.gasLeft()); // 5

       c1.drive(); // Honda Civic goes vroom
       System.out.println(c1.gasLeft()); // 0

    c1.addGas(1);
    System.out.println(c1.gasLeft()); // 1

    c1.drive(); // Cannot drive

    System.out.println(c2.gasLeft()); // 5

   }
}


