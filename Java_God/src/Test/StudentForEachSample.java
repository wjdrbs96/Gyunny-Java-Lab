package Test;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentDTOList = new ArrayList<>();
        studentDTOList.add(new StudentDTO("규니1", 43, 99, 10));
        studentDTOList.add(new StudentDTO("규니2", 30, 71, 85));
        studentDTOList.add(new StudentDTO("규니2", 32, 81, 75));
        sample.printStudentNames(studentDTOList);
    }

    public void printStudentNames(List<StudentDTO> students) {
        students.stream().map(student -> student.getName()).forEach(System.out::println);
    }

    public void filterWithScoreForLoop(List<StudentDTO> studentDTOList,  int scoreCutLine) {
        studentDTOList.stream().
                filter(student -> student.getScoreMath() > scoreCutLine)
                .forEach(System.out::println);

    }
}
