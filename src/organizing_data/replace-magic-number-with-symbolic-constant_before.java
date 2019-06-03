static final double GRATITATIONAL_CONSTANT = 9.81;
double potentialEnergy(double mass, double height) {
  return mass * height * GRATITATIONAL_CONSTANT;
}