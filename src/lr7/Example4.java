package lr7;

public class Example4 {
    class SuperClass {
        protected char character;

        public SuperClass(char character) {
            this.character = character;
        }

        public SuperClass(SuperClass obj) {
            this.character = obj.character;
        }
    }

    class SubClass1 extends SuperClass {
        protected String text;

        public SubClass1(char character, String text) {
            super(character);
            this.text = text;
        }

        public SubClass1(SubClass1 obj) {
            super(obj);
            this.text = obj.text;
        }
    }

    class SubClass2 extends SubClass1 {
        protected int number;

        public SubClass2(char character, String text, int number) {
            super(character, text);
            this.number = number;
        }

        public SubClass2(SubClass2 obj) {
            super(obj);
            this.number = obj.number;
        }
    }
}
