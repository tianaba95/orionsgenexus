/*
               File: ParametrosDocumentos
        Description: Parametros Documentos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 12, 2018 12:25:15.15
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class parametrosdocumentos extends GXProcedure
{
   public parametrosdocumentos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parametrosdocumentos.class ), "" );
   }

   public parametrosdocumentos( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      parametrosdocumentos.this.aP0 = aP0;
      parametrosdocumentos.this.aP1 = aP1;
      parametrosdocumentos.this.aP2 = aP2;
      parametrosdocumentos.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      parametrosdocumentos.this.aP0 = aP0;
      parametrosdocumentos.this.aP1 = aP1;
      parametrosdocumentos.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00302 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A208Para_Nombre = P00302_A208Para_Nombre[0] ;
         A209Para_Valor = P00302_A209Para_Valor[0] ;
         A20Para_Id = P00302_A20Para_Id[0] ;
         AV8Ambiente = A209Para_Valor ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00303 */
      pr_default.execute(1, new Object[] {AV8Ambiente});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A208Para_Nombre = P00303_A208Para_Nombre[0] ;
         A210Para_Ambiente = P00303_A210Para_Ambiente[0] ;
         A209Para_Valor = P00303_A209Para_Valor[0] ;
         A20Para_Id = P00303_A20Para_Id[0] ;
         AV9Host = GXutil.ltrim( GXutil.trim( A209Para_Valor)) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00304 */
      pr_default.execute(2, new Object[] {AV8Ambiente});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A208Para_Nombre = P00304_A208Para_Nombre[0] ;
         A210Para_Ambiente = P00304_A210Para_Ambiente[0] ;
         A209Para_Valor = P00304_A209Para_Valor[0] ;
         A20Para_Id = P00304_A20Para_Id[0] ;
         AV13UsuarioServ = GXutil.ltrim( GXutil.trim( A209Para_Valor)) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P00305 */
      pr_default.execute(3, new Object[] {AV8Ambiente});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A208Para_Nombre = P00305_A208Para_Nombre[0] ;
         A210Para_Ambiente = P00305_A210Para_Ambiente[0] ;
         A209Para_Valor = P00305_A209Para_Valor[0] ;
         A20Para_Id = P00305_A20Para_Id[0] ;
         AV14Contrasena = GXutil.ltrim( GXutil.trim( A209Para_Valor)) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = parametrosdocumentos.this.AV9Host;
      this.aP1[0] = parametrosdocumentos.this.AV13UsuarioServ;
      this.aP2[0] = parametrosdocumentos.this.AV14Contrasena;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Host = "" ;
      AV13UsuarioServ = "" ;
      AV14Contrasena = "" ;
      scmdbuf = "" ;
      P00302_A208Para_Nombre = new String[] {""} ;
      P00302_A209Para_Valor = new String[] {""} ;
      P00302_A20Para_Id = new long[1] ;
      A208Para_Nombre = "" ;
      A209Para_Valor = "" ;
      AV8Ambiente = "" ;
      P00303_A208Para_Nombre = new String[] {""} ;
      P00303_A210Para_Ambiente = new String[] {""} ;
      P00303_A209Para_Valor = new String[] {""} ;
      P00303_A20Para_Id = new long[1] ;
      A210Para_Ambiente = "" ;
      P00304_A208Para_Nombre = new String[] {""} ;
      P00304_A210Para_Ambiente = new String[] {""} ;
      P00304_A209Para_Valor = new String[] {""} ;
      P00304_A20Para_Id = new long[1] ;
      P00305_A208Para_Nombre = new String[] {""} ;
      P00305_A210Para_Ambiente = new String[] {""} ;
      P00305_A209Para_Valor = new String[] {""} ;
      P00305_A20Para_Id = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.parametrosdocumentos__default(),
         new Object[] {
             new Object[] {
            P00302_A208Para_Nombre, P00302_A209Para_Valor, P00302_A20Para_Id
            }
            , new Object[] {
            P00303_A208Para_Nombre, P00303_A210Para_Ambiente, P00303_A209Para_Valor, P00303_A20Para_Id
            }
            , new Object[] {
            P00304_A208Para_Nombre, P00304_A210Para_Ambiente, P00304_A209Para_Valor, P00304_A20Para_Id
            }
            , new Object[] {
            P00305_A208Para_Nombre, P00305_A210Para_Ambiente, P00305_A209Para_Valor, P00305_A20Para_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A20Para_Id ;
   private String scmdbuf ;
   private String AV9Host ;
   private String AV13UsuarioServ ;
   private String AV14Contrasena ;
   private String A208Para_Nombre ;
   private String A209Para_Valor ;
   private String AV8Ambiente ;
   private String A210Para_Ambiente ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00302_A208Para_Nombre ;
   private String[] P00302_A209Para_Valor ;
   private long[] P00302_A20Para_Id ;
   private String[] P00303_A208Para_Nombre ;
   private String[] P00303_A210Para_Ambiente ;
   private String[] P00303_A209Para_Valor ;
   private long[] P00303_A20Para_Id ;
   private String[] P00304_A208Para_Nombre ;
   private String[] P00304_A210Para_Ambiente ;
   private String[] P00304_A209Para_Valor ;
   private long[] P00304_A20Para_Id ;
   private String[] P00305_A208Para_Nombre ;
   private String[] P00305_A210Para_Ambiente ;
   private String[] P00305_A209Para_Valor ;
   private long[] P00305_A20Para_Id ;
}

final  class parametrosdocumentos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00302", "SELECT Para_Nombre, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE Para_Nombre = 'AMBIENTE' ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00303", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'SERVIDOR DOCUMENTOS') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00304", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'USUARIO SERVIDOR DOCUMENTOS') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00305", "SELECT Para_Nombre, Para_Ambiente, Para_Valor, Para_Id FROM SEG_PARAMETROS WHERE (Para_Ambiente = ?) AND (Para_Nombre = 'CONTRASEÑA SERVIDOR DOCUMENTOS') ORDER BY Para_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
      }
   }

}

