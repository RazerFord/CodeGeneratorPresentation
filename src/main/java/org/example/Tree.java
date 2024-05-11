package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Tree<T> {
    private Node<T> root;

    public T get(int i) {
        Deque<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> node = queue.poll();
            if (0 == i) {
                return node.value;
            }
            i--;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return null;
    }

    public void add(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            Deque<Node<T>> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node<T> node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                } else {
                    node.left = new Node<>(value);
                    return;
                }
                if (node.right != null) {
                    queue.add(node.right);
                } else {
                    node.right = new Node<>(value);
                    return;
                }
            }
        }
    }

    private static class Node<T> {
        private final T value;
        private Node<T> left;
        private Node<T> right;

        private Node(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(value, node.value) && Objects.equals(left, node.left) && Objects.equals(right, node.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree<?> tree = (Tree<?>) o;
        return Objects.equals(root, tree.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }
}
