def newgit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newbuild()
{
  sh "mvn package"
}
def newdeploy(jobname,ip,contextpath)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
def newselinium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
