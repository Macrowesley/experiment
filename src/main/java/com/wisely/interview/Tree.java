package com.wisely.interview;

import java.util.Scanner;
import java.util.Stack;

class Build {
        private static class Node {
            char val;
            Node left;
            Node right;

            public Node(char val) {
                this.val = val;
            }
        }
        //根据已有的字符串(前序遍历的字符串已告知)创建一颗二叉树
        public static int i=0;
        public static Node buildTree(String str) {
            Node root=null;
            if(str.charAt(i)!='{'){ //在不用定义数组的前提下，用该方法str.charAt(i)获取当前下标所对应的字符
                root=new Node(str.charAt(i));//相当于是把字符值封装到一个结点，赋给root
                i++;
                if(str.charAt(i-1)=='{'){
                    root.left=buildTree(str);
                }else if(str.charAt(i-1)==','){
                    root.right=buildTree(str);
                }

            }else{
                i++;
            }
            return root;
        }
        //中序遍历：
        public static void inOrderTraversalNor(Node root) {
            if (root == null) {
                return;
            }
            Stack<Node> stack = new Stack<>();
            Node cur = root;
            while (cur != null||!stack.empty()) {
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                Node top = stack.pop();
                System.out.print(top.val + " ");
                cur = top.right;
            }
        }
        /*public static void main(String[] args) {
            Node root=buildTree("ABC##DE#G##F###");

            System.out.printf("中序遍历：");
            inOrderTraversalNor(root);
            System.out.println();

            System.out.printf("后序遍历：");
            postOrderTraversalNor(root);
            System.out.println();
        }*/
        //还有一种是需要自己去输入字符串的
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
//            while(input.hasNext()){
            do{
                String str=input.nextLine();
                Node root=buildTree(str);

                inOrderTraversalNor(root);
                System.out.println();
            }while (false);
        }
}
