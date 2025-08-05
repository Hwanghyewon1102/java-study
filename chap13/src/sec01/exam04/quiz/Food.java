package sec01.exam04.quiz;

import java.util.Objects;

class Food {
    private String name;
    private int price;

    public Food() {}

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 중복 방지를 위한 equals(), hashCode() 재정의
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Food)) return false;
        Food food = (Food) obj;
        return price == food.price &&
               Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // 출력 형식 재정의
    @Override
    public String toString() {
        return name + ":" + price;
    }
}