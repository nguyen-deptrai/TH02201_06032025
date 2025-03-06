import java.util.ArrayList;
import java.util.List;

public class CauMot {
        public static List<Integer> Tam() {
                List<Integer> result = new ArrayList<>();
                for (int i = 2; i <= 50; i += 2) {
                    if (i % 8 != 0) {
                        result.add(i);
                    }
                }
                return result;
            }
}
