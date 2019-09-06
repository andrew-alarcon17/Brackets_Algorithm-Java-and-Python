string = "(([{}](){}))"


class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[len(self.items)-1]

    def size(self):
        return len(self.items)


def closed(text):
    if len(text) % 2 != 0:
        return False
    k = text[0]
    if k == ']' or k == '}' or k == ')':
        return False
    #print(k)

    s = Stack()
    for char in text:
        if char == '[' or char == '{' or char == '(':
            s.push(char)

        if char == ']' or char == '}' or char == ')':
            s.pop()
    return True

print(closed(string))
