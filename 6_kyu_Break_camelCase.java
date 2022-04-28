class Solution {
  public static String camelCase(String input) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        sb.append(" " + input.charAt(i));
      } else {
        sb.append(input.charAt(i));
      }
    }
    return sb.toString();
  }
}