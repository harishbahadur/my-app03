// ??? に外部クラス Outer の内部クラス Inner を生成して showMessage() を呼び出すコードを書きなさい。
class Outer {
    public class Inner {
        public void showMessage() {
            System.out.println("Innerクラスのメソッドが呼ばれました");
        }
    }
}
class InnerNew {
    public static void main(String[] args) {
        Outer outer = new Outer(); // 外部クラスを生成　テキストには書いていませんが必要です。
        Outer.Inner inner = outer.new Inner();      
        inner.showMessage();
    }

}