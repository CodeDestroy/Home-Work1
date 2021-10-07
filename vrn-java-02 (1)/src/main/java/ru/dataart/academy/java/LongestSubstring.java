package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        //Task implementation
        String subString = "";
        int maxLength = 0;
        int iCurr = 0;
        int i = 0;
        char currChar;
        while (i < checkString.length())
        {
            if (subString == "")
                iCurr = i;
            currChar = checkString.charAt(i);
            if (subString.indexOf(currChar) == -1) {
                subString += currChar;
                i++;
            }
            else{
                subString = "";
                i = iCurr + 1;
            }
            if (subString.length() > maxLength)
                maxLength = subString.length();
        }
        if (subString.length() > maxLength)
            return  subString.length();
        else
            return maxLength;
    }
}
