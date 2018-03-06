package ru.blizzed.timetablespbulib.model;

public enum TimeTableType {

    ALL(0),
    PRIMARY(1),
    ATTESTATION(2),
    FINAL(3);

    private int index;

    TimeTableType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
