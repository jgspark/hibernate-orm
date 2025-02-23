/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query;

import org.hibernate.HibernateException;
import org.hibernate.QueryException;

import java.util.Map;

/**
 * Indicates that validation and translation of one or more named
 * queries failed at initialization time.
 *
 * @author Gavin King
 */
public class NamedQueryValidationException extends QueryException {
	private final Map<String, HibernateException> errors;

	public NamedQueryValidationException(String message, Map<String, HibernateException> errors) {
		super( message );
		this.errors = errors;
	}

	/**
	 * A map from query name to the error that occurred while
	 * interpreting or translating the named query.
	 */
	public Map<String, HibernateException> getErrors() {
		return errors;
	}
}
