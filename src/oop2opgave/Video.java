package oop2opgave;

class Video extends LoanItem {
    private int duration;

    public Video(String title, int duration) {
        super("Video", title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}



