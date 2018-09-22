class GfG
{
	public int remAnagrams(String s,String s1)
        {
            int count = 0;
            int a[] = new int[26];
            for(char c : s.toCharArray())
                a[c-'a']++;
            for(char c : s1.toCharArray())
                a[c-'a']--;
            for(int i=0;i<26;i++)
                count+=Math.abs(a[i]);
            return count;
        }
}

https://practice.geeksforgeeks.org/problems/anagram-of-string/1/?ref=self
