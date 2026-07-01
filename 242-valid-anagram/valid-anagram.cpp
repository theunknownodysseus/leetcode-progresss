
class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()){
            return false;
        }
        map<char, int> map1;
        for(char i : s){
                map1[i]++;
        }
        for(char i : t){
            if(map1.find(i) == map1.end() || map1[i] == 0){
                    return false;
                }
                map1[i]--;
            }
        return true;
    }
};