package com.eronalves.trees;

import org.junit.jupiter.api.Test;

public class BinaryTreeTest {


  @Test
  public void inOrderTraversalTest(){
    BinaryTree<Integer> integerBinaryTree = new BinaryTree<>();
    integerBinaryTree.root = new BinaryTreeNode<>(1);
    var root = integerBinaryTree.root;
    root.left = new BinaryTreeNode<>(2);
    root.right = new BinaryTreeNode<>(3);

    integerBinaryTree.inOrderTraversal();
    // prints 2 1 3
  }
}
