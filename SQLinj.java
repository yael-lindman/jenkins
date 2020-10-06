public static void getUser(String x, String y, HttpServletRequest req) 
          throws SQLException {
      String __x_OR_y_0 = null;
      ResultSet results = null;
      String query;
      Connection connection = getConnection();
      if (runningOnWindows())  {
      query = "SELECT TOP 1 first_name FROM user_data "
              + "WHERE userId = " + "?";
      __x_OR_y_0 = x;
      }  else { 
          query = "SELECT first_name FROM user_data WHERE " + "userId = " + "?";
      __x_OR_y_0 = y;
      }
      PreparedStatement statement = connection.prepareStatement(query, 
              ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      statement.setString(1, __x_OR_y_0);
      results = statement.executeQuery(query);
 }
