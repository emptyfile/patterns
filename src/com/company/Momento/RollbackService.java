package com.company.Momento;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RollbackService {
    private Map<String, RollbackPoint> rollbackPoints;

    public RollbackService() {
        rollbackPoints = new HashMap<String, RollbackPoint>();
    }

    public void add(RollbackPoint point, String date){
        rollbackPoints.put(date, point);
    }

    public RollbackPoint get(Date date){
        return rollbackPoints.get(date);
    }
}
