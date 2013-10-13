/**
 * Classes and methods related to pictures stock
 * User: bdickele
 * Date: 13/10/13
 */

object PictureStock {

  abstract class StockFolder

  case class Gallery(name: String, folders: List[StockFolder]) extends StockFolder

  case class SubGallery(name: String, pictures: List[String]) extends StockFolder


  /**
   * @param folder
   * @return List of picture names of a gallery or a sub-category. "Picture name" here means path from root
   *         of pictures stock
   */
  def pictures(folder: StockFolder): List[String] = folder match {
    case SubGallery(_, pictures) => pictures
    case Gallery(_, folders) => (List[String]() /: folders)(_ ::: pictures(_))
  }
}

