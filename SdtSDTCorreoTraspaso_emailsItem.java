/*
               File: SdtSDTCorreoTraspaso_emailsItem
        Description: SDTCorreoTraspaso
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.15
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

public final  class SdtSDTCorreoTraspaso_emailsItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCorreoTraspaso_emailsItem( )
   {
      this(  new ModelContext(SdtSDTCorreoTraspaso_emailsItem.class));
   }

   public SdtSDTCorreoTraspaso_emailsItem( ModelContext context )
   {
      super( context, "SdtSDTCorreoTraspaso_emailsItem");
   }

   public SdtSDTCorreoTraspaso_emailsItem( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCorreoTraspaso_emailsItem");
   }

   public SdtSDTCorreoTraspaso_emailsItem( StructSdtSDTCorreoTraspaso_emailsItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "emailCuentadanteOrigen") )
            {
               gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "emailCuentadanteDestino") )
            {
               gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino = oReader.getValue() ;
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
         sName = "SDTCorreoTraspaso.emailsItem" ;
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
      oWriter.writeElement("emailCuentadanteOrigen", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("emailCuentadanteDestino", GXutil.rtrim( gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino));
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
      AddObjectProperty("emailCuentadanteOrigen", gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen, false);
      AddObjectProperty("emailCuentadanteDestino", gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino, false);
   }

   public String getgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen( )
   {
      return gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen = value ;
   }

   public String getgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino( )
   {
      return gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino ;
   }

   public void setgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino( String value )
   {
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen = "" ;
      gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTCorreoTraspaso_emailsItem Clone( )
   {
      return (com.orions2.SdtSDTCorreoTraspaso_emailsItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCorreoTraspaso_emailsItem struct )
   {
      setgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen(struct.getEmailcuentadanteorigen());
      setgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino(struct.getEmailcuentadantedestino());
   }

   public com.orions2.StructSdtSDTCorreoTraspaso_emailsItem getStruct( )
   {
      com.orions2.StructSdtSDTCorreoTraspaso_emailsItem struct = new com.orions2.StructSdtSDTCorreoTraspaso_emailsItem ();
      struct.setEmailcuentadanteorigen(getgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen());
      struct.setEmailcuentadantedestino(getgxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadanteorigen ;
   protected String gxTv_SdtSDTCorreoTraspaso_emailsItem_Emailcuentadantedestino ;
}

