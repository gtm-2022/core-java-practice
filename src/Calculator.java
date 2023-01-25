class Calculator {
    public int add(int op1, int op2) {

        return (op1 + op2);
    }

    public int add(int op1, int op2, int op3) {
        return (op1 + op2 + op3);
    }

    public float add(float op1, float op2) {
        return (op1 + op2);
    }

    public double add(double op1, double op2) {
        return (op1 + op2);
    }

    public static void main(String args[]) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 50));
        System.out.println(c.add(2.4, 4.1));
        System.out.println(c.add(10.5, 20.25));
    }
}
