final class im{
      public String na;
      private int da;
      im(String na, int da){
              this.na=na;
              this.da=da;
      }
      public String getName(){
            return na;
      }
      public int getDate(){
                 return da;
       }
}
class main{
              public static void main(String kl[]){
                      im m=new im("Hello",2002);
                       System.out.println(m.getName());
                      System.out.println(m.getDate());
               }
}