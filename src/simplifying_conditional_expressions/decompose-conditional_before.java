bool IsSummer(int date){
    if(date.before(SUMMER_START) || date.after(SUMMER_END)){
        return true;
        }
    return false;
}

int semCharge =  quantity * winterRate;
if (IsSummer(date)) {
  charge = semCharge + winterServiceCharge;
}
else {
  charge = semCharge;
}