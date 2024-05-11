package org.example;

public class TreeFiller {
    public static Tree<Integer> createTree(int count) {
        Tree<Integer> tree = new Tree<>();
        for (int i = 0; i < count; i++) {
            tree.add(i);
        }
        return tree;
    }
}
