
Node = function(val, left=null, right=null) {
    this.val = val;
    this.left = left;
    this.right = right;

};

Node.prototype =  function() {
    function serialize(node=this) {
        if (node === null) {
            return "null"
        }

        return `${node.val}-${node.serialize(node.left)}-${node.serialize(node.right)}`
    }

    function deserialize(s=null, vals=null) {
        if (s === null && vals === null) {
            throw "Both parameters are null."
        }

        if (vals === null && typeof(s) === "string") {
            vals = s.split('-');
        }

        val = vals.shift()
        if (val === "null") {
            return null
        }
        var node = new Node(val);
        node.left = node.deserialize(s=null, vals=vals);
        node.right = node.deserialize(s=null, vals=vals);

        return node;
    }

    return {
        serialize: serialize,
        deserialize: deserialize
    }
}();

var node = new Node('root', new Node('left', new Node('left.left')), new Node('right'))
var serial = node.serialize();
if (node.deserialize(node.serialize()).left.left.val === "left.left") {
    console.log("TEST PASSED")
}
else {
    console.log("TEST FAILED")
}