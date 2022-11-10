package com.he3cloud.panda.service.server.dao;

import com.he3cloud.panda.service.server.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * cluster info dao
 */
@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {

}
