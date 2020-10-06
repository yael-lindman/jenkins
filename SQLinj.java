public static void getUser(String x, String y, HttpServletRequest req) 
          throws SQLException {
      ResultSet results = null;
      String query;
      Connection connection = getConnection();
      Statement statement = connection.createStatement(
              ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      if (runningOnWindows())  {
      query = "SELECT TOP 1 first_name FROM user_data "
              + "WHERE userId = " + x;
      }  else { 
          query = "SELECT first_name FROM user_data WHERE " + "userId = " + y;
      }
      results = statement.executeQuery(query);
 }
