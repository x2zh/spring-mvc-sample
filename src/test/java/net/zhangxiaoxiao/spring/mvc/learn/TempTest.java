package net.zhangxiaoxiao.spring.mvc.learn;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class TempTest {

    @Test
    void javaSerialTest() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Person p = new Person();
        p.setName("zhangxiaoxiao");
        p.setAge(20);

        try {
            ObjectOutputStream oss = new ObjectOutputStream(os);
            oss.writeObject(p);
            byte[] buffer = os.toByteArray();
            System.out.println(buffer.length);
            ByteArrayInputStream is = new ByteArrayInputStream(buffer);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object object = ois.readObject();
            Person person = (Person) object;
            assertEquals(p, person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    static class Person implements Serializable {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Person person = (Person) o;

            if (age != person.age) {
                return false;
            }
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }
    }
}
