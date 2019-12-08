public boolean commonEnd(int[] a, int[] b) {
  if(a[0] == b[0])
    return true;
  else if(a[a.length-1] == b[b.length-1])
    return true;
  else
    return false;
}
