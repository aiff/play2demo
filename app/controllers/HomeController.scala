package controllers

import javax.inject.Inject
import models.Widget
import play.api.mvc.{AbstractController, ControllerComponents}
import scala.collection.mutable.ArrayBuffer
import play.api.data._
import play.api.data.Forms._
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action {
    Ok(views.html.index())
  }
  private val widgets = ArrayBuffer(
    Widget("Widget 1", 123),
    Widget("Widget 2", 456),
    Widget("Widget 3", 789)
  )

  def listWidgets = Action {
    Ok(views.html.listWidgets(widgets.toSeq,HomeController.createWidgetForm))
  }
  def createWidget = TODO

}
  object HomeController
{ val createWidgetForm = Form(
  mapping(
  "name" -> text,
  "price" -> number
  )(Widget.apply)(Widget.unapply)

  )
}