/*
               File: StructSdtSDTCabeTrans
        Description: SDTCabeTrans
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:16.71
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.genexus.*;

public final  class StructSdtSDTCabeTrans implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCabeTrans( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTCabeTrans_Tran_fecharegistro = cal.getTime() ;
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
      gxTv_SdtSDTCabeTrans_Tran_valortransaccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTCabeTrans_Tran_estado = "" ;
      gxTv_SdtSDTCabeTrans_Tran_fecharatificacion = cal.getTime() ;
      gxTv_SdtSDTCabeTrans_Tran_usuarioratifica = "" ;
      gxTv_SdtSDTCabeTrans_Tran_numeroingreso = "" ;
      gxTv_SdtSDTCabeTrans_Tran_fechaingreso = cal.getTime() ;
      gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino = "" ;
      gxTv_SdtSDTCabeTrans_Tran_detalle = "" ;
      gxTv_SdtSDTCabeTrans_Tran_tipoentra = "" ;
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
      return gxTv_SdtSDTCabeTrans_Tran_id ;
   }

   public void setTran_id( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_id = value ;
   }

   public java.util.Date getTran_fecharegistro( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_fecharegistro ;
   }

   public void setTran_fecharegistro( java.util.Date value )
   {
      gxTv_SdtSDTCabeTrans_Tran_fecharegistro = value ;
   }

   public long getTran_usuarioid( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuarioid ;
   }

   public void setTran_usuarioid( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuarioid = value ;
   }

   public String getTran_usuariocodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuariocodigo ;
   }

   public void setTran_usuariocodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuariocodigo = value ;
   }

   public String getTran_usuarionombre( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuarionombre ;
   }

   public void setTran_usuarionombre( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuarionombre = value ;
   }

   public long getTran_centrocostoid( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostoid ;
   }

   public void setTran_centrocostoid( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostoid = value ;
   }

   public String getTran_centrocostocodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo ;
   }

   public void setTran_centrocostocodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostocodigo = value ;
   }

   public String getTran_centrocostodescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion ;
   }

   public void setTran_centrocostodescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostodescripcion = value ;
   }

   public long getTran_regionid( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regionid ;
   }

   public void setTran_regionid( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regionid = value ;
   }

   public short getTran_regioncodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regioncodigo ;
   }

   public void setTran_regioncodigo( short value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regioncodigo = value ;
   }

   public String getTran_regiondescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regiondescripcion ;
   }

   public void setTran_regiondescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regiondescripcion = value ;
   }

   public String getTran_regionabrev( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regionabrev ;
   }

   public void setTran_regionabrev( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regionabrev = value ;
   }

   public String getTran_codigomovimiento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codigomovimiento ;
   }

   public void setTran_codigomovimiento( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codigomovimiento = value ;
   }

   public String getTran_descripcionmovimiento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento ;
   }

   public void setTran_descripcionmovimiento( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_descripcionmovimiento = value ;
   }

   public String getTran_indareadante( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_indareadante ;
   }

   public void setTran_indareadante( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_indareadante = value ;
   }

   public String getTran_inde_s( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_inde_s ;
   }

   public void setTran_inde_s( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_inde_s = value ;
   }

   public String getTran_indcurso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_indcurso ;
   }

   public void setTran_indcurso( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_indcurso = value ;
   }

   public long getTran_codtipoelemento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codtipoelemento ;
   }

   public void setTran_codtipoelemento( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codtipoelemento = value ;
   }

   public String getTran_tipoelemento( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_tipoelemento ;
   }

   public void setTran_tipoelemento( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_tipoelemento = value ;
   }

   public String getTran_moduloorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_moduloorigen ;
   }

   public void setTran_moduloorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_moduloorigen = value ;
   }

   public String getTran_codalmaorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codalmaorigen ;
   }

   public void setTran_codalmaorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codalmaorigen = value ;
   }

   public String getTran_codbodeorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codbodeorigen ;
   }

   public void setTran_codbodeorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codbodeorigen = value ;
   }

   public long getTran_idcuentadanteorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen ;
   }

   public void setTran_idcuentadanteorigen( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_idcuentadanteorigen = value ;
   }

   public long getTran_idproveedor( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_idproveedor ;
   }

   public void setTran_idproveedor( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_idproveedor = value ;
   }

   public String getTran_nombcuentadanteorigen( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen ;
   }

   public void setTran_nombcuentadanteorigen( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_nombcuentadanteorigen = value ;
   }

   public String getTran_nombreproveedor( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_nombreproveedor ;
   }

   public void setTran_nombreproveedor( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_nombreproveedor = value ;
   }

   public String getTran_modulodestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_modulodestino ;
   }

   public void setTran_modulodestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_modulodestino = value ;
   }

   public String getTran_codalmadestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codalmadestino ;
   }

   public void setTran_codalmadestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codalmadestino = value ;
   }

   public String getTran_codbodedestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_codbodedestino ;
   }

   public void setTran_codbodedestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_codbodedestino = value ;
   }

   public long getTran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino ;
   }

   public void setTran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_idcuentadantedestino = value ;
   }

   public String getTran_nombcuentadantedestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino ;
   }

   public void setTran_nombcuentadantedestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_nombcuentadantedestino = value ;
   }

   public String getTran_observaciones( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_observaciones ;
   }

   public void setTran_observaciones( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_observaciones = value ;
   }

   public String getTran_areadantecodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_areadantecodigo ;
   }

   public void setTran_areadantecodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_areadantecodigo = value ;
   }

   public String getTran_areadantedescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion ;
   }

   public void setTran_areadantedescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_areadantedescripcion = value ;
   }

   public String getTran_cursocodigo( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_cursocodigo ;
   }

   public void setTran_cursocodigo( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_cursocodigo = value ;
   }

   public String getTran_cursodescripcion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_cursodescripcion ;
   }

   public void setTran_cursodescripcion( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_cursodescripcion = value ;
   }

   public java.math.BigDecimal getTran_valortransaccion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_valortransaccion ;
   }

   public void setTran_valortransaccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCabeTrans_Tran_valortransaccion = value ;
   }

   public long getTran_numerolineas( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_numerolineas ;
   }

   public void setTran_numerolineas( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_numerolineas = value ;
   }

   public String getTran_estado( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_estado ;
   }

   public void setTran_estado( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_estado = value ;
   }

   public java.util.Date getTran_fecharatificacion( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_fecharatificacion ;
   }

   public void setTran_fecharatificacion( java.util.Date value )
   {
      gxTv_SdtSDTCabeTrans_Tran_fecharatificacion = value ;
   }

   public String getTran_usuarioratifica( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_usuarioratifica ;
   }

   public void setTran_usuarioratifica( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_usuarioratifica = value ;
   }

   public long getTran_consecutivocc( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_consecutivocc ;
   }

   public void setTran_consecutivocc( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_consecutivocc = value ;
   }

   public long getTran_tipoingreso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_tipoingreso ;
   }

   public void setTran_tipoingreso( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_tipoingreso = value ;
   }

   public String getTran_numeroingreso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_numeroingreso ;
   }

   public void setTran_numeroingreso( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_numeroingreso = value ;
   }

   public java.util.Date getTran_fechaingreso( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_fechaingreso ;
   }

   public void setTran_fechaingreso( java.util.Date value )
   {
      gxTv_SdtSDTCabeTrans_Tran_fechaingreso = value ;
   }

   public long getTran_centrocostoiddestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino ;
   }

   public void setTran_centrocostoiddestino( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostoiddestino = value ;
   }

   public String getTran_centrocostocodigodestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino ;
   }

   public void setTran_centrocostocodigodestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostocodigodestino = value ;
   }

   public String getTran_centrocostodescripciondestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino ;
   }

   public void setTran_centrocostodescripciondestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_centrocostodescripciondestino = value ;
   }

   public long getTran_regioniddestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regioniddestino ;
   }

   public void setTran_regioniddestino( long value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regioniddestino = value ;
   }

   public short getTran_regioncodigodestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino ;
   }

   public void setTran_regioncodigodestino( short value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino = value ;
   }

   public String getTran_regiondescripciondestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino ;
   }

   public void setTran_regiondescripciondestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regiondescripciondestino = value ;
   }

   public String getTran_regionabrevdestino( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino ;
   }

   public void setTran_regionabrevdestino( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_regionabrevdestino = value ;
   }

   public String getTran_detalle( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_detalle ;
   }

   public void setTran_detalle( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_detalle = value ;
   }

   public String getTran_tipoentra( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_tipoentra ;
   }

   public void setTran_tipoentra( String value )
   {
      gxTv_SdtSDTCabeTrans_Tran_tipoentra = value ;
   }

   public int getTran_cantidadpadres( )
   {
      return gxTv_SdtSDTCabeTrans_Tran_cantidadpadres ;
   }

   public void setTran_cantidadpadres( int value )
   {
      gxTv_SdtSDTCabeTrans_Tran_cantidadpadres = value ;
   }

   protected short gxTv_SdtSDTCabeTrans_Tran_regioncodigo ;
   protected short gxTv_SdtSDTCabeTrans_Tran_regioncodigodestino ;
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
   protected String gxTv_SdtSDTCabeTrans_Tran_tipoelemento ;
   protected String gxTv_SdtSDTCabeTrans_Tran_estado ;
   protected String gxTv_SdtSDTCabeTrans_Tran_numeroingreso ;
   protected String gxTv_SdtSDTCabeTrans_Tran_detalle ;
   protected String gxTv_SdtSDTCabeTrans_Tran_tipoentra ;
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
   protected java.util.Date gxTv_SdtSDTCabeTrans_Tran_fecharegistro ;
   protected java.math.BigDecimal gxTv_SdtSDTCabeTrans_Tran_valortransaccion ;
   protected java.util.Date gxTv_SdtSDTCabeTrans_Tran_fecharatificacion ;
   protected java.util.Date gxTv_SdtSDTCabeTrans_Tran_fechaingreso ;
}

