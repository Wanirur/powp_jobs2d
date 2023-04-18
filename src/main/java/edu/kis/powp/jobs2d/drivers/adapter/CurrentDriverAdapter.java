package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CurrentDriverAdapter extends AbstractDriver  {    
    private DriverManager manager;
    public CurrentDriverAdapter(int x, int y, DriverManager manager) {
        super(x, y);
        this.manager = manager;
    }

    @Override
    public void operateTo(int x, int y) {
        Job2dDriver currentDriver = manager.getCurrentDriver();
		currentDriver.operateTo(x, y);
    }
   
}
