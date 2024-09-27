def download(filename)
 {
  git "https://github.com/intelliqittrainings/${filename}.git"
 }
def build()
{
  sh 'mvn package'
}

