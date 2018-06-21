/*
               File: SdtSDTRecordarUsuario
        Description: SDTRecordarUsuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.68
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

public final  class SdtSDTRecordarUsuario extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRecordarUsuario( )
   {
      this(  new ModelContext(SdtSDTRecordarUsuario.class));
   }

   public SdtSDTRecordarUsuario( ModelContext context )
   {
      super( context, "SdtSDTRecordarUsuario");
   }

   public SdtSDTRecordarUsuario( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRecordarUsuario");
   }

   public SdtSDTRecordarUsuario( StructSdtSDTRecordarUsuario struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaEmail") )
            {
               gxTv_SdtSDTRecordarUsuario_Usuaemail = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "usuaCedula") )
            {
               gxTv_SdtSDTRecordarUsuario_Usuacedula = GXutil.lval( oReader.getValue()) ;
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
         sName = "SDTRecordarUsuario" ;
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
      oWriter.writeElement("usuaEmail", GXutil.rtrim( gxTv_SdtSDTRecordarUsuario_Usuaemail));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("usuaCedula", GXutil.trim( GXutil.str( gxTv_SdtSDTRecordarUsuario_Usuacedula, 18, 0)));
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
      AddObjectProperty("usuaEmail", gxTv_SdtSDTRecordarUsuario_Usuaemail, false);
      AddObjectProperty("usuaCedula", GXutil.ltrim( GXutil.str( gxTv_SdtSDTRecordarUsuario_Usuacedula, 18, 0)), false);
   }

   public String getgxTv_SdtSDTRecordarUsuario_Usuaemail( )
   {
      return gxTv_SdtSDTRecordarUsuario_Usuaemail ;
   }

   public void setgxTv_SdtSDTRecordarUsuario_Usuaemail( String value )
   {
      gxTv_SdtSDTRecordarUsuario_Usuaemail = value ;
   }

   public long getgxTv_SdtSDTRecordarUsuario_Usuacedula( )
   {
      return gxTv_SdtSDTRecordarUsuario_Usuacedula ;
   }

   public void setgxTv_SdtSDTRecordarUsuario_Usuacedula( long value )
   {
      gxTv_SdtSDTRecordarUsuario_Usuacedula = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRecordarUsuario_Usuaemail = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRecordarUsuario Clone( )
   {
      return (com.orions2.SdtSDTRecordarUsuario)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRecordarUsuario struct )
   {
      setgxTv_SdtSDTRecordarUsuario_Usuaemail(struct.getUsuaemail());
      setgxTv_SdtSDTRecordarUsuario_Usuacedula(struct.getUsuacedula());
   }

   public com.orions2.StructSdtSDTRecordarUsuario getStruct( )
   {
      com.orions2.StructSdtSDTRecordarUsuario struct = new com.orions2.StructSdtSDTRecordarUsuario ();
      struct.setUsuaemail(getgxTv_SdtSDTRecordarUsuario_Usuaemail());
      struct.setUsuacedula(getgxTv_SdtSDTRecordarUsuario_Usuacedula());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTRecordarUsuario_Usuacedula ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRecordarUsuario_Usuaemail ;
}

