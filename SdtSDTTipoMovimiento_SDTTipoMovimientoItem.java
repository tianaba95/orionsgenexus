/*
               File: SdtSDTTipoMovimiento_SDTTipoMovimientoItem
        Description: SDTTipoMovimiento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.27
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

public final  class SdtSDTTipoMovimiento_SDTTipoMovimientoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTTipoMovimiento_SDTTipoMovimientoItem( )
   {
      this(  new ModelContext(SdtSDTTipoMovimiento_SDTTipoMovimientoItem.class));
   }

   public SdtSDTTipoMovimiento_SDTTipoMovimientoItem( ModelContext context )
   {
      super( context, "SdtSDTTipoMovimiento_SDTTipoMovimientoItem");
   }

   public SdtSDTTipoMovimiento_SDTTipoMovimientoItem( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTTipoMovimiento_SDTTipoMovimientoItem");
   }

   public SdtSDTTipoMovimiento_SDTTipoMovimientoItem( StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodigoMovimiento") )
            {
               gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_DescripcionMovimiento") )
            {
               gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento = oReader.getValue() ;
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
         sName = "SDTTipoMovimiento.SDTTipoMovimientoItem" ;
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
      oWriter.writeElement("Tran_CodigoMovimiento", GXutil.rtrim( gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_DescripcionMovimiento", GXutil.rtrim( gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento));
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
      AddObjectProperty("Tran_CodigoMovimiento", gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento, false);
      AddObjectProperty("Tran_DescripcionMovimiento", gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento, false);
   }

   public String getgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento( )
   {
      return gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento ;
   }

   public void setgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento( String value )
   {
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento = value ;
   }

   public String getgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento( )
   {
      return gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento ;
   }

   public void setgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento( String value )
   {
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem Clone( )
   {
      return (com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem struct )
   {
      setgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento(struct.getTran_codigomovimiento());
      setgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento(struct.getTran_descripcionmovimiento());
   }

   public com.orions2.StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem getStruct( )
   {
      com.orions2.StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem struct = new com.orions2.StructSdtSDTTipoMovimiento_SDTTipoMovimientoItem ();
      struct.setTran_codigomovimiento(getgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento());
      struct.setTran_descripcionmovimiento(getgxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_codigomovimiento ;
   protected String gxTv_SdtSDTTipoMovimiento_SDTTipoMovimientoItem_Tran_descripcionmovimiento ;
}

