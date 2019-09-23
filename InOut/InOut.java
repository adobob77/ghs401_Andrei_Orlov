import javax.swing.JOptionPane;
public class InOut
{
    public static void main(){
        try{
            double sleepHours = Double.parseDouble(JOptionPane.showInputDialog(null, "How many hours of sleep did you get? ", "", JOptionPane.QUESTION_MESSAGE));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Your opinion is false", "", JOptionPane.ERROR_MESSAGE);
            main();
        }
    }
}
