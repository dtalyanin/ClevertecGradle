package ru.clevertec.plugin;

import org.gradle.api.Project;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProjectFilesUtils {
    private static final String REPORTS_FOLDER = "reports/tests/test";
    private static final String NEW_REPORT_FOLDER = "report";
    private static final String DATE_PATTERN = "YYYY-MM-dd-HH-mm-ss";

    public static File getReportPath(Project project) {
        return new File(project.getBuildDir() + File.separator + REPORTS_FOLDER);
    }

    public static File getReportPathForRemoving(Project project) {
        return new File(project.getProjectDir() + File.separator +
                NEW_REPORT_FOLDER + File.separator + getCurrentTime());
    }

    private static String getCurrentTime() {
        return DateTimeFormatter.ofPattern(DATE_PATTERN).format(LocalDateTime.now());
    }
}
