public String makeOutWord(String out, String word) {
  String first = out.substring(0,2);
  String last = out.substring(out.length()-2);
  String output = first + word + last;
  return output;
}
