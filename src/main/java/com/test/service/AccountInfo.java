package com.test.service;

/**
 * Created by zongwei.yang on 2016/2/29.
 */
public class AccountInfo {
    public Long Id;
    public Long ParentId;
    public String Name;
    public String AccountNo;
    public String OpenDate;
    public String AccountType;
    public String Status;
    public Benchmark BenchMark;

    public static class Benchmark {
        public Long Id;
        public String Name;
        public String TickerSymbol;
    }
}
