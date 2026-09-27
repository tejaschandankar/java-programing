public class array {
    public static void main(String[] args) {
        int[] rollnum = new int[3];
        rollnum[0] = 101;
        rollnum[1] = 102;
        rollnum[2] = 103;
        // System.out.println(rollnum[0]);
        // System.out.println(rollnum[1]);
        // System.out.println(rollnum[2]);

        // System.out.println(rollnum.length);
        for (int i = 0; i < rollnum.length; i++) {
            System.out.println(rollnum[i]);

        }
        System.out.println(rollnum.length);
    }
}