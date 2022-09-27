#此文件列出使用GitHub过程中出现的常见问题

##1、无法访问GitHub
修改hosts文件,刷新配置：cmd中敲入ipconfig /flushdns；
windows系统文件路径：C:\Windows\System32\drivers\etc\hosts
```
185.199.108.154               github.githubassets.com
140.82.113.22                 central.github.com
185.199.108.133               desktop.githubusercontent.com
185.199.108.153               assets-cdn.github.com
185.199.108.133               camo.githubusercontent.com
185.199.108.133               github.map.fastly.net
199.232.69.194                github.global.ssl.fastly.net
140.82.113.3                  gist.github.com
185.199.108.153               github.io
140.82.114.4                  github.com
140.82.112.6                  api.github.com
185.199.108.133               raw.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
140.82.113.9                  codeload.github.com
52.217.88.28                  github-cloud.s3.amazonaws.com
52.216.238.99                 github-com.s3.amazonaws.com
52.216.26.252                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.101.68                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.48.84                  github-production-repository-file-5c1aeb.s3.amazonaws.com
185.199.108.153               githubstatus.com
64.71.168.201                 github.community
185.199.108.133               media.githubusercontent.com
```

##2、GitHub代码无法上传
错误类型为：fatal: unable to access 'https://github.com/xxxxx/xxxxx.git/': The requested URL returned error: 403
>在项目的隐藏文件夹 .git 中找到 config 文件，修改里面项目的URL为：git@github.com:仓库名/项目名.git

错误类型为：fatal: unable to access 'https://github.com/XXX.git/': OpenSSL SSL_read: SSL_ERROR_SYSCALL, errno 10054
>使用命令 git config --global http.postBuffer 524288000

错误类型为：fatal: unable to access 'https://github.com/XXX.git/': Failed to connect to github.com port 443: Timed out
>使用命令 git config --global --unset http.proxy