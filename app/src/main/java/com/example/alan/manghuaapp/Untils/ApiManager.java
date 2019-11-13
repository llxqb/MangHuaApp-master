package com.example.alan.manghuaapp.Untils;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class ApiManager {

    public static final String BASE_URL = "http://api.kkmh.com/v1/";

    /*
    * 0?since=0&sa_event=eyJkaXN0aW5jdF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsImV2ZW50IjoiUmVhZEhvbWVQYWdlIiwib3JpZ2luYWxfaWQiOiJBOmFjOTk1Y2E3ZTFiMDM2YjciLCJwcm9qZWN0Ijoia3VhaWthbl9hcHAiLCJwcm9wZXJ0aWVzIjp7IkZpbmRUYWJOYW1lIjoi5YiG57G7IiwiRnJvbUhvbWVwYWdlVGFiTmFtZSI6IueDremXqCIsIkZyb21Ib21lcGFnZVVwZGF0ZURhdGUiOjAsIkhvbWVwYWdlVGFiTmFtZSI6IueDremXqCIsIkhvbWVwYWdlVXBkYXRlRGF0ZSI6MSwiVHJpZ2dlclBhZ2UiOiJIb21lUGFnZSIsIlZDb21tdW5pdHlUYWJOYW1lIjoi54Ot6ZeoIiwiUHJvcGVydHlFdmVudCI6IlJlYWRIb21lUGFnZSIsIiRhcHBfdmVyc2lvbiI6IjMuNS4xIiwiJGxpYl92ZXJzaW9uIjoiMS42LjEzIiwiJG1hbnVmYWN0dXJlciI6IlhpYW9taSIsIiRtb2RlbCI6Ik1JIDUiLCIkb3MiOiJBbmRyb2lkIiwiJG9zX3ZlcnNpb24iOiI2LjAuMSIsIiRzY3JlZW5faGVpZ2h0IjoxOTIwLCIkc2NyZWVuX3dpZHRoIjoxMDgwLCIkd2lmaSI6dHJ1ZSwiJGNhcnJpZXIiOiLkuK3lm73ogZTpgJoiLCIkbmV0d29ya190eXBlIjoiV0lGSSIsImFidGVzdF9ncm91cCI6MH0sInRpbWUiOjE0ODIxMzM1NzAwNzEsInR5cGUiOiJ0cmFjayJ9
    *
    * **/
    //热门
    public static final String WEEK_URL = "daily/comic_lists/{weeken}?since=0&sa_event=eyJkaXN0aW5jdF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsImV2ZW50IjoiUmVhZEhvbWVQYWdlIiwib3JpZ2luYWxfaWQiOiJBOmFjOTk1Y2E3ZTFiMDM2YjciLCJwcm9qZWN0Ijoia3VhaWthbl9hcHAiLCJwcm9wZXJ0aWVzIjp7IkZpbmRUYWJOYW1lIjoi5YiG57G7IiwiRnJvbUhvbWVwYWdlVGFiTmFtZSI6IueDremXqCIsIkZyb21Ib21lcGFnZVVwZGF0ZURhdGUiOjAsIkhvbWVwYWdlVGFiTmFtZSI6IueDremXqCIsIkhvbWVwYWdlVXBkYXRlRGF0ZSI6MSwiVHJpZ2dlclBhZ2UiOiJIb21lUGFnZSIsIlZDb21tdW5pdHlUYWJOYW1lIjoi54Ot6ZeoIiwiUHJvcGVydHlFdmVudCI6IlJlYWRIb21lUGFnZSIsIiRhcHBfdmVyc2lvbiI6IjMuNS4xIiwiJGxpYl92ZXJzaW9uIjoiMS42LjEzIiwiJG1hbnVmYWN0dXJlciI6IlhpYW9taSIsIiRtb2RlbCI6Ik1JIDUiLCIkb3MiOiJBbmRyb2lkIiwiJG9zX3ZlcnNpb24iOiI2LjAuMSIsIiRzY3JlZW5faGVpZ2h0IjoxOTIwLCIkc2NyZWVuX3dpZHRoIjoxMDgwLCIkd2lmaSI6dHJ1ZSwiJGNhcnJpZXIiOiLkuK3lm73ogZTpgJoiLCIkbmV0d29ya190eXBlIjoiV0lGSSIsImFidGVzdF9ncm91cCI6MH0sInRpbWUiOjE0ODIxMzM1NzAwNzEsInR5cGUiOiJ0cmFjayJ9";

    /*
    *广场
    * v1/feeds/feed_lists?uid=&since=0&page_num=1&catalog_type=2&sa_event=eyJkaXN0aW5jdF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsImV2ZW50IjoiUmVhZFZDb21tdW5pdHkiLCJvcmlnaW5hbF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsInByb2plY3QiOiJrdWFpa2FuX2FwcCIsInByb3BlcnRpZXMiOnsiRmluZFRhYk5hbWUiOiLliIbnsbsiLCJGcm9tVkNvbW11bml0eVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVVwZGF0ZURhdGUiOjAsIlRyaWdnZXJQYWdlIjoiVkNvbW11bml0eVBhZ2UiLCJWQ29tbXVuaXR5VGFiTmFtZSI6IueDremXqCIsIlByb3BlcnR5RXZlbnQiOiJSZWFkVkNvbW11bml0eSIsIiRhcHBfdmVyc2lvbiI6IjMuNS4xIiwiJGxpYl92ZXJzaW9uIjoiMS42LjEzIiwiJG1hbnVmYWN0dXJlciI6IlhpYW9taSIsIiRtb2RlbCI6Ik1JIDUiLCIkb3MiOiJBbmRyb2lkIiwiJG9zX3ZlcnNpb24iOiI2LjAuMSIsIiRzY3JlZW5faGVpZ2h0IjoxOTIwLCIkc2NyZWVuX3dpZHRoIjoxMDgwLCIkd2lmaSI6dHJ1ZSwiJGNhcnJpZXIiOiLkuK3lm73ogZTpgJoiLCIkbmV0d29ya190eXBlIjoiV0lGSSIsImFidGVzdF9ncm91cCI6MH0sInRpbWUiOjE0ODIxMzM2NDMwMTksInR5cGUiOiJ0cmFjayJ9
    * http://api.kkmh.com/v1/feeds/feed_lists?uid=&since=0&page_num=1&catalog_type=2&sa_event=eyJkaXN0aW5jdF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsImV2ZW50IjoiUmVhZFZDb21tdW5pdHkiLCJvcmlnaW5hbF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsInByb2plY3QiOiJrdWFpa2FuX2FwcCIsInByb3BlcnRpZXMiOnsiRmluZFRhYk5hbWUiOiLliIbnsbsiLCJGcm9tVkNvbW11bml0eVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVVwZGF0ZURhdGUiOjAsIlRyaWdnZXJQYWdlIjoiVkNvbW11bml0eVBhZ2UiLCJWQ29tbXVuaXR5VGFiTmFtZSI6IueDremXqCIsIlByb3BlcnR5RXZlbnQiOiJSZWFkVkNvbW11bml0eSIsIiRhcHBfdmVyc2lvbiI6IjMuNS4xIiwiJGxpYl92ZXJzaW9uIjoiMS42LjEzIiwiJG1hbnVmYWN0dXJlciI6IlhpYW9taSIsIiRtb2RlbCI6Ik1JIDUiLCIkb3MiOiJBbmRyb2lkIiwiJG9zX3ZlcnNpb24iOiI2LjAuMSIsIiRzY3JlZW5faGVpZ2h0IjoxOTIwLCIkc2NyZWVuX3dpZHRoIjoxMDgwLCIkd2lmaSI6dHJ1ZSwiJGNhcnJpZXIiOiLkuK3lm73ogZTpgJoiLCIkbmV0d29ya190eXBlIjoiV0lGSSIsImFidGVzdF9ncm91cCI6MH0sInRpbWUiOjE0ODIxMzM2NDMwMTksInR5cGUiOiJ0cmFjayJ9
     */
    //catalog_type=1
    public static final String SQUARE_URL = "feeds/feed_lists?uid=&since=0&page_num=1&sa_event=eyJkaXN0aW5jdF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsImV2ZW50IjoiUmVhZFZDb21tdW5pdHkiLCJvcmlnaW5hbF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsInByb2plY3QiOiJrdWFpa2FuX2FwcCIsInByb3BlcnRpZXMiOnsiRmluZFRhYk5hbWUiOiLliIbnsbsiLCJGcm9tVkNvbW11bml0eVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVVwZGF0ZURhdGUiOjAsIlRyaWdnZXJQYWdlIjoiVkNvbW11bml0eVBhZ2UiLCJWQ29tbXVuaXR5VGFiTmFtZSI6IueDremXqCIsIlByb3BlcnR5RXZlbnQiOiJSZWFkVkNvbW11bml0eSIsIiRhcHBfdmVyc2lvbiI6IjMuNS4xIiwiJGxpYl92ZXJzaW9uIjoiMS42LjEzIiwiJG1hbnVmYWN0dXJlciI6IlhpYW9taSIsIiRtb2RlbCI6Ik1JIDUiLCIkb3MiOiJBbmRyb2lkIiwiJG9zX3ZlcnNpb24iOiI2LjAuMSIsIiRzY3JlZW5faGVpZ2h0IjoxOTIwLCIkc2NyZWVuX3dpZHRoIjoxMDgwLCIkd2lmaSI6dHJ1ZSwiJGNhcnJpZXIiOiLkuK3lm73ogZTpgJoiLCIkbmV0d29ya190eXBlIjoiV0lGSSIsImFidGVzdF9ncm91cCI6MH0sInRpbWUiOjE0ODIxMzM2NDMwMTksInR5cGUiOiJ0cmFjayJ9";

    /*
    *&page_num=3
    * **/
    public static final String SQUARE_MORE_URL = "feeds/feed_lists?uid=&since=74338044048084992&catalog_type=2&sa_event=eyJkaXN0aW5jdF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsImV2ZW50IjoiUmVhZFZDb21tdW5pdHkiLCJvcmlnaW5hbF9pZCI6IkE6YWM5OTVjYTdlMWIwMzZiNyIsInByb2plY3QiOiJrdWFpa2FuX2FwcCIsInByb3BlcnRpZXMiOnsiRmluZFRhYk5hbWUiOiLmjqjojZAiLCJGcm9tVkNvbW11bml0eVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVRhYk5hbWUiOiLng63pl6giLCJIb21lcGFnZVVwZGF0ZURhdGUiOjAsIlRyaWdnZXJQYWdlIjoiVkNvbW11bml0eVBhZ2UiLCJWQ29tbXVuaXR5VGFiTmFtZSI6IueDremXqCIsIlByb3BlcnR5RXZlbnQiOiJSZWFkVkNvbW11bml0eSIsIiRhcHBfdmVyc2lvbiI6IjMuNS4xIiwiJGxpYl92ZXJzaW9uIjoiMS42LjEzIiwiJG1hbnVmYWN0dXJlciI6IlhpYW9taSIsIiRtb2RlbCI6Ik1JIDUiLCIkb3MiOiJBbmRyb2lkIiwiJG9zX3ZlcnNpb24iOiI2LjAuMSIsIiRzY3JlZW5faGVpZ2h0IjoxOTIwLCIkc2NyZWVuX3dpZHRoIjoxMDgwLCIkd2lmaSI6dHJ1ZSwiJGNhcnJpZXIiOiLkuK3lm73ogZTpgJoiLCIkbmV0d29ya190eXBlIjoiV0lGSSIsImFidGVzdF9ncm91cCI6MH0sInRpbWUiOjE0ODI0ODI3MTUxMzksInR5cGUiOiJ0cmFjayJ9";
}
