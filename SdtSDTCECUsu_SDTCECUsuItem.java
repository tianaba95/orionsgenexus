/*
               File: SdtSDTCECUsu_SDTCECUsuItem
        Description: SDTCECUsu
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.87
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

public final  class SdtSDTCECUsu_SDTCECUsuItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCECUsu_SDTCECUsuItem( )
   {
      this(  new ModelContext(SdtSDTCECUsu_SDTCECUsuItem.class));
   }

   public SdtSDTCECUsu_SDTCECUsuItem( ModelContext context )
   {
      super( context, "SdtSDTCECUsu_SDTCECUsuItem");
   }

   public SdtSDTCECUsu_SDTCECUsuItem( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCECUsu_SDTCECUsuItem");
   }

   public SdtSDTCECUsu_SDTCECUsuItem( StructSdtSDTCECUsu_SDTCECUsuItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cent_Id") )
            {
               gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cent_Descripcion") )
            {
               gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Regi_Cod") )
            {
               gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cent_Codigo") )
            {
               gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Regi_Abrev") )
            {
               gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Regi_Descripcion") )
            {
               gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion = oReader.getValue() ;
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
         sName = "SDTCECUsu.SDTCECUsuItem" ;
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
      oWriter.writeElement("Cent_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cent_Descripcion", GXutil.rtrim( gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Regi_Cod", GXutil.trim( GXutil.str( gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Cent_Codigo", GXutil.rtrim( gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Regi_Abrev", GXutil.rtrim( gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Regi_Descripcion", GXutil.rtrim( gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion));
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
      AddObjectProperty("Cent_Id", gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id, false);
      AddObjectProperty("Cent_Descripcion", gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion, false);
      AddObjectProperty("Regi_Cod", gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod, false);
      AddObjectProperty("Cent_Codigo", gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo, false);
      AddObjectProperty("Regi_Abrev", gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev, false);
      AddObjectProperty("Regi_Descripcion", gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion, false);
   }

   public long getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id ;
   }

   public void setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id( long value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id = value ;
   }

   public String getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion ;
   }

   public void setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion = value ;
   }

   public short getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod ;
   }

   public void setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod( short value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod = value ;
   }

   public String getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo ;
   }

   public void setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo = value ;
   }

   public String getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev ;
   }

   public void setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev = value ;
   }

   public String getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion( )
   {
      return gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion ;
   }

   public void setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion( String value )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion = "" ;
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo = "" ;
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev = "" ;
      gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTCECUsu_SDTCECUsuItem Clone( )
   {
      return (com.orions2.SdtSDTCECUsu_SDTCECUsuItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCECUsu_SDTCECUsuItem struct )
   {
      setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id(struct.getCent_id());
      setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion(struct.getCent_descripcion());
      setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod(struct.getRegi_cod());
      setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo(struct.getCent_codigo());
      setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev(struct.getRegi_abrev());
      setgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion(struct.getRegi_descripcion());
   }

   public com.orions2.StructSdtSDTCECUsu_SDTCECUsuItem getStruct( )
   {
      com.orions2.StructSdtSDTCECUsu_SDTCECUsuItem struct = new com.orions2.StructSdtSDTCECUsu_SDTCECUsuItem ();
      struct.setCent_id(getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id());
      struct.setCent_descripcion(getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion());
      struct.setRegi_cod(getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod());
      struct.setCent_codigo(getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo());
      struct.setRegi_abrev(getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev());
      struct.setRegi_descripcion(getgxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion());
      return struct ;
   }

   protected short gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_cod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_id ;
   protected String sTagName ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_descripcion ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Cent_codigo ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_abrev ;
   protected String gxTv_SdtSDTCECUsu_SDTCECUsuItem_Regi_descripcion ;
}

