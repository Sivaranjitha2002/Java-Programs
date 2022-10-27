class base{
       String b1="I am base class ",b2="I am base class";
 
       base(){
                  this.b1="I am base class default constructer";
       }
       base(String b2){
               this();
               this.b2=b2;
       }
        void display(){
                 System.out.println("Values are: "+b1+" ,  "+b2);
       }
}
class cons extends base{
      String s1="No Change",s2="No Change";
      cons(){
                super("I am base class parameterized constructer");
               this.s1="Changes by Default contructer";
       }
       cons(String s2){
              this();
              this.s2=s2;
       }
       void display(){
                  super.display();
                 System.out.println("Values are: "+s1+" ,  "+s2);
       }
}
class main{
          public static void main(String a[]){
                 cons c=new cons("Changes by Parameterized contructer");
                 c.display();
                
         }
}