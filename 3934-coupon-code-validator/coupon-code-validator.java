class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int[] ind = new int[100];
        String[] valid = {"electronics", "grocery", "pharmacy", "restaurant"};
        List<String> res = new ArrayList<>();
        
        List<String> elect = new ArrayList<>();
        List<String> groc = new ArrayList<>();
        List<String> phar = new ArrayList<>();
        List<String> rest = new ArrayList<>();

        for( int i = 0 ; i < code.length ; i++){
            if ((code[i].matches("^\\w+$")) && (Arrays.asList(valid).contains(businessLine[i]) && isActive[i])) {
                if(businessLine[i].equals("electronics")){
                    elect.add(code[i]);
                }
                else if(businessLine[i].equals("grocery")){
                    groc.add(code[i]);
                }
                else if(businessLine[i].equals("pharmacy")){
                    phar.add(code[i]);
                }
                else{
                    rest.add(code[i]);
                }
            }
        }
        Collections.sort(elect);
        Collections.sort(groc);
        Collections.sort(phar);
        Collections.sort(rest);

        res.addAll(elect);
        res.addAll(groc);
        res.addAll(phar);
        res.addAll(rest);
        return res;
    }
}