package services

import com.google.gson.Gson

import javax.inject.Inject

class GsonService @Inject()() {

  def getGson(): Gson = {
    new Gson()
  }

}
