package ujkhatri.model;

import lombok.*;

//Generates a public constructor with parameter for each field
@AllArgsConstructor(access = AccessLevel.PUBLIC)
//Generates the toString method
@ToString
public class User {
    //Defines Getter and Setter for field and exception thrown if value is null
    @NonNull @Getter @Setter
    private int id;

    @NonNull @Getter @Setter
    private String name;

    @NonNull @Getter @Setter
    private int age;
}
