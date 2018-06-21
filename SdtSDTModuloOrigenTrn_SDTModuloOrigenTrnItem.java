/*
               File: SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem
        Description: SDTModuloOrigenTrn
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.87
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

public final  class SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem( )
   {
      this(  new ModelContext(SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem.class));
   }

   public SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem( ModelContext context )
   {
      super( context, "SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem");
   }

   public SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem");
   }

   public SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem( StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloOrigen") )
            {
               gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen = oReader.getValue() ;
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
         sName = "SDTModuloOrigenTrn.SDTModuloOrigenTrnItem" ;
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
      oWriter.writeElement("Tran_ModuloOrigen", GXutil.rtrim( gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen));
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
      AddObjectProperty("Tran_ModuloOrigen", gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen, false);
   }

   public String getgxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen( )
   {
      return gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen ;
   }

   public void setgxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen( String value )
   {
      gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem Clone( )
   {
      return (com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem struct )
   {
      setgxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen(struct.getTran_moduloorigen());
   }

   public com.orions2.StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem getStruct( )
   {
      com.orions2.StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem struct = new com.orions2.StructSdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem ();
      struct.setTran_moduloorigen(getgxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen ;
}

