// See LICENSE.txt for license details.
package problems

import chisel3._

// Problem:
//
// Implement a dual port memory of 256 8-bit words.
// When 'wen' is asserted, write 'wrData' to memory at 'wrAddr'
// When 'ren' is asserted, 'rdData' holds the output
// of reading the memory at 'rdAddr'
//Problem has been completed

class Memo extends Module {
  val io = IO(new Bundle {
    val wen     = Input(Bool())
    val wrAddr  = Input(UInt(8.W))
    val wrData  = Input(UInt(8.W))
    val ren     = Input(Bool())
    val rdAddr  = Input(UInt(8.W))
    val rdData  = Output(UInt(8.W))
  })

  val mem = Mem(256, UInt(8.W))

  // Implement below ----------
  when(io.wen){mem(io.wrAddr):=io.wrData}

  io.rdData:=0.U
  when(io.ren){io.rdData:=mem(io.rdAddr)}

  // Implement above ----------

}
