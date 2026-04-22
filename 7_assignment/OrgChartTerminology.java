import java.util.ArrayList;
import java.util.List;

public class OrgChartTerminology {
    static class Node {
        String name;
        List<Node> children;

        Node(String name) {
            this.name = name;
            this.children = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Node ceo = new Node("CEO");
        Node cto = new Node("CTO");
        Node cfo = new Node("CFO");
        Node devLead = new Node("Dev Lead");
        Node hr = new Node("HR");
        Node dev1 = new Node("Dev1");
        Node dev2 = new Node("Dev2");

        ceo.children.add(cto);
        ceo.children.add(cfo);
        cto.children.add(devLead);
        cfo.children.add(hr);
        devLead.children.add(dev1);
        devLead.children.add(dev2);

        System.out.println("Leaf Nodes:");
        printLeaves(ceo);
        
        System.out.println("\nHeight of Tree: " + getHeight(ceo));
    }

    static void printLeaves(Node node) {
        if (node == null) return;
        if (node.children.isEmpty()) {
            System.out.println(node.name);
        }
        for (Node child : node.children) {
            printLeaves(child);
        }
    }

    static int getHeight(Node node) {
        if (node == null || node.children.isEmpty()) return 0;
        int maxChildHeight = 0;
        for (Node child : node.children) {
            maxChildHeight = Math.max(maxChildHeight, getHeight(child));
        }
        return maxChildHeight + 1;
    }
}
