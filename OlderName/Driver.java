import javax.swing.JOptionPane;
public class Driver
{

    public Driver()
    {
        // initialise instance variables

    }

    public static void main()
    {
        maleStudents[] mList = new maleStudents[7];
        femaleStudents[] fList = new femaleStudents[7];
        String[] olderName = new String[7];
        String[] nameList = {"Jeff","George","Hurk","Francis",null,"Kole",null,"Jessica","Grace","Karen","Leslie","Brandie",null,null};
        int[] gradeList = {1,12,3,4,5,6,7,1,12,3,4,12,6,8};
        //                 1,2,3,4,5,6,7,1,2,3,4,5,6,7
        System.out.println("Female Name\tGrade\t\tMale Name\tGrade\t\tOlderStudent");
        for(int i=0;i<1;i++)
        {
            if(i<7)
            {
                mList[i] = new maleStudents(nameList[i],gradeList[i]);
            }else
            {
                fList[i%7] = new femaleStudents(nameList[i],gradeList[i]);
            }
        }
        mList[5]=new maleStudents("Mark",12);
        for(int i=0;i<olderName.length;i++)
        {
            try
            {
                if(mList[i].name==null && fList[i].name==null)
                {
                    olderName[i]="Space for Rent";
                }
                else if(mList[i].name==null)
                {
                    olderName[i]=fList[i].name;
                }else if(fList[i].name==null)
                {
                    olderName[i]=mList[i].name;
                }
                else if(mList[i].grade>fList[i].grade)
                {
                    olderName[i]=mList[i].name;
                }else if(fList[i].grade>mList[i].grade)
                {
                    olderName[i]=fList[i].name;
                }else if(fList[i].grade==mList[i].grade)
                {
                    double num = Math.random();
                    if(num>=0.5)
                    {
                        olderName[i]=mList[i].name;
                    }else
                    {
                        olderName[i]=fList[i].name;
                    }
                }
            }catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null,"Error message: "+e,"Error",JOptionPane.ERROR_MESSAGE);
                 if(mList[i].name==null&&fList[i].name==null){
                    olderName[i]="Space for Rent";
                }
                if(mList[i]==null){
                    mList[i] = new maleStudents(null,0);
                    if(fList[i]!=null){
                        olderName[i]=fList[i].name;
                    }
                }
                if(fList[i]==null){
                    fList[i] = new femaleStudents(null,0);
                    if(mList[i]!=null){
                        olderName[i]=mList[i].name;
                    }
                }
               
            }
            System.out.println(fList[i].name+"\t\t"+fList[i].grade+"\t\t"+mList[i].name+"\t\t"+mList[i].grade+"\t\t"+olderName[i]);
        }
    }
}
