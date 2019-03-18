
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

def car(pair):
    return pair.__closure__[0].cell_contents

def cdr(pair):
    return pair.__closure__[1].cell_contents

if __name__ == "__main__":
    print(car(cons(3, 4)))
    print(cdr(cons(3, 4)))