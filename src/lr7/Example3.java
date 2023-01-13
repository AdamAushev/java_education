package lr7;

public class Example3 {
    class SuperClass {
        protected int number;

        public SuperClass(int number) {
            this.number = number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String toString() {
            return "SuperClass: " + number;
        }
    }

    class SubClass1 extends SuperClass {
        protected char character;

        public SubClass1(int number, char character) {
            super(number);
            this.character = character;
        }

        public void setNumberChar(int number, char character) {
            super.setNumber(number);
            this.character = character;
        }

        public String toString() {
            return "SubClass1: " + super.number + " " + character;
        }
    }

    class SubClass2 extends SubClass1 {
        protected String text;

        public SubClass2(int number, char character, String text) {
            super(number, character);
            this.text = text;
        }

        public void setNumberCharText(int number, char character, String text) {
            super.setNumberChar(number, character);
            this.text = text;
        }

        public String toString() {
            return "SubClass2: " + super.number + " " + super.character + " " + text;
        }
    }
}
