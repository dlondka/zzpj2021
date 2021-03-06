package p.lodz.it.zzjp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;

    public void sayHello() {
        System.out.println("Hello im " + name);
    }
}
