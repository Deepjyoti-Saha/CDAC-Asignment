class SpecialCoding10 {
    public static void main(String [] args) {
		String S = "ABCxyz";
		String J = "ABC";
       
        int count = 0;

        for(int i=0; i< S.length(); i++){
            for(int j=0; j<J.length(); j++){
                if(S.charAt(i) == J.charAt(j)){ //check if there's a match
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
		
    }
}
