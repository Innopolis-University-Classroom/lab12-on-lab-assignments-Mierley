package ru.innopolis.problem1;

abstract class Handler {
    public void handle(){}
}

class Logger extends Handler
{
    protected Handler nextHandler;
    public Logger(Logger startLogger)
    {
        this.nextHandler = startLogger;
    }
    public Logger() {}
}

class LoggerConsole extends Logger
{
    public LoggerConsole()
    {
        this.nextHandler = new LoggerFile();
    }
}

class LoggerFile extends Logger
{
    public LoggerFile ()
    {
        this.nextHandler = new LoggerServer();
    }
}

class LoggerServer extends Logger
{
    public LoggerServer ()
    {
        this.nextHandler = null;
    }
}