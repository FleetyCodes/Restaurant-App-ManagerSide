package com.example.application.views.employers;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "EmployeePaymentView")
@PageTitle("EmployeePayment")
public class EmployeePaymentView extends VerticalLayout {
    public EmployeePaymentView(){
        setSizeFull();
    }
}
