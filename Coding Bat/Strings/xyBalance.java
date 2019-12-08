public boolean xyBalance(String str) {
  int pos1 = str.lastIndexOf('x');
  int pos2 = str.lastIndexOf('y');
  if(pos1 == -1 & pos2 == -1)
    return true;
  else if(pos1 > pos2)
    return false;
  else if(pos2 > pos1)
    return true;
  else
    return false;
}
