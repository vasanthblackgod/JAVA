class Solution
{
    public String reverseVowels(String s) {
        <Character> vowels = new <Character>();
        addAll(vowels, 'a','e','i','o','u');
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (!vowels.contains(chars[left])) {
                left ++;
                continue;
            }
            if (!vowels.contains(chars[right])) {
                right --;
                continue;
            }
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left ++;
            right --;
        }
        return new String(chars);
    }
}
