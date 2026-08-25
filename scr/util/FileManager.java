package scr.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private String results, information, file_name;

    public FileManager(String file_name) {
        this.file_name = file_name;
    }

    public FileManager(String file_name, String information) {
        this.information = information;
        this.file_name = file_name;
    }

    public String read() throws IOException {
        FileReader reader = new FileReader(file_name);
        results = reader.readAllAsString();
        reader.close();
        return results;
    }

    public String write() throws IOException {
        FileWriter writer = new FileWriter(file_name);
        writer.write(information);
        writer.close();
        String success = "Information written successfully in the file";

        return success;
    }

    public String append() throws IOException {
        FileWriter append_data = new FileWriter(file_name, true);
        append_data.append(information);
        append_data.close();
        String progress = "Information successfully appended to the file";

        return progress;
    }
}
