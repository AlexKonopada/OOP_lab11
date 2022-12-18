package task_builder;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;


enum Gender{
    MALE, FEMALE
}

@ToString
@SuperBuilder
public class User extends Human{
    private Gender gender;
    private int age;
    private int weight;
    private int height;
    private List<String> occupations;
}
