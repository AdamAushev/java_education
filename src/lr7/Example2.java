package lr7;

public class Example2 {
    class SuperClass {
        private String text;

        public SuperClass(String text) {
            this.text = text;
        }

        public void setText() {
            this.text = "";
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getTextLength() {
            return text.length();
        }
    }

    class SubClass extends SuperClass {
        private int number;

        public SubClass(int number, String text) {
            super(text);
            this.number = number;
        }

        public void setNumber() {
            this.number = 0;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setText() {
            super.setText();
        }

        public void setText(String text) {
            super.setText(text);
        }

        public void setTextNumber(String text, int number) {
            super.setText(text);
            this.number = number;
        }
    }
}
