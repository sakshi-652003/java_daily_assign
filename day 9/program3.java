class Demo{
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            char ch = 'A';
            for (int j = 0; j <= 3 ; j++) {
               
                if(j< 4 - i){
                    System.out.print(ch+" ");
                    ch++;
                }
            }   
            System.out.println();
        
    }
}
}

