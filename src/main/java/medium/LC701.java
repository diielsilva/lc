package medium;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class LC701 {
    TreeNode insertIntoBST(TreeNode root, int value) {
        TreeNode aux = root;
        TreeNode prev = null;

        if (root != null) {
            while (aux != null) {
                prev = aux;

                if (value > aux.val) {
                    aux = aux.right;
                } else {
                    aux = aux.left;
                }
            }

            if (value > prev.val) {
                prev.right = new TreeNode(value);
            } else {
                prev.left = new TreeNode(value);
            }
        } else {
            root = new TreeNode(value);
        }


        return root;
    }
}

