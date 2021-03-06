package com.spring.core.chap01_1;

public class EasternRestaurant implements Restaurant {

    private Chef chef; // 호텔 안에는 셰프가 있어야지. 이 경우에도 역할에 의존해야지 특정 구현체에 의존하면 안된다.

    private Course course; // 매일 코스 요리가 바뀐다고 가정. 특정 코스요리에 의존하면 안된다!


    // 코스요리가 매일 바뀔 것이고 그 코스를 제일 잘 요리할 수 있는 셰프도 매일 바뀔 것이라고 가정할 것이다.
        // 코드의 내용 변경이 잦아질 것이라고 가정하는 것이다.


    public EasternRestaurant() {
        this.chef = new KimuraChef(); // 추가적 클래스를 만들어서 새로운 셰프들을 넣는 것은 가능
                                        // 변경에 닫혀있는건 아니라서 OCP 위반이다!!
        this.course = new SushiCourse();
    }


    @Override
    public void reserve() {
        course.combineMenu();
    }

    @Override
    public void order() {
        chef.cook();
    }


}
