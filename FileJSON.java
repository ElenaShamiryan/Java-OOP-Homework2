package DZ2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileJSON extends Records{
    @Override
    public void FileWriter(Map<String, Double> args) {

        try(FileWriter writer = new FileWriter("DZ2/file2.json", false)) {
            writer.append("{\n");
            int count = 1;
            for(Map.Entry<String, Double> entry: args.entrySet()) {
                if (count < args.size()) {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "," + "\n");
                } else {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "\n");
                }
                count++;
            }
            writer.append("}\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
