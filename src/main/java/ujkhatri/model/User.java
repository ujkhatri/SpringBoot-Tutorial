package ujkhatri.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

//Generates a public constructor with parameter for each field
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Document(collection = "User")
@NoArgsConstructor
public class User {
    //Defines Getter and Setter for field and exception thrown if value is null
    @NonNull @Getter @Setter
    @Id
    private int id;

    @NonNull @Getter @Setter
    private String name;

    @Getter @Setter
    private int age;
}
