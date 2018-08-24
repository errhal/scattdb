package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class SettingsController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def settings() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.settings())
  }
}
