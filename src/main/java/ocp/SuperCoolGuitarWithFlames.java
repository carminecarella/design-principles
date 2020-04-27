package ocp;

public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    public SuperCoolGuitarWithFlames(String make, String model, int volume) {
        super(make, model, volume);
    }

    public String getFlameColor() {
        return flameColor;
    }
}
