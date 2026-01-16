int maxNumberOfBalloons(char* text) {
    char frq[] = {'b','a','l','o','n'};
    int freq[] = {0,0,0,0,0};
    for(int i = 0 ; i < strlen(text)  ; i++){
        for(int j = 0 ; j < 5; j++){
            if(text[i] == frq[j]){
                freq[j]++;
            }
        }
    }
    int count = 0 ;
    while(true){
        if(freq[0] >=1 && freq[1] >=1 && freq[2]>=2 && freq[3] >= 2 && freq[4] >=1){
            count++;
            freq[0]--;
            freq[1]--;
            freq[2]--;freq[2]--;
            freq[3]--;freq[3]--;
            freq[4]--;
        }
        else{
            break;
        }
    }
    return count;
}