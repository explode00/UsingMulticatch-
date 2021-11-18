class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class Vote {
    public void age(int age) throws InvalidAgeException{
        if(age<18 | age>60){
            System.out.println("Not Allowed to vote");
        }
        else{
            System.out.println("You can vote");
        }
    }
 }
 class Main2{
     public static void main(String[] args) {
         Vote obj = new Vote();
         String name = args[0];
         Integer age = Integer.parseInt(args[1]);
         try{
             obj.age(age);
         }
         catch (InvalidAgeException e){
             System.out.println(e);
         }
     }
 }
