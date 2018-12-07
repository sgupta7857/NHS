package com.citizen.validetor;

import com.citizen.model.RegularAmount;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegularAmountValidator implements ConstraintValidator<ValidRegularAmount, RegularAmount> {

    private double weeklyAmount = 0;
    public void initialize(ValidRegularAmount constraintAnnotation) {
        this.weeklyAmount = constraintAnnotation.weeklyAmount();
    }

    public boolean isValid(RegularAmount regularAmount, ConstraintValidatorContext constraintValidatorContext) {
        RegularAmount.Frequency frequency = regularAmount.getFrequency();
        String amount = regularAmount.getAmount();

        try {
            double amountDouble = Double.parseDouble(amount);
            if (frequency.equals(RegularAmount.Frequency.WEEK)) {
                if(amountDouble >= weeklyAmount){
                    return true;
                }
            } else if (frequency.equals(RegularAmount.Frequency.TWO_WEEK)) {
                if(amountDouble/2 >= weeklyAmount){
                    return true;
                }
            } else if (frequency.equals(RegularAmount.Frequency.FOUR_WEEK)) {
                if(amountDouble/4 >= weeklyAmount){
                    return true;
                }
            }else if (frequency.equals(RegularAmount.Frequency.MONTH)) {
                if(amountDouble/4 >= weeklyAmount){
                    return true;
                }
            }else if (frequency.equals(RegularAmount.Frequency.QUARTER)) {
                if(amountDouble/13 >= weeklyAmount){
                    return true;
                }
            }else if (frequency.equals(RegularAmount.Frequency.YEAR)) {
                if(amountDouble/52 >= weeklyAmount){
                    return true;
                }
            }
        }catch (NumberFormatException e){

        }



        return false;
    }
}
