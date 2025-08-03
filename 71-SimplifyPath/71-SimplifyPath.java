// Last updated: 8/4/2025, 12:59:24 AM
class Solution {
  public String simplifyPath(String path) {
    final String[] DIRS = path.split("/");
    Stack<String> stack = new Stack<>();

    for (final String dir : DIRS) {
      if (dir.isEmpty() || dir.equals("."))
        continue;
      if (dir.equals("..")) {
        if (!stack.isEmpty())
          stack.pop();
      } else {
        stack.push(dir);
      }
    }

    return "/" + String.join("/", stack);
  }
}