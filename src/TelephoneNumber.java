public class TelephoneNumber implements Comparable<TelephoneNumber> {
    public final int countryCode;
    public final int localNumber;

    public TelephoneNumber(int countryCode, int localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    @Override
    public int compareTo(TelephoneNumber other) {
        if (this.countryCode == other.countryCode) {
            return this.localNumber - other.localNumber;
        }
        return this.countryCode - other.countryCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getLocalNumber() {
        return localNumber;
    }

    @Override
    public String toString() {
        return "+" + getCountryCode() + " " + formatLocalNumber();
    }

    private String formatLocalNumber() {
        StringBuilder formattedNumber = new StringBuilder();
        char[] tempCharArray = String.valueOf(getLocalNumber()).toCharArray();
        for (int i = 0; i < tempCharArray.length; i++) {
            formattedNumber.append(tempCharArray[i]);
            if (i % 3 == 2)
            {
                formattedNumber.append(' ');
            }
        }
        return String.valueOf(formattedNumber);
    }
}
