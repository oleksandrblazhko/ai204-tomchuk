package com.nuop.tscp;

import com.nuop.tscp.healthCondition.healthCondition;
import java.util.HashMap;
import java.util.Map;

public class setHealthConditionTest {

    public static boolean isIdCorrect(healthCondition healthCondition) {
        return healthCondition.getId() > 0 && healthCondition.getId() < 1000000000;
    }

    public static boolean isDateCorrect(healthCondition healthCondition) {
        return healthCondition.getDate().matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
    }

    public static boolean areValuesCorrect(healthCondition healthCondition) {
        return healthCondition.getCalories() > 0 && healthCondition.getCalories() < 1000000000
                && healthCondition.getPace() > 0 && healthCondition.getPace() < 1000000000
                && healthCondition.getPressure() > 0 && healthCondition.getPressure() < 1000000000
                && healthCondition.getPulse() > 0 && healthCondition.getPulse() < 1000000000;
    }

    public static int setHealthCondition(healthCondition healthCondition) {
        if (!isIdCorrect(healthCondition)) {
            return -1;
        }

        if(!isDateCorrect(healthCondition)) {
            return -2;
        }

        if (!areValuesCorrect(healthCondition)) {
            return -3;
        }

        return 1;
    }


    public static void main(String[] args) {

        Map<healthCondition, Integer> valueMap = new HashMap<>(Map.of(
                new healthCondition(9, "16.07.21", 446, 68, 6734, 118), 1,
                new healthCondition(-100, "16.07.21", 446, 68, 6734, 118), -1,
                new healthCondition(1, "16.13.26", 446, 68, 6734, 118), -2,
                new healthCondition(1, "16.07.21", -100, 68, 6734, 118), -3
        ));

        int i = 1;
        for (healthCondition healthCondition : valueMap.keySet()) {
            if (valueMap.get(healthCondition) == setHealthCondition(healthCondition)) {
                System.out.println("TC" + i++ + ": PASSED");
            } else {
                System.out.println("TC" + i++ + ": FAILED");
            }
        }
    }
}
