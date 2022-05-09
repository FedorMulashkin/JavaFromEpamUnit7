package task.stringlambda;

public class DoSomethingWithStringsImpl implements DoSomethingWithStrings{
    @Override
    public String doSomething(String str1, String str2) {
        return str1.length() > str2.length() ? str1 : str2;
    }
}

