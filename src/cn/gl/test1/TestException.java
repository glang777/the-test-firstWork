package cn.gl.test1;

public class TestException {
    public static void main(String[] args) {
        try {
            Student s = new Student(-20, "张三");
        } catch (ShuziException e) {
            System.out.println(e.getMessage());
        }
    }
}
class Student {
    private int age;
    private String name;
    
    public Student(int age, String name) throws ShuziException{
        if(age < 0) {
            throw new ShuziException("年龄不能为负数");
        }
        this.age = age;
        this.name = name;
    }
    
    public String toString() {
        return name + age;
    }
}
class ShuziException extends Exception {
    private String message;
    
    public ShuziException(String message) {
        super(message);
    }
}

