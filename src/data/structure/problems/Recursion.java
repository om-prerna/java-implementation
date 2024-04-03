package data.structure.problems;

public class Recursion {


    public static void main(String args[]){
       //System.out.println(squareSum(5));

        TreeNode root = new TreeNode(5, new TreeNode(4,new TreeNode(2), null),
                new TreeNode(6, new TreeNode(8),new TreeNode(7)));
        System.out.println(isValidBST(root));
    }
    static int squareSum(int n){
        int sum =0;
        if(n ==1 ) return 1;
         sum += n*n;
         return sum+= squareSum(n-1);
    }

    static boolean isValidBST(TreeNode root) {
        boolean result = false;
        System.out.println(result + " " + root.val);
        if(root == null) return true;

        TreeNode temp = root;
        int  min,max =0;
        TreeNode left = temp.left;
        TreeNode right = temp.right;
        if(left == null && right == null)
            return true;
        else if(left != null && right == null){
            if(left.val < temp.val)
                return  isValidBST(left) ;
            else
                return false;
        }
        else if(left == null && right != null){
            if(right.val > temp.val)
                return isValidBST(right);
            else
                return false;
        }
        else if(left != null && right != null){
            if(left.val < temp.val  && right.val  > temp.val){
                result = isValidBST(left) && isValidBST(right);
                Integer.toString(1);
            }
            else
                return false;
        }


        return result;
    }
}

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
  }
