package scala99

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

object FileWriter {
  def write(data: String, path: String) = {

    Files.write(Paths.get(path), data.getBytes(StandardCharsets.UTF_8))
  }
}
