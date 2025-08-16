class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int[] digitsArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digitsArray[i] = Character.getNumericValue(s.charAt(i));
        }
        for(int i = 0; i < digitsArray.length; i++){
            if(digitsArray[i] == 6){
                digitsArray[i] = 9;
                break;
            }
        }
        num = 0;
        for (int digit : digitsArray) {
            num = num * 10 + digit;
        }
        return num;
    }
}