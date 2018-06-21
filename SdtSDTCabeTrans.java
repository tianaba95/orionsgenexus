/*
               File: SdtSDTCabeTrans
        Description: SDTCabeTrans
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.28
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

public final  class SdtSDTCabeTrans extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTCabeTrans( )
   {
      this(  new ModelContext(SdtSDTCabeTrans.class));
   }

   public SdtSDTCabeTrans( ModelContext context )
   {
      super( context, "SdtSDTCabeTrans");
   }

   public SdtSDTCabeTrans( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCabeTrans");
   }

   public SdtSDTCabeTrans( StructSdtSDTCabeTrans struct )
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
               gxTv_SdtSDTCabeTrans_Tran_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaRegistro") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCabeTrans_Tran_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTCabeTrans_Tran_fecharegistro = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_UsuarioId") )
            {
               gxTv_SdtSDTCabeTrans_Tran_usuarioid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_UsuarioCodigo") )
            {
               gxTv_SdtSDTCabeTrans_Tran_usuariocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_UsuarioNombre") )
            {
               gxTv_SdtSDTCabeTrans_Tran_usuarionombre = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoId") )
            {
               gxTv_SdtSDTCabeTrans_Tran_centrocostoid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoCodigo") )
            {
               gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoDescripcion") )
            {
               gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionId") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regionid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionCodigo") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regioncodigo = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionDescripcion") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regiondescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionAbrev") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regionabrev = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodigoMovimiento") )
            {
               gxTv_SdtSDTCabeTrans_Tran_codigomovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_DescripcionMovimiento") )
            {
               gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IndAreadante") )
            {
               gxTv_SdtSDTCabeTrans_Tran_indareadante = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IndE_S") )
            {
               gxTv_SdtSDTCabeTrans_Tran_inde_s = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IndCurso") )
            {
               gxTv_SdtSDTCabeTrans_Tran_indcurso = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodTipoElemento") )
            {
               gxTv_SdtSDTCabeTrans_Tran_codtipoelemento = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TipoElemento") )
            {
               gxTv_SdtSDTCabeTrans_Tran_tipoelemento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloOrigen") )
            {
               gxTv_SdtSDTCabeTrans_Tran_moduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaOrigen") )
            {
               gxTv_SdtSDTCabeTrans_Tran_codalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeOrigen") )
            {
               gxTv_SdtSDTCabeTrans_Tran_codbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadanteOrigen") )
            {
               gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdProveedor") )
            {
               gxTv_SdtSDTCabeTrans_Tran_idproveedor = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NombCuentadanteOrigen") )
            {
               gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NombreProveedor") )
            {
               gxTv_SdtSDTCabeTrans_Tran_nombreproveedor = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_modulodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_codalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_codbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadanteDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NombCuentadanteDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Observaciones") )
            {
               gxTv_SdtSDTCabeTrans_Tran_observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_AreadanteCodigo") )
            {
               gxTv_SdtSDTCabeTrans_Tran_areadantecodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_AreadanteDescripcion") )
            {
               gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CursoCodigo") )
            {
               gxTv_SdtSDTCabeTrans_Tran_cursocodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CursoDescripcion") )
            {
               gxTv_SdtSDTCabeTrans_Tran_cursodescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ValorTransaccion") )
            {
               gxTv_SdtSDTCabeTrans_Tran_valortransaccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NumeroLineas") )
            {
               gxTv_SdtSDTCabeTrans_Tran_numerolineas = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Estado") )
            {
               gxTv_SdtSDTCabeTrans_Tran_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaRatificacion") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCabeTrans_Tran_fecharatificacion = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtSDTCabeTrans_Tran_fecharatificacion = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_UsuarioRatifica") )
            {
               gxTv_SdtSDTCabeTrans_Tran_usuarioratifica = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ConsecutivoCC") )
            {
               gxTv_SdtSDTCabeTrans_Tran_consecutivocc = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TipoIngreso") )
            {
               gxTv_SdtSDTCabeTrans_Tran_tipoingreso = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_NumeroIngreso") )
            {
               gxTv_SdtSDTCabeTrans_Tran_numeroingreso = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_FechaIngreso") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCabeTrans_Tran_fechaingreso = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSDTCabeTrans_Tran_fechaingreso = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoIdDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoCodigoDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CentroCostoDescripcionDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionIdDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regioniddestino = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionCodigoDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionDescripcionDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_RegionAbrevDestino") )
            {
               gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_Detalle") )
            {
               gxTv_SdtSDTCabeTrans_Tran_detalle = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_TipoEntra") )
            {
               gxTv_SdtSDTCabeTrans_Tran_tipoentra = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CantidadPadres") )
            {
               gxTv_SdtSDTCabeTrans_Tran_cantidadpadres = (int)(GXutil.lval( oReader.getValue())) ;
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
         sName = "SDTCabeTrans" ;
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
      oWriter.writeElement("Tran_Id", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_id, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTCabeTrans_Tran_fecharegistro) )
      {
         oWriter.writeStartElement("Tran_FechaRegistro");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCabeTrans_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCabeTrans_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCabeTrans_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTCabeTrans_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTCabeTrans_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTCabeTrans_Tran_fecharegistro), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaRegistro", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_UsuarioId", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_usuarioid, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_UsuarioCodigo", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_usuariocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_UsuarioNombre", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_usuarionombre));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoId", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_centrocostoid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoCodigo", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoDescripcion", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionId", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_regionid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionCodigo", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_regioncodigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionDescripcion", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_regiondescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionAbrev", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_regionabrev));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodigoMovimiento", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_codigomovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_DescripcionMovimiento", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IndAreadante", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_indareadante));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IndE_S", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_inde_s));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IndCurso", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_indcurso));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodTipoElemento", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_codtipoelemento, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_TipoElemento", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_tipoelemento));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ModuloOrigen", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_moduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaOrigen", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_codalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeOrigen", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_codbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadanteOrigen", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdProveedor", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_idproveedor, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NombCuentadanteOrigen", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NombreProveedor", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_nombreproveedor));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ModuloDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_modulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_codalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_codbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NombCuentadanteDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Observaciones", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_AreadanteCodigo", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_areadantecodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_AreadanteDescripcion", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CursoCodigo", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_cursocodigo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CursoDescripcion", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_cursodescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ValorTransaccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCabeTrans_Tran_valortransaccion, 18, 2)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NumeroLineas", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_numerolineas, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Estado", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_estado));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTCabeTrans_Tran_fecharatificacion) )
      {
         oWriter.writeStartElement("Tran_FechaRatificacion");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCabeTrans_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCabeTrans_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCabeTrans_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTCabeTrans_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTCabeTrans_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTCabeTrans_Tran_fecharatificacion), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaRatificacion", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_UsuarioRatifica", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_usuarioratifica));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ConsecutivoCC", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_consecutivocc, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_TipoIngreso", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_tipoingreso, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_NumeroIngreso", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_numeroingreso));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTCabeTrans_Tran_fechaingreso) )
      {
         oWriter.writeStartElement("Tran_FechaIngreso");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCabeTrans_Tran_fechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCabeTrans_Tran_fechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCabeTrans_Tran_fechaingreso), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Tran_FechaIngreso", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeElement("Tran_CentroCostoIdDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoCodigoDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CentroCostoDescripcionDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionIdDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_regioniddestino, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionCodigoDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionDescripcionDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_RegionAbrevDestino", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_Detalle", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_detalle));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_TipoEntra", GXutil.rtrim( gxTv_SdtSDTCabeTrans_Tran_tipoentra));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CantidadPadres", GXutil.trim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_cantidadpadres, 8, 0)));
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
      AddObjectProperty("Tran_Id", gxTv_SdtSDTCabeTrans_Tran_id, false);
      datetime_STZ = gxTv_SdtSDTCabeTrans_Tran_fecharegistro ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaRegistro", sDateCnv, false);
      AddObjectProperty("Tran_UsuarioId", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_usuarioid, 18, 0)), false);
      AddObjectProperty("Tran_UsuarioCodigo", gxTv_SdtSDTCabeTrans_Tran_usuariocodigo, false);
      AddObjectProperty("Tran_UsuarioNombre", gxTv_SdtSDTCabeTrans_Tran_usuarionombre, false);
      AddObjectProperty("Tran_CentroCostoId", gxTv_SdtSDTCabeTrans_Tran_centrocostoid, false);
      AddObjectProperty("Tran_CentroCostoCodigo", gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo, false);
      AddObjectProperty("Tran_CentroCostoDescripcion", gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion, false);
      AddObjectProperty("Tran_RegionId", gxTv_SdtSDTCabeTrans_Tran_regionid, false);
      AddObjectProperty("Tran_RegionCodigo", gxTv_SdtSDTCabeTrans_Tran_regioncodigo, false);
      AddObjectProperty("Tran_RegionDescripcion", gxTv_SdtSDTCabeTrans_Tran_regiondescripcion, false);
      AddObjectProperty("Tran_RegionAbrev", gxTv_SdtSDTCabeTrans_Tran_regionabrev, false);
      AddObjectProperty("Tran_CodigoMovimiento", gxTv_SdtSDTCabeTrans_Tran_codigomovimiento, false);
      AddObjectProperty("Tran_DescripcionMovimiento", gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento, false);
      AddObjectProperty("Tran_IndAreadante", gxTv_SdtSDTCabeTrans_Tran_indareadante, false);
      AddObjectProperty("Tran_IndE_S", gxTv_SdtSDTCabeTrans_Tran_inde_s, false);
      AddObjectProperty("Tran_IndCurso", gxTv_SdtSDTCabeTrans_Tran_indcurso, false);
      AddObjectProperty("Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_codtipoelemento, 18, 0)), false);
      AddObjectProperty("Tran_TipoElemento", gxTv_SdtSDTCabeTrans_Tran_tipoelemento, false);
      AddObjectProperty("Tran_ModuloOrigen", gxTv_SdtSDTCabeTrans_Tran_moduloorigen, false);
      AddObjectProperty("Tran_CodAlmaOrigen", gxTv_SdtSDTCabeTrans_Tran_codalmaorigen, false);
      AddObjectProperty("Tran_CodBodeOrigen", gxTv_SdtSDTCabeTrans_Tran_codbodeorigen, false);
      AddObjectProperty("Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen, 18, 0)), false);
      AddObjectProperty("Tran_IdProveedor", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_idproveedor, 18, 0)), false);
      AddObjectProperty("Tran_NombCuentadanteOrigen", gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen, false);
      AddObjectProperty("Tran_NombreProveedor", gxTv_SdtSDTCabeTrans_Tran_nombreproveedor, false);
      AddObjectProperty("Tran_ModuloDestino", gxTv_SdtSDTCabeTrans_Tran_modulodestino, false);
      AddObjectProperty("Tran_CodAlmaDestino", gxTv_SdtSDTCabeTrans_Tran_codalmadestino, false);
      AddObjectProperty("Tran_CodBodeDestino", gxTv_SdtSDTCabeTrans_Tran_codbodedestino, false);
      AddObjectProperty("Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino, 18, 0)), false);
      AddObjectProperty("Tran_NombCuentadanteDestino", gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino, false);
      AddObjectProperty("Tran_Observaciones", gxTv_SdtSDTCabeTrans_Tran_observaciones, false);
      AddObjectProperty("Tran_AreadanteCodigo", gxTv_SdtSDTCabeTrans_Tran_areadantecodigo, false);
      AddObjectProperty("Tran_AreadanteDescripcion", gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion, false);
      AddObjectProperty("Tran_CursoCodigo", gxTv_SdtSDTCabeTrans_Tran_cursocodigo, false);
      AddObjectProperty("Tran_CursoDescripcion", gxTv_SdtSDTCabeTrans_Tran_cursodescripcion, false);
      AddObjectProperty("Tran_ValorTransaccion", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSDTCabeTrans_Tran_valortransaccion, 18, 2)), false);
      AddObjectProperty("Tran_NumeroLineas", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_numerolineas, 18, 0)), false);
      AddObjectProperty("Tran_Estado", gxTv_SdtSDTCabeTrans_Tran_estado, false);
      datetime_STZ = gxTv_SdtSDTCabeTrans_Tran_fecharatificacion ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaRatificacion", sDateCnv, false);
      AddObjectProperty("Tran_UsuarioRatifica", gxTv_SdtSDTCabeTrans_Tran_usuarioratifica, false);
      AddObjectProperty("Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( gxTv_SdtSDTCabeTrans_Tran_consecutivocc, 18, 0)), false);
      AddObjectProperty("Tran_TipoIngreso", gxTv_SdtSDTCabeTrans_Tran_tipoingreso, false);
      AddObjectProperty("Tran_NumeroIngreso", gxTv_SdtSDTCabeTrans_Tran_numeroingreso, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCabeTrans_Tran_fechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCabeTrans_Tran_fechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCabeTrans_Tran_fechaingreso), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Tran_FechaIngreso", sDateCnv, false);
      AddObjectProperty("Tran_CentroCostoIdDestino", gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino, false);
      AddObjectProperty("Tran_CentroCostoCodigoDestino", gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino, false);
      AddObjectProperty("Tran_CentroCostoDescripcionDestino", gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino, false);
      AddObjectProperty("Tran_RegionIdDestino", gxTv_SdtSDTCabeTrans_Tran_regioniddestino, false);
      AddObjectProperty("Tran_RegionCodigoDestino", gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino, false);
      AddObjectProperty("Tran_RegionDescripcionDestino", gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino, false);
      AddObjectProperty("Tran_RegionAbrevDestino", gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino, false);
      AddObjectProperty("Tran_Detalle", gxTv_SdtSDTCabeTrans_Tran_detalle, false);
      AddObjectProperty("Tran_TipoEntra", gxTv_SdtSDTCabeTrans_Tran_tipoentra, false);
      AddObjectProperty("Tran_CantidadPadres", gxTv_SdtSDTCabeTrans_Tran_cantidadpadres, false);
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_id( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_id ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_id( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_id = value ;
   }

   public java.util.Date getgxTv_SdtSDTCabeTrans_Tran_fecharegistro( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_fecharegistro ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTCabeTrans_Tran_fecharegistro = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_usuarioid( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuarioid ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_usuarioid( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuarioid = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_usuariocodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuariocodigo ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_usuariocodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuariocodigo = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_usuarionombre( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuarionombre ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_usuarionombre( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuarionombre = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_centrocostoid( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostoid ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_centrocostoid( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostoid = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_centrocostocodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_centrocostocodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_regionid( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regionid ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regionid( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regionid = value ;
   }

   public short getgxTv_SdtSDTCabeTrans_Tran_regioncodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regioncodigo ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regioncodigo( short value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regioncodigo = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_regiondescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regiondescripcion ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regiondescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regiondescripcion = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_regionabrev( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regionabrev ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regionabrev( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regionabrev = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_codigomovimiento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codigomovimiento ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_codigomovimiento( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codigomovimiento = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_indareadante( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_indareadante ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_indareadante( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_indareadante = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_inde_s( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_inde_s ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_inde_s( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_inde_s = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_indcurso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_indcurso ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_indcurso( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_indcurso = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_codtipoelemento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codtipoelemento ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_codtipoelemento( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codtipoelemento = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_tipoelemento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_tipoelemento ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_tipoelemento( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_tipoelemento = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_moduloorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_moduloorigen ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_moduloorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_moduloorigen = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_codalmaorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codalmaorigen ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_codalmaorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codalmaorigen = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_codbodeorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codbodeorigen ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_codbodeorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codbodeorigen = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_idproveedor( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_idproveedor ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_idproveedor( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_idproveedor = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_nombreproveedor( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_nombreproveedor ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_nombreproveedor( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_nombreproveedor = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_modulodestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_modulodestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_modulodestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_modulodestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_codalmadestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codalmadestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_codalmadestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codalmadestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_codbodedestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codbodedestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_codbodedestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codbodedestino = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_observaciones( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_observaciones ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_observaciones( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_observaciones = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_areadantecodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_areadantecodigo ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_areadantecodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_areadantecodigo = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_areadantedescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_areadantedescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_cursocodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_cursocodigo ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_cursocodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_cursocodigo = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_cursodescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_cursodescripcion ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_cursodescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_cursodescripcion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCabeTrans_Tran_valortransaccion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_valortransaccion ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_valortransaccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCabeTrans_Tran_valortransaccion = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_numerolineas( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_numerolineas ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_numerolineas( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_numerolineas = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_estado( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_estado ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_estado( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_estado = value ;
   }

   public java.util.Date getgxTv_SdtSDTCabeTrans_Tran_fecharatificacion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_fecharatificacion ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTCabeTrans_Tran_fecharatificacion = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_usuarioratifica( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuarioratifica ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_usuarioratifica( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuarioratifica = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_consecutivocc( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_consecutivocc ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_consecutivocc( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_consecutivocc = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_tipoingreso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_tipoingreso ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_tipoingreso( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_tipoingreso = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_numeroingreso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_numeroingreso ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_numeroingreso( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_numeroingreso = value ;
   }

   public java.util.Date getgxTv_SdtSDTCabeTrans_Tran_fechaingreso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_fechaingreso ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_fechaingreso( java.util.Date value )
   {
      gxTv_SdtSDTCabeTrans_Tran_fechaingreso = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino = value ;
   }

   public long getgxTv_SdtSDTCabeTrans_Tran_regioniddestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regioniddestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regioniddestino( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regioniddestino = value ;
   }

   public short getgxTv_SdtSDTCabeTrans_Tran_regioncodigodestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regioncodigodestino( short value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_regionabrevdestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_regionabrevdestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_detalle( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_detalle ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_detalle( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_detalle = value ;
   }

   public String getgxTv_SdtSDTCabeTrans_Tran_tipoentra( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_tipoentra ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_tipoentra( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_tipoentra = value ;
   }

   public int getgxTv_SdtSDTCabeTrans_Tran_cantidadpadres( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_cantidadpadres ;
   }

   public void setgxTv_SdtSDTCabeTrans_Tran_cantidadpadres( int value )
   {
      gxTv_SdtSDTCabeTrans_Tran_cantidadpadres = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCabeTrans_Tran_fecharegistro = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTCabeTrans_Tran_usuariocodigo = "" ;
      gxTv_SdtSDTCabeTrans_Tran_usuarionombre = "" ;
      gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo = "" ;
      gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion = "" ;
      gxTv_SdtSDTCabeTrans_Tran_regiondescripcion = "" ;
      gxTv_SdtSDTCabeTrans_Tran_regionabrev = "" ;
      gxTv_SdtSDTCabeTrans_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento = "" ;
      gxTv_SdtSDTCabeTrans_Tran_indareadante = "" ;
      gxTv_SdtSDTCabeTrans_Tran_inde_s = "" ;
      gxTv_SdtSDTCabeTrans_Tran_indcurso = "" ;
      gxTv_SdtSDTCabeTrans_Tran_tipoelemento = "" ;
      gxTv_SdtSDTCabeTrans_Tran_moduloorigen = "" ;
      gxTv_SdtSDTCabeTrans_Tran_codalmaorigen = "" ;
      gxTv_SdtSDTCabeTrans_Tran_codbodeorigen = "" ;
      gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen = "" ;
      gxTv_SdtSDTCabeTrans_Tran_nombreproveedor = "" ;
      gxTv_SdtSDTCabeTrans_Tran_modulodestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_codalmadestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_codbodedestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_observaciones = "" ;
      gxTv_SdtSDTCabeTrans_Tran_areadantecodigo = "" ;
      gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion = "" ;
      gxTv_SdtSDTCabeTrans_Tran_cursocodigo = "" ;
      gxTv_SdtSDTCabeTrans_Tran_cursodescripcion = "" ;
      gxTv_SdtSDTCabeTrans_Tran_valortransaccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTCabeTrans_Tran_estado = "" ;
      gxTv_SdtSDTCabeTrans_Tran_fecharatificacion = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTCabeTrans_Tran_usuarioratifica = "" ;
      gxTv_SdtSDTCabeTrans_Tran_numeroingreso = "" ;
      gxTv_SdtSDTCabeTrans_Tran_fechaingreso = GXutil.nullDate() ;
      gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_detalle = "" ;
      gxTv_SdtSDTCabeTrans_Tran_tipoentra = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public com.orions2.SdtSDTCabeTrans Clone( )
   {
      return (com.orions2.SdtSDTCabeTrans)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTCabeTrans struct )
   {
      setgxTv_SdtSDTCabeTrans_Tran_id(struct.getTran_id());
      setgxTv_SdtSDTCabeTrans_Tran_fecharegistro(struct.getTran_fecharegistro());
      setgxTv_SdtSDTCabeTrans_Tran_usuarioid(struct.getTran_usuarioid());
      setgxTv_SdtSDTCabeTrans_Tran_usuariocodigo(struct.getTran_usuariocodigo());
      setgxTv_SdtSDTCabeTrans_Tran_usuarionombre(struct.getTran_usuarionombre());
      setgxTv_SdtSDTCabeTrans_Tran_centrocostoid(struct.getTran_centrocostoid());
      setgxTv_SdtSDTCabeTrans_Tran_centrocostocodigo(struct.getTran_centrocostocodigo());
      setgxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion(struct.getTran_centrocostodescripcion());
      setgxTv_SdtSDTCabeTrans_Tran_regionid(struct.getTran_regionid());
      setgxTv_SdtSDTCabeTrans_Tran_regioncodigo(struct.getTran_regioncodigo());
      setgxTv_SdtSDTCabeTrans_Tran_regiondescripcion(struct.getTran_regiondescripcion());
      setgxTv_SdtSDTCabeTrans_Tran_regionabrev(struct.getTran_regionabrev());
      setgxTv_SdtSDTCabeTrans_Tran_codigomovimiento(struct.getTran_codigomovimiento());
      setgxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento(struct.getTran_descripcionmovimiento());
      setgxTv_SdtSDTCabeTrans_Tran_indareadante(struct.getTran_indareadante());
      setgxTv_SdtSDTCabeTrans_Tran_inde_s(struct.getTran_inde_s());
      setgxTv_SdtSDTCabeTrans_Tran_indcurso(struct.getTran_indcurso());
      setgxTv_SdtSDTCabeTrans_Tran_codtipoelemento(struct.getTran_codtipoelemento());
      setgxTv_SdtSDTCabeTrans_Tran_tipoelemento(struct.getTran_tipoelemento());
      setgxTv_SdtSDTCabeTrans_Tran_moduloorigen(struct.getTran_moduloorigen());
      setgxTv_SdtSDTCabeTrans_Tran_codalmaorigen(struct.getTran_codalmaorigen());
      setgxTv_SdtSDTCabeTrans_Tran_codbodeorigen(struct.getTran_codbodeorigen());
      setgxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen(struct.getTran_idcuentadanteorigen());
      setgxTv_SdtSDTCabeTrans_Tran_idproveedor(struct.getTran_idproveedor());
      setgxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen(struct.getTran_nombcuentadanteorigen());
      setgxTv_SdtSDTCabeTrans_Tran_nombreproveedor(struct.getTran_nombreproveedor());
      setgxTv_SdtSDTCabeTrans_Tran_modulodestino(struct.getTran_modulodestino());
      setgxTv_SdtSDTCabeTrans_Tran_codalmadestino(struct.getTran_codalmadestino());
      setgxTv_SdtSDTCabeTrans_Tran_codbodedestino(struct.getTran_codbodedestino());
      setgxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino(struct.getTran_idcuentadantedestino());
      setgxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino(struct.getTran_nombcuentadantedestino());
      setgxTv_SdtSDTCabeTrans_Tran_observaciones(struct.getTran_observaciones());
      setgxTv_SdtSDTCabeTrans_Tran_areadantecodigo(struct.getTran_areadantecodigo());
      setgxTv_SdtSDTCabeTrans_Tran_areadantedescripcion(struct.getTran_areadantedescripcion());
      setgxTv_SdtSDTCabeTrans_Tran_cursocodigo(struct.getTran_cursocodigo());
      setgxTv_SdtSDTCabeTrans_Tran_cursodescripcion(struct.getTran_cursodescripcion());
      setgxTv_SdtSDTCabeTrans_Tran_valortransaccion(struct.getTran_valortransaccion());
      setgxTv_SdtSDTCabeTrans_Tran_numerolineas(struct.getTran_numerolineas());
      setgxTv_SdtSDTCabeTrans_Tran_estado(struct.getTran_estado());
      setgxTv_SdtSDTCabeTrans_Tran_fecharatificacion(struct.getTran_fecharatificacion());
      setgxTv_SdtSDTCabeTrans_Tran_usuarioratifica(struct.getTran_usuarioratifica());
      setgxTv_SdtSDTCabeTrans_Tran_consecutivocc(struct.getTran_consecutivocc());
      setgxTv_SdtSDTCabeTrans_Tran_tipoingreso(struct.getTran_tipoingreso());
      setgxTv_SdtSDTCabeTrans_Tran_numeroingreso(struct.getTran_numeroingreso());
      setgxTv_SdtSDTCabeTrans_Tran_fechaingreso(struct.getTran_fechaingreso());
      setgxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino(struct.getTran_centrocostoiddestino());
      setgxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino(struct.getTran_centrocostocodigodestino());
      setgxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino(struct.getTran_centrocostodescripciondestino());
      setgxTv_SdtSDTCabeTrans_Tran_regioniddestino(struct.getTran_regioniddestino());
      setgxTv_SdtSDTCabeTrans_Tran_regioncodigodestino(struct.getTran_regioncodigodestino());
      setgxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino(struct.getTran_regiondescripciondestino());
      setgxTv_SdtSDTCabeTrans_Tran_regionabrevdestino(struct.getTran_regionabrevdestino());
      setgxTv_SdtSDTCabeTrans_Tran_detalle(struct.getTran_detalle());
      setgxTv_SdtSDTCabeTrans_Tran_tipoentra(struct.getTran_tipoentra());
      setgxTv_SdtSDTCabeTrans_Tran_cantidadpadres(struct.getTran_cantidadpadres());
   }

   public com.orions2.StructSdtSDTCabeTrans getStruct( )
   {
      com.orions2.StructSdtSDTCabeTrans struct = new com.orions2.StructSdtSDTCabeTrans ();
      struct.setTran_id(getgxTv_SdtSDTCabeTrans_Tran_id());
      struct.setTran_fecharegistro(getgxTv_SdtSDTCabeTrans_Tran_fecharegistro());
      struct.setTran_usuarioid(getgxTv_SdtSDTCabeTrans_Tran_usuarioid());
      struct.setTran_usuariocodigo(getgxTv_SdtSDTCabeTrans_Tran_usuariocodigo());
      struct.setTran_usuarionombre(getgxTv_SdtSDTCabeTrans_Tran_usuarionombre());
      struct.setTran_centrocostoid(getgxTv_SdtSDTCabeTrans_Tran_centrocostoid());
      struct.setTran_centrocostocodigo(getgxTv_SdtSDTCabeTrans_Tran_centrocostocodigo());
      struct.setTran_centrocostodescripcion(getgxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion());
      struct.setTran_regionid(getgxTv_SdtSDTCabeTrans_Tran_regionid());
      struct.setTran_regioncodigo(getgxTv_SdtSDTCabeTrans_Tran_regioncodigo());
      struct.setTran_regiondescripcion(getgxTv_SdtSDTCabeTrans_Tran_regiondescripcion());
      struct.setTran_regionabrev(getgxTv_SdtSDTCabeTrans_Tran_regionabrev());
      struct.setTran_codigomovimiento(getgxTv_SdtSDTCabeTrans_Tran_codigomovimiento());
      struct.setTran_descripcionmovimiento(getgxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento());
      struct.setTran_indareadante(getgxTv_SdtSDTCabeTrans_Tran_indareadante());
      struct.setTran_inde_s(getgxTv_SdtSDTCabeTrans_Tran_inde_s());
      struct.setTran_indcurso(getgxTv_SdtSDTCabeTrans_Tran_indcurso());
      struct.setTran_codtipoelemento(getgxTv_SdtSDTCabeTrans_Tran_codtipoelemento());
      struct.setTran_tipoelemento(getgxTv_SdtSDTCabeTrans_Tran_tipoelemento());
      struct.setTran_moduloorigen(getgxTv_SdtSDTCabeTrans_Tran_moduloorigen());
      struct.setTran_codalmaorigen(getgxTv_SdtSDTCabeTrans_Tran_codalmaorigen());
      struct.setTran_codbodeorigen(getgxTv_SdtSDTCabeTrans_Tran_codbodeorigen());
      struct.setTran_idcuentadanteorigen(getgxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen());
      struct.setTran_idproveedor(getgxTv_SdtSDTCabeTrans_Tran_idproveedor());
      struct.setTran_nombcuentadanteorigen(getgxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen());
      struct.setTran_nombreproveedor(getgxTv_SdtSDTCabeTrans_Tran_nombreproveedor());
      struct.setTran_modulodestino(getgxTv_SdtSDTCabeTrans_Tran_modulodestino());
      struct.setTran_codalmadestino(getgxTv_SdtSDTCabeTrans_Tran_codalmadestino());
      struct.setTran_codbodedestino(getgxTv_SdtSDTCabeTrans_Tran_codbodedestino());
      struct.setTran_idcuentadantedestino(getgxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino());
      struct.setTran_nombcuentadantedestino(getgxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino());
      struct.setTran_observaciones(getgxTv_SdtSDTCabeTrans_Tran_observaciones());
      struct.setTran_areadantecodigo(getgxTv_SdtSDTCabeTrans_Tran_areadantecodigo());
      struct.setTran_areadantedescripcion(getgxTv_SdtSDTCabeTrans_Tran_areadantedescripcion());
      struct.setTran_cursocodigo(getgxTv_SdtSDTCabeTrans_Tran_cursocodigo());
      struct.setTran_cursodescripcion(getgxTv_SdtSDTCabeTrans_Tran_cursodescripcion());
      struct.setTran_valortransaccion(getgxTv_SdtSDTCabeTrans_Tran_valortransaccion());
      struct.setTran_numerolineas(getgxTv_SdtSDTCabeTrans_Tran_numerolineas());
      struct.setTran_estado(getgxTv_SdtSDTCabeTrans_Tran_estado());
      struct.setTran_fecharatificacion(getgxTv_SdtSDTCabeTrans_Tran_fecharatificacion());
      struct.setTran_usuarioratifica(getgxTv_SdtSDTCabeTrans_Tran_usuarioratifica());
      struct.setTran_consecutivocc(getgxTv_SdtSDTCabeTrans_Tran_consecutivocc());
      struct.setTran_tipoingreso(getgxTv_SdtSDTCabeTrans_Tran_tipoingreso());
      struct.setTran_numeroingreso(getgxTv_SdtSDTCabeTrans_Tran_numeroingreso());
      struct.setTran_fechaingreso(getgxTv_SdtSDTCabeTrans_Tran_fechaingreso());
      struct.setTran_centrocostoiddestino(getgxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino());
      struct.setTran_centrocostocodigodestino(getgxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino());
      struct.setTran_centrocostodescripciondestino(getgxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino());
      struct.setTran_regioniddestino(getgxTv_SdtSDTCabeTrans_Tran_regioniddestino());
      struct.setTran_regioncodigodestino(getgxTv_SdtSDTCabeTrans_Tran_regioncodigodestino());
      struct.setTran_regiondescripciondestino(getgxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino());
      struct.setTran_regionabrevdestino(getgxTv_SdtSDTCabeTrans_Tran_regionabrevdestino());
      struct.setTran_detalle(getgxTv_SdtSDTCabeTrans_Tran_detalle());
      struct.setTran_tipoentra(getgxTv_SdtSDTCabeTrans_Tran_tipoentra());
      struct.setTran_cantidadpadres(getgxTv_SdtSDTCabeTrans_Tran_cantidadpadres());
      return struct ;
   }

   protected short gxTv_SdtSDTCabeTrans_Tran_regioncodigo ;
   protected short gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTCabeTrans_Tran_cantidadpadres ;
   protected long gxTv_SdtSDTCabeTrans_Tran_id ;
   protected long gxTv_SdtSDTCabeTrans_Tran_usuarioid ;
   protected long gxTv_SdtSDTCabeTrans_Tran_centrocostoid ;
   protected long gxTv_SdtSDTCabeTrans_Tran_regionid ;
   protected long gxTv_SdtSDTCabeTrans_Tran_codtipoelemento ;
   protected long gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen ;
   protected long gxTv_SdtSDTCabeTrans_Tran_idproveedor ;
   protected long gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino ;
   protected long gxTv_SdtSDTCabeTrans_Tran_numerolineas ;
   protected long gxTv_SdtSDTCabeTrans_Tran_consecutivocc ;
   protected long gxTv_SdtSDTCabeTrans_Tran_tipoingreso ;
   protected long gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino ;
   protected long gxTv_SdtSDTCabeTrans_Tran_regioniddestino ;
   protected java.math.BigDecimal gxTv_SdtSDTCabeTrans_Tran_valortransaccion ;
   protected String gxTv_SdtSDTCabeTrans_Tran_tipoelemento ;
   protected String gxTv_SdtSDTCabeTrans_Tran_estado ;
   protected String gxTv_SdtSDTCabeTrans_Tran_numeroingreso ;
   protected String gxTv_SdtSDTCabeTrans_Tran_detalle ;
   protected String gxTv_SdtSDTCabeTrans_Tran_tipoentra ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCabeTrans_Tran_fecharegistro ;
   protected java.util.Date gxTv_SdtSDTCabeTrans_Tran_fecharatificacion ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtSDTCabeTrans_Tran_fechaingreso ;
   protected String gxTv_SdtSDTCabeTrans_Tran_observaciones ;
   protected String gxTv_SdtSDTCabeTrans_Tran_usuariocodigo ;
   protected String gxTv_SdtSDTCabeTrans_Tran_usuarionombre ;
   protected String gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo ;
   protected String gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion ;
   protected String gxTv_SdtSDTCabeTrans_Tran_regiondescripcion ;
   protected String gxTv_SdtSDTCabeTrans_Tran_regionabrev ;
   protected String gxTv_SdtSDTCabeTrans_Tran_codigomovimiento ;
   protected String gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento ;
   protected String gxTv_SdtSDTCabeTrans_Tran_indareadante ;
   protected String gxTv_SdtSDTCabeTrans_Tran_inde_s ;
   protected String gxTv_SdtSDTCabeTrans_Tran_indcurso ;
   protected String gxTv_SdtSDTCabeTrans_Tran_moduloorigen ;
   protected String gxTv_SdtSDTCabeTrans_Tran_codalmaorigen ;
   protected String gxTv_SdtSDTCabeTrans_Tran_codbodeorigen ;
   protected String gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen ;
   protected String gxTv_SdtSDTCabeTrans_Tran_nombreproveedor ;
   protected String gxTv_SdtSDTCabeTrans_Tran_modulodestino ;
   protected String gxTv_SdtSDTCabeTrans_Tran_codalmadestino ;
   protected String gxTv_SdtSDTCabeTrans_Tran_codbodedestino ;
   protected String gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino ;
   protected String gxTv_SdtSDTCabeTrans_Tran_areadantecodigo ;
   protected String gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion ;
   protected String gxTv_SdtSDTCabeTrans_Tran_cursocodigo ;
   protected String gxTv_SdtSDTCabeTrans_Tran_cursodescripcion ;
   protected String gxTv_SdtSDTCabeTrans_Tran_usuarioratifica ;
   protected String gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino ;
   protected String gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino ;
   protected String gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino ;
   protected String gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino ;
}

