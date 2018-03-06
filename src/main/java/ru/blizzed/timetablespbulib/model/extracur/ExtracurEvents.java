package ru.blizzed.timetablespbulib.model.extracur;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import ru.blizzed.timetablespbulib.model.Event;
import ru.blizzed.timetablespbulib.model.EventsPage;

public class ExtracurEvents extends EventsPage {

    @SerializedName("Alias")
    private String alias;

    @SerializedName("Title")
    private String title;

    @SerializedName("HasEventsToShow")
    private boolean hasEventsToShow;

    @SerializedName("ChosenMonthDisplayText")
    private String chosenMonthDisplayText;

    @SerializedName("PreviousMonthDisplayText")
    private String previousMonthDisplayText;

    @SerializedName("PreviousMonthDate")
    private String previousMonthDate;

    @SerializedName("NextMonthDisplayText")
    private String nextMonthDisplayText;

    @SerializedName("NextMonthDate")
    private String nextMonthDate;

    @SerializedName("IsCurrentMonthReferenceAvailable")
    private boolean isCurrentMonthReferenceAvailable;

    @SerializedName("ShowGroupingCaptions")
    private boolean showGroupingCaptions;

    @SerializedName("EventGroupings")
    private List<EventGrouping> eventGroupings;

    @SerializedName("EarlierEvents")
    private List<Event> earlierEvents;

    public String getAlias() {
        return alias;
    }

    public String getTitle() {
        return title;
    }

    public boolean isHasEventsToShow() {
        return hasEventsToShow;
    }

    public String getChosenMonthDisplayText() {
        return chosenMonthDisplayText;
    }

    public String getPreviousMonthDisplayText() {
        return previousMonthDisplayText;
    }

    public String getPreviousMonthDate() {
        return previousMonthDate;
    }

    public String getNextMonthDisplayText() {
        return nextMonthDisplayText;
    }

    public String getNextMonthDate() {
        return nextMonthDate;
    }

    public boolean isCurrentMonthReferenceAvailable() {
        return isCurrentMonthReferenceAvailable;
    }

    public boolean isShowGroupingCaptions() {
        return showGroupingCaptions;
    }

    public List<EventGrouping> getEventGroupings() {
        return eventGroupings;
    }

    public List<Event> getEarlierEvents() {
        return earlierEvents;
    }

    public static class EventGrouping {

        @SerializedName("Caption")
        private String caption;

        @SerializedName("Events")
        private List<Event> events;

        public String getCaption() {
            return caption;
        }

        public List<Event> getEvents() {
            return events;
        }

    }

}