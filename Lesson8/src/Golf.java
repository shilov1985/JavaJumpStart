public class Golf {

    private static int ballsQuantity;

    public static void main(String[] args) {
        ballsQuantity = 20;

        GroupOfPlayes group1 = new GroupOfPlayes(2);
        group1.register();
        GroupOfPlayes group2 = new GroupOfPlayes(5);
        group2.register();
        GroupOfPlayes group3 = new GroupOfPlayes(3);
        group3.register();
        group1.unRegister();
        GroupOfPlayes group4 = new GroupOfPlayes(4);
        group4.register();
        GroupOfPlayes group5 = new GroupOfPlayes(6);
        group5.register();
        group2.reRegister(2);

        System.out.println("ballsQuantity = "+ballsQuantity);
    }

    public static class GroupOfPlayes {
        private int players;

        public GroupOfPlayes(int players) {
            super();
            this.players = players;
        }

        public void reRegister(int players) {
            System.out.println("We re-register " + players
                    + " playes of this group.");
            ballsQuantity += this.players;
            ballsQuantity -= players;

        }

        public void unRegister() {
            System.out.println("We unregister " + players + " playes.");
            ballsQuantity += players;

        }

        public void register() {
            System.out.println("We register " + players + " playes.");
            ballsQuantity -= players;
        }

    }
}
