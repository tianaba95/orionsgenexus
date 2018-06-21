/*
               File: SdtSDTRolUsu_SDTRolUsuItem
        Description: SDTRolUsu
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.81
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

public final  class SdtSDTRolUsu_SDTRolUsuItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRolUsu_SDTRolUsuItem( )
   {
      this(  new ModelContext(SdtSDTRolUsu_SDTRolUsuItem.class));
   }

   public SdtSDTRolUsu_SDTRolUsuItem( ModelContext context )
   {
      super( context, "SdtSDTRolUsu_SDTRolUsuItem");
   }

   public SdtSDTRolUsu_SDTRolUsuItem( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRolUsu_SDTRolUsuItem");
   }

   public SdtSDTRolUsu_SDTRolUsuItem( StructSdtSDTRolUsu_SDTRolUsuItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Rol_Id") )
            {
               gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Rol_Descripcion") )
            {
               gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Rol_Tipo") )
            {
               gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo = oReader.getValue() ;
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
         sName = "SDTRolUsu.SDTRolUsuItem" ;
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
      oWriter.writeElement("Rol_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Rol_Descripcion", GXutil.rtrim( gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Rol_Tipo", GXutil.rtrim( gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo));
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
      AddObjectProperty("Rol_Id", gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id, false);
      AddObjectProperty("Rol_Descripcion", gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion, false);
      AddObjectProperty("Rol_Tipo", gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo, false);
   }

   public long getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id( )
   {
      return gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id ;
   }

   public void setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id( long value )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id = value ;
   }

   public String getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion( )
   {
      return gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion ;
   }

   public void setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion( String value )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion = value ;
   }

   public String getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo( )
   {
      return gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo ;
   }

   public void setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo( String value )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion = "" ;
      gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTRolUsu_SDTRolUsuItem Clone( )
   {
      return (com.orions2.SdtSDTRolUsu_SDTRolUsuItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTRolUsu_SDTRolUsuItem struct )
   {
      setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id(struct.getRol_id());
      setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion(struct.getRol_descripcion());
      setgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo(struct.getRol_tipo());
   }

   public com.orions2.StructSdtSDTRolUsu_SDTRolUsuItem getStruct( )
   {
      com.orions2.StructSdtSDTRolUsu_SDTRolUsuItem struct = new com.orions2.StructSdtSDTRolUsu_SDTRolUsuItem ();
      struct.setRol_id(getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id());
      struct.setRol_descripcion(getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion());
      struct.setRol_tipo(getgxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_id ;
   protected String gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_tipo ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRolUsu_SDTRolUsuItem_Rol_descripcion ;
}

