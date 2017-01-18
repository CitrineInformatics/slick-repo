/*
 * Copyright 2017 byteslounge.com (Gonçalo Marques).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.byteslounge.slickrepo.test

package object scalaversion {
  type H2Profile = slick.driver.H2Driver
  val DB2Profile = com.typesafe.slick.driver.db2.DB2Driver
  val SQLServerProfile = com.typesafe.slick.driver.ms.SQLServerDriver
  val OracleProfile = com.typesafe.slick.driver.oracle.OracleDriver
  val H2Profile = slick.driver.H2Driver
  val MySQLProfile = slick.driver.MySQLDriver
  val PostgresProfile = slick.driver.PostgresDriver
  val DerbyProfile = slick.driver.DerbyDriver
  val HsqldbProfile = slick.driver.HsqldbDriver
}
