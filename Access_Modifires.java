
     // Using Private Access
class MYEmployee{
    private int Id;
    private String name;
    private String course;
    private String university;
    private String dist;

    public void setName(String n){
         name = n;
    }
    public String getName(){
        return name;
    }
    public void setCourse(String c){
        course = c;
    }
    public String getCourse(){
        return course;
    }
    public void setUniversity(String u){
        university = u;
    }
    public String getUniversity(){
        return university;
    }
    public void setDist(String d){
        dist = d;
    }
    public String getDist(){
        return dist;
    }
    public void setId(int i){
        Id = i;
    }
    public int getId(){
        return Id;
    }
}
public class Access_Modifires {
    public static void main(String[] args) {
        MYEmployee patel = new MYEmployee();
        patel.setId(49);
        patel.setName("Shobhit Patel");
        patel.setCourse("B.tech");
        patel.setUniversity("Babu Banarasi Das University");
        patel.setDist("Lucknow");
        System.out.println(patel.getId());
        System.out.println(patel.getName());
        System.out.println(patel.getCourse());
        System.out.println(patel.getUniversity());
        System.out.println(patel.getDist());


    }
}
