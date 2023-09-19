package com.eronalves.trees;

public class BinaryTree<T> {
  public BinaryTreeNode<T> root;

  public void inOrderTraversal(){
    inOrderTraversalHelper(root);
  }

  public void preOrderTraversal(){
    preOrderTraversalHelper(root);
  }

  private void preOrderTraversalHelper(BinaryTreeNode<T> node){
    if(node != null){
      visit(node);
      preOrderTraversalHelper(node.left);
      preOrderTraversalHelper(node.right);
    }
  }

  private void inOrderTraversalHelper(BinaryTreeNode<T> node){
    if(node != null){
      inOrderTraversalHelper(node.left);
      visit(node);
      inOrderTraversalHelper(node.right);
    }
  }


  private void visit(BinaryTreeNode<T> node){
    System.out.println(node.value);
  }
}
