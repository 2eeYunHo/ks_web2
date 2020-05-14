package com.yunho.app.repository;

import com.yunho.app.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface SkillRepository extends JpaRepository<Skill, Long> {
    }

