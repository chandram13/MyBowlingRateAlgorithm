class StrikesGivenFrames{
  // n = number of players playing bowling, multiplied by 2 b/c of turns
  // x = number of turns for each frame
  def CalculatingStrikesProbability(n,x):
    2 * (n/10) * (1/10 * x)
    // g is an empty constant representing the gutter (player receives no points for fallen pins)
    // Maximum points is 300, given 12 strikes
  def CaclulatingBowlingPoints(x, g = 0):
    1/6 * (1/2 * x) + 10 + g
  // player recieves turkey status after 3 strikes occur repeatedly
  def getTurkey():
    2 * (n/10) + 3 * (1/10)
}