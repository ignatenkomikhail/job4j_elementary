package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        System.out.println(report.generate("Report", "Report body in JSON format"));
    }
}
