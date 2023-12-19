package Students;

import java.util.ArrayList;

public class Aspirant extends Student {
    public String ScientificWorks;
    public Aspirant(String fullName, String lastName, String group,String scientificWorks) {
        super(fullName, lastName, group);
        this.ScientificWorks = scientificWorks;}
    public float getAverageMark(ArrayList<Float> marks){
        for(int i = 0;i < marks.size();i++){
            Mark += marks.get(i);
        }
        return Mark/ marks.size();
    }
    public int getScholarship(float averageMark){
        if(averageMark == 5) return 200;
        else return 180;
    }
}
