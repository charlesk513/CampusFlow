package scr.model;

public class Course {

    private String code;
    private String title;
    private int credits;

    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
