package com.eronalves.lists;

/**
 * Position
 */
public interface Position<E> {

  E getElement() throws IllegalStateException;

}
