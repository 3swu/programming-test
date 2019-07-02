class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []
        self.min = 0
        self.length = 0

    def push(self, x: int) -> None:
        if self.length == 0:
            self.min = x
        self.stack.append(x)
        self.length += 1
        if x < self.min:
            self.min = x


    def pop(self) -> None:
        top = self.stack.pop()
        self.length -= 1
        if top == self.min:
            self.min = min(self.stack) if self.length != 0 else 0
        return top
        

    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.min
        