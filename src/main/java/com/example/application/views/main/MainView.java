package com.example.application.views.main;

import com.example.application.views.foods.and.drinks.FoodsConfigView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        SideNav nav = new SideNav();
        SideNavItem foodAndDrinksConfigNav = new SideNavItem("Food and Drinks Configuration");
        foodAndDrinksConfigNav.setExpanded(true);
        foodAndDrinksConfigNav.addItem(new SideNavItem("Foods", FoodsConfigView.class, VaadinIcon.CUTLERY.create()));
        foodAndDrinksConfigNav.addItem(new SideNavItem("Drinks", FoodsConfigView.class, VaadinIcon.COFFEE.create()));
        foodAndDrinksConfigNav.addItem(new SideNavItem("Menus", FoodsConfigView.class, VaadinIcon.FILE.create()));
        nav.addItem(foodAndDrinksConfigNav);

        Div navWrapper = new Div(nav);
        nav.setWidthFull();
        add(navWrapper);
    }
}