package Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericsMultipleParameter<K,V> {
    private K key;
    private V value;
    private List<Node<K,V>> nodeList = new ArrayList<>();

    class Node<K,V> {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public void put(K key, V value) {
        Boolean check = false;
        for(Node<K, V> node : nodeList) {
            if(node.key.equals(key)) {
                node.value = value;
                check = true;
            }
        }
        if(check == false) {
            Node<K,V> toSaveNode = new Node<K,V>(key, value);
            System.out.println("Called");
            nodeList.add(toSaveNode);
        }
    }

    public V get(K key)  {
        V valueToReturn;
        try {
            for(Node<K, V> node : nodeList) {
                if(node.key.equals(key)) {
                    valueToReturn = node.value;
                    return valueToReturn;
                }
            }
            throw new Exception("Can't find the key");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (V) new Object();
    }

    public void print() {
        System.out.println(nodeList);
    }

    public static void main(String[] args) {
        GenericsMultipleParameter<String, Integer> customMap = new GenericsMultipleParameter<String, Integer>();
        customMap.put("Adarsh",1);
        customMap.put("Chicky",2);
        customMap.print();
        System.out.println(customMap.get("Adarsh"));
        System.out.println(customMap.get("test"));
    }
}
