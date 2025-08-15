class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for (String email : emails) {
            int at = email.indexOf('@');
            String l = email.substring(0, at);
            String d = email.substring(at);
            int p = l.indexOf('+');
            if (p!= -1) {
                l = l.substring(0, p);
            }
            l= l.replace(".", "");
            unique.add(l + d);
        }
        return unique.size();
    }
}