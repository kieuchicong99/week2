public class StudentManagement{
    final int Max = 100;
    StudentManagement(){}
    //task 9
    public Student[] students = new Student[Max] ;

    //thuộc tính tự cho thêm
    public int count = 0;
    
    //phương thức tự cho thêm
    public void  list(){
        System.out.printf("\n-->List Students:\n");
        for (int i = 0 ; i< count; i++){
            students[i].getInfo();
        }            
    }

    public void addStudent(Student s){
        if(count < Max-1){
            students[count] = s;
            count ++;
        }
    }

    //kiểm tra xem 2 sinh viên có cùng group không
    public boolean sameGroup(Student s1, Student s2){
        boolean sameGroup = s1.getGroup()==s2.getGroup();
        if(sameGroup)
            System.out.printf("Two student: %s and %s is the same group!\n",s1.getName(),s2.getName());
        else 
            System.out.printf("Two student: %s and %s isn't the same group !!!\n",s1.getName(),s2.getName()) ;
        return (sameGroup);
    }

    //sắp xếp danh sách sinh viên theo group và in ra
    public void studentsByGroup(){
        int i, j ;        
        for (i = 0 ; i < count ; i++)
            for(j = i+1 ; j <= count -1 ; j++){
                if(students[i] != null && students[j] != null){                
                    if(students[i].getGroup().compareTo(students[j].getGroup()) < 0){
                        Student any ;
                        any = students[i];
                        students[i] = students[j];
                        students[j] = any;
                    }
                }
            }
        list();                
    }

    //Remove các sinh viên có id được yêu cầu
    public void removeStudent(String id){
        for(int i = count-1 ; i >= 0 ; i--)
            if (students[i] != null && students[i].getId().equals(id)){
                for(int j = i ; j < count -1 ; j++)
                    students[j] = students[j+1];
                count --;
            }
    }

    //Phương thức main
    public static void main(String[]args) {
        //task 6
        Student student = new Student();
        student.setName("Kieu Chi Cong");
        student.setId("1"); 
        student.setEmail("kieuchicong99@gmail.com");
        student.setGroup("K62C-CLC");
        System.out.printf("\n-->Test getInfo method to show information of one student:\n");
        student.getInfo();

        //task 8
        Student student1 = new Student();
        Student student2 = new Student("Nguyen Van A","2","2@vnu.edu.vn");
        Student student3 = new Student(student2);
        student3.setName("Nguyen Van B");
        Student student4 = new Student(student);
        student4.setGroup("K62C-CLC");
       
        // task 10
        student1.setGroup("K59C-CLC");
        student2.setGroup("K59CB");
        StudentManagement president = new StudentManagement();
        
        System.out.printf("\n-->Test two student is the same group or not:\n");
        president.sameGroup(student1, student2);
        president.sameGroup(student3, student2);
        
        
        
        president.addStudent(student1);
        president.addStudent(student4);
        president.addStudent(student2);
        president.addStudent(student);
        president.addStudent(student2); 
        president.addStudent(student1);
        president.addStudent(student3);
        president.addStudent(student1);
        president.addStudent(student3);
        president.addStudent(student1);
        president.addStudent(student3);
        president.addStudent(student1);
        president.addStudent(student4);
        president.addStudent(student4);

        president.list();
        //task12
        System.out.printf("\n-->Call studentsByGroup method:\n");        
        president.studentsByGroup(); 
        //task13
        System.out.printf("\n-->Call removeStudent method for student have id = 000:\n");
        president.removeStudent("000");
        president.studentsByGroup();  

    }
    
}