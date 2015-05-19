// --------------------------------------------------------------------
// Copyright (c) 2015 by Semillero ADT. 
// --------------------------------------------------------------------
//
// --------------------------------------------------------------------
//
//                     web: https://sites.google.com/site/semilleroadt/
//                     email: semilleroadtupb@gmail.com
//
// --------------------------------------------------------------------
//
// Major Functions:	BE-MICRO MAX10 TOP
//
// --------------------------------------------------------------------
//
// Revision History :
// --------------------------------------------------------------------
//   Ver  :| Author            :| Mod. Date :| Changes Made:

// --------------------------------------------------------------------



module ( //CLOCKS
						CLK_50,
						USER_CLK,
						
                                                //LED
						LED,

                                              //SW
						SW,

                                               //AD5681R
						AD5681R_LDACn,
						AD5681R_RSTn,
						AD5681R_SCL,
						AD5681R_SDA,
						AD5681R_SYNCn,

);



//CLOCKS
input CLK_50;
input USER_CLK;

//LED
output [7:0]LED;

//SW
input [3:0]SW;

//AD5681R
output AD5681R_LDACn;
output AD5681R_RSTn;
output AD5681R_SCL;
output AD5681R_SDA;
output AD5681R_SYNCn;

//=======================================================
//  REG/WIRE declarations
//======================================================= 

 //=======================================================
//  Structural coding
//======================================================= 

  //assign GPIO_2[55:0]=56'd0; 

 endmodule   