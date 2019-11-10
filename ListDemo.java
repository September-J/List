package List;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List<String> courses = new ArrayList<>();
        courses.add("C语言");
        courses.add("JAVA SE");
        courses.add("Java web");
        courses.add("Java EE");

        //和数组一样，允许添加重复元素
        courses.add("C语言");
        System.out.println(courses);

        //类似数组下标访问
        System.out.println(courses.get(0));
        System.out.println(courses);
        courses.set(0,"计算机基础");
        System.out.println(courses);

        //截取部分[1,3)
        List<String> subCourse = courses.subList(1,3);
        System.out.println(subCourse);

        //重新构造
        List<String> course2 = new ArrayList<>();
        System.out.println(course2);

        List<String> course3 = new LinkedList<>(courses);
        System.out.println(course3);

        //引用的转换
        ArrayList<String> course4 = (ArrayList<String>)course2;
        System.out.println(course4);
        LinkedList<String> course5 = (LinkedList<String>)course3;
        System.out.println(course5);
    }
}
