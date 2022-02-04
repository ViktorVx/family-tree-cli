package org.pva.familytreecli.graph;

import org.pva.familytreecli.graph.model.GraphNode;
import org.pva.familytreecli.graph.model.PersonData;
import org.springframework.stereotype.Component;

@Component
public class AppGraph {

    private GraphNode root;

    public AppGraph() {
        root = new GraphNode<PersonData>(null, null, "Enter last name:", new PersonData());
        root.addNext(new GraphNode<PersonData>("Enter first name"))
                .addNext(new GraphNode<PersonData>("Enter middle name"));
    }
}
