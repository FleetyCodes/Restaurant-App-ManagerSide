package com.example.application.views.foods.and.drinks;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "DrinksConfigView")
@PageTitle("DrinksConfig")
public class DrinksConfigView  extends VerticalLayout {
    public DrinksConfigView(){
        setSizeFull();
    }
}
