package com.nuop.tscp;

public class UserTest {

    public static boolean isIdCorrect(Integer userId) {
        return userId > 0 && userId < 1000000000;
    }

    public static boolean isSexCorrect(String gender) {
        return gender.equalsIgnoreCase("woman")
                || gender.equalsIgnoreCase("man")
                || gender.equalsIgnoreCase("binary");
    }

    private static Integer testUser(Users user) {

        if (!isIdCorrect(user.getUserId())) {
            return -1;
        }

        if (!isSexCorrect(user.getSex())) {
            return -2;
        }

        return 0;
    }

    public static void main(String[] args) {

        Users goodUser = new Users(1, "woman");
        int actualResultFirst = testUser(goodUser);
        System.out.println("TC1: user " + goodUser + "  should pass check.      Expected result =  0, actual result =  " + actualResultFirst + " || " + ((0 == actualResultFirst)?("PASSED"):("FAILED")));

        Users BadUserOne = new Users(-67, "man");
        int actualResultSecond = testUser(BadUserOne);
        System.out.println("TC2: user " + BadUserOne + " should not pass check.  Expected result = -1, actual result = " + actualResultSecond + " || " + ((-1 == actualResultSecond)?("PASSED"):("FAILED")));

        Users BadUserTwo = new Users(15, "notset");
        int actualResultThird = testUser(BadUserTwo);
        System.out.println("TC3: user " + BadUserTwo + "  should not pass check.  Expected result = -2, actual result = " + actualResultThird + " || " + ((-2 == actualResultThird)?("PASSED"):("FAILED")));

        if (0 != actualResultFirst || -1 != actualResultSecond || -2 != actualResultThird) {
            System.exit(-1);
        }

    }
}

class Users {

    private Integer userId;
    private String gender;

    public Users(Integer userId, String gender) {
        this.userId = userId;
        this.gender = gender;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSex() {
        return gender;
    }

    public void setSex(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" + userId +
                ", Sex='" + gender  + '\'' +
                '}';
    }
}
