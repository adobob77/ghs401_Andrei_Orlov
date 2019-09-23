import javax.swing.JOptionPane;
public class greatLow
{
    static void main(){
        int length = 0;
        int max = 0;
        int min = 100;
        while(length<10 || length>1000){
            try{
                length = Integer.parseInt(JOptionPane.showInputDialog(null, "What list length would you like? \nMust be between 10 and 20", "Array Length Query", JOptionPane.QUESTION_MESSAGE));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Try again.", "" + e, JOptionPane.ERROR_MESSAGE);
            }
        }
        int[] numList = new int[length];
        for(int i = 1; i<=length;i++){
            int num = (int)(Math.random()*91+10);
            numList[i-1] = num;
            System.out.print(num + " ");
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.println("\ngreatest " + max);
        System.out.println("least " + min);
    }
}
