/*
               File: SdtSDTALM_DETA
        Description: SDTALM_DETA
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.99
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

public final  class SdtSDTALM_DETA extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTALM_DETA( )
   {
      this(  new ModelContext(SdtSDTALM_DETA.class));
   }

   public SdtSDTALM_DETA( ModelContext context )
   {
      super( context, "SdtSDTALM_DETA");
   }

   public SdtSDTALM_DETA( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTALM_DETA");
   }

   public SdtSDTALM_DETA( StructSdtSDTALM_DETA struct )
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
               gxTv_SdtSDTALM_DETA_Tran_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Consecutivo") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_consecutivo = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_CodigoBien") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_codigobien = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Cantidad") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_cantidad = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ValorUnitario") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_valorunitario = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ValorTotal") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_valortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_PlacaNumero") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_placanumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_PlacaPadre") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_placapadre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Observaciones") )
            {
               gxTv_SdtSDTALM_DETA_Tdet_observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_Atributos") )
            {
               if ( gxTv_SdtSDTALM_DETA_Tdet_atributos == null )
               {
                  gxTv_SdtSDTALM_DETA_Tdet_atributos = new GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem>(com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem.class, "SDTALM_DETA_ATR.SDTALM_DETA_ATRItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTALM_DETA_Tdet_atributos.readxml(oReader, "TDet_Atributos") ;
               }
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
         sName = "SDTALM_DETA" ;
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
      oWriter.writeElement("Tran_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_DETA_Tran_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Consecutivo", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_DETA_Tdet_consecutivo, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_CodigoBien", GXutil.rtrim( gxTv_SdtSDTALM_DETA_Tdet_codigobien));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Cantidad", GXutil.trim( GXutil.str( gxTv_SdtSDTALM_DETA_Tdet_cantidad, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ValorUnitario", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTALM_DETA_Tdet_valorunitario, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ValorTotal", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTALM_DETA_Tdet_valortotal, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_PlacaNumero", GXutil.rtrim( gxTv_SdtSDTALM_DETA_Tdet_placanumero));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_PlacaPadre", GXutil.rtrim( gxTv_SdtSDTALM_DETA_Tdet_placapadre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_Observaciones", GXutil.rtrim( gxTv_SdtSDTALM_DETA_Tdet_observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTALM_DETA_Tdet_atributos != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "ACBSENA" ;
         }
         else
         {
            sNameSpace1 = "ACBSENA" ;
         }
         gxTv_SdtSDTALM_DETA_Tdet_atributos.writexml(oWriter, "TDet_Atributos", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("Tran_Id", gxTv_SdtSDTALM_DETA_Tran_id, false);
      AddObjectProperty("TDet_Consecutivo", GXutil.ltrim( GXutil.str( gxTv_SdtSDTALM_DETA_Tdet_consecutivo, 18, 0)), false);
      AddObjectProperty("TDet_CodigoBien", gxTv_SdtSDTALM_DETA_Tdet_codigobien, false);
      AddObjectProperty("TDet_Cantidad", gxTv_SdtSDTALM_DETA_Tdet_cantidad, false);
      AddObjectProperty("TDet_ValorUnitario", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTALM_DETA_Tdet_valorunitario, 18, 2)), false);
      AddObjectProperty("TDet_ValorTotal", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTALM_DETA_Tdet_valortotal, 18, 2)), false);
      AddObjectProperty("TDet_PlacaNumero", gxTv_SdtSDTALM_DETA_Tdet_placanumero, false);
      AddObjectProperty("TDet_PlacaPadre", gxTv_SdtSDTALM_DETA_Tdet_placapadre, false);
      AddObjectProperty("TDet_Observaciones", gxTv_SdtSDTALM_DETA_Tdet_observaciones, false);
      if ( gxTv_SdtSDTALM_DETA_Tdet_atributos != null )
      {
         AddObjectProperty("TDet_Atributos", gxTv_SdtSDTALM_DETA_Tdet_atributos, false);
      }
   }

   public long getgxTv_SdtSDTALM_DETA_Tran_id( )
   {
      return gxTv_SdtSDTALM_DETA_Tran_id ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tran_id( long value )
   {
      gxTv_SdtSDTALM_DETA_Tran_id = value ;
   }

   public long getgxTv_SdtSDTALM_DETA_Tdet_consecutivo( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_consecutivo ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_consecutivo( long value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_consecutivo = value ;
   }

   public String getgxTv_SdtSDTALM_DETA_Tdet_codigobien( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_codigobien ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_codigobien( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_codigobien = value ;
   }

   public long getgxTv_SdtSDTALM_DETA_Tdet_cantidad( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_cantidad ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_cantidad( long value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_cantidad = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTALM_DETA_Tdet_valorunitario( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_valorunitario ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_valorunitario( java.math.BigDecimal value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_valorunitario = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTALM_DETA_Tdet_valortotal( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_valortotal ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_valortotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_valortotal = value ;
   }

   public String getgxTv_SdtSDTALM_DETA_Tdet_placanumero( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_placanumero ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_placanumero( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_placanumero = value ;
   }

   public String getgxTv_SdtSDTALM_DETA_Tdet_placapadre( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_placapadre ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_placapadre( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_placapadre = value ;
   }

   public String getgxTv_SdtSDTALM_DETA_Tdet_observaciones( )
   {
      return gxTv_SdtSDTALM_DETA_Tdet_observaciones ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_observaciones( String value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_observaciones = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem> getgxTv_SdtSDTALM_DETA_Tdet_atributos( )
   {
      if ( gxTv_SdtSDTALM_DETA_Tdet_atributos == null )
      {
         gxTv_SdtSDTALM_DETA_Tdet_atributos = new GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem>(com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem.class, "SDTALM_DETA_ATR.SDTALM_DETA_ATRItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTALM_DETA_Tdet_atributos ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_atributos( GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem> value )
   {
      gxTv_SdtSDTALM_DETA_Tdet_atributos = value ;
   }

   public void setgxTv_SdtSDTALM_DETA_Tdet_atributos_SetNull( )
   {
      gxTv_SdtSDTALM_DETA_Tdet_atributos = null ;
   }

   public boolean getgxTv_SdtSDTALM_DETA_Tdet_atributos_IsNull( )
   {
      if ( gxTv_SdtSDTALM_DETA_Tdet_atributos == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTALM_DETA_Tdet_codigobien = "" ;
      gxTv_SdtSDTALM_DETA_Tdet_valorunitario = DecimalUtil.ZERO ;
      gxTv_SdtSDTALM_DETA_Tdet_valortotal = DecimalUtil.ZERO ;
      gxTv_SdtSDTALM_DETA_Tdet_placanumero = "" ;
      gxTv_SdtSDTALM_DETA_Tdet_placapadre = "" ;
      gxTv_SdtSDTALM_DETA_Tdet_observaciones = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTALM_DETA Clone( )
   {
      return (com.orions2.SdtSDTALM_DETA)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTALM_DETA struct )
   {
      setgxTv_SdtSDTALM_DETA_Tran_id(struct.getTran_id());
      setgxTv_SdtSDTALM_DETA_Tdet_consecutivo(struct.getTdet_consecutivo());
      setgxTv_SdtSDTALM_DETA_Tdet_codigobien(struct.getTdet_codigobien());
      setgxTv_SdtSDTALM_DETA_Tdet_cantidad(struct.getTdet_cantidad());
      setgxTv_SdtSDTALM_DETA_Tdet_valorunitario(struct.getTdet_valorunitario());
      setgxTv_SdtSDTALM_DETA_Tdet_valortotal(struct.getTdet_valortotal());
      setgxTv_SdtSDTALM_DETA_Tdet_placanumero(struct.getTdet_placanumero());
      setgxTv_SdtSDTALM_DETA_Tdet_placapadre(struct.getTdet_placapadre());
      setgxTv_SdtSDTALM_DETA_Tdet_observaciones(struct.getTdet_observaciones());
      GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem> gxTv_SdtSDTALM_DETA_Tdet_atributos_aux = new GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem>(com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem.class, "SDTALM_DETA_ATR.SDTALM_DETA_ATRItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem> gxTv_SdtSDTALM_DETA_Tdet_atributos_aux1 = new GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem>(com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem.class, "SDTALM_DETA_ATR.SDTALM_DETA_ATRItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTALM_DETA_Tdet_atributos_aux1.setStruct(struct.getTdet_atributos());
      for (int i = 0; i < gxTv_SdtSDTALM_DETA_Tdet_atributos_aux1.size(); i++)
      {
         gxTv_SdtSDTALM_DETA_Tdet_atributos_aux.add(new com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem(gxTv_SdtSDTALM_DETA_Tdet_atributos_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTALM_DETA_Tdet_atributos(gxTv_SdtSDTALM_DETA_Tdet_atributos_aux);
   }

   public com.orions2.StructSdtSDTALM_DETA getStruct( )
   {
      com.orions2.StructSdtSDTALM_DETA struct = new com.orions2.StructSdtSDTALM_DETA ();
      struct.setTran_id(getgxTv_SdtSDTALM_DETA_Tran_id());
      struct.setTdet_consecutivo(getgxTv_SdtSDTALM_DETA_Tdet_consecutivo());
      struct.setTdet_codigobien(getgxTv_SdtSDTALM_DETA_Tdet_codigobien());
      struct.setTdet_cantidad(getgxTv_SdtSDTALM_DETA_Tdet_cantidad());
      struct.setTdet_valorunitario(getgxTv_SdtSDTALM_DETA_Tdet_valorunitario());
      struct.setTdet_valortotal(getgxTv_SdtSDTALM_DETA_Tdet_valortotal());
      struct.setTdet_placanumero(getgxTv_SdtSDTALM_DETA_Tdet_placanumero());
      struct.setTdet_placapadre(getgxTv_SdtSDTALM_DETA_Tdet_placapadre());
      struct.setTdet_observaciones(getgxTv_SdtSDTALM_DETA_Tdet_observaciones());
      Vector aux_vectorgxTv_SdtSDTALM_DETA_Tdet_atributos = getgxTv_SdtSDTALM_DETA_Tdet_atributos().getStruct();
      Vector aux_vector1gxTv_SdtSDTALM_DETA_Tdet_atributos = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTALM_DETA_Tdet_atributos.size(); i++)
      {
         aux_vector1gxTv_SdtSDTALM_DETA_Tdet_atributos.addElement(((com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem)aux_vectorgxTv_SdtSDTALM_DETA_Tdet_atributos.elementAt(i)).getStruct());
      }
      struct.setTdet_atributos(aux_vector1gxTv_SdtSDTALM_DETA_Tdet_atributos);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTALM_DETA_Tran_id ;
   protected long gxTv_SdtSDTALM_DETA_Tdet_consecutivo ;
   protected long gxTv_SdtSDTALM_DETA_Tdet_cantidad ;
   protected java.math.BigDecimal gxTv_SdtSDTALM_DETA_Tdet_valorunitario ;
   protected java.math.BigDecimal gxTv_SdtSDTALM_DETA_Tdet_valortotal ;
   protected String sTagName ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_codigobien ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_placanumero ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_placapadre ;
   protected String gxTv_SdtSDTALM_DETA_Tdet_observaciones ;
   protected GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem> gxTv_SdtSDTALM_DETA_Tdet_atributos_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem> gxTv_SdtSDTALM_DETA_Tdet_atributos_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTALM_DETA_ATR_SDTALM_DETA_ATRItem> gxTv_SdtSDTALM_DETA_Tdet_atributos=null ;
}

