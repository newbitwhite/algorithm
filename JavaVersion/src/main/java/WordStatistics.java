import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author xiaobai
 * @description
 * @date 2022-03-16 15:46
 */
public class WordStatistics {
    public void readFile() throws IOException {
        // 创建一个FileInputStream对象:
        String s = Files.readString(Paths.get("./README1.md"));
        String[] sArr = s.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (String str : sArr) {
            String s1 = str.toLowerCase();
            Integer num = map.get(s1);
            map.put(s1, num == null ? 1 : num + 1);
        }
        map = sortDescend(map);
        map.forEach((i,j)-> {
            System.out.println(i + "  " + j);
        });
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortDescend(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            }
        });

        Map<K, V> returnMap = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            returnMap.put(entry.getKey(), entry.getValue());
        }
        return returnMap;
    }

    public static void main(String[] args) {
        try {
            new WordStatistics().readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
