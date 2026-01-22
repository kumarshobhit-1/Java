

class  MyMainEmployee{
    private int id;
    private String name; 
    private String course;
    private String university;
    private String dist;

    public MyMainEmployee(){
        id = 49;
        name = "Shobhit kumar";
        course = "B.tech";
        university = "Babu Banarasi Das University";
        dist = "Lucknow";
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public String getUniversity(){
        return university;
    }
    public String getDist(){
        return dist;
    }
}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee patel = new MyMainEmployee();
        System.out.println(patel.getId());
        System.out.println(patel.getName());
        System.out.println(patel.getCourse());
        System.out.println(patel.getUniversity());
        System.out.println(patel.getDist());
    }
}