package scr.repository;

import scr.util.FileManager;
import scr.model.User;

public class UserRepository {
    private FileManager fileManager;
    private String fileName = "../../data/users.txt";

    public UserRepository(FileManager fileManager, String fileName) {
        this.fileManager = fileManager;
        this.fileName = fileName;
    }

    public void save(User item) {
        String username = item.getUsername();
        String password = item.getPassword();
        // fileManager = new FileManager(fileName, information);
    }
}
