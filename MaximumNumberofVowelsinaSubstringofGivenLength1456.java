/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Daniel Ochoa
 */
public class MaximumNumberofVowelsinaSubstringofGivenLength1456 {

    public void MaximumNumberofVowelsinaSubstringofGivenLength1456() {
        String s = "tryhard";
        int k = 4;
        int iMaximunVowels = counterVowels(s.substring(0, k));
//        System.out.println(iMaximunVowels + " " + s.substring(0, k));
        int iSub = iMaximunVowels;
        for (int i = k; i < s.length(); i++) {
            if (verifyVowels(s.charAt(i - k)) == true) {
                iSub--;
            }
            if (verifyVowels(s.charAt(i)) == true) {
                iSub++;
            }
            if (iSub > iMaximunVowels) {
                iMaximunVowels = iSub;
            }
        }
        System.out.println(iMaximunVowels);
    }

    public int counterVowels(String sValue) {
        int iCounter = 0;
        for (char c : sValue.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                iCounter++;
            }
        }
        return iCounter;
    }

    public boolean verifyVowels(char cValue) {
        char cArrVowels[] = {'a', 'e', 'i', 'o', 'u'};
        for (char cArrVowel : cArrVowels) {
            if (cValue == cArrVowel) {
                return true;
            }
        }
        return false;
    }
}
