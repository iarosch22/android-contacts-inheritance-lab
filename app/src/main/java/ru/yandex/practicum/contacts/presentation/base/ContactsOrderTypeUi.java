package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

public class ContactsOrderTypeUi {
    private final String type;
    private final boolean isSelected;

    public ContactsOrderTypeUi(@NonNull String type, boolean isSelected) {
        this.type = type;
        this.isSelected = isSelected;
    }

    public String getType() {
        return type;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
