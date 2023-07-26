package com.semye.base.arithmetic.sort;

import java.util.Stack;

/**
 * Created by yesheng on 2021/3/23
 * 二叉树遍历
 */
public class TreeNodeTest {


    public static void main(String[] args) {
//        lnr(createTree());
        test(createTree());
        System.out.println("======");
//        nlr(createTree());
        nlr2(createTree());
//        getHeight();
    }


    public static TreeNode createTree() {
        TreeNode treeNode = new TreeNode();
        treeNode.value = 44;
        TreeNode newlast = new TreeNode();
        newlast.value = 999;
        TreeNode node1 = new TreeNode();
        node1.value = 11;
        node1.left = newlast;
        TreeNode node2 = new TreeNode();
        node2.value = 9;
        TreeNode node3 = new TreeNode();
        node3.value = 2;
        TreeNode node4 = new TreeNode();
        node4.value = 99;
        TreeNode node5 = new TreeNode();
        node5.value = 12;
        TreeNode node6 = new TreeNode();
        node6.value = 113;
        node6.left = node3;
        node6.right = node4;
        node5.left = node1;
        node5.right = node2;
        treeNode.left = node6;
        treeNode.right = node5;
        return treeNode;
    }


    /**
     * 获取二叉树的高度
     * 递归法
     */
    public static void getHeight() {
        TreeNode root = createTree();
        int height = getTreeHeight(root);
        System.out.println(height);
    }

    public static int getTreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getTreeHeight(root.left);
        int right = getTreeHeight(root.right);
        return Math.max(left, right) + 1;
    }


    /**
     * 先序遍历 非递归实现
     * N node
     * L left
     * R right
     */
    public static void nlr(TreeNode treeNode) {
        if (treeNode == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || treeNode != null) {
            while (treeNode != null) {
                System.out.println(treeNode.value);
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            treeNode = stack.pop();
            treeNode = treeNode.right;
        }
    }

    /**
     * 先序遍历
     * 使用栈
     *
     * @param treeNode
     */
    public static void nlr2(TreeNode treeNode) {
        if (treeNode == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode treeNode1 = stack.pop();
            System.out.println(treeNode1.value);
            if (treeNode1.right != null) {
                stack.push(treeNode1.right);
            }
            if (treeNode1.left != null) {
                stack.push(treeNode1.left);
            }
        }
    }

    /**
     * 中序遍历
     *
     * @param treeNode
     */
    public static void lnr(TreeNode treeNode) {
        if (treeNode == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || treeNode != null) {
            while (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            treeNode = stack.pop();
            System.out.println(treeNode.value);
            treeNode = treeNode.right;
        }
    }


    public static void test(TreeNode treeNode) {
        if (treeNode == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || treeNode != null) {
            while (treeNode != null) {
                stack.push(treeNode);
                System.out.println(treeNode.value);
                treeNode = treeNode.left;
            }
            treeNode = stack.pop();
            treeNode = treeNode.right;
        }
    }

    /**
     * @param treeNode
     */
    public static void lrn(TreeNode treeNode) {
        if (treeNode == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (!stack.isEmpty() || treeNode != null) {
            while (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            treeNode = stack.pop();
            if (treeNode.right == null || treeNode.right == prev) {
                System.out.println(treeNode.value);
                prev = treeNode;
                treeNode = null;
            } else {
                stack.push(treeNode);
                treeNode = treeNode.right;
            }
        }
    }
}
