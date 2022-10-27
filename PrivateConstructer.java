class base{
         private static base b;
         private base(){
                    System.out.println("I am a private constructer");
         }

         public static base get(){
                    if(b==null)
                            b=new base();
                    return b;
         }
         void display(){
                  System.out.println("Object Created Successfully");
          }
}
class main{
          public static void main(String aa[]){
                  base b;
                  b=base.get();
                  b.display();
         }
}
