class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    @staticmethod
    def serialize(node):
        if node is None:
            return "None"
        return node.val + "-" + Node.serialize(node.left) + "-" + Node.serialize(node.right)

    @staticmethod
    def deserialize(s=None, vals=None):
        if s is None and vals is None:
            raise Exception("Both parameters are None.")
        if vals is None and s:
            vals = s.split('-') # convert serialize string to array
        val = vals.pop(0) # get and remove the first index

        if val == "None":
            return None

        node = Node(val)
        node.left = Node.deserialize(vals=vals)
        node.right = Node.deserialize(vals=vals)

        return node
        
if __name__ == "__main__":
    node = Node('root', Node('left', Node('left.left')), Node('right'))
    assert Node.deserialize(Node.serialize(node)).left.left.val == "left.left", "TEST FAILED"
    print("TEST PASSED")
    