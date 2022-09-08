public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName()+" has ended.");  
    }
public static void main(String a[]){
   System.out.println("Welcome to Java Week 6 New Question."); 
   Thread Q=new Thread(new Question62());
   System.out.println("Main Thread has ended."); 
}
}
