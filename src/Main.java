import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Slumdunk> shohokuList = new ArrayList<>();
        shohokuList.add(new Slumdunk("桜木花道", 10));
        shohokuList.add(new Slumdunk("流川楓", 11));
        shohokuList.add(new Slumdunk("ゴリ", 4));
        shohokuList.add(new Slumdunk("宮城リョータ", 7));
        shohokuList.add(new Slumdunk("三井寿", 14));

        for (int i = 0; i < shohokuList.size(); i++) {
            System.out.println(shohokuList.get(i));
        }

        Map<String, String> shohokuMap = new HashMap<>();
        shohokuMap.put("桜木花道", "188cm");
        shohokuMap.put("流川楓", "187cm");
        shohokuMap.put("ゴリ", "197cm");
        shohokuMap.put("宮城リョータ", "168cm");
        shohokuMap.put("三井寿", "184cm");

        try {
            System.out.println("\n選手名を入力してください。身長を調べます。");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            
            if (shohokuMap.get(input) == null) {
                throw new NullPointerException();
            } else {
                System.out.println(shohokuMap.get(input));
            }
        } catch (NullPointerException e) {
            System.out.println("当てはまる人がいません");
        }
    }
}

