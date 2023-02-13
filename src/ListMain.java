import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        Slumdunk shohoku1 = new Slumdunk("桜木花道", 10);
        Slumdunk shohoku2 = new Slumdunk("流川楓", 11);
        Slumdunk shohoku3 = new Slumdunk("ゴリ", 4);
        Slumdunk shohoku4 = new Slumdunk("宮城リョータ", 7);
        Slumdunk shohoku5 = new Slumdunk("三井寿", 14);

        List<Slumdunk> shohokuList = new ArrayList<>();
        shohokuList.add(shohoku1);
        shohokuList.add(shohoku2);
        shohokuList.add(shohoku3);
        shohokuList.add(shohoku4);
        shohokuList.add(shohoku5);

        // 繰り返し文
        for (int i = 0; i < shohokuList.size(); i++) {
            System.out.println(shohokuList.get(i));
        }
        // イテレータ
        Iterator<Slumdunk> it = shohokuList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
