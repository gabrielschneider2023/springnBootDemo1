# springnBootDemo1
## the problem 
```shell
$ git push -u origin main
remote: Support for password authentication was removed on August 13, 2021.
remote: Please see https://docs.github.com/en/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.
fatal: Authentication failed for 'https://github.com/gabrielschneider2023/springnBootDemo1.git/'
```
## how to solve the problem
- step 1
   ```shell
   the username is your email account
- step 2
    ```shell
    the password is your persoanl classic api key
    ```
- step 3
  ```shell
  $ git clone https://github.com/USERNAME/REPO.git
    Username: YOUR_USERNAME
    Password: YOUR_PERSONAL_ACCESS_TOKEN  
  how to generate the api key :
     Go to settings in your Github account >> Developer settings >> Personal access token >> Tokens (classic) >> Generate new token
   ```