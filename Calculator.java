public abstract class Calculator {
    private int[] numbers;

    public Calculator(int[] numbers) {
        this.numbers = numbers;
    }

    public abstract int add();

    public abstract int subtract();

    public abstract int multiply();

    public abstract int divide();

    public abstract int factorial();

    public abstract int squareroot();

    public abstract int squareroot(int base);

    public abstract int exponent(int base, int power);

    public void clear() {
        numbers[0] = 0;
    }

    public int[] getNumbers() {
        return numbers;
    }                                   //getter

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;         //setter
    }
}

class BasicCalculator extends Calculator {
    public BasicCalculator(int[] numbers) {
        super(numbers);
    }

    @Override
    public int add() {
        int sum = 0;
        for (int num : getNumbers()) {
            sum += num;
        }
        clear();
        return sum;
    }

    @Override
    public int subtract() {
        int result;
        result = getNumbers()[0];
        for (int i = 1; i < getNumbers().length; i++) {
            result -= getNumbers()[i];
        }
        clear();
        return result;
    }

    @Override
    public int multiply() {
        int result = 1;
        for (int num : getNumbers()) {
            result *= num;
        }
        clear();
        return result;
    }

    @Override
    public int divide() {
        int result = getNumbers()[0];
        for (int i = 1; i < getNumbers().length; i++) {
            result /= getNumbers()[i];
        }
        clear();
        return result;
    }

    @Override
    public int factorial() {
        throw new UnsupportedOperationException("Method not supported");
    }

    @Override
    public int squareroot() {
        throw new UnsupportedOperationException("Method not supported");
    }

    @Override
    public int squareroot(int base) {
        return 0;
    }

    @Override
    public int exponent(int base, int exp) {
        throw new UnsupportedOperationException("Method not supported");
    }
}

class ScientificCalculator extends Calculator {
    public ScientificCalculator(int[] numbers) {
        super(numbers);
    }

    @Override
    public int add() {
        throw new UnsupportedOperationException("Method not supported");
    }

    @Override
    public int subtract() {
        throw new UnsupportedOperationException("Method not supported");
    }

    @Override
    public int multiply() {
        throw new UnsupportedOperationException("Method not supported");
    }

    @Override
    public int divide() {
        throw new UnsupportedOperationException("Method not supported");
    }

    @Override
    public int factorial() {
        int result = 1;
        int num = getNumbers()[0];
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        clear();
        return result;
    }

    @Override
    public int squareroot() {
        return 0;
    }

    @Override
    public int squareroot(int base) {
        int result = (int) Math.sqrt(base);
        clear();
        return result;
    }

    @Override
    public int exponent(int base, int power) {
        int result = (int) Math.pow(base, power);
        clear();
        return result;
    }
}
