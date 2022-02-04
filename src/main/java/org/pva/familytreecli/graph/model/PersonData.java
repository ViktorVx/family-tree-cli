package org.pva.familytreecli.graph.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PersonData extends NodeData {

    private String lastName;
    private String firstName;
    private String middleName;
}
