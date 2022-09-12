package models

import controllers.Model


case class StudentSurvey(firstName: String,
                         lastName: String,
                         career: String,
                         sex: String,
                         survey: String) extends Model


case class UserName(
                   username: String,
                   password: String
                   ) extends Model

