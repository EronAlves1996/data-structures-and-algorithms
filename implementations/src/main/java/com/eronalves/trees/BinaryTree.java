package com.eronalves.trees;

import com.eronalves.lists.Position;

/**
 * BinaryTree
 */
public interface BinaryTree<E> extends Tree<E> {

  Position<E> left(Position<E> p) throws IllegalArgumentException;

  Position<E> right(Position<E> p) throws IllegalArgumentException;

  Position<E> sibling(Position<E> p) throws IllegalArgumentException;

}
