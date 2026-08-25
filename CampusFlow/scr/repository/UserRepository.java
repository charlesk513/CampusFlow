package CampusFlow.scr.repository;

import java.io.IOException;

import CampusFlow.scr.model.User;
import CampusFlow.scr.util.FileManager;

public class UserRepository {
    private FileManager fileManager;
    private String fileName = "../../data/users.txt";

    public UserRepository(FileManager fileManager, String fileName) {
        this.fileManager = fileManager;
        this.fileName = fileName;
    }

    public void save(User item) throws IOException {
        String credentials = "\n" + item.getUsername() + " " + item.getPassword();
        fileManager = new FileManager(this.fileName, credentials);
        String response = fileManager.append();
        System.out.println(response);
    }

}
