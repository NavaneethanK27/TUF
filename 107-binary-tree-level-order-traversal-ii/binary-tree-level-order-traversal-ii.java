class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            int size = q.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = q.poll();

                temp.add(current.val);

                if (current.left != null) {
                    q.offer(current.left);
                }

                if (current.right != null) {
                    q.offer(current.right);
                }
            }

            result.add(temp);
        }

        Collections.reverse(result);

        return result;
    }
}