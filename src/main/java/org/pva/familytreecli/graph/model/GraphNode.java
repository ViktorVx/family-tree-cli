package org.pva.familytreecli.graph.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GraphNode <org.pva.familytreecli.graph.model.NodeData>{

    private GraphNode<org.pva.familytreecli.graph.model.NodeData> nextGraphNode;
    private GraphNode<org.pva.familytreecli.graph.model.NodeData> prevGraphNode;
    private String message;
    private org.pva.familytreecli.graph.model.NodeData nodeData;

    public GraphNode(String message) {
        this.message = message;
    }

    //    TODO подобрать правильный паттерн для реализации

    public GraphNode<org.pva.familytreecli.graph.model.NodeData> addNext(GraphNode<org.pva.familytreecli.graph.model.NodeData> graphNode) {
        this.nextGraphNode = graphNode;
        graphNode.setPrevGraphNode(this);
        return graphNode;
    }

}
