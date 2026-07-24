public class cap {
    class ABC {
        private int variable; 

        public void setVariable(int x) {
            this.variable = x;
        }

        public int getVariable() {
            return variable;
        }
    }

    public static void main(String[] args) {
        cap outer = new cap();

        cap.ABC obj = outer.new ABC();

        obj.setVariable(42);

        System.out.println("The value of the variable is: " + obj.getVariable());
    }
}