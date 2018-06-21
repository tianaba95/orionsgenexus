/*
               File: SdtSDTRespuestaReport
        Description: SDTRespuestaReport
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.75
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTRespuestaReport extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRespuestaReport( )
   {
      this(  new ModelContext(SdtSDTRespuestaReport.class));
   }

   public SdtSDTRespuestaReport( ModelContext context )
   {
      super( context, "SdtSDTRespuestaReport");
   }

   public SdtSDTRespuestaReport( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRespuestaReport");
   }

   public SdtSDTRespuestaReport( StructSdtSDTRespuestaReport struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "id") )
            {
               gxTv_SdtSDTRespuestaReport_Id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "status") )
            {
               gxTv_SdtSDTRespuestaReport_Status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "reportURI") )
            {
               gxTv_SdtSDTRespuestaReport_Reporturi = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "requestId") )
            {
               gxTv_SdtSDTRespuestaReport_Requestid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "status2") )
            {
               gxTv_SdtSDTRespuestaReport_Status2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "SDTRespuestaReport" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "ACBSENA" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("id", GXutil.rtrim( gxTv_SdtSDTRespuestaReport_Id));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("status", GXutil.rtrim( gxTv_SdtSDTRespuestaReport_Status));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("reportURI", GXutil.rtrim( gxTv_SdtSDTRespuestaReport_Reporturi));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("requestId", GXutil.rtrim( gxTv_SdtSDTRespuestaReport_Requestid));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("status2", GXutil.rtrim( gxTv_SdtSDTRespuestaReport_Status2));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("id", gxTv_SdtSDTRespuestaReport_Id, false);
      AddObjectProperty("status", gxTv_SdtSDTRespuestaReport_Status, false);
      AddObjectProperty("reportURI", gxTv_SdtSDTRespuestaReport_Reporturi, false);
      AddObjectProperty("requestId", gxTv_SdtSDTRespuestaReport_Requestid, false);
      AddObjectProperty("status2", gxTv_SdtSDTRespuestaReport_Status2, false);
   }

   public String getgxTv_SdtSDTRespuestaReport_Id( )
   {
      return gxTv_SdtSDTRespuestaReport_Id ;
   }

   public void setgxTv_SdtSDTRespuestaReport_Id( String value )
   {
      gxTv_SdtSDTRespuestaReport_Id = value ;
   }

   public String getgxTv_SdtSDTRespuestaReport_Status( )
   {
      return gxTv_SdtSDTRespuestaReport_Status ;
   }

   public void setgxTv_SdtSDTRespuestaReport_Status( String value )
   {
      gxTv_SdtSDTRespuestaReport_Status = value ;
   }

   public String getgxTv_SdtSDTRespuestaReport_Reporturi( )
   {
      return gxTv_SdtSDTRespuestaReport_Reporturi ;
   }

   public void setgxTv_SdtSDTRespuestaReport_Reporturi( String value )
   {
      gxTv_SdtSDTRespuestaReport_Reporturi = value ;
   }

   public String getgxTv_SdtSDTRespuestaReport_Requestid( )
   {
      return gxTv_SdtSDTRespuestaReport_Requestid ;
   }

   public void setgxTv_SdtSDTRespuestaReport_Requestid( String value )
   {
      gxTv_SdtSDTRespuestaReport_Requestid = value ;
   }

   public String getgxTv_SdtSDTRespuestaReport_Status2( )
   {
      return gxTv_SdtSDTRespuestaReport_Status2 ;
   }

   public void setgxTv_SdtSDTRespuestaReport_Status2( String value )
   {
      gxTv_SdtSDTRespuestaReport_Status2 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRespuestaReport_Id = "" ;
      gxTv_SdtSDTRespuestaReport_Status = "" ;
      gxTv_SdtSDTRespuestaReport_Reporturi = "" ;
      gxTv_SdtSDTRespuestaReport_Requestid = "" ;
      gxTv_SdtSDTRespuestaReport_Status2 = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRespuestaReport Clone( )
   {
      return (com.orions2.SdtSDTRespuestaReport)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRespuestaReport struct )
   {
      setgxTv_SdtSDTRespuestaReport_Id(struct.getId());
      setgxTv_SdtSDTRespuestaReport_Status(struct.getStatus());
      setgxTv_SdtSDTRespuestaReport_Reporturi(struct.getReporturi());
      setgxTv_SdtSDTRespuestaReport_Requestid(struct.getRequestid());
      setgxTv_SdtSDTRespuestaReport_Status2(struct.getStatus2());
   }

   public com.orions2.StructSdtSDTRespuestaReport getStruct( )
   {
      com.orions2.StructSdtSDTRespuestaReport struct = new com.orions2.StructSdtSDTRespuestaReport ();
      struct.setId(getgxTv_SdtSDTRespuestaReport_Id());
      struct.setStatus(getgxTv_SdtSDTRespuestaReport_Status());
      struct.setReporturi(getgxTv_SdtSDTRespuestaReport_Reporturi());
      struct.setRequestid(getgxTv_SdtSDTRespuestaReport_Requestid());
      struct.setStatus2(getgxTv_SdtSDTRespuestaReport_Status2());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRespuestaReport_Id ;
   protected String gxTv_SdtSDTRespuestaReport_Status ;
   protected String gxTv_SdtSDTRespuestaReport_Reporturi ;
   protected String gxTv_SdtSDTRespuestaReport_Requestid ;
   protected String gxTv_SdtSDTRespuestaReport_Status2 ;
}

