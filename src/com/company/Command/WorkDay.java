package com.company.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkDay {
    private List<Action> actionList = new ArrayList<>();

    public void takeAction(Action action){
        actionList.add(action);
    }

    public void makeActions(){
        actionList.forEach(Action::execute);
        actionList.clear();
    }
}
