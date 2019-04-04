import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class ListTest {
    public List coursesToSelect;
    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    public void testAdd() {
        Course cr1 = new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);
        Course temp2 = (Course)coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

        Course[] courses = {new Course("3","离散数学"),new Course("4","汇编语言")};
        coursesToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) coursesToSelect.get(2);
        Course temp4 = (Course) coursesToSelect.get(3);

        System.out.println("添加了2门课程：" + temp3.id + ":" +temp3.name + ";" + temp4.id + ":" + temp4.name);

        Course[] courses2 = {new Course("5","高等数学"), new Course("6", "大学英语")};
        coursesToSelect.addAll(Arrays.asList(courses2));
        Course temp5 = (Course) coursesToSelect.get(4);
        Course temp6 = (Course) coursesToSelect.get(5);
        System.out.println("添加了2门课程：" + temp5.id + ":" +temp5.name + ";" + temp6.id + ":" + temp6.name);
    }

    public void testGet() {
        int size = coursesToSelect.size();
        System.out.println("有如下课程待选：");
        for (int i = 0; i < size; i++) {
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println("课程：" + cr.id + ":" + cr.name);
        }
    }

    /*
    * foreach
     */
    public void testForeach() {
        System.out.println("有如下课程待选(foreach)：");
        for (Object obj: coursesToSelect) {
            Course cr = (Course) obj;
            System.out.println("课程：" + cr.id + ":" + cr.name);
        }
    }

    /**
     * 迭代器
     * */
    public void testIterator() {
        Iterator it = coursesToSelect.iterator();
        System.out.println("有如下课程待选(迭代器)：");
        while(it.hasNext()) {
            Course cr = (Course) it.next();
            System.out.println("课程：" + cr.id + ":" + cr.name);
        }
    }

    public void testModify() {
        coursesToSelect.set(5,new Course("6","大学日语"));
    }

    public void testRemove() {
        Course cr = (Course) coursesToSelect.get(5);
        coursesToSelect.remove(cr);
        testForeach();
    }

//    public void testType() {
//        coursesToSelect.add("aaa");
//    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testGet();
        lt.testIterator();
        lt.testForeach();
        lt.testModify();
        lt.testForeach();
        lt.testRemove();
//        lt.testType();
//        lt.testForeach();
    }


}
