def tomcatDeploy(String inventory, String playbook){
 sh "ansible-playbook -i ${inventory} ${playbook}"
}
