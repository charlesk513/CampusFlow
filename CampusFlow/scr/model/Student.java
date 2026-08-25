package CampusFlow.scr.model;

public class Student {

    private String name;
    private String reg_no;
    private String programme;
    private String student_no;
    private int year;
    private String email;
    private String phone;

    public Student(String name, String reg_no, String programme, String student_no, String email, int year,
            String phone) {
        this.name = name;
        this.reg_no = reg_no;
        this.student_no = student_no;
        this.programme = programme;
        this.email = email;
        this.year = year;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getReg_no() {
        return this.reg_no;
    }

    public String getProgramme() {
        return this.programme;
    }

    public String getStudent_no() {
        return this.student_no;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
