/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.engine.jdbc.dialect.spi;

/**
 * Exposes information about the database and JDBC driver that can be used in resolving the appropriate Dialect
 * to use.
 * <p/>
 * The information here mimics part of the JDBC {@link java.sql.DatabaseMetaData} contract, specifically the portions
 * about database and driver names and versions.
 */
public interface DialectResolutionInfo {
	/**
	 * Constant used to indicate that no version is defined
	 */
	int NO_VERSION = -9999;

	/**
	 * Obtain access to the database name, as returned from {@link java.sql.DatabaseMetaData#getDatabaseProductName()}
	 * for the target database
	 *
	 * @return The database name
	 *
	 * @see java.sql.DatabaseMetaData#getDatabaseProductName()
	 */
	String getDatabaseName();

	/**
	 * Obtain access to the database version, as returned from {@link java.sql.DatabaseMetaData#getDatabaseProductVersion()}
	 * for the target database
	 *
	 * @return The database version
	 *
	 * @see java.sql.DatabaseMetaData#getDatabaseProductVersion()
	 */
	String getDatabaseVersion();

	/**
	 * Obtain access to the database major version, as returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseMajorVersion()} for the target database.
	 *
	 * @return The database major version, or {@value #NO_VERSION} to indicate "no version information"
	 *
	 * @see java.sql.DatabaseMetaData#getDatabaseMajorVersion()
	 */
	int getDatabaseMajorVersion();

	/**
	 * Obtain access to the database minor version, as returned from
	 * {@link java.sql.DatabaseMetaData#getDatabaseMinorVersion()} for the target database.
	 *
	 * @return The database minor version, or {@value #NO_VERSION} to indicate "no version information"
	 *
	 * @see java.sql.DatabaseMetaData#getDatabaseMinorVersion()
	 */
	int getDatabaseMinorVersion();

	/**
	 * Obtain access to the name of the JDBC driver, as returned from {@link java.sql.DatabaseMetaData#getDriverName()}
	 * for the target database
	 *
	 * @return The JDBC driver name
	 *
	 * @see java.sql.DatabaseMetaData#getDriverName()
	 */
	String getDriverName();

	/**
	 * Obtain access to the major version of the JDBC driver, as returned from
	 * {@link java.sql.DatabaseMetaData#getDriverMajorVersion()} ()} for the target database.
	 *
	 * @return The JDBC driver major version, or {@value #NO_VERSION} to indicate "no version information"
	 *
	 * @see java.sql.DatabaseMetaData#getDriverMajorVersion()
	 */
	int getDriverMajorVersion();

	/**
	 * Obtain access to the minor version of the JDBC driver, as returned from
	 * {@link java.sql.DatabaseMetaData#getDriverMinorVersion()} for the target database.
	 *
	 * @return The JDBC driver minor version, or {@value #NO_VERSION} to indicate "no version information"
	 *
	 * @see java.sql.DatabaseMetaData#getDriverMinorVersion()
	 */
	int getDriverMinorVersion();

	/**
	 * Obtain access to the underlying object of the given type.
	 *
	 * Return <code>null</code> if the underlying object is not of the given type.
	 *
	 * @return The unwrapped object or <code>null</code>
	 */
	default <T> T unwrap(Class<T> clazz) {
		return null;
	}

}
