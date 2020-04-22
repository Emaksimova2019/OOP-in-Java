public abstract class Player {
    private String name;
    private String type;
    private float maxRun;
    private float maxJump;

    Player(String type, String name, float maxJump, float maxRun) {
        this.type = type;
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    String getName() { return this.name; }
    String getType() { return this.type; }

    float getMaxRun() { return this.maxRun; }
    float getMaxJump() { return this.maxJump; }

    protected boolean run_distance(float distance) { return (distance <= maxRun); }
    protected boolean jump_height(float height) { return (height <= maxJump); }

    public void run() {
        System.out.println(name+" бежит");
    }
    public void jump() {
        System.out.println(name+" прыгает");
    }
}
