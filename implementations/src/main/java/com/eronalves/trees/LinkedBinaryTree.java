package com.eronalves.trees;

import java.util.Iterator;

import com.eronalves.lists.Position;

/**
 * LinkedBinaryTree
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

  protected static class Node<E> implements Position<E> {
    private E element;
    private Node<E> parent;
    private Node<E> left;
    private Node<E> right;

    public Node<E> getParent() {
      return parent;
    }

    public void setParent(Node<E> parent) {
      this.parent = parent;
    }

    public Node<E> getLeft() {
      return left;
    }

    public void setLeft(Node<E> left) {
      this.left = left;
    }

    public Node<E> getRight() {
      return right;
    }

    public void setRight(Node<E> right) {
      this.right = right;
    }

    public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
      element = e;
      parent = above;
      left = leftChild;
      right = rightChild;
    }

    @Override
    public E getElement() throws IllegalStateException {
      return element;
    }

    public void setElement(E element) {
      this.element = element;
    }

  }

  protected Node<E> createNode(E e, Node<E> parent, Node<E> left,
      Node<E> right) {
    return new Node<E>(e, parent, left, right);
  }

  protected Node<E> root = null;
  private int size = 0;

  public LinkedBinaryTree() {
  }

  protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
    if (!(p instanceof Node))
      throw new IllegalArgumentException("Not valid position type");
    Node<E> node = (Node<E>) p;
    if (node.getParent() == node)
      throw new IllegalArgumentException("p is no longer in the tree");
    return node;
  }

  @Override
  public Position<E> left(Position<E> p) throws IllegalArgumentException {
    Node<E> node = validate(p);
    return node.getLeft();
  }

  @Override
  public Position<E> right(Position<E> p) throws IllegalArgumentException {
    Node<E> node = validate(p);
    return node.getRight();
  }

  @Override
  public Position<E> root() {
    return root;
  }

  @Override
  public Position<E> parent(Position<E> p) throws IllegalArgumentException {
    Node<E> node = validate(p);
    return node.getParent();
  }

  @Override
  public int size() {
    return size;
  }

  public Position<E> addRoot(E e) throws IllegalStateException {
    if (!isEmpty()) throw new IllegalStateException("Tree is not empty");
    root = createNode(e, null, null, null);
    size = 1;
    return root;
  }

  public Position<E> addLeft(Position<E> p, E e) {
    Node<E> parent = validate(p);
    if (parent.getLeft() != null)
      throw new IllegalArgumentException("P already has a left child");
    Node<E> child = createNode(e, parent, null, null);
    parent.setLeft(child);
    size++;
    return child;
  }

  public Position<E> addRight(Position<E> p, E e) {
    Node<E> parent = validate(p);
    if (parent.getRight() != null)
      throw new IllegalArgumentException("P already has a right child");
    Node<E> child = createNode(e, parent, null, null);
    parent.setRight(child);
    size++;
    return child;
  }

  public E set(Position<E> p, E e) {
    Node<E> node = validate(p);
    E temp = node.getElement();
    node.setElement(e);
    return temp;
  }

  public void attach(Position<E> p, LinkedBinaryTree<E> t1,
      LinkedBinaryTree<E> t2) {
    Node<E> node = validate(p);
    if (isInternal(p)) throw new IllegalArgumentException("p must be a leaf");
    size += t1.size() + t2.size();
    if (!t1.isEmpty()) {
      t1.root.setParent(node);
      node.setLeft(t1.root);
      t1.root = null;
      t1.size = 0;
    }

    if (!t2.isEmpty()) {
      t2.root.setParent(node);
      node.setRight(t2.root);
      t2.root = null;
      t2.size = 0;
    }
  }

  public E remove(Position<E> p) {
    Node<E> node = validate(p);
    if (numChildren(p) == 2)
      throw new IllegalArgumentException("p has two children");
    Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight());

    if (child != null) child.setParent(node.getParent());
    if (node == root)
      root = child;
    else {
      Node<E> parent = node.getParent();
      if (node == parent.getLeft())
        parent.setLeft(child);
      else
        parent.setRight(child);
    }

    size--;
    E temp = node.getElement();
    node.setElement(null);
    node.setLeft(null);
    node.setRight(null);
    node.setParent(node);
    return temp;
  }

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public Iterable<Position<E>> positions() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'positions'");
  }

}
