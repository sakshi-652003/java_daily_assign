class Demo{
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            char ch = 'A';
            char ch1 = 'a';
            for (int j = 0; j <= 3 ; j++) {
               
                if(j< 4 - i){
                    if(i%2!=0){
                        System.out.print(ch1+" ");
                        ch1++;
                    }else{
                        System.out.print(ch+" ");
                        ch++;
                    }
                                
                }
            }   
            System.out.println();
        
    }
}
}
