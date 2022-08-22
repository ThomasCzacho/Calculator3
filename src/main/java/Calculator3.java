public class Calculator3 {


    public static void main(String[] args) {
    }

    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 10;
    public double total;

    public double findTotal () {
        //Calculate an individual's total after tax and tip
        //Print this value

        total = originalPrice * (1 + tax + tip);
        return(total);
    }

}


