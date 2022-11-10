package com.he3cloud.panda.service.server.service;

import com.he3cloud.panda.service.server.dao.ProjectDao;
import com.he3cloud.panda.service.server.entity.Project;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ProjectService {

    @Resource
    private ProjectDao projectDao;

    public void test() {

        Project project = new Project();
        project.setProjectName("test");

        projectDao.save(project);
    }
}
