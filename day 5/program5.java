 class Pattern2 {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print("*" + num);
                num++;
            }
            System.out.println();
        }
    }
}
