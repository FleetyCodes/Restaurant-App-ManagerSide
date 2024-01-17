package com.example.application.views.foods.and.drinks;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "MenusConfigView")
@PageTitle("MenusConfig")
public class MenusConfigView  extends VerticalLayout {
    public MenusConfigView(){
        setSizeFull();
    }
}
