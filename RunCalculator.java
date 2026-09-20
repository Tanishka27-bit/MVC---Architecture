   //  import java.awt.event.*;
   //  import javax.swing.*;
    

   //  public class RunCalculator {
   //       void main() {
   //          ViewsCalculator view = new ViewsCalculator();

   //          ModelsCalculator view = new ModelsCalculator();
   //          ControllerCalculator = new ControllerCalculator(view, model);
   //          System.out.println(x: "Calcualtor");
   //       }
   //  }


   public class RunCalculator {  
     public static void main(String[] args) {  
            ViewsCalculator view = new ViewsCalculator(); 
             ModelsCalculator model = new ModelsCalculator(); 
             
             
           new ControllerCalculator(view , model);
     }

   }