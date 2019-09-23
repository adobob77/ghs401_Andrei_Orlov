import javax.swing.JOptionPane;
public class WaldoList
{
    public static void main(){
        try{
            String[] userpass = {"Granada","Matadors"};
            String user = JOptionPane.showInputDialog(null, "School Name:", "username", JOptionPane.QUESTION_MESSAGE);
            String pass = JOptionPane.showInputDialog(null, "Mascot Name:", "password", JOptionPane.QUESTION_MESSAGE);
            int n = 0;
            for(int i=0;i<2;i++){
                 if(user.equals(userpass[i])||pass.equals(userpass[i])){
                     n++;
                 }
            }
            if(n==2){
                int waldoLen = Integer.parseInt(JOptionPane.showInputDialog(null, "How long should the Waldo List be?", "do the answer", JOptionPane.QUESTION_MESSAGE));
                if(waldoLen>1){
                    String[] waldoList = new String[waldoLen];
                    int waldoRand = (int)Math.round((Math.random()*waldoLen));
                    for(int i = 1;i<=waldoLen;i++){
                        if(i==waldoRand){
                            waldoList[i-1] = "Waldo";
                        }else{
                            waldoList[i-1] = null;
                        }
                    }
                    for(int i = 1;i<=waldoLen;i++){
                        try{
                            if(waldoList[i-1].equals("Waldo")){
                                System.out.println("Found Waldo in spot " + i);
                                JOptionPane.showMessageDialog(null,"Found Waldo in spot " + i, "", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                System.out.println("Waldo not found in spot " + i + ". In this spot was " + waldoList[i-1]);
                            }
                        }catch(Exception e){
                            System.out.println("Found nothing in spot " +i);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"The length should be greater then 1", "", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect School or Mascot", "", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"How dare you make this error: " + e, "stahp it", JOptionPane.ERROR_MESSAGE);
        }
    }
}
