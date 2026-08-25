package CampusFlow.scr.model;

public class Result {

    private String student_no;
    private String course_code;
    private double cat_mark;
    private double exam_mark;
    private double total;
    private double average;
    private String grade;

    public Result(String student_no, String course_code, double cat_mark, double exam_mark, double total,
            double average,
            String grade) {
        this.student_no = student_no;
        this.course_code = course_code;
        this.cat_mark = cat_mark;
        this.exam_mark = exam_mark;
        this.total = total;
        this.average = average;
        this.grade = grade;
    }

    public String getStudent_no() {
        return this.student_no;
    }

    public double getExam_mark() {
        return this.exam_mark;
    }

    public double getCat_mark() {
        return this.cat_mark;
    }

    public String getCourse_code() {
        return this.course_code;
    }

    public double getTotal() {
        return this.total;
    }

    public double getAverage() {
        return this.average;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setCat_mark(double cat_mark) {
        this.cat_mark = cat_mark;
    }

    public void setExam_mark(double exam_mark) {
        this.exam_mark = exam_mark;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
