package task_mail.MailInfo;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    private int id;
    @Setter @Getter
    private String name;
    @Setter @Getter
    private int age;
    @Setter @Getter
    private Gender sex;
    @Setter @Getter
    private String email;
    private static int count = 0;

    public Client(int age, String name, Gender sex, String email) {
        id = ++count;
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
}
