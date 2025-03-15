public class MethodReturnTypes {
    public static void main(String[] args) {
        
        //parameter yata to?ano ba.
        displayWelcomeMessage();

        //Variables daw para tawagin si CalculateAverage eme.
        int value1 = 20;
        int value2 = 30;
        double result = calculateAverage(value1, value2);
        System.out.println("The average is: " + result);
        
    }public static void displayWelcomeMessage() {

        //Ewan pero parang Cout lang sya
     System.out.println("Welcome to our program!");

    }public static double calculateAverage(int num1, int num2) {

        //Condition para sa CalculatedAverage Ngani
        double average = (num1 + num2) / 2.0;
        return average;
    }
}