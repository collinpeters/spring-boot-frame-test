Reproducing issue with X-Frame-Options

Instructions
* Run both with `mvn spring-boot:run`
* Get token
	```
	curl -X POST -u myclient:mysecret -H "Content-Type: application/x-www-form-urlencoded" -d 'grant_type=password&username=user&password=secret' "http://localhost:9999/oauth/token"
	{"access_token":"c0c0ca20-8e4d-4014-8c31-5d58c8081d13","token_type":"bearer","refresh_token":"a37f7956-e1c0-4a58-bf2b-bd92ec51a488","expires_in":43138,"scope":"access"}"}
	```
* Call resource
	```
	curl -v -X GET -H "Accept: application/json" -H "Authorization: Bearer c0c0ca20-8e4d-4014-8c31-5d58c8081d13" "http://localhost:8899/test
	```
* Response includes header `X-Frame-Options: DENY`
* Question now is how to disable it?
