class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> res = new ArrayList();
        
        List<String> elect = new ArrayList();
        List<String> groc = new ArrayList();
        List<String> phar = new ArrayList();
        List<String> rest = new ArrayList();

        for( int i = 0 ; i < isActive.length ; i++){
            if (isActive[i]) {
                if(businessLine[i].equals("electronics") 
                    || businessLine[i].equals("grocery")
                  || businessLine[i].equals("pharmacy")
                  || businessLine[i].equals("restaurant")){
                    
                if(code[i].length() == 0){
                    continue;
                }

                boolean crt = true;
                for(int j = 0 ;j<code[i].length() ; j++){
                    char ch = code[i].charAt(j);
                    if(!Character.isLetterOrDigit(ch) && ch!='_'){
                        crt = false;
                        break;
                    }
                }
                
                if(crt){
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