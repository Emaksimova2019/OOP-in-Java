import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class Start {
    public static void main(String[] args) {

        Player human = new Human("Иван", 2, 2);
        Player cat = new Cat("Рыжик", 2, 3);
        Player robot = new Robot("R2D2", 1, 2);

        Obstacle runRoad = new RunRoad(3);
        Obstacle wall = new Wall(2);

        Player[] players = {human, cat, robot};
        Obstacle[] obstacles = {runRoad, wall};

        for (Player player : players) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.getType() == "RunRoad") {
                    System.out.print(player.getType() + " " + player.getName() + " can MAX " + obstacle.getAction());
                    System.out.print(" " + player.getMaxRun() + "km. Tries to " + obstacle.getAction() + " " + obstacle.getSize());
                    System.out.println("km. Total - " + ((player.run_distance(obstacle.getSize())) ? "succeed." : "fails."));
                }
                if (obstacle.getType() == "Wall") {
                    System.out.print(player.getType() + " " + player.getName() + " can MAX " + obstacle.getAction());
                    System.out.print(" " + player.getMaxJump() + "m. Tries to " + obstacle.getAction() + " " + obstacle.getSize());
                    System.out.println("m. Total - " + ((player.jump_height(obstacle.getSize())) ? "succeed." : "fails."));
                }
            }
        }

        for (Player player : players) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.getType() == "RunRoad") {
                    System.out.print(player.getType() + " " + player.getName() + " can MAX " + obstacle.getAction());
                    System.out.print(" " + player.getMaxRun() + "km. Tries to " + obstacle.getAction() + " " + obstacle.getSize());
                    System.out.println("km. Total - " + ((player.run_distance(obstacle.getSize())) ? "succeed. " : "fails. "));
                }
                if (obstacle.getType() == "Wall") {
                    System.out.print(player.getType() + " " + player.getName() + " can MAX " + obstacle.getAction());
                    System.out.print(" " + player.getMaxJump() + "m. Tries to " + obstacle.getAction() + " " + obstacle.getSize());
                    System.out.println("m. Total - " + ((player.jump_height(obstacle.getSize())) ? "succeed." : "fails."));
                }
                if (!(player.run_distance(obstacle.getSize()))) {
                    System.out.println(player.getType() + " " + player.getName() + " don`t play.");
                    break;
                }
            }
        }
    }
}