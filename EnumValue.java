enum Color{
      BLUE,GREEN,ORANGE,RED;
      public String getColor(){
               switch(this){
                    case BLUE: return "blue";
                    case GREEN: return "green";
                    case ORANGE: return "orange";
                    case RED: return "red";
                    default:return null;
             }
      }

            public static void main(String as[]){
                        System.out.println(""+Color.BLUE.getColor());
                        System.out.println(""+Color.RED.getColor());
           }
}
                    