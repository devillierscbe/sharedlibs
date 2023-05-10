def tomcatDeploy()
{
 ansiblePlaybook credentialsId: 'Ansible', disableHostKeyChecking: true, installation: 'ansible', inventory: 'demo.inv', playbook: 'libdemo.yml'
}
