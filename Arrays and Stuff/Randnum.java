import javax.swing.JOptionPane;
public class Randnum
{
    public static void main(){
        try{
            int[] numList = new int[10];
            int evenNum = 0;
            int high = Integer.parseInt(JOptionPane.showInputDialog("Input high value"));
            int low = Integer.parseInt(JOptionPane.showInputDialog("Input low value"));
            if(low>=high){
                JOptionPane.showMessageDialog(null, "Your opinion is invalid");
                main();
            }
            else{
                for(int i=0; i<numList.length; i++){
                    int num = (int)(Math.random()*((high-low)+1)+low);
                    numList[i]=num;
                    System.out.print((i+1) + " = " + numList[i]);
                    if(num%2==0){
                        evenNum++;
                        System.out.println(" This number is even");
                    }
                    else{
                        System.out.println(" This number is odd");
                    }
                }
            }
            System.out.println("There were " + evenNum + " even numbers and " + (10-evenNum) + " odd numbers.");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Your opinion is invalid");
            main();
        }
    }
}
