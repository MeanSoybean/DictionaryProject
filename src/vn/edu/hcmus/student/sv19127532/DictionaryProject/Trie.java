package vn.edu.hcmus.student.sv19127532.DictionaryProject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Trie class implementation for Dictionary.
 */
public class Trie {

}

/**
 * Node class implementation for Trie.
 */
class Node {
    /**
     * The entries of words/definitions associated with this node.
     */
    private final ArrayList<Entry> entries;

    /**
     * The children of this node, accessed by character.
     */
    private final HashMap<Character, Node> children;
    /**
     * Go to the next node.
     * @param nextChar the next character in the trie.
     * @return the next node
     */
    public Node Descend(char nextChar) {
        throw new UnsupportedOperationException();
    }

    /**
     * Constructor
     */
    Node() {
        entries = new ArrayList<>();
        children = new HashMap<>();
    }
}