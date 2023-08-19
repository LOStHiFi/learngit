public class Variable {
    public static void main(String[] args) {
        
    }

    //定义整形的例子
    public static void intNum() {
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000;
        int i4 = 0xff0000;
        int i5 = 0b1000000000;
        //long类型的结尾需要加L
        long n1 = 9000000000000000000L;
    }

    //定义浮点数的例子
    public static void floatNum() {
        float f1 = 3.14f;
        float f2 = 3.14e38f;//科学计数法表示的3.14x10^38
        //不带f结尾的是double类型，不能赋值给float
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324;//科学计数法表示的4.9x10^-324
    }

    //定义布尔类型的例子
    public static void booleanNum() {
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3;//true
        int age = 12;
        boolean isAdult = age >= 18;//false
    }

    //定义字符类型的例子
    public static void charNum() {
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);
    }

    //定义引用类型的例子
    public static void stringNum() {
        String s = "hello";
    }

    //定义常量的例子
    public static void finalNum() {
        final double PI = 3.14;
        double r = 5.0;
        double area = PI * r * r;
    }

    //var关键字
    public static void varNum() {
        //StringBuilder sb = new StringBuilder();
        var sb = new StringBuilder();
    }
}