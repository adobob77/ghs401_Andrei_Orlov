import javax.swing.JOptionPane;
public class SquareRange
{
    public static void main(){
        for(int i = 1; i<=10; i++){
            int square = (int)Math.pow(i, 2);
            int num = (int)(Math.round(Math.random()*((square-i)+1)+i));
            System.out.print(i + "\t" + square + "\t" + num + "\t");
            if(i==num){
                System.out.println("The random value is equal to the index");
            }else if(square==num){
                System.out.println("The random value is equla to the square of the index");
            }else{
                System.out.println("");
            }
        }
        System.out.println("\n");
        try{
            String[] movieList = new String[3];
            String[] songList = new String[3];
            for(int a=0;a<movieList.length;a++){
                movieList[a] = JOptionPane.showInputDialog(null, "input a movie", "", JOptionPane.QUESTION_MESSAGE);
            }
            for(int a=0;a<songList.length;a++){
                songList[a] = JOptionPane.showInputDialog(null, "input a song", "", JOptionPane.QUESTION_MESSAGE);
            }
            for(int b=0;b<movieList.length;b++){
                System.out.println(movieList[b]);
            }
            System.out.print("\n\n");
            int b=1;
            while(b<=songList.length){
                if(b==songList.length){
                    System.out.print(songList[b-1]);
                }else{
                    System.out.print(songList[b-1] + ", ");
                }
                b++;
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "How daer you make this error: " + e, "error text", JOptionPane.ERROR_MESSAGE);
        }
    }
}
