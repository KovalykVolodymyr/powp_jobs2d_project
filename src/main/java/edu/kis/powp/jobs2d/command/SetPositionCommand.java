package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private int x,y;
    private Job2dDriver driver;

    public SetPositionCommand(Job2dDriver driver, int x, int y) {
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }
}
