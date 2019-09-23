import javax.swing.JOptionPane;
public class MasterClass
{
    public static void main(){
        String[] nameList1 = new String[3];
        String[] nameList2 = new String[3];
        String name1="";
        String name2="";
        int age1=0;
        int age2=0;
        for(int nameOwner=1;nameOwner<3;nameOwner++){
            for(int i=0;i<3;i++){
                if(nameOwner==1){
                    nameList1[i] = JOptionPane.showInputDialog(null,"Input name "+(i+1)+" for person 1");
                }else{
                    nameList2[i] = JOptionPane.showInputDialog(null,"Input name "+(i+1)+" for person 2");
                }
            }
        }
        for(int nameOwner=1;nameOwner<3;nameOwner++){
            for(int i=0;i<3;i++){
                if(nameOwner==1){
                    name1 = name1+" "+nameList1[i];
                }else{
                    name2 = name2+" "+nameList2[i];
                }
            }
        }
        if(name1.length()>name2.length()){
            System.out.println("Your name is longer");
        }else if(name1.length()<name2.length()){
            System.out.println("Your friend's name is longer");
        }else{
            System.out.println("Your names are the same length");
        }
        try{
            age1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Input age for person 1"));
            age2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Input age for person 2"));
        }catch(Exception e){
            age1 = 0;
            age2 = 0;
        }
        Person p1 = new Person(nameList1[0],nameList1[1],nameList1[2],age1);
        Person p2 = new Person(nameList2[0],nameList2[1],nameList2[2],age2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
