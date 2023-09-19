package com.eronalves.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeNode<T> {
  public T value;
  public BinaryTreeNode<T> left;
  public BinaryTreeNode<T> right;

  public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right){
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public BinaryTreeNode(T value){
    this(value, null, null);
  }
}
