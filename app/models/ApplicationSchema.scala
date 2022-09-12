package models

import org.squeryl.Schema


object ApplicationSchema extends Schema {

  val studentSurveys = table[StudentSurvey]("studentsurveys")
  val userNames = table[UserName]("usernames")
}
