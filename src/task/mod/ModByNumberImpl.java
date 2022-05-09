package task.mod;

public class ModByNumberImpl implements ModByNumber {
    @Override
    public boolean mod(int number) {
        return number % 13 == 0;
    }
}
