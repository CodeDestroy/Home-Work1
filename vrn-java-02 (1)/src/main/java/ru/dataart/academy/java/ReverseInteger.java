package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) throws Exception {
        //Task implementation
        long outputNumber = 0;
        while(inputNumber != 0){
            outputNumber = outputNumber * 10 + inputNumber % 10;
            inputNumber /= 10;
        }

        int outputNum;
        if (outputNumber > 2147483647 || outputNumber < -2147483648)
            throw new Exception("Ошибка ввода, данное число не может быть конвертированно!");
        else
            outputNum = (int)outputNumber;

        return outputNum;
    }
}
