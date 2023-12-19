package Students;

import java.util.ArrayList;

public class Student {
    public String fullName;
    public String lastName;
    public String group;
    public float Mark;
    ArrayList<Float> marks = new ArrayList<>(2);

    public Student(String fullName, String lastName, String group) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.group = group;
    }
    public float getAverageMark(ArrayList<Float> marks) {
        for (int i = 0; i < marks.size(); i++) {
            Mark += marks.get(i);
        }
        return Mark / marks.size();
    }


    public int getScholarship(float averageMark) {
        if(averageMark == 5) return 100;
        else return 80;
    }

}
