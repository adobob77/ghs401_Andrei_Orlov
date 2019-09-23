import javax.swing.JOptionPane;
public class Calculator
{
    public static void main(){
        try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("What is a?"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("What is b?"));
            int c = Integer.parseInt(JOptionPane.showInputDialog("What is c?"));
            int bSquare = b*b;
            System.out.println("b^2 = " + b);
            int ac4 = 4*a*c;
            System.out.println("4*a*c = " + ac4);
            if(ac4<=bSquare){
                double sqrt = Math.sqrt(bSquare - ac4);
                System.out.println("Square root of b*b-4ac = " + sqrt);
                double r1 = (-b+sqrt)/(2*a);
                System.out.println("Your first root is " + r1);
                double r2 = (-b-sqrt)/(2*a);
                System.out.println("Your second root is " + r2);
            }
            else{
                System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…");
            }
        }
        catch(Exception e){
            main();
        }
        
    }
}
