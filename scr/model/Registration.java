package scr.model;

public class Registration {
    private String reg_no;
    private String student_no;
    private String course_code;
    private String semester;

    public Registration(String reg_no, String course_code, String student_no, String semester) {
        this.reg_no = reg_no;
        this.student_no = student_no;
        this.course_code = course_code;
        this.semester = semester;
    }

    public String getReg_no() {
        return this.reg_no;
    }

    public String getStudent_no() {
        return this.student_no;
    }

    public String getCourse_code() {
        return this.course_code;
    }

    public String getSemester() {
        return this.semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

}