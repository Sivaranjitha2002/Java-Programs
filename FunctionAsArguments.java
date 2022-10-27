class main{
        public int add(int a,int b){
                       return a+b;
        }
        public int square(int a){
               return a*a;
         }
         public static void main(String aa[]){
                     main m=new main();
                     System.out.println("Result is: "+m.square(m.add(10,5)));
         }
}