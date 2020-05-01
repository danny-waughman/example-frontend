package controllers


import javax.inject._
import models.Payment
import org.joda.time.LocalDate
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
    Ok(indexView(List(
      Payment(LocalDate.parse("01-01-20"), "abcd1234", 20.00),
      Payment(LocalDate.parse("05-01-20"), "efgh5678", 50.00)
    )))
  }

}