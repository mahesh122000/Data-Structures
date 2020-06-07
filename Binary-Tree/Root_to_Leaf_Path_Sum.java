 boolean hasPathSum(Node node, int sum) {
        if(node==null)
        return false;
        if(sum==node.data && node.left==null && node.right==null)
        return true;
        return hasPathSum(node.left,sum-node.data)|hasPathSum(node.right,sum-node.data);
    }