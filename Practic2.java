enum Feeling {
    HAPPY, SAD, SURPRISED, HUNGRY;

    public boolean isHappy() {
        return this == HAPPY;
    }
}

enum Games {
    TANKS, ARCANOID, PACMAN, DIGGER;

    public boolean isTanks() {
        return this == TANKS;
    }
}

public class Practic2 {
    public static void main(String[] args) {
        System.out.println("Feeling:");
        for (Feeling f : Feeling.values()) {
            System.out.println(f + "->isHappy: " + f.isHappy());
        }

        System.out.println("\nGames:");
        for (Games g : Games.values()) {
            System.out.println(g + "->isTanks: " + g.isTanks());
        }
    }
}
