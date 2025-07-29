public class student{
    private int id;
    private String name;
    private double score;

    public student(){
        System.out.println("Default student object created!!");
    }

    public student(int id, String name, double score){
        this.id=id;
        this.name=name;
        this.score=score;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score=score;
    }

    public void displaydetails(){
        System.out.println("Student id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Student Score: "+score);
        System.out.println("------------------------");
    }
}
