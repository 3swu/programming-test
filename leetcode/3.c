int lengthOfLongestSubstring(char * s){
    int length = strlen(s);
    if(length == 0)
        return 0;
    int flagarray[length];
    for(int i = 0; i < length; i++) {
        if(i == 0)
            flagarray[i] = 1;
        else {
            int j = 1;
            for(; j <= flagarray[i - 1]; j++) {
                if(s[i - j] == s[i])
                    break;
            }
            flagarray[i] = j;
        }
    }
    int max = 0;
    for(int i = 0; i < length; i++) {
        if(flagarray[i] > max)
            max = flagarray[i];
    }
    return max;
}
