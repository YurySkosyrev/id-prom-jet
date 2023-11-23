package com.itprom.jet.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Маршрут
 *
 * boardName - какому борту назначен маршрут
 *
 * notAssigned() - назначен ли маршрут какому-либо борту
 */

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Route {
    private String boardName;
    private List<RoutePath> path = new ArrayList<>();

    public boolean notAssigned(){
        return boardName == null;
    }
}
