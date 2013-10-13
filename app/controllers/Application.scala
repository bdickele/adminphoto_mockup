package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def galleries = Action {
    Ok(views.html.galleries())
  }

  def gallery(id: Long) = Action {
    Ok(views.html.gallery())
  }

  def pictures = Action {
    Ok(views.html.pictures())
  }

}