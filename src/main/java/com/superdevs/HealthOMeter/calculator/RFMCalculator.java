package com.superdevs.HealthOMeter.calculator;

import com.superdevs.HealthOMeter.entity.Gender;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.MathContext;

@Component
public class RFMCalculator {
    public BigDecimal calculateRFM(Gender gender, BigDecimal height, BigDecimal waistRatio) {
        MathContext mathContext = new MathContext(3);

        if (gender != null && height != null && waistRatio!= null
                && height.compareTo(BigDecimal.ZERO) > 0 && waistRatio.compareTo(BigDecimal.ZERO) > 0
                && (gender == Gender.MALE || gender == Gender.FEMALE)) {
            BigDecimal partialResult = new BigDecimal("20").multiply(height).divide(waistRatio, mathContext);
            if (gender == Gender.MALE) {
                return  new BigDecimal("64").subtract(partialResult);
            } else {
                return new BigDecimal("76").subtract(partialResult);
            }
        }
        return BigDecimal.ZERO;
    }
}
