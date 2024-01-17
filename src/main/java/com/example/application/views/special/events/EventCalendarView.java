package com.example.application.views.special.events;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "EventCalendarView")
@PageTitle("EventCalendar")
public class EventCalendarView extends VerticalLayout {
    public EventCalendarView(){
        setSizeFull();
    }
}
