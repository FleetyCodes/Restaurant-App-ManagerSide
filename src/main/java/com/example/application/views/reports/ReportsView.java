package com.example.application.views.reports;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "ReportsView")
@PageTitle("Reports")
public class ReportsView extends VerticalLayout {
    public ReportsView(){
        setSizeFull();
    }

}
