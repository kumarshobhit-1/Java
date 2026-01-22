
class  MyMainEmployee2{
    private int id;
    private String name;
    private String course;
    private String university;
    private String dist;

    public MyMainEmployee2(int myId, String myName, String myCourse, String myUniversity, String myDist){
        id = myId;
        name = myName;
        course = myCourse;
        university = myUniversity;
        dist = myDist;
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
public class Constructor_2nd_type_se {
    public static void main(String[] args) {
        MyMainEmployee2 patel = new MyMainEmployee2(49,"Shobhitkumar", "B.tech", "Babu Banarasi Das University", "Lucknow");
        System.out.println(patel.getId());
        System.out.println(patel.getName());
        System.out.println(patel.getCourse());
        System.out.println(patel.getUniversity());
        System.out.println(patel.getDist());
    }
}

