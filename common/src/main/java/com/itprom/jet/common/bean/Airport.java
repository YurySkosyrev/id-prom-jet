package com.itprom.jet.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * name - имя аэропорта
 * boards - список бортов
 * x, y - координаты аэропорта
 */

@Getter
@Setter
@EqualsAndHashCode
public class Airport {
    private String name;
    private List<String> boards;
    private int x;
    private int y;

    private void addBoard(String board) {
        int ind = boards.indexOf(board);
        if (ind >= 0) {
            boards.set(ind, board);
        } else {
            boards.add(board);
        }
    }

    private void removeBoard(String board) {
        boards.remove(board);
    }
}
