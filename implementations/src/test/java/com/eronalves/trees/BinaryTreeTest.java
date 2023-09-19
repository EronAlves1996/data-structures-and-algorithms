package com.eronalves.trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BinaryTreeTest {

  private PrintStream println;
  private BinaryTree<Integer> bt;


  private ByteArrayOutputStream mockPrintln(){
    ByteArrayOutputStream bo = new ByteArrayOutputStream();

    // store the default instance here, to restore after
    println = System.out;
    System.setOut(new PrintStream(bo));

    return bo;
  }

  @BeforeEach
  public void setupBasicTree(){
    bt = new BinaryTree<>();
    var btn = new BinaryTreeNode<>(1);
    btn.left = new BinaryTreeNode<>(2);
    btn.right = new BinaryTreeNode<>(3);
    bt.root = btn;
  }

  @AfterEach
  public void restorePrintln (){
    System.setOut(println);
  }

  @Test
  public void inOrderTraversalTest() throws IOException {
    ByteArrayOutputStream bo = mockPrintln();

    bt.inOrderTraversal();

    bo.flush();
    String printedOut = new String(bo.toByteArray());

    // /r/n is windows default format for line carrier
    Assertions.assertEquals("2\r\n1\r\n3\r\n", printedOut);
  }

  @Test
  public void preOrderTraversal() throws IOException {
    ByteArrayOutputStream bo = mockPrintln();

    bt.preOrderTraversal();

    bo.flush();

    String printedOut = new String(bo.toByteArray());

    Assertions.assertEquals("1\r\n2\r\n3\r\n", printedOut);
  }
}
