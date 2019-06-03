public double getPayAmount() {
  double result;
  if (isDead){
    result = deadAmount();
  }
  if (isSeparated){
      result = separatedAmount();
  }
  if (isRetired){
      result = retiredAmount();
  }
  if(isNormal){
      result = normalPayAmount();
  }
  return result;
}