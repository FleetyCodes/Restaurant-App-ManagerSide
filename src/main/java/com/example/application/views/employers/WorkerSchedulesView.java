package com.example.application.views.employers;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "WorkerSchedulesView")
@PageTitle("WorkerSchedules")
public class WorkerSchedulesView  extends VerticalLayout {
    public WorkerSchedulesView(){
        setSizeFull();
    }
}
