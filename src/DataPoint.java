public class DataPoint {
    private String text;
    private String label = "";

    public DataPoint(String text, String label) {
        this.text = text;
        this.label = label;
    }

    public String getText() {
        return text;
    }
    public boolean hasLabel(){
        if(!label.equals("")) return true;
        return false;
    }
    public String getLabel() {
        return label;
    }
}
