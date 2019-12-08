public boolean gHappy(String str) {
  boolean happy = false;
  if(str.indexOf('g') == -1)
    return true;
  for(int i = 0; i < (str.length() - 1); i++) {
    if(str.charAt(i) == 'g' && !(str.charAt(i+1) == 'g' || str.charAt(i-1) == 'g'))
      happy = false;
    else if(str.charAt(i) == 'g' && (str.charAt(i+1) == 'g'))
      happy = true;
  }
  if(happy == true) {
    if(str.charAt(str.length()-1) == 'g')
      if(str.charAt(str.length()-2) != 'g')
        return false;
  
  }
  return happy;

}
