/*
               File: WSReportes
        Description: Stub for WSReportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 28, 2018 12:7:4.70
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsreportes extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.orions2.GXcfg.class);
      wsreportes pgm = new wsreportes (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      short aP0 = 0;
      short aP1 = 0;
      String aP2 = "";
      String aP3 = "";
      String aP4 = "";
      String aP5 = "";
      long aP6 = 0;
      java.util.Date aP7 = GXutil.nullDate();
      java.util.Date aP8 = GXutil.nullDate();
      String aP9 = "";
      String aP10 = "";
      String aP11 = "";
      String aP12 = "";
      long aP13 = 0;
      long aP14 = 0;
      long aP15 = 0;
      String aP16 = "";
      String[] aP17 = new String[] {""};

      try
      {
         aP0 = (short) GXutil.val( args[0], ".");
         aP1 = (short) GXutil.val( args[1], ".");
         aP2 = (String) args[2];
         aP3 = (String) args[3];
         aP4 = (String) args[4];
         aP5 = (String) args[5];
         aP6 = (long) GXutil.val( args[6], ".");
         aP7 = (java.util.Date) localUtil.ctod( args[7], 3);
         aP8 = (java.util.Date) localUtil.ctod( args[8], 3);
         aP9 = (String) args[9];
         aP10 = (String) args[10];
         aP11 = (String) args[11];
         aP12 = (String) args[12];
         aP13 = (long) GXutil.val( args[13], ".");
         aP14 = (long) GXutil.val( args[14], ".");
         aP15 = (long) GXutil.val( args[15], ".");
         aP16 = (String) args[16];
         aP17[0] = (String) args[17];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   public wsreportes( )
   {
      super( -1 , new ModelContext( wsreportes.class ), "" );
      Application.init(com.orions2.GXcfg.class);
   }

   public wsreportes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsreportes.class ), "" );
   }

   public wsreportes( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( short aP0 ,
                        short aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        long aP6 ,
                        java.util.Date aP7 ,
                        java.util.Date aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        String aP12 ,
                        long aP13 ,
                        long aP14 ,
                        long aP15 ,
                        String aP16 ,
                        String[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( short aP0 ,
                             short aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             long aP6 ,
                             java.util.Date aP7 ,
                             java.util.Date aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             String aP12 ,
                             long aP13 ,
                             long aP14 ,
                             long aP15 ,
                             String aP16 ,
                             String[] aP17 )
   {
      wsreportes.this.AV2RPT_REP_ID = aP0;
      wsreportes.this.AV3Regi_Cod = aP1;
      wsreportes.this.AV4Cent_Codigo = aP2;
      wsreportes.this.AV5Modulo = aP3;
      wsreportes.this.AV6Almacen = aP4;
      wsreportes.this.AV7Bodega = aP5;
      wsreportes.this.AV8Cedula = aP6;
      wsreportes.this.AV9Fecha_Inicial = aP7;
      wsreportes.this.AV10Fecha_Final = aP8;
      wsreportes.this.AV11Estado_Inicial = aP9;
      wsreportes.this.AV12Estado_Final = aP10;
      wsreportes.this.AV13Movimiento_Inicial = aP11;
      wsreportes.this.AV14Movimiento_Final = aP12;
      wsreportes.this.AV15Trans_ConsecutivoCC = aP13;
      wsreportes.this.AV16Trans_ConsecutivoCCFin = aP14;
      wsreportes.this.AV17Tipo_Codigo = aP15;
      wsreportes.this.AV18Formato = aP16;
      wsreportes.this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      context.globals.nSOAPErr = (short)(0) ;
      context.globals.sSOAPErrMsg = "" ;
      GXSoapHTTPClient.setHost( httpContext.getServerName( ) );
      GXSoapHTTPClient.setPort( httpContext.getServerPort( ) );
      GXSoapHTTPClient.setBaseURL( httpContext.getScriptPath( ) );
      SoapParm.assignlocationproperties( context, "AWSReportes", GXSoapHTTPClient);
      GXSoapHTTPClient.addHeader("Content-type", "text/xml;charset=utf-8");
      GXSoapHTTPClient.addHeader("Connection", "close");
      GXSoapHTTPClient.addHeader("SOAPAction", "ACBSENAaction/"+"AWSREPORTES.Execute");
      GXSoapXMLWriter.openRequest(GXSoapHTTPClient);
      GXSoapXMLWriter.writeStartDocument("utf-8", (byte)(0));
      GXSoapXMLWriter.writeStartElement("SOAP-ENV:Envelope");
      GXSoapXMLWriter.writeAttribute("xmlns:SOAP-ENV", "http://schemas.xmlsoap.org/soap/envelope/");
      GXSoapXMLWriter.writeAttribute("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
      GXSoapXMLWriter.writeAttribute("xmlns:SOAP-ENC", "http://schemas.xmlsoap.org/soap/encoding/");
      GXSoapXMLWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      GXSoapXMLWriter.writeStartElement("SOAP-ENV:Body");
      GXSoapXMLWriter.writeStartElement("Execute");
      GXSoapXMLWriter.writeAttribute("xmlns", "ACBSENA");
      GXSoapXMLWriter.writeElement("Rpt_rep_id", GXutil.trim( GXutil.str( AV2RPT_REP_ID, 4, 0)));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Regi_cod", GXutil.trim( GXutil.str( AV3Regi_Cod, 4, 0)));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Cent_codigo", GXutil.rtrim( AV4Cent_Codigo));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Modulo", GXutil.rtrim( AV5Modulo));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Almacen", GXutil.rtrim( AV6Almacen));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Bodega", GXutil.rtrim( AV7Bodega));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Cedula", GXutil.trim( GXutil.str( AV8Cedula, 18, 0)));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      if ( GXutil.dateCompare(GXutil.nullDate(), AV9Fecha_Inicial) )
      {
         GXSoapXMLWriter.writeStartElement("Fecha_inicial");
         GXSoapXMLWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         GXSoapXMLWriter.writeAttribute("xsi:nil", "true");
         GXSoapXMLWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( AV9Fecha_Inicial), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( AV9Fecha_Inicial), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( AV9Fecha_Inicial), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         GXSoapXMLWriter.writeElement("Fecha_inicial", sDateCnv);
         GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), AV10Fecha_Final) )
      {
         GXSoapXMLWriter.writeStartElement("Fecha_final");
         GXSoapXMLWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         GXSoapXMLWriter.writeAttribute("xsi:nil", "true");
         GXSoapXMLWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( AV10Fecha_Final), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( AV10Fecha_Final), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( AV10Fecha_Final), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         GXSoapXMLWriter.writeElement("Fecha_final", sDateCnv);
         GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      }
      GXSoapXMLWriter.writeElement("Estado_inicial", GXutil.rtrim( AV11Estado_Inicial));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Estado_final", GXutil.rtrim( AV12Estado_Final));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Movimiento_inicial", GXutil.rtrim( AV13Movimiento_Inicial));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Movimiento_final", GXutil.rtrim( AV14Movimiento_Final));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Trans_consecutivocc", GXutil.trim( GXutil.str( AV15Trans_ConsecutivoCC, 18, 0)));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Trans_consecutivoccfin", GXutil.trim( GXutil.str( AV16Trans_ConsecutivoCCFin, 18, 0)));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Tipo_codigo", GXutil.trim( GXutil.str( AV17Tipo_Codigo, 18, 0)));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeElement("Formato", GXutil.rtrim( AV18Formato));
      GXSoapXMLWriter.writeAttribute("xmlns", "http://tempuri.org/");
      GXSoapXMLWriter.writeEndElement();
      GXSoapXMLWriter.writeEndElement();
      GXSoapXMLWriter.writeEndElement();
      GXSoapXMLWriter.close();
      GXSoapHTTPClient.execute("POST", "com.orions2.awsreportes");
      if ( GXSoapHTTPClient.getErrCode() != 0 )
      {
         currSoapErr = (short)(GXSoapHTTPClient.getErrCode()*-1-10000) ;
         currSoapErrmsg = GXSoapHTTPClient.getErrDescription() ;
      }
      GXSoapXMLReader.openResponse(GXSoapHTTPClient);
      GXSoapError = GXSoapXMLReader.read() ;
      while ( GXSoapError > 0 )
      {
         if ( GXutil.strSearch( GXSoapXMLReader.getName(), "Body", 1) > 0 )
         {
            if (true) break;
         }
         GXSoapError = GXSoapXMLReader.read() ;
      }
      if ( GXSoapError > 0 )
      {
         GXSoapError = GXSoapXMLReader.read() ;
         if ( ( GXSoapError > 0 ) && ( GXutil.strcmp(GXSoapXMLReader.getLocalName(), "Fault") == 0 ) )
         {
            soapFault = (short)(1) ;
         }
      }
      sTagName = GXSoapXMLReader.getName() ;
      if ( GXSoapXMLReader.getIsSimple() == 0 )
      {
         if ( soapFault == 0 )
         {
            GXSoapError = GXSoapXMLReader.read() ;
            if ( ( GXSoapError > 0 ) && ( GXutil.strcmp(GXSoapXMLReader.getLocalName(), "Fault") == 0 ) )
            {
               soapFault = (short)(1) ;
            }
         }
         if ( soapFault == 1 )
         {
            GXSoapXMLReader.read();
            while ( ! ( ( GXutil.strcmp(GXSoapXMLReader.getLocalName(), "Fault") == 0 ) && ( GXSoapXMLReader.getNodeType() == 2 ) ) )
            {
               if ( GXutil.strcmp(GXutil.lower( GXSoapXMLReader.getName()), "faultcode") == 0 )
               {
                  sFaultCode = GXSoapXMLReader.getValue() ;
               }
               else if ( GXutil.strcmp(GXutil.lower( GXSoapXMLReader.getName()), "faultstring") == 0 )
               {
                  sFaultString = GXSoapXMLReader.getValue() ;
               }
               else if ( GXutil.strcmp(GXutil.lower( GXSoapXMLReader.getName()), "detail") == 0 )
               {
                  if ( GXSoapXMLReader.getIsSimple() != 0 )
                  {
                     GXSoapXMLReader.read();
                     sDetail = GXSoapXMLReader.readRawXML() ;
                  }
                  else
                  {
                     sDetail = GXSoapXMLReader.getValue() ;
                  }
               }
               GXSoapXMLReader.read();
            }
            if ( GXutil.strSearch( GXutil.lower( sFaultCode), "client", 1) > 0 )
            {
               currSoapErr = (short)(-20004) ;
               currSoapErrmsg = currSoapErrmsg + "SOAP Fault: Error in client request." + GXutil.newLine( ) + "Message: " + sFaultString + GXutil.newLine( ) + "Detail: " + sDetail ;
            }
            else if ( GXutil.strSearch( GXutil.lower( sFaultCode), "server", 1) > 0 )
            {
               currSoapErr = (short)(-20005) ;
               currSoapErrmsg = currSoapErrmsg + "SOAP Fault: Error in server execution." + GXutil.newLine( ) + "Message: " + sFaultString + GXutil.newLine( ) + "Detail: " + sDetail ;
            }
            else
            {
               currSoapErr = (short)(-20006) ;
               currSoapErrmsg = currSoapErrmsg + "Unknown error: " + sFaultCode + GXutil.newLine( ) + "Message: " + sFaultString + GXutil.newLine( ) + "Detail: " + sDetail ;
            }
         }
         else
         {
            nOutParmCount = (short)(0) ;
            while ( ( ( GXutil.strcmp(GXSoapXMLReader.getName(), sTagName) != 0 ) || ( GXSoapXMLReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
            {
               readOk = (short)(0) ;
               if ( GXutil.strcmp2( GXSoapXMLReader.getLocalName(), "Respuesta") && ( GXSoapXMLReader.getNodeType() != 2 ) && ( GXutil.strcmp(GXSoapXMLReader.getNamespaceURI(), "http://tempuri.org/") == 0 ) )
               {
                  AV19Respuesta = GXSoapXMLReader.getValue() ;
                  if ( GXSoapError > 0 )
                  {
                     readOk = (short)(1) ;
                  }
                  GXSoapError = GXSoapXMLReader.read() ;
               }
               nOutParmCount = (short)(nOutParmCount+1) ;
               if ( readOk == 0 )
               {
                  context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
                  context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + GXSoapXMLReader.readRawXML() ;
                  GXSoapError = (short)(nOutParmCount*-1) ;
               }
            }
         }
      }
      GXSoapXMLReader.close();
      if ( currSoapErr == 0 )
      {
         if ( GXSoapError < 0 )
         {
            currSoapErr = (short)(GXSoapError*-1) ;
            currSoapErrmsg = context.globals.sSOAPErrMsg ;
         }
         else
         {
            if ( GXSoapXMLReader.getErrCode() > 0 )
            {
               currSoapErr = (short)(GXSoapXMLReader.getErrCode()*-1) ;
               currSoapErrmsg = GXSoapXMLReader.getErrDescription() ;
            }
            else
            {
               if ( GXSoapError == 0 )
               {
                  currSoapErr = (short)(-20001) ;
                  currSoapErrmsg = "Malformed SOAP message." ;
               }
               else
               {
                  currSoapErr = (short)(0) ;
                  currSoapErrmsg = "No error." ;
               }
            }
         }
      }
      if ( currSoapErr != 0 )
      {
         oLocation = SoapParm.getlocation(context, "AWSReportes") ;
         if ( oLocation.getCancelOnError() == 1 )
         {
            throw new RuntimeException(currSoapErrmsg + "(" + currSoapErr+ ")");
         }
      }
      context.globals.nSOAPErr = currSoapErr ;
      context.globals.sSOAPErrMsg = currSoapErrmsg ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP17[0] = wsreportes.this.AV19Respuesta;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Respuesta = "" ;
      GXSoapHTTPClient = new com.genexus.internet.HttpClient();
      sReturn = "" ;
      GXSoapXMLReader = new com.genexus.xml.XMLReader();
      GXSoapXMLWriter = new com.genexus.xml.XMLWriter();
      currSoapErrmsg = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      sTagName = "" ;
      sFaultCode = "" ;
      sFaultString = "" ;
      sDetail = "" ;
      oLocation = new com.genexus.internet.Location();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV2RPT_REP_ID ;
   private short AV3Regi_Cod ;
   private short GXSoapError ;
   private short currSoapErr ;
   private short soapFault ;
   private short readOk ;
   private short nOutParmCount ;
   private short Gx_err ;
   private long AV8Cedula ;
   private long AV15Trans_ConsecutivoCC ;
   private long AV16Trans_ConsecutivoCCFin ;
   private long AV17Tipo_Codigo ;
   private String AV11Estado_Inicial ;
   private String AV12Estado_Final ;
   private String AV18Formato ;
   private String sReturn ;
   private String currSoapErrmsg ;
   private String sDateCnv ;
   private String sNumToPad ;
   private String sTagName ;
   private String sFaultCode ;
   private String sFaultString ;
   private String sDetail ;
   private java.util.Date AV9Fecha_Inicial ;
   private java.util.Date AV10Fecha_Final ;
   private String AV4Cent_Codigo ;
   private String AV5Modulo ;
   private String AV6Almacen ;
   private String AV7Bodega ;
   private String AV13Movimiento_Inicial ;
   private String AV14Movimiento_Final ;
   private String AV19Respuesta ;
   private com.genexus.xml.XMLWriter GXSoapXMLWriter ;
   private com.genexus.xml.XMLReader GXSoapXMLReader ;
   private com.genexus.internet.Location oLocation ;
   private com.genexus.internet.HttpClient GXSoapHTTPClient ;
   private String[] aP17 ;
}

