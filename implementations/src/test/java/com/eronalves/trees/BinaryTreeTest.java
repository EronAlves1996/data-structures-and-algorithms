package com.eronalves.trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BinaryTreeTest {

  private PrintStream println;

  private ByteArrayOutputStream mockPrintln(){
    ByteArrayOutputStream bo = new ByteArrayOutputStream();

    // store the default instance here, to restore after
    println = System.out;
    System.setOut(new PrintStream(bo));

    return bo;
  }

  @AfterEach
  public void restorePrintln (){
    System.setOut(println);
  }

  @Test
  public void inOrderTraversalTest() throws IOException {
    ByteArrayOutputStream bo = mockPrintln();

    BinaryTree<Integer> integerBinaryTree = new BinaryTree<>();
    integerBinaryTree.root = new BinaryTreeNode<>(1);
    var root = integerBinaryTree.root;
    root.left = new BinaryTreeNode<>(2);
    root.right = new BinaryTreeNode<>(3);

    integerBinaryTree.inOrderTraversal();

    bo.flush();
    String printedOut = new String(bo.toByteArray());

    // /r/n is windows default format for line carrier
    Assertions.assertEquals("2\r\n1\r\n3\r\n", printedOut);
  }
}
