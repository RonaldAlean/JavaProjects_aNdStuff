public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      
      printFizzBuzz(10);
    }
    
    public static void printFizzBuzz(int n) {
         for(int i=1; i<= n; i++){
             if( (i%3 == 0) && (i%5 == 0) ){
                 System.out.println("FizzBuzz");
             }
             else if (i % 3 == 0){
                 System.out.println("Fizz");
             }
             else if (i % 5 == 0){
                 System.out.println("Buzz");
             }
             else {
                 System.out.println(i);
             }
         }
    }
}
/*https://youtu.be/h36mQC3JFMo*/
/*Working with module of three and five to return multiples of five and three, as Fizz and Buzz.*/
/*All from zero to one hundred 100 or zero through 10 ten. to sussefull return their multiples correctly*/
/*this is done by setting the ,if, statemnts in the correct order, on top, and by using else-if statements afterward down*/
/*In oder to achieve the correct result and not have repetitive output. We use if correctly on to and they else if statements to...*/
/*..To perevent repetitive output and have a function that returns the requested output correctly in a way of new lines with correct module output.*/
/*Thank you.*/
/*And should be a .java application. Thank you.*/
/*Thank you.*/
