/*
               File: StructSdtSDTNuevaTransaccion
        Description: SDTNuevaTransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:19.39
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTNuevaTransaccion implements Cloneable, java.io.Serializable
{
   public StructSdtSDTNuevaTransaccion( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro = cal.getTime() ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion = cal.getTime() ;
      gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_estado = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_inde_s = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_observaciones = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso = cal.getTime() ;
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_detalle = "" ;
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad = cal.getTime() ;
      gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public long getTran_id( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_id ;
   }

   public void setTran_id( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_id = value ;
   }

   public java.util.Date getTran_fecharegistro( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro ;
   }

   public void setTran_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro = value ;
   }

   public String getTran_codigomovimiento( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento ;
   }

   public void setTran_codigomovimiento( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento = value ;
   }

   public String getTran_moduloorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen ;
   }

   public void setTran_moduloorigen( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen = value ;
   }

   public String getTran_codalmaorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen ;
   }

   public void setTran_codalmaorigen( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen = value ;
   }

   public String getTran_codbodeorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen ;
   }

   public void setTran_codbodeorigen( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen = value ;
   }

   public long getTran_idcuentadanteorigen( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen ;
   }

   public void setTran_idcuentadanteorigen( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen = value ;
   }

   public String getTran_modulodestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino ;
   }

   public void setTran_modulodestino( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino = value ;
   }

   public String getTran_codalmadestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino ;
   }

   public void setTran_codalmadestino( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino = value ;
   }

   public String getTran_codbodedestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino ;
   }

   public void setTran_codbodedestino( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino = value ;
   }

   public long getTran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino ;
   }

   public void setTran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino = value ;
   }

   public java.util.Date getTran_fecharatificacion( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion ;
   }

   public void setTran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion = value ;
   }

   public String getTran_usuarioratifica( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica ;
   }

   public void setTran_usuarioratifica( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica = value ;
   }

   public String getTran_estado( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_estado ;
   }

   public void setTran_estado( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_estado = value ;
   }

   public long getTran_usuarioid( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid ;
   }

   public void setTran_usuarioid( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid = value ;
   }

   public long getTran_centrocostoid( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid ;
   }

   public void setTran_centrocostoid( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid = value ;
   }

   public long getTran_regionid( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_regionid ;
   }

   public void setTran_regionid( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_regionid = value ;
   }

   public String getTran_inde_s( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_inde_s ;
   }

   public void setTran_inde_s( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_inde_s = value ;
   }

   public String getTran_tipoelemento( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento ;
   }

   public void setTran_tipoelemento( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento = value ;
   }

   public String getTran_observaciones( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_observaciones ;
   }

   public void setTran_observaciones( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_observaciones = value ;
   }

   public String getTran_areadantecodigo( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo ;
   }

   public void setTran_areadantecodigo( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo = value ;
   }

   public String getTran_cursocodigo( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo ;
   }

   public void setTran_cursocodigo( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo = value ;
   }

   public java.math.BigDecimal getTran_valortransaccion( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion ;
   }

   public void setTran_valortransaccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion = value ;
   }

   public long getTran_numerolineas( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas ;
   }

   public void setTran_numerolineas( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas = value ;
   }

   public long getTran_consecutivocc( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc ;
   }

   public void setTran_consecutivocc( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc = value ;
   }

   public long getTran_tipoingreso( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso ;
   }

   public void setTran_tipoingreso( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso = value ;
   }

   public String getTran_numeroingreso( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso ;
   }

   public void setTran_numeroingreso( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso = value ;
   }

   public java.util.Date getTran_fechaingreso( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso ;
   }

   public void setTran_fechaingreso( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso = value ;
   }

   public long getTran_centrocostoiddestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino ;
   }

   public void setTran_centrocostoiddestino( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino = value ;
   }

   public long getTran_regioniddestino( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino ;
   }

   public void setTran_regioniddestino( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino = value ;
   }

   public String getTran_tipoentra( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra ;
   }

   public void setTran_tipoentra( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra = value ;
   }

   public int getTran_cantidadpadres( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres ;
   }

   public void setTran_cantidadpadres( int value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres = value ;
   }

   public long getTran_idproveedor( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor ;
   }

   public void setTran_idproveedor( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor = value ;
   }

   public String getTran_detalle( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_detalle ;
   }

   public void setTran_detalle( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_detalle = value ;
   }

   public long getTran_idcuentadanteresponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad ;
   }

   public void setTran_idcuentadanteresponsabilidad( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad = value ;
   }

   public long getTran_transaccresponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad ;
   }

   public void setTran_transaccresponsabilidad( long value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad = value ;
   }

   public java.util.Date getTran_fecharesponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad ;
   }

   public void setTran_fecharesponsabilidad( java.util.Date value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad = value ;
   }

   public short getTran_tablaresponsabilidad( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad ;
   }

   public void setTran_tablaresponsabilidad( short value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad = value ;
   }

   public String getTran_entidadgobierno( )
   {
      return gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno ;
   }

   public void setTran_entidadgobierno( String value )
   {
      gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno = value ;
   }

   protected short gxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad ;
   protected int gxTv_SdtSDTNuevaTransaccion_Tran_cantidadpadres ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_id ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_usuarioid ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_regionid ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_numerolineas ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_consecutivocc ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idproveedor ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad ;
   protected long gxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_estado ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_tipoentra ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_detalle ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_observaciones ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_modulodestino ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_usuarioratifica ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_inde_s ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo ;
   protected String gxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fecharegistro ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fecharatificacion ;
   protected java.math.BigDecimal gxTv_SdtSDTNuevaTransaccion_Tran_valortransaccion ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso ;
   protected java.util.Date gxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad ;
}

