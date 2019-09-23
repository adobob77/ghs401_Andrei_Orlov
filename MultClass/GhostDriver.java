import javax.swing.JOptionPane;
public class GhostDriver
{
    public static void main(){
        int ghostNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Input number of ghosts","",JOptionPane.QUESTION_MESSAGE));
        Ghost[] ghostList = new Ghost[ghostNum];
        for(int i = 0;i<ghostNum;i++){
            ghostList[i] = new Ghost(JOptionPane.showInputDialog(null,"Input ghost color","",JOptionPane.QUESTION_MESSAGE));
        }
        for(int i = 0;i<ghostNum;i++){
            System.out.println(ghostList[i].toString());
        }
    }
}
