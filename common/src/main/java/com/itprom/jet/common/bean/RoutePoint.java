package com.itprom.jet.common.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Точка маршрута
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoutePoint {
    private String name;
    private double x;
    private double y;
}
