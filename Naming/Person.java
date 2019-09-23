
public class Person
{
    private String[] nameArray;
    private int age;
    public Person(){
        
        nameArray = new String[3];
        this.nameArray[1] = null;
        this.nameArray[2] = null;
        this.age = 0;
    }
    
    public Person(String f, String m, String l, int a){
        this.nameArray[0] = f;
        this.nameArray[1] = m;
        this.nameArray[2] = l;
        this.age = a;
    }
    
    public String toString(){
        return "Name: "+this.nameArray[0]+" "+this.nameArray[1]+" "+this.nameArray[2]+"; Age: "+this.age;
    }
}
