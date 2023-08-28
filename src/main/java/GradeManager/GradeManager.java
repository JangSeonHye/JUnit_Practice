package GradeManager;

import java.util.HashMap;
import java.util.Map;

public class GradeManager {
    private Map<String, Integer> grades;

    public GradeManager() {
        grades = new HashMap<>();
    }

    public void addGrade(String studentName, int grade) {
        // 성적은 0부터 100 사이여야 함
        assert grade >= 0 && grade <= 100 : "Invalid grade: " + grade;

        // 학생 이름은 공백이 아니어야 함
        assert !studentName.isBlank() : "Student name cannot be blank";

        grades.put(studentName, grade);
    }

    @Deprecated
    public void removeGrade(String studentName) {
        // Deprecated된 메소드임을 경고로 알림
        System.out.println("Warning: This method is deprecated");

        grades.remove(studentName);
    }

    public Map<String, Integer> getGrades(){
        return grades;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        manager.addGrade("Alice", 85);
        manager.addGrade("Bob", 92);
        manager.addGrade("", 75); // 빈 문자열인 경우 assertion 실패

        System.out.println(manager);

        manager.removeGrade("Bob");
    }
}
