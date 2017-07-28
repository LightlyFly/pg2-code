public Object clone() {
    try {
        Car cloned = (Car) super.clone();
        cloned.engine = (Engine) engine.clone();
        return cloned;
    } catch(CloneNotSupportedException ex) {
        return null;
    }
}