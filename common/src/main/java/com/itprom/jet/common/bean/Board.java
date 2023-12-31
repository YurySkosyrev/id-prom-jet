package com.itprom.jet.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * route - маршрут по которому идёт самолет
 * busy - занят борт или нет
 * x, y - координаты борта
 * angle - повороты на UI
 *
 * noBusy() - метод пригодится для lambda-expressions или method-reference
 *
 * calculatePosition() - вычисление положения точки с помощью линейной кривой Безье
 */

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Board {
    private String name;
    private String location;
    private Route route;
    private boolean busy;
    private double speed;
    private double x;
    private double y;
    private double angle;

    private boolean noBusy(){
        return !busy;
    }

    private void calculatePosition(RoutePath routeDirection){
        double t = routeDirection.getProgress()/100;

        double toX = (1-t)*routeDirection.getFrom().getX() + t*routeDirection.getTo().getX();
        double toY = (1-t)*routeDirection.getFrom().getY() + t*routeDirection.getTo().getY();

        double deltaX = this.x - toX;
        double deltaY = this.y - toY;

        this.angle = Math.toDegrees(Math.atan2(deltaX, deltaY));
        if(this.angle < 0) {
            this.angle = 360 + this.angle;
        }

        this.x = toX;
        this.y = toY;
    }
}
