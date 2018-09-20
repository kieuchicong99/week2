public class Student{
    private String name, id, group, email;

    public Student(){
        this.name = "Student";
        this.id = "000";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em ){
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "K59CB";
    }
    public Student(Student s){
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }

    // getter, setter for name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    // getter, setter for id
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    // getter, setter for group
    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return this.group;
    }
    
    // getter, setter for email
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public String getInfo(){
        String Info = this.name + ", " + this.id + ", " + this.group + ", " + this.email;
        System.out.println(Info);
        return Info;
    }
}