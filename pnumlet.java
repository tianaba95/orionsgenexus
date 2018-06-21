/*
               File: Pnumlet
        Description: Traduce importe a letras
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.67
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumlet extends GXProcedure
{
   public pnumlet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumlet.class ), "" );
   }

   public pnumlet( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( java.math.BigDecimal[] aP0 )
   {
      pnumlet.this.AV8Importe = aP0[0];
      this.aP0 = aP0;
      pnumlet.this.AV9Letra = aP1[0];
      this.aP1 = aP1;
      pnumlet.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             String[] aP1 )
   {
      pnumlet.this.AV8Importe = aP0[0];
      this.aP0 = aP0;
      pnumlet.this.AV9Letra = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Cen1 = " CIENTO " ;
      AV38Cen2 = "DOSCIENTOS " ;
      AV39Cen3 = "TRESCIENTOS " ;
      AV40Cen4 = "CUATROCIENTOS " ;
      AV41Cen5 = "QUINIENTOS " ;
      AV42Cen6 = "SEISCIENTOS " ;
      AV43Cen7 = "SETECIENTOS " ;
      AV44Cen8 = "OCHOCIENTOS " ;
      AV45Cen9 = "NOVECIENTOS " ;
      AV46Dec1 = "DIEZ " ;
      AV47Dec2 = "VEINTI" ;
      AV48Dec3 = "TREINTA " ;
      AV49Dec4 = "CUARENTA " ;
      AV50Dec5 = "CINCUENTA " ;
      AV51Dec6 = "SESENTA " ;
      AV52Dec7 = "SETENTA " ;
      AV53Dec8 = "OCHENTA " ;
      AV54Dec9 = "NOVENTA " ;
      AV55Die1 = "ONCE " ;
      AV56Die2 = "DOCE " ;
      AV57Die3 = "TRECE " ;
      AV58Die4 = "CATORCE " ;
      AV59Die5 = "QUINCE " ;
      AV60Die6 = "DIECISEIS " ;
      AV61Die7 = "DIECISIETE " ;
      AV62Die8 = "DIECIOCHO " ;
      AV63Die9 = "DIECINUEVE " ;
      AV64Uni1 = "UN " ;
      AV65Uni2 = "DOS " ;
      AV66Uni3 = "TRES " ;
      AV67Uni4 = "CUATRO " ;
      AV68Uni5 = "CINCO " ;
      AV69Uni6 = "SEIS " ;
      AV70Uni7 = "SIETE " ;
      AV71Uni8 = "OCHO " ;
      AV72Uni9 = "NUEVE " ;
      AV73Sep1 = " " ;
      AV74Sep2 = "MIL " ;
      AV75Sep3 = "MILLON " ;
      AV76Sep4 = "MIL " ;
      AV77Sep5 = "BILLON " ;
      AV10N = AV8Importe ;
      AV23Tr5 = (long)(GXutil.Int( DecimalUtil.decToDouble(AV10N.divide(DecimalUtil.doubleToDec(1000000000000L), 18, java.math.BigDecimal.ROUND_DOWN)))) ;
      AV10N = AV10N.subtract(DecimalUtil.doubleToDec(AV23Tr5*1000000000000L)) ;
      AV22Tr4 = (long)(GXutil.Int( DecimalUtil.decToDouble(AV10N.divide(DecimalUtil.doubleToDec(1000000000L), 18, java.math.BigDecimal.ROUND_DOWN)))) ;
      AV10N = AV10N.subtract(DecimalUtil.doubleToDec(AV22Tr4*1000000000L)) ;
      AV21Tr3 = (short)(GXutil.Int( DecimalUtil.decToDouble(AV10N.divide(DecimalUtil.doubleToDec(1000000), 18, java.math.BigDecimal.ROUND_DOWN)))) ;
      AV10N = AV10N.subtract(DecimalUtil.doubleToDec(AV21Tr3*1000000)) ;
      AV20Tr2 = (long)(GXutil.Int( DecimalUtil.decToDouble(AV10N.divide(DecimalUtil.doubleToDec(1000), 18, java.math.BigDecimal.ROUND_DOWN)))) ;
      AV10N = AV10N.subtract(DecimalUtil.doubleToDec(AV20Tr2*1000)) ;
      AV19Tr1 = (short)(GXutil.Int( DecimalUtil.decToDouble(AV10N))) ;
      AV18Tr0 = (short)(DecimalUtil.decToDouble((AV8Importe.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV8Importe))))).multiply(DecimalUtil.doubleToDec(100)))) ;
      AV25P = (byte)(0) ;
      if ( AV22Tr4 > 0 )
      {
         AV25P = (byte)(AV25P+1) ;
      }
      if ( AV21Tr3 > 0 )
      {
         AV25P = (byte)(AV25P+1) ;
      }
      AV9Letra = "" ;
      if ( AV8Importe.doubleValue() == 0 )
      {
         AV9Letra = "CERO" ;
      }
      else
      {
         AV26Trio = (short)(AV23Tr5) ;
         AV24I = (byte)(5) ;
         /* Execute user subroutine: 'ALFA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9Letra = GXutil.concat( AV9Letra, AV11Lit, "") ;
         AV26Trio = (short)(AV22Tr4) ;
         AV24I = (byte)(4) ;
         /* Execute user subroutine: 'ALFA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9Letra = GXutil.concat( AV9Letra, AV11Lit, "") ;
         AV26Trio = AV21Tr3 ;
         AV24I = (byte)(3) ;
         /* Execute user subroutine: 'ALFA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9Letra = GXutil.concat( AV9Letra, AV11Lit, "") ;
         AV26Trio = (short)(AV20Tr2) ;
         AV24I = (byte)(2) ;
         /* Execute user subroutine: 'ALFA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9Letra = GXutil.concat( AV9Letra, AV11Lit, "") ;
         AV26Trio = AV19Tr1 ;
         AV24I = (byte)(1) ;
         /* Execute user subroutine: 'ALFA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9Letra = GXutil.concat( AV9Letra, AV11Lit, "") ;
         AV83Aux = " " + AV82MonDesAbv + " PESOS M/cte CON " ;
         AV11Lit = GXutil.str( AV18Tr0, 2, 0) ;
         AV9Letra = GXutil.concat( AV9Letra, AV11Lit, AV83Aux) ;
         AV9Letra = GXutil.concat( AV9Letra, "/100 CTVS", "") ;
      }
      AV9Letra = GXutil.concat( AV9Letra, " ", "") ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ALFA' Routine */
      AV28Tt1 = DecimalUtil.doubleToDec(AV26Trio/ (double) (100)) ;
      AV31T1 = (byte)(GXutil.Int( DecimalUtil.decToDouble(AV28Tt1))) ;
      AV29Tt2 = DecimalUtil.doubleToDec((AV26Trio-(AV31T1*100))/ (double) (10)) ;
      AV32T2 = (byte)(GXutil.Int( DecimalUtil.decToDouble(AV29Tt2))) ;
      AV30Tt3 = DecimalUtil.doubleToDec(AV26Trio-(AV31T1*100)-(AV32T2*10)) ;
      AV33T3 = (byte)(GXutil.Int( DecimalUtil.decToDouble(AV30Tt3))) ;
      AV34L1 = GXutil.str( AV31T1, 1, 0) ;
      AV35L2 = GXutil.str( AV32T2, 1, 0) ;
      AV36L3 = GXutil.str( AV33T3, 1, 0) ;
      AV11Lit = "" ;
      if ( AV26Trio == 100 )
      {
         AV11Lit = GXutil.concat( AV11Lit, "CIEN ", " ") ;
      }
      else
      {
         if ( AV31T1 == 1 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV37Cen1, " ") ;
         }
         else if ( AV31T1 == 2 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV38Cen2, " ") ;
         }
         else if ( AV31T1 == 3 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV39Cen3, " ") ;
         }
         else if ( AV31T1 == 4 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV40Cen4, " ") ;
         }
         else if ( AV31T1 == 5 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV41Cen5, " ") ;
         }
         else if ( AV31T1 == 6 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV42Cen6, " ") ;
         }
         else if ( AV31T1 == 7 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV43Cen7, " ") ;
         }
         else if ( AV31T1 == 8 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV44Cen8, " ") ;
         }
         else if ( AV31T1 == 9 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV45Cen9, " ") ;
         }
      }
      if ( AV32T2 == 1 )
      {
         if ( AV33T3 == 0 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV46Dec1, " ") ;
         }
         else if ( AV33T3 == 1 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV55Die1, " ") ;
         }
         else if ( AV33T3 == 2 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV56Die2, " ") ;
         }
         else if ( AV33T3 == 3 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV57Die3, " ") ;
         }
         else if ( AV33T3 == 4 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV58Die4, " ") ;
         }
         else if ( AV33T3 == 5 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV59Die5, " ") ;
         }
         else if ( AV33T3 == 6 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV60Die6, " ") ;
         }
         else if ( AV33T3 == 7 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV61Die7, " ") ;
         }
         else if ( AV33T3 == 8 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV62Die8, " ") ;
         }
         else if ( AV33T3 == 9 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV63Die9, " ") ;
         }
      }
      else
      {
         if ( AV32T2 == 2 )
         {
            if ( AV33T3 == 0 )
            {
               AV11Lit = GXutil.concat( AV11Lit, "VEINTI ", " ") ;
            }
            if ( AV33T3 != 0 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV47Dec2, " ") ;
            }
         }
         else if ( AV32T2 == 3 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV48Dec3, " ") ;
         }
         else if ( AV32T2 == 4 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV49Dec4, " ") ;
         }
         else if ( AV32T2 == 5 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV50Dec5, " ") ;
         }
         else if ( AV32T2 == 6 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV51Dec6, " ") ;
         }
         else if ( AV32T2 == 7 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV52Dec7, " ") ;
         }
         else if ( AV32T2 == 8 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV53Dec8, " ") ;
         }
         else if ( AV32T2 == 9 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV54Dec9, " ") ;
         }
      }
      if ( ( AV33T3 > 0 ) && ( AV32T2 > 2 ) )
      {
         AV11Lit = GXutil.concat( AV11Lit, "Y", " ") ;
      }
      if ( ( AV33T3 > 0 ) && ( AV32T2 != 1 ) && ( ( AV26Trio > 1 ) || ! ( ( AV24I == 2 ) || ( AV24I == 4 ) ) ) )
      {
         if ( AV32T2 != 2 )
         {
            if ( AV33T3 == 1 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV64Uni1, " ") ;
            }
            else if ( AV33T3 == 2 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV65Uni2, " ") ;
            }
            else if ( AV33T3 == 3 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV66Uni3, " ") ;
            }
            else if ( AV33T3 == 4 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV67Uni4, " ") ;
            }
            else if ( AV33T3 == 5 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV68Uni5, " ") ;
            }
            else if ( AV33T3 == 6 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV69Uni6, " ") ;
            }
            else if ( AV33T3 == 7 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV70Uni7, " ") ;
            }
            else if ( AV33T3 == 8 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV71Uni8, " ") ;
            }
            else if ( AV33T3 == 9 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV72Uni9, " ") ;
            }
         }
         else
         {
            if ( AV33T3 == 1 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV64Uni1, "") ;
            }
            else if ( AV33T3 == 2 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV65Uni2, "") ;
            }
            else if ( AV33T3 == 3 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV66Uni3, "") ;
            }
            else if ( AV33T3 == 4 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV67Uni4, "") ;
            }
            else if ( AV33T3 == 5 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV68Uni5, "") ;
            }
            else if ( AV33T3 == 6 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV69Uni6, "") ;
            }
            else if ( AV33T3 == 7 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV70Uni7, "") ;
            }
            else if ( AV33T3 == 8 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV71Uni8, "") ;
            }
            else if ( AV33T3 == 9 )
            {
               AV11Lit = GXutil.concat( AV11Lit, AV72Uni9, "") ;
            }
         }
      }
      if ( ( AV26Trio > 0 ) || ( ( AV24I == 3 ) && ( ( AV25P == 2 ) || ( AV25P == 1 ) ) ) )
      {
         if ( AV24I == 1 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV73Sep1, " ") ;
         }
         else if ( AV24I == 2 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV74Sep2, " ") ;
         }
         else if ( AV24I == 3 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV75Sep3, " ") ;
         }
         else if ( AV24I == 4 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV76Sep4, " ") ;
         }
         else if ( AV24I == 5 )
         {
            AV11Lit = GXutil.concat( AV11Lit, AV77Sep5, " ") ;
         }
      }
      if ( ( ( AV26Trio > 1 ) || ( AV24I == 3 ) && ( AV25P == 2 ) ) && ( ( AV24I == 3 ) || ( AV24I == 5 ) ) )
      {
         AV11Lit = GXutil.concat( AV11Lit, "ES ", "") ;
      }
      if ( ( AV24I == 1 ) && ( AV32T2 != 1 ) && ( AV33T3 == 1 ) )
      {
         AV11Lit = GXutil.concat( AV11Lit, "O", "") ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumlet.this.AV8Importe;
      this.aP1[0] = pnumlet.this.AV9Letra;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Cen1 = "" ;
      AV38Cen2 = "" ;
      AV39Cen3 = "" ;
      AV40Cen4 = "" ;
      AV41Cen5 = "" ;
      AV42Cen6 = "" ;
      AV43Cen7 = "" ;
      AV44Cen8 = "" ;
      AV45Cen9 = "" ;
      AV46Dec1 = "" ;
      AV47Dec2 = "" ;
      AV48Dec3 = "" ;
      AV49Dec4 = "" ;
      AV50Dec5 = "" ;
      AV51Dec6 = "" ;
      AV52Dec7 = "" ;
      AV53Dec8 = "" ;
      AV54Dec9 = "" ;
      AV55Die1 = "" ;
      AV56Die2 = "" ;
      AV57Die3 = "" ;
      AV58Die4 = "" ;
      AV59Die5 = "" ;
      AV60Die6 = "" ;
      AV61Die7 = "" ;
      AV62Die8 = "" ;
      AV63Die9 = "" ;
      AV64Uni1 = "" ;
      AV65Uni2 = "" ;
      AV66Uni3 = "" ;
      AV67Uni4 = "" ;
      AV68Uni5 = "" ;
      AV69Uni6 = "" ;
      AV70Uni7 = "" ;
      AV71Uni8 = "" ;
      AV72Uni9 = "" ;
      AV73Sep1 = "" ;
      AV74Sep2 = "" ;
      AV75Sep3 = "" ;
      AV76Sep4 = "" ;
      AV77Sep5 = "" ;
      AV10N = DecimalUtil.ZERO ;
      AV11Lit = "" ;
      AV83Aux = "" ;
      AV82MonDesAbv = "" ;
      AV28Tt1 = DecimalUtil.ZERO ;
      AV29Tt2 = DecimalUtil.ZERO ;
      AV30Tt3 = DecimalUtil.ZERO ;
      AV34L1 = "" ;
      AV35L2 = "" ;
      AV36L3 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25P ;
   private byte AV24I ;
   private byte AV31T1 ;
   private byte AV32T2 ;
   private byte AV33T3 ;
   private short AV21Tr3 ;
   private short AV19Tr1 ;
   private short AV18Tr0 ;
   private short AV26Trio ;
   private short Gx_err ;
   private long AV23Tr5 ;
   private long AV22Tr4 ;
   private long AV20Tr2 ;
   private java.math.BigDecimal AV8Importe ;
   private java.math.BigDecimal AV10N ;
   private java.math.BigDecimal AV28Tt1 ;
   private java.math.BigDecimal AV29Tt2 ;
   private java.math.BigDecimal AV30Tt3 ;
   private String AV9Letra ;
   private String AV37Cen1 ;
   private String AV38Cen2 ;
   private String AV39Cen3 ;
   private String AV40Cen4 ;
   private String AV41Cen5 ;
   private String AV42Cen6 ;
   private String AV43Cen7 ;
   private String AV44Cen8 ;
   private String AV45Cen9 ;
   private String AV46Dec1 ;
   private String AV47Dec2 ;
   private String AV48Dec3 ;
   private String AV49Dec4 ;
   private String AV50Dec5 ;
   private String AV51Dec6 ;
   private String AV52Dec7 ;
   private String AV53Dec8 ;
   private String AV54Dec9 ;
   private String AV55Die1 ;
   private String AV56Die2 ;
   private String AV57Die3 ;
   private String AV58Die4 ;
   private String AV59Die5 ;
   private String AV60Die6 ;
   private String AV61Die7 ;
   private String AV62Die8 ;
   private String AV63Die9 ;
   private String AV64Uni1 ;
   private String AV65Uni2 ;
   private String AV66Uni3 ;
   private String AV67Uni4 ;
   private String AV68Uni5 ;
   private String AV69Uni6 ;
   private String AV70Uni7 ;
   private String AV71Uni8 ;
   private String AV72Uni9 ;
   private String AV73Sep1 ;
   private String AV74Sep2 ;
   private String AV75Sep3 ;
   private String AV76Sep4 ;
   private String AV77Sep5 ;
   private String AV11Lit ;
   private String AV83Aux ;
   private String AV82MonDesAbv ;
   private String AV34L1 ;
   private String AV35L2 ;
   private String AV36L3 ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP0 ;
   private String[] aP1 ;
}

