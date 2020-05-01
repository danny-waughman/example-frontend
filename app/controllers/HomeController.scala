package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import uk.gov.hmrc.play.bootstrap.controller.FrontendController
import views.html.Index

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(mcc: MessagesControllerComponents,
                               indexView: Index) extends FrontendController(mcc) {

  def index: Action[AnyContent] = Action { implicit request =>
    Ok(indexView())
  }

}