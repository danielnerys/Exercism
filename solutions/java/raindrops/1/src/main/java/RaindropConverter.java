

class RaindropConverter {

    String convert(int number) {
        StringBuilder rainDrop = new StringBuilder();

        if (number % 3 == 0) {
            rainDrop.append("Pling");

        }
        if (number % 5 == 0) {
            rainDrop.append("Plang");

        }
        if (number % 7 == 0) {
            rainDrop.append("Plong");
        }

        if (rainDrop.isEmpty()) {
            return String.valueOf(number);
        } else {
            return rainDrop.toString();
        }


    }

}
