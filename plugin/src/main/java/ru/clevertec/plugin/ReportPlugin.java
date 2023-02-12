package ru.clevertec.plugin;

import groovy.lang.Closure;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ReportPlugin implements Plugin<Project> {
    private static final String REPORT_TASK = "reportTask";


    @Override
    public void apply(Project project) {
        project.getTasks().create(REPORT_TASK, ReportTask.class);
        project.getTasks().getByName(REPORT_TASK).onlyIf(new Closure(this) {
            @Override
            public Object call(Object arguments) {
                return ProjectFilesUtils.getReportPath(project).exists();
            }
        });
    }
}
