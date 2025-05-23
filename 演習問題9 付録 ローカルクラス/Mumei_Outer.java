// 下記のーーーーの部分を無名クラスに書き換えなさい。
interface Greet {
    public String greet(String name);
}

public class Mumei_Outer {
    public static void main(String[] args) {
        //ーーーーーーーーーーーーーーーーーーーーーー
        class Local implements Greet {
            public String greet(String name) {
                return "こんにちは" + name + "さん";
            }
        }
        Local g = new Local();
        //ーーーーーーーーーーーーーーーーーーーーーー
        System.out.println(g.greet("山田"));
    }
}
