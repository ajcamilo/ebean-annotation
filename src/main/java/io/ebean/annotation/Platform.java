package io.ebean.annotation;

/**
 * Built in supported platforms.
 */
public enum Platform {

  /**
   * Generic base platform configured via properties or code.
   */
  GENERIC,

  /**
   * DB2.
   */
  DB2,

  /**
   * CockroachDB.
   */
  COCKROACH,

  /**
   * H2.
   */
  H2,

  /**
   * HsqlDB.
   */
  HSQLDB,

  /**
   * Postgres.
   */
  POSTGRES,

  /**
   * MySql.
   */
  MYSQL,

  /**
   * Oracle.
   */
  ORACLE,

  /**
   * SQLAnywhere.
   */
  SQLANYWHERE,

  /**
   * SQLite.
   */
  SQLITE,

  /**
   * Microsoft SQL Server 2016 platform (Non UTF8 types and Identity by default).
   */
  SQLSERVER16,

  /**
   * Microsoft SQL Server 2017 platform (UTF8 types and Sequence).
   */
  SQLSERVER17,

  /**
   * Microsoft SQL Server (preferred platform 2017).
   */
  SQLSERVER;

}
