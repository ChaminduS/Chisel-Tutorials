// See LICENSE.txt for license details.
package problems

import chisel3._

// Problem:
//
// Count incoming trues
// (increase counter every clock if 'in' is asserted)
//Problem has been completed

class Accumulator extends Module {
  val io = IO(new Bundle {
    val in  = Input(UInt(1.W))
    val out = Output(UInt(8.W))
  })

  // Implement below ----------
  val accumulator = RegInit(0.U(8.W))
  accumulator := accumulator + io.in
  io.out := accumulator 

  // Implement above ----------
}
