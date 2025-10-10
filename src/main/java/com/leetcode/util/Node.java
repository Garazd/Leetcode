package com.leetcode.util;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return equals((Node) o, new IdentityHashMap<>());
    }

    private boolean equals(final Node other, final Map<Node, Boolean> visited) {
        if (visited.containsKey(this)) {
            return true;
        }
        visited.put(this, Boolean.TRUE);

        if (val != other.val) {
            return false;
        }

        final boolean nextEqual =
                (next == null && other.next == null)
                        || (next != null && other.next != null && next.equals(other.next, visited));

        final boolean randomEqual =
                (random == null && other.random == null)
                        || (random != null && other.random != null && random.equals(other.random, visited));

        return nextEqual && randomEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
