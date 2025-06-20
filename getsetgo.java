class Student{
    private String name;
    public String getName(){
        return name;
    }
public void Setname(String name){
    this.name=name;
}
}
class getsetgo{
    public static void main(String[] args) {
        Student s=new Student();
        s.Setname("Samrudh");
        System.out.println(s.getName());
    }
}