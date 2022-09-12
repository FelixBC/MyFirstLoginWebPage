package controllers

import org.squeryl.KeyedEntity

trait Model extends KeyedEntity[Long] {

  var id: Long = 0L

}
