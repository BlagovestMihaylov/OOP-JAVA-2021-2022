package generator;

public class Result {
    char[] chars;
    int data;

    public Result() {
    }

    public Result(char[] chars, int data) {
        this.chars = chars;
        this.data = data;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
