class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()

        while n != 1:
            if n in seen:
                return False
            seen.add(n)
            res = 0
            # calculate sum of squares of digits
            res = 0
            temp = n
            while temp > 0:
                digit = temp % 10
                res += digit * digit
                temp = temp // 10

            n = res  # update n to next number in sequence

        return True
