package com.zss.ordermode;

public interface Command {
    public void execute();
    public void undo();
}
