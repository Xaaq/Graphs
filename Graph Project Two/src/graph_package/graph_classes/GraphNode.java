package graph_package.graph_classes;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Xaaq333 on 2017-03-16.
 */

/**
 * opakowywuje pojedynczy wezel grafu
 */
public class GraphNode {

    /**
     * id tego wezla
     */
    private int id;
    /**
     * tablica sasiadow - referencje do wszystkich wezlow z ktorymi jest polaczony
     */
    private ArrayList<GraphNode> connectionList = new ArrayList<>();

    /**
     * konstruktor ktory ustawia id tego wezla
     */
    public GraphNode(int id) {
        this.id = id;
    }


    /**
     * dodaje referencje do innego wezla do tablicy sasiadow
     */
    public void addConnection(GraphNode connectionNode) {
        connectionList.add(connectionNode);
    }

    /**
     * usuwa polaczenie pod podanym indeksem
     */
    public void removeConnection(GraphNode connectionNode) {
        connectionList.remove(connectionNode);
    }

    /**
     * zwraca id węzła
     */
    public int getId() {
        return id;
    }

    /**
     * zwraca tablice sasiadow
     */
    public ArrayList<GraphNode> getConnectionList() {
        return (ArrayList<GraphNode>) connectionList;
    }
}