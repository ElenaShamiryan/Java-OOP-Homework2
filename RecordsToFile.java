package DZ2;

import java.util.HashMap;
import java.util.Map;

public class RecordsToFile {
    public static void main(String[] args) {

        Map<String, Double> dict = new HashMap<>();
        dict.put("Иван Иванов", 4.8);
        dict.put("Мария Кузнецова", 5.0);
        dict.put("Степан Кузьмин", 3.6);

        FileTxt file1 = new FileTxt();
        file1.FileWriter(dict);

        FileXml file2 = new FileXml();
        file2.FileWriter(dict);

        FileJSON file3 = new FileJSON();
        file3.FileWriter(dict);

    }
}
