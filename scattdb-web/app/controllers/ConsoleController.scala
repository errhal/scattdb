package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class ConsoleController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def console() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.console())
  }
}
