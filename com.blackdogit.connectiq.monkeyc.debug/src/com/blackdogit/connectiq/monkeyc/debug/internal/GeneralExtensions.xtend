package com.blackdogit.connectiq.monkeyc.debug.internal

import com.google.common.collect.Maps
import com.google.common.collect.Sets
import java.util.Map
import java.util.Set
import org.eclipse.xtext.xbase.lib.Functions$Function1
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.util.Iterator
import java.util.HashSet

class GeneralExtensions {
    /**
     * Returns a map for which the {@link Map#values} are the given elements grouped in {@link Set Sets} according
     * to a supplied function {@code computeKeys} on its corresponding value.
     * 
     * @param values
     *            the values to use when constructing the {@code Map}. May not be <code>null</code>.
     * @param computeKeys
     *            the function used to produce the key for each set of values. May not be <code>null</code>.
     * @return a map mapping the result of evaluating the function {@code keyFunction} on each value in the input
     *         collection to that value
     */
    def static <K,V> Map<K, Set<V>> toMapSet(Iterable<? extends V> values, Function1<? super V, K> computeKeys) {
        if (computeKeys == null)
            throw new NullPointerException("computeKeys");
        val Map<K, Set<V>> result = Maps::newLinkedHashMap
        for (v : values) {
            val k = computeKeys.apply(v)
            var s = result.get(k)
            if (s == null) result.put(k, s = Sets::newHashSet)
            s += v
        }
        return result
    }

    /**
     * Simple extension that will add the elements of a MapSet to an existing MapSet.
     */
    def static <K, V> void operator_add(Map<K, Set<V>> to, Map<K, Set<V>> from) {
        for(K key : from.keySet){
            var toSet = to.get(key)
            if (toSet == null) {
                toSet = new HashSet
                to.put(key, toSet)
            }
            toSet.addAll(from.get(key))
        }
    }
    
    def static Iterable<Node> children(Node node) {
        new NodeChildrenIterable(node)
    }

    
    /**
     * Sugar: Returns the specified attribute of the node
     */
    def static String attr(Node node, String name) {
        node?.attributes?.getNamedItem(name)?.nodeValue
    }

    
    /**
     * Sugar: Returns a iterable list for the specified NodeList
     */
    def static Iterable<Node> list(NodeList list) {
        new NodeListIterable(list)
    }
}

class NodeListIterable implements Iterable<Node>, Iterator<Node> {
    val NodeList myList
    var int index = 0
    
    new(NodeList list) {
        myList = list
    }
    override iterator() {
        return this
    }

    override hasNext() {
        index < myList.length
    }
    
    override next() {
        val i = index
        index = index+1
        myList.item(i)
    }
    
    override remove() {
        throw new UnsupportedOperationException("remove is not supported")
    }
}

class NodeChildrenIterable implements Iterable<Node>, Iterator<Node> {
    val Node myNode
    var Node nextChild = null
    
    new(Node node) {
        myNode = node
        nextChild = myNode.firstChild
    }
    override iterator() {
        return this
    }

    override hasNext() {
        nextChild != null
    }
    
    override next() {
        val r = nextChild
        nextChild = nextChild.nextSibling
        r
    }
    
    override remove() {
        throw new UnsupportedOperationException("remove is not supported")
    }
}
