package cn.kgc.entity;

public class Student {
    private Integer id;
    private Integer gradeId;
    private String studentName;
    private String gender;
    private Integer age;
    private String studentNum;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gradeId=" + gradeId +
                ", studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", studentNum='" + studentNum + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }
}
