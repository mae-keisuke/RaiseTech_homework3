public class ExceptionMain {
    public static void main(String[] args) {

        try {
            String[] name = new String[6];
            name[0] = "桜木花道";
            name[1] = "流川楓";
            name[2] = "ゴリ";
            name[3] = "宮城リョータ";
            name[4] = "三井寿";

            for (int i = 0; i < name.length; i++) {
                if (name[i] == null) {
                    throw new Exception();
                } else {
                    System.out.println(name[i]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
        } catch (Exception e) {
            System.out.println("例外が発生しています");
        }
    }
}
