package Cat;

class Cat {
    private String chipId;
    private boolean registered;

    public Cat(String chipId) {
        this.chipId = chipId;
        this.registered = false;
    }

    public String getChipId() {
        return chipId;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void register() {
        registered = true;
    }
}