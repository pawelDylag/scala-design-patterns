package demo

import creational.{DatabaseClient, MysqlClient, PgSqlClient}

/**
  * Created by kprzystalski on 31/03/17.
  */

object FactoryMethod {
  def main(args: Array[String]): Unit = {
    val clientMySql: DatabaseClient = new MysqlClient
    val clientPgSql: DatabaseClient = new PgSqlClient
    clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees")
  }
}
