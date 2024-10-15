class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        num_str = str(x)
        
        return num_str == num_str[::-1]