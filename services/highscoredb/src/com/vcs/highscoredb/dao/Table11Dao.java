/*Generated by WaveMaker Studio*/

package com.vcs.highscoredb.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.vcs.highscoredb.Table11;

/**
 * Specifies methods used to obtain and modify Table11 related information
 * which is stored in the database.
 */
@Repository("highscoredb.Table11Dao")
public class Table11Dao extends WMGenericDaoImpl<Table11, Integer> {

    @Autowired
    @Qualifier("highscoredbTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

