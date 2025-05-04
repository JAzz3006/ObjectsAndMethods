package cmp;

public class Keyboard {
    private final KeyboardType keyboardType;
    private final KeyboardLights keyboardLights;
    private final float keyboardMass;

    public Keyboard(KeyboardType keyboardType, KeyboardLights keyboardLights, float keyboardMass) {
        this.keyboardType = keyboardType;
        this.keyboardLights = keyboardLights;
        this.keyboardMass = keyboardMass;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public KeyboardLights getKeyboardLights() {
        return keyboardLights;
    }

    public float getKeyboardMass() {
        return keyboardMass;
    }

    @Override
    public String toString() {
        return "Клавиатура: " +
                "Тип: " + keyboardType +
                ", подсветка: " + keyboardLights +
                ", масса: " + keyboardMass + " кг";
    }
}
