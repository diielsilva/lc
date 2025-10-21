package easy;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class LC700 {
    TreeNode searchBST(TreeNode node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.val) {
            return searchBST(node.left, value);
        } else if (value > node.val) {
            return searchBST(node.right, value);
        }

        return node;
    }
}


