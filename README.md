Reposotory was taken from github.com/RameshMF/springboot-blog-rest-api.git for educational purposes. Thanks RameshMF.

Hypermedia-driven REST service with Spring HATEOAS

Try:
http://localhost:9080/api/v1/posts/1

```JSON
{
   "id":1,
   "title":"sample",
   "description":"test post",
   "content":"my first post",
   "comments":null,
   "_links":{
      "self":{
         "href":"http://localhost:9080/api/v1/posts/1"
      },
      "comments":{
         "href":"http://localhost:9080/api/v1/posts/1/comments"
      }
   }
}
```
