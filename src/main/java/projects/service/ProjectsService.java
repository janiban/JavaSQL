package projects.service;

import projects.dao.ProjectsDao;
import projects.entity.Project;


public class ProjectsService {
  private ProjectsDao projectDao = new ProjectsDao();

  public Project addProject(Project project) {
    return projectDao.insertProject(project);
  }
}
