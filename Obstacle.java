public abstract class Obstacle {
    private float size;
    private String type;
    private String action;

    Obstacle(String type, String action, float size) {
        this.type = type;
        this.action = action;
        this.size = size;
    }

    String getType() { return this.type; }
    String getAction() { return this.action; }
    float getSize() { return this.size; }

}
