package oop2opgave;

class LoanItem {
    private String type;
    private String title;

    public LoanItem(String type, String title) {
        this.type = type;
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}