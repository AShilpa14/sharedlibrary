def download(filename)
 {
  git "https://github.com/intelliqittrainings/${filename}.git"
 }
def buildstep()
{
  sh "mvn package"
}

