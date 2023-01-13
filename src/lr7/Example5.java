package lr7;

public class Example5 {
    class SuperClass {
        protected String text;
        public SuperClass(String text) {
            this.text = text;
        }

        public void display() {
            System.out.println("Class: SuperClass");
            System.out.println("text: " + text);
        }
    }

    class SubClass1 extends SuperClass {
        protected int num;
        public SubClass1(String text, int num) {
            super(text);
            this.num = num;
        }

        @Override
        public void display() {
            System.out.println("Class: SubClass1");
            System.out.println("text: " + text);
            System.out.println("num: " + num);
        }
    }

    class SubClass2 extends SuperClass {
        protected char letter;
        public SubClass2(String text, char letter) {
            super(text);
            this.letter = letter;
        }

        @Override
        public void display() {
            System.out.println("Class: SubClass2");
            System.out.println("text: " + text);
            System.out.println("letter: " + letter);
        }
    }

    class SubClass3 extends SuperClass {
        protected boolean flag;
        public SubClass3(String text, boolean flag) {
            super(text);
            this.flag = flag;
        }

        @Override
        public void display() {
            System.out.println("Class: SubClass3");
            System.out.println("text: " + text);
            System.out.println("flag: " + flag);
        }
    }

    class SubClass4 extends SuperClass {
        protected double value;
        public SubClass4(String text, double value) {
            super(text);
            this.value = value;
        }

        @Override
        public void display() {
            System.out.println("Class: SubClass4");
            System.out.println("text: " + text);
            System.out.println("value: " + value);
        }
    }

    public class Main {
        public void main(String[] args) {
            SubClass1 obj1 = new SubClass1("hello", 5);
            obj1.display();

            SubClass2 obj2 = new SubClass2("world", 'A');
            obj2.display();

            SubClass3 obj3 = new SubClass3("hi", true);
            obj3.display();

            SubClass4 obj4 = new SubClass4("goodbye", 3.14);
            obj4.display();

            SuperClass obj5 = new SubClass4("test", 2.718);
            obj5.display();
        }
    }
}
