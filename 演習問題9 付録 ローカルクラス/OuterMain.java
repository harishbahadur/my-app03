// ①②③のコメントの通りにコードを書きなさい。
class Outer {
    private int x = 10;  // Outerクラスのx

    class Inner {
        private int x = 20; // Innerクラスのx

        public void printValues() {

            // ①Outerクラスのxを出力する処理を書きなさい
            System.out.println("Outerクラスのx: " + Outer.this.x);

            // ②Innerクラスのxを出力する処理を書きなさい
            System.out.println("Innerクラスのx: " + this.x);
        }
    }
}
class OuterMain {
    public static void main(String[] args) {
        // ③外部クラスと内部クラスを生成しなさい
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printValues();
        inner.printValues();
    }
}