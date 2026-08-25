package scr.model;

public class Lecturer {
    private String name;
    private String lecturer_id;
    private String email;

    public Lecturer(String name, String lecturer_id, String email) {
        this.name = name;
        this.lecturer_id = lecturer_id;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getLecturer_id() {
        return this.lecturer_id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

}
