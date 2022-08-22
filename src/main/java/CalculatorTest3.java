public class CalculatorTest3 {
    public static void main(String[] args) {
        //Instantiate a Calculator2 object
        Calculator3 calc = new Calculator3();

        calc.originalPrice = 10;
        System.out.println("Ashley's Total: $"+calc.findTotal());

        calc.originalPrice = 12;
        System.out.println("Oscar's Total: $"+calc.findTotal());

        calc.originalPrice = 14;
        System.out.println("Alex's Total: $"+calc.findTotal());

        calc.originalPrice = 16;
        System.out.println("Josh's Total: $"+calc.findTotal());

        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party


        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */

    }
}
