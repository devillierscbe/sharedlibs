def tomcatDeploy()
{
 sh "ansible-playbook -i tomcat libdemo.yml"
}
