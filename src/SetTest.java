import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

    public List<Course> coursesToSelect;

    public SetTest() {
        coursesToSelect = new ArrayList<Course>();
    }

    public void testAdd() {
        Course cr1 = new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
//        System.out.println("添加了课程：" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);
        Course temp2 = (Course)coursesToSelect.get(0);
//        System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

        Course[] courses = {new Course("3","离散数学"),new Course("4","汇编语言")};
        coursesToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) coursesToSelect.get(2);
        Course temp4 = (Course) coursesToSelect.get(3);

//        System.out.println("添加了2门课程：" + temp3.id + ":" +temp3.name + ";" + temp4.id + ":" + temp4.name);

        Course[] courses2 = {new Course("5","高等数学"), new Course("6", "大学英语")};
        coursesToSelect.addAll(Arrays.asList(courses2));
        Course temp5 = (Course) coursesToSelect.get(4);
        Course temp6 = (Course) coursesToSelect.get(5);
//        System.out.println("添加了2门课程：" + temp5.id + ":" +temp5.name + ";" + temp6.id + ":" + temp6.name);
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

    public void testForEachForSet(Student student) {
        // 打印输出, 学生所选的课程！
        for (Course cr:student.courses){
            System.out.println("选择了课程：" + cr.id + ":" + cr.name);
        }
    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testForeach();
        //创建一个学生对象
        Student student = new Student("1","小明");
        System.out.println("欢迎学生：" + student.name + "选课！");
        //创建一个Scanner对象，接收从键盘输入的课程ID
        Scanner console = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.println("请输入课程ID");
            String courseId = console.next();
            for(Course cr: st.coursesToSelect) {
                if (cr.id.equals(courseId)) {
                    student.courses.add(cr);
                }
            }
        }

        st.testForEachForSet(student);

    }
}
