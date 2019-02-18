package helloandroid2.bizsolution.biz.helloworld;

import java.io.Serializable;


/***
 * Implement Serializable to be able to send from one class to another
 * Usage:
 *
 *
 *
 * Person person = new Person("MR. A", "012345678", "28");
 * Intent intent = new Intent( Context source, Class<?> destination);
 * intent.putExtra("key",person);
 * source.startActivity(intent);
 *
 *
 *
 *
 *
 */
public class Person implements Serializable {

    private String name;
    private String phone;
    private String age;

    public Person(String name, String phone, String age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAge() {
        return age;
    }
}
