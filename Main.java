public class Main {
    public static void main(String[] args){
        int myFizz = 9 % 3;
        
        if(myFizz % 3 == 0){
            System.out.println("Fizz");
        }
        
        if(myFizz % 5 == 0){
            System.out.println("Fizz");
        }
        if(myFizz % 3 == 0 & myFizz % 5 == 0){
            System.out.println("fizz Buzz");
        }
        else{
            System.out.println("Good Job");
        }
        
        

        System.out.println(myFizz);
    }
}
