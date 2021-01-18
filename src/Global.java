public class Global {
    boolean isConst;
    int length;
    String items;

    public boolean getIsConst() {
        return isConst;
    }

    public void setIsConst(boolean isConst) {
        this.isConst = isConst;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Global(boolean isConst, int length, String items) {
        this.isConst = isConst;
        this.length = length;
        this.items = items;
    }

    public Global(boolean isConst) {
        this.isConst = isConst;
        this.length = 0;
        this.items = null;
    }

    @Override
    public String toString() {
        return "Global{" +
                "isConst=" + isConst +
                ",\n count=" + length +
                ",\n items='" + items + '\'' +
                '}';
    }
}
