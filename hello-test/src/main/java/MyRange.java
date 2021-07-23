public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getStartNumber() {
        int number = Integer.parseInt(String.valueOf(this.input.charAt(1)));
        if(isStartWithInclude()) {
            return number;
        }
        return number + 1;
    }
    public int getEndNumber() {
        int number = Integer.parseInt(String.valueOf(this.input.charAt(3)));
        if(isEndWithInclude()) {
            return number;
        }
        return number - 1;
    }

    public String generateNumber() {
        int start = getStartNumber();
        int end = getEndNumber();
        String result = "";
        for (int i = start; i <= end; i++) {
            result += i + ",";
        }
        return result.substring(0, result.length() - 1);
    }
}
