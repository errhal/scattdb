package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class DashboardController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def dashboard() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.dashboard())
  }
}
