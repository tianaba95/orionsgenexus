/*
               File: PArchivosFTP
        Description: PArchivos FTP
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 12, 2018 16:22:58.35
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class parchivosftp extends GXProcedure
{
   public parchivosftp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parchivosftp.class ), "" );
   }

   public parchivosftp( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public short executeUdp( String[] aP0 )
   {
      parchivosftp.this.AV11Nove_Soporte = aP0[0];
      this.aP0 = aP0;
      parchivosftp.this.AV13FtpError = aP1[0];
      this.aP1 = aP1;
      parchivosftp.this.aP1 = new short[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 )
   {
      parchivosftp.this.AV11Nove_Soporte = aP0[0];
      this.aP0 = aP0;
      parchivosftp.this.AV13FtpError = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV8Host ;
      GXv_char2[0] = AV9UsuarioServ ;
      GXv_char3[0] = AV10Contrasena ;
      new com.orions2.parametrosdocumentos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3) ;
      parchivosftp.this.AV8Host = GXv_char1[0] ;
      parchivosftp.this.AV9UsuarioServ = GXv_char2[0] ;
      parchivosftp.this.AV10Contrasena = GXv_char3[0] ;
      context.getSessionInstances().getFTP().connect ( "172.29.35.151" ,  "jbossuser" ,  AV10Contrasena );
      GXv_int4[0] = AV13FtpError ;
      context.getSessionInstances().getFTP().lastError ( GXv_int4 );
      parchivosftp.this.AV13FtpError = (short)((short)(GXv_int4[0])) ;
      System.out.println( "FTP error al conectar: "+AV13FtpError );
      context.getSessionInstances().getFTP().put ( AV11Nove_Soporte ,  "/DataShared/" ,  "A" );
      GXv_int4[0] = AV13FtpError ;
      context.getSessionInstances().getFTP().lastError ( GXv_int4 );
      parchivosftp.this.AV13FtpError = (short)((short)(GXv_int4[0])) ;
      System.out.println( "FTP error al enviar: "+AV13FtpError );
      context.getSessionInstances().getFTP().disconnect ( );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = parchivosftp.this.AV11Nove_Soporte;
      this.aP1[0] = parchivosftp.this.AV13FtpError;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Host = "" ;
      GXv_char1 = new String [1] ;
      AV9UsuarioServ = "" ;
      GXv_char2 = new String [1] ;
      AV10Contrasena = "" ;
      GXv_char3 = new String [1] ;
      GXv_int4 = new int [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13FtpError ;
   private short Gx_err ;
   private int GXv_int4[] ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV11Nove_Soporte ;
   private String AV8Host ;
   private String AV9UsuarioServ ;
   private String AV10Contrasena ;
   private String[] aP0 ;
   private short[] aP1 ;
}

