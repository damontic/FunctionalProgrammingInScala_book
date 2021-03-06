package co.damontic.candymachine

trait Input
case object Coin extends Input
case object Turn extends Input

case class Machine (locked : Boolean, candies : Int, coins : Int)