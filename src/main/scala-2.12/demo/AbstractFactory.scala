package demo

import creational.{DatabaseClientt, MySqlFactory, PgSqlFactory}

/**
  * Created by kprzystalski on 31/03/17.
  */
object AbstractFactory {
  def main(args: Array[String]): Unit = {
    val clientMySql: DatabaseClientt = new DatabaseClientt(new MySqlFactory)
    val clientPgSql: DatabaseClientt = new DatabaseClientt(new PgSqlFactory)
    clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees")
  }
}