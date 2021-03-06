/*Generated by WaveMaker Studio*/

package com.vcs.highscoredb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.vcs.highscoredb.Table11;

/**
 * Service object for domain model class Table11.
 *
 * @see {@link Table11}
 */
public interface Table11Service {

    /**
     * Creates a new Table11.
     *
     * @param table11 The information of the created CompositeTable.
     * @return The created Table11.
     */
	Table11 create(Table11 table11);


	/**
	 * Finds Table11 by id.
	 *
	 * @param table11Id The id of the wanted Table11.
	 * @return The found Table11. If no Table11 is found, this method returns null.
	 */
	Table11 getById(Integer table11Id) throws EntityNotFoundException;

    /**
	 * Finds Table11 by unique key.
	 *
	 * @param column4 column4 value.
	 * @return The found Table11.
     * @throws EntityNotFoundException if no Table11 found.
	 */
    Table11 getByColumn4(String column4)throws EntityNotFoundException;

    /**
	 * Finds Table11 by unique key.
	 *
	 * @param column4 column4 value.
	 * @param column3 column3 value.
	 * @return The found Table11.
     * @throws EntityNotFoundException if no Table11 found.
	 */
    Table11 getByColumn4AndColumn3(String column4, String column3)throws EntityNotFoundException;

	/**
	 * Updates the information of a Table11.
	 *
	 * @param table11 The information of the updated Table11.
	 * @return The updated Table11.
     *
	 * @throws EntityNotFoundException if no Table11 is found with given id.
	 */
	Table11 update(Table11 table11) throws EntityNotFoundException;

    /**
	 * Deletes a Table11.
	 *
	 * @param table11Id The id of the deleted Table11.
	 * @return The deleted Table11.
     *
	 * @throws EntityNotFoundException if no Table11 is found with the given id.
	 */
	Table11 delete(Integer table11Id) throws EntityNotFoundException;

	/**
	 * Finds all Table11s.
	 *
	 * @return A list of Table11s.
	 */
    @Deprecated
	Page<Table11> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Table11s.
	 * @return A list of Table11s.
	 */
    Page<Table11> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Table11s in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Table11.
	 */
	long count(String query);


}

