class pattern15 {
    public static void main(String[] args) {
        // Use nested for loops to print the given pattern
    	 
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= abs(i - 5); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (i - j) == 0 || (i + j)==10) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int abs(int num) {
        if (num >= 0) {
            return num;
        } else {
            num *= -1;
        }
        return num;
    }
}
