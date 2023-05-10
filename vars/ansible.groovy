def tomcatDeploy()
{
 sh "ansible-playbook -i inventory libdemo.yml"
}
