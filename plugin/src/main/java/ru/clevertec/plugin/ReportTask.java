package ru.clevertec.plugin;

import org.apache.commons.io.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;

public class ReportTask extends DefaultTask {
    private static final String ERROR_MESSAGE = "Cannot move report: ";
    @TaskAction
    public void moveReport() {
        File from = ProjectFilesUtils.getReportPath(getProject());
        File to = ProjectFilesUtils.getReportPathForRemoving(getProject());
        try {
            FileUtils.moveDirectory(from, to);
        } catch (IOException e) {
            System.out.println(ERROR_MESSAGE + e.getMessage());
        }
    }
}