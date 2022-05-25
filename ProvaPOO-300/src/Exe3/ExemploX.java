package Exe3;

public class ExemploX {


    
public static void CalculaX() {
      for(int i=2; i<=5; i++) {
          if (i==4) break;
          System.out.print(i + ",");
      }
}

public static void main(String[] args) {
      

        for(int i=1; i<=5; i++) {
            if (i==1) continue;
         System.out.print(i + ","); 
        }
        CalculaX();
}
}