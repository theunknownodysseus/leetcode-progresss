/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        if(node.neighbors.size() == 0){
            Node node1 = new Node(node.val);
            return node1;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node node1 = new Node(node.val);
        
        map.put(node, node1);
        for(Node curr : node.neighbors){
            node1.neighbors.add(cloneGraph(curr));
        }
        return node1;
    }
}