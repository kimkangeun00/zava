import java.util.Scanner;

class Student {
    int school_num; String name; String major; int phone_num;

    int getSchoolNum(){
        return school_num;
    }
    String getName(){
        return name;
    }
    String getMajor(){
        return major;
    }
    int getPhoneNum(){
        return phone_num;
    }
    void setSchool_num(int num){
        school_num = num;
    }
    void setName(String n){
        name = n;
    }
    void setMajor(String n){
        major = n;
    }
    void setPhoneNum(int num){
        phone_num = num;
    }


}

class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student[] stu = new Student[3];

        for(int i=0; i<3; i++){
            stu[i] = new Student();

            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            stu[i].setSchool_num(sc.nextInt());
            stu[i].setName(sc.next());
            stu[i].setMajor(sc.next());
            stu[i].setPhoneNum(sc.nextInt());
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.\n");
        for (int i=0; i<3; i++){
            String phone = Integer.toString(stu[i].getPhoneNum());
            String phone_print = "0" + phone.substring(0,2) + "-" + phone.substring(2,6) + "-" + phone.substring(6);
            System.out.printf("%d번째 학생: %d %s %s %s\n", i+1, stu[i].getSchoolNum(), stu[i].getName(), stu[i].getMajor(), phone_print);
        }


    }
}