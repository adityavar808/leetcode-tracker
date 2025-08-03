// Last updated: 8/4/2025, 12:56:33 AM
class Solution {
    public String generateTag(String caption) {
        String[] words = caption.trim().split("\\s+");
        StringBuilder tagBuilder = new StringBuilder("#");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("[^a-zA-Z]", "");
            if (word.isEmpty()) continue;

            if (i == 0) {
                tagBuilder.append(word.toLowerCase());
            } else {
                tagBuilder.append(Character.toUpperCase(word.charAt(0)));
                tagBuilder.append(word.substring(1).toLowerCase());
            }
        }

        if (tagBuilder.length() > 100) {
            return tagBuilder.substring(0, 100);
        }

        return tagBuilder.toString();
    }
}
