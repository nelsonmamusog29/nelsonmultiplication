 package HollowSquare;

public class HollowSquareJava {

  public static void main(String[] args) {
      int rows = 12;
        
      for (int i = 1; i <=rows; i++) {
          for (int j = 1; j <=rows; j++) {
                
               if(i == 1 || i == rows || j == 1 || j == rows)
                   System.out.print("*");
               else
                   System.out.print(" ");
            }
            System.out.println();
            
    }
    }
    
}
