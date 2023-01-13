package lr7;

public class Example1 {
    class SuperClass {
        private String text;

        public SuperClass(String text) {
            this.text = text;
        }

        public String toString() {
            return "SuperClass: " + text;
        }
    }

    class SubClass extends SuperClass {
        private String text2;

        public SubClass(String text) {
            super(text);
        }

        public SubClass(String text, String text2) {
            super(text);
            this.text2 = text2;
        }

        public String toString() {
            return "SubClass: " + super.text + " " + text2;
        }
    }
}
