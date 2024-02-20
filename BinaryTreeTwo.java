import java.util.*;
public class BinaryTreeTwo {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    // public static int height(Node root){
    //     if(root==null){
    //         return 0;
    //     }

    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     return Math.max(lh,rh)+1;
        
    // }

    // public static int count(Node root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int lcount=count(root.left);
    //     int rcount=count(root.right);
    //     int c=lcount +rcount +1;
    //     return c;
    // }

    // public static int sum(Node root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int lsum=sum(root.left);
    //     int rsum=sum(root.right);
    //     int treesum=lsum+rsum+root.data;
    //     return treesum;
    // }
    // public static int diameter(Node root){//---->o(n2)
    //     if(root==null){
    //         return 0;
    //     }
    //     int leftdia=diameter(root.left);
    //     int rightdia=diameter(root.right);
    //     int lht=height(root.left);
    //     int rht=height(root.right);

    //     int selfdia=lht+rht+1;
    //     return Math.max(selfdia,Math.max(leftdia,rightdia));
    // }
    // static class info{
    //     int dia;
    //     int ht;
    //     public info(int dia,int ht){
    //         this.dia=dia;
    //         this.ht=ht;
    //     }
    // }
    // public static info Diameter(Node root){//---->o(n)
    //     if(root==null){
    //         return new info(0,0);
    //     }
        
    //     info leftinfo=Diameter(root.left);
    //     info rightinfo=Diameter(root.right);
    //     int dia=Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht+1);
    //     int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
    //     return new info(dia,ht);
    // }


    public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }

        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;


    }

    public static boolean isSubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }

        return isSubtree(root.left,subroot) ||isSubtree(root.right,subroot);
    }

    static class Info{
        Node node;
        int hd;
         
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }


    public static void topview(Node root){
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();

        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{ 
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
           
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();

    }

        public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);

        // System.out.println(height(root));
        
        
        // System.out.println(count(root));
        
        
        // System.out.println(sum(root));

        // System.out.println(diameter(root));
        
        // System.out.println(Diameter(root).dia);

        System.out.println(isSubtree(root,subroot));

        // topview(root);
    }
}
