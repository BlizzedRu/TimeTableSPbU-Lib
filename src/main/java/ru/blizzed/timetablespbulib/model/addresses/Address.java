package ru.blizzed.timetablespbulib.model.addresses;

public class Address extends BaseAddress {

    public enum Type {
        THEATER(0), AMPHITHEATER(1), ROUND_TABLE(2);

        private int index;

        Type(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }

    private int matches;

    public int getMatches() {
        return matches;
    }

}
