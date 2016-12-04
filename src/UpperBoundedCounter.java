public class UpperBoundedCounter extends Calculations
{

    UpperBoundedCounter() {
        limit=10;
    }

    UpperBoundedCounter(int num) {
        value1 = num;
        limit=10;
    }

    UpperBoundedCounter(int num, int num2) {
        value1 = num;
        limit = num2;
    }


    public void up() {
        if (value1 < limit) {
            value1++;
        }

    }

    public String toString() {
        return "A Counter with a value of " + value1 + " and a limit of " + limit;
    }
}