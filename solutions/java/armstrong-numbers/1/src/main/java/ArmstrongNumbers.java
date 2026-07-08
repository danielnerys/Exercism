class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int casas = String.valueOf(Math.abs(numberToCheck)).length();

    int soma = 0;

    for(Character i: String.valueOf(numberToCheck).toCharArray()){
        int numero = Character.getNumericValue(i);

        soma += Math.pow(numero, casas);
    }

    return soma == numberToCheck;

    }

}
