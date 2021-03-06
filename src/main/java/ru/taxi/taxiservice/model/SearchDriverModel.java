package ru.taxi.taxiservice.model;

import lombok.Data;

/**
 * Модель поиска такси.
 */
@Data
public class SearchDriverModel {

    /**
     * Уровень.
     */
    private int level;

    /**
     * Модель авто.
     */
    private String carModel;
}
