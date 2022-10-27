class fact{
           int factorial(int n){
                     if(n==0 || n==1)
                              return 1;
                      else
                                 return n*factorial(n-1);

            }
}
class main{
             public static void main(String dd[]){
                     fact f=new fact();
                     long s=System.nanoTime();
                     int val=f.factorial(20);
                      long e=System.nanoTime();
                     System.out.println("Execution Time :"+(e-s));
             }
}