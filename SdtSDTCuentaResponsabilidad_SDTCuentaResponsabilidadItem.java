/*
               File: SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem
        Description: SDTCuentaResponsabilidad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.20
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

public final  class SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem( )
   {
      this(  new ModelContext(SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem.class));
   }

   public SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem( ModelContext context )
   {
      super( context, "SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem");
   }

   public SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem( int remoteHandle ,
                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem");
   }

   public SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem( StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Id") )
            {
               gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoId") )
            {
               gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionId") )
            {
               gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodigoMovimiento") )
            {
               gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadante") )
            {
               gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaRatificacion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ConsecutivoCC") )
            {
               gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Tabla") )
            {
               gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "SDTCuentaResponsabilidad.SDTCuentaResponsabilidadItem" ;
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
      oWriter.writeElement("Tran_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoId", GXutil.trim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionId", GXutil.trim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodigoMovimiento", GXutil.rtrim( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadante", GXutil.trim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion) )
      {
         oWriter.writeStartElement("Tran_FechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_ConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Tabla", GXutil.trim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla, 4, 0)));
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
      AddObjectProperty("Tran_Id", gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id, false);
      AddObjectProperty("Tran_CentroCostoId", gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid, false);
      AddObjectProperty("Tran_RegionId", gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid, false);
      AddObjectProperty("Tran_CodigoMovimiento", gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento, false);
      AddObjectProperty("Tran_IdCuentadante", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante, 18, 0)), false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaRatificacion", sDateCnv, false);
      AddObjectProperty("Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc, 18, 0)), false);
      AddObjectProperty("Tran_Tabla", gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla, false);
   }

   public long getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id = value ;
   }

   public long getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid = value ;
   }

   public long getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid = value ;
   }

   public String getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento( String value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento = value ;
   }

   public long getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante = value ;
   }

   public java.util.Date getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion = value ;
   }

   public long getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc( long value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc = value ;
   }

   public short getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla( )
   {
      return gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla ;
   }

   public void setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla( short value )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion = GXutil.nullDate() ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public com.orions2.SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem Clone( )
   {
      return (com.orions2.SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem struct )
   {
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id(struct.getTran_id());
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid(struct.getTran_centrocostoid());
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid(struct.getTran_regionid());
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento(struct.getTran_codigomovimiento());
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante(struct.getTran_idcuentadante());
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion(struct.getTran_fecharatificacion());
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc(struct.getTran_consecutivocc());
      setgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla(struct.getTran_tabla());
   }

   public com.orions2.StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem getStruct( )
   {
      com.orions2.StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem struct = new com.orions2.StructSdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem ();
      struct.setTran_id(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id());
      struct.setTran_centrocostoid(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid());
      struct.setTran_regionid(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid());
      struct.setTran_codigomovimiento(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento());
      struct.setTran_idcuentadante(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante());
      struct.setTran_fecharatificacion(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion());
      struct.setTran_consecutivocc(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc());
      struct.setTran_tabla(getgxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla());
      return struct ;
   }

   protected short gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_tabla ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_id ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_centrocostoid ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_regionid ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_idcuentadante ;
   protected long gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_consecutivocc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_fecharatificacion ;
   protected String gxTv_SdtSDTCuentaResponsabilidad_SDTCuentaResponsabilidadItem_Tran_codigomovimiento ;
}

