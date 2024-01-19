package com.example.application.views.main;

import com.example.application.views.employers.EmployeePaymentView;
import com.example.application.views.employers.WorkerSchedulesView;
import com.example.application.views.foods.and.drinks.FoodsConfigView;
import com.example.application.views.foods.and.drinks.DrinksConfigView;
import com.example.application.views.foods.and.drinks.MenusConfigView;
import com.example.application.views.reports.ReportsView;
import com.example.application.views.special.events.EventCalendarView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.Route;
@CssImport("./styles/my-custom.css")
@Route("")
public class MainView extends VerticalLayout {
    public MainView() {

        SideNav nav = new SideNav();
        nav.setId("mainPageNavbar");

        SideNavItem foodAndDrinksConfigNav = new SideNavItem("Food and Drinks Configuration");


        foodAndDrinksConfigNav.addItem(new SideNavItem("Foods", FoodsConfigView.class, VaadinIcon.CUTLERY.create()));
        foodAndDrinksConfigNav.addItem(new SideNavItem("Drinks", DrinksConfigView.class, VaadinIcon.COFFEE.create()));
        foodAndDrinksConfigNav.addItem(new SideNavItem("Menus", MenusConfigView.class, VaadinIcon.FILE.create()));
        foodAndDrinksConfigNav.setExpanded(true);
        foodAndDrinksConfigNav.setId("configCategoryId");


        SideNavItem workerSchedulesNav = new SideNavItem("Employer Configuration");
        workerSchedulesNav.addItem(new SideNavItem("Employee Schedules", WorkerSchedulesView.class, VaadinIcon.CLOCK.create()));
        workerSchedulesNav.addItem(new SideNavItem("Employee Payment", EmployeePaymentView.class, VaadinIcon.MONEY.create()));
        workerSchedulesNav.setExpanded(true);
        workerSchedulesNav.setId("configCategoryId");

        SideNavItem specialEventsNav = new SideNavItem("Special Events Configuration");
        //main page should be this calendar ?
        specialEventsNav.addItem(new SideNavItem("Calendar", EventCalendarView.class, VaadinIcon.CALENDAR.create()));
        specialEventsNav.setExpanded(true);
        specialEventsNav.setId("configCategoryId");

        SideNavItem reportsNav = new SideNavItem("Reports");
        reportsNav.addItem(new SideNavItem("Check Reports", ReportsView.class, VaadinIcon.FOLDER.create()));
        reportsNav.setExpanded(true);
        reportsNav.setId("configCategoryId");

        nav.addItem(foodAndDrinksConfigNav, workerSchedulesNav, specialEventsNav, reportsNav);
        Div navWrapper = new Div(nav);
        nav.setWidthFull();
        add(navWrapper);
    }
}