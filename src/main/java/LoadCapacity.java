public enum LoadCapacity {
    N1(0f, 3.5f),
    N2(3.6f, 12f),
    N3(12.1f, 100f);
    private Float loadMin;
    private Float loadMax;

    LoadCapacity(Float loadMin, Float loadMax) {
        this.loadMin = loadMin;
        this.loadMax = loadMax;
    }

    public float getLoadMin() {
        return loadMin;
    }
    public float getLoadMax() {
        return loadMax;
    }


    @Override
    public String toString() {
        return  " от " + loadMin +
                ", до " + loadMax + " " + super.toString();
    }

}

