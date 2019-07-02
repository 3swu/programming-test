import copy
class Solution:
    def reverseWords(self, s: str) -> str:
        l = s.split(' ')
        for i in l:
            i.replace(' ', '')
        str = ''
        lenth = len(l)
        for i in range(lenth):
            if l[-i-1] == '':
                continue
            else:
                str += l[-i-1]
                str += ' '
        st = copy.copy(str)
        st.rstrip()
        return st

if __name__ == '__main__':
    print(Solution().reverseWords("  hello world!  ")) 