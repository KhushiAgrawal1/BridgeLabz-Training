package com.MediStore_Pharmacy_Inventory_and_Sales_System;

import java.time.LocalDate;

public class MediStoreApp {
    public static void main(String[] args) {

        Medicine med = new Syrup(
                "Cough Syrup",
                120,
                LocalDate.of(2026, 5, 1)
        );

        med.sell(2);
    }
}

