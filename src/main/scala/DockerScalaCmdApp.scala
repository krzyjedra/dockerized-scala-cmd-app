object DockerScalaCmdApp extends App {

  import java.io.File

  def getListOfFiles(dir: String) = {
    val file = new File(dir)
    file.listFiles
      .map(_.getName).foreach(println)
  }

  print(getListOfFiles(args(0)))
}
