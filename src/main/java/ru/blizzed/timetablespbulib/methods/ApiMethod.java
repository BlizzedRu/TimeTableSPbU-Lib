package ru.blizzed.timetablespbulib.methods;

class ApiMethod<CallerType> {

    private CallerType caller;

    ApiMethod(CallerType caller) {
        this.caller = caller;
    }

    CallerType getCaller() {
        return caller;
    }

}
