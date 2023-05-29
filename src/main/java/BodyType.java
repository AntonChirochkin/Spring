public enum BodyType {
    SEDAN("СЕДАН"),
    HATBACK("ХЕТЧБЭК"),
    COUPE("КУПЕ"),
    UNIVERSAL("УНИВЕРСАЛ"),
    JEEP("ВНЕДОРОЖНИК"),
    CROSSOVER("КРОССОВЕР"),
    PICKUP("ПИКАП"),
    VAN("ФУРГОН"),
    MINIVAN("МИНИВЭН");
    String bodyTape;

    BodyType(String bodyTape) {
        this.bodyTape = bodyTape;
    }

    public String getBodyTape() {
        return bodyTape;
    }

    @Override
    public String toString() {
        return bodyTape;
    }
}
