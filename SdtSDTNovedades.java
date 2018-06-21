/*
               File: SdtSDTNovedades
        Description: SDTNovedades
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:18.89
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

public final  class SdtSDTNovedades extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTNovedades( )
   {
      this(  new ModelContext(SdtSDTNovedades.class));
   }

   public SdtSDTNovedades( ModelContext context )
   {
      super( context, "SdtSDTNovedades");
   }

   public SdtSDTNovedades( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTNovedades");
   }

   public SdtSDTNovedades( StructSdtSDTNovedades struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_UsuarioRegistro") )
            {
               gxTv_SdtSDTNovedades_Nove_usuarioregistro = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_TransId") )
            {
               gxTv_SdtSDTNovedades_Nove_transid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TNov_Codigo") )
            {
               gxTv_SdtSDTNovedades_Tnov_codigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Observaciones") )
            {
               gxTv_SdtSDTNovedades_Nove_observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Masivo") )
            {
               gxTv_SdtSDTNovedades_Nove_masivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_Soporte") )
            {
               gxTv_SdtSDTNovedades_Nove_soporte=GXutil.blobFromBase64( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nove_RutaSoporte") )
            {
               gxTv_SdtSDTNovedades_Nove_rutasoporte = oReader.getValue() ;
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
         sName = "SDTNovedades" ;
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
      oWriter.writeElement("Nove_UsuarioRegistro", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedades_Nove_usuarioregistro, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_TransId", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedades_Nove_transid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TNov_Codigo", GXutil.trim( GXutil.str( gxTv_SdtSDTNovedades_Tnov_codigo, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_Observaciones", GXutil.rtrim( gxTv_SdtSDTNovedades_Nove_observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_Masivo", GXutil.rtrim( gxTv_SdtSDTNovedades_Nove_masivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_Soporte", GXutil.blobToBase64( gxTv_SdtSDTNovedades_Nove_soporte));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Nove_RutaSoporte", GXutil.rtrim( gxTv_SdtSDTNovedades_Nove_rutasoporte));
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
      AddObjectProperty("Nove_UsuarioRegistro", GXutil.ltrim( GXutil.str( gxTv_SdtSDTNovedades_Nove_usuarioregistro, 18, 0)), false);
      AddObjectProperty("Nove_TransId", gxTv_SdtSDTNovedades_Nove_transid, false);
      AddObjectProperty("TNov_Codigo", gxTv_SdtSDTNovedades_Tnov_codigo, false);
      AddObjectProperty("Nove_Observaciones", gxTv_SdtSDTNovedades_Nove_observaciones, false);
      AddObjectProperty("Nove_Masivo", gxTv_SdtSDTNovedades_Nove_masivo, false);
      AddObjectProperty("Nove_Soporte", gxTv_SdtSDTNovedades_Nove_soporte, false);
      AddObjectProperty("Nove_RutaSoporte", gxTv_SdtSDTNovedades_Nove_rutasoporte, false);
   }

   public long getgxTv_SdtSDTNovedades_Nove_usuarioregistro( )
   {
      return gxTv_SdtSDTNovedades_Nove_usuarioregistro ;
   }

   public void setgxTv_SdtSDTNovedades_Nove_usuarioregistro( long value )
   {
      gxTv_SdtSDTNovedades_Nove_usuarioregistro = value ;
   }

   public long getgxTv_SdtSDTNovedades_Nove_transid( )
   {
      return gxTv_SdtSDTNovedades_Nove_transid ;
   }

   public void setgxTv_SdtSDTNovedades_Nove_transid( long value )
   {
      gxTv_SdtSDTNovedades_Nove_transid = value ;
   }

   public int getgxTv_SdtSDTNovedades_Tnov_codigo( )
   {
      return gxTv_SdtSDTNovedades_Tnov_codigo ;
   }

   public void setgxTv_SdtSDTNovedades_Tnov_codigo( int value )
   {
      gxTv_SdtSDTNovedades_Tnov_codigo = value ;
   }

   public String getgxTv_SdtSDTNovedades_Nove_observaciones( )
   {
      return gxTv_SdtSDTNovedades_Nove_observaciones ;
   }

   public void setgxTv_SdtSDTNovedades_Nove_observaciones( String value )
   {
      gxTv_SdtSDTNovedades_Nove_observaciones = value ;
   }

   public String getgxTv_SdtSDTNovedades_Nove_masivo( )
   {
      return gxTv_SdtSDTNovedades_Nove_masivo ;
   }

   public void setgxTv_SdtSDTNovedades_Nove_masivo( String value )
   {
      gxTv_SdtSDTNovedades_Nove_masivo = value ;
   }

   @GxUpload
   public String getgxTv_SdtSDTNovedades_Nove_soporte( )
   {
      return gxTv_SdtSDTNovedades_Nove_soporte ;
   }

   public void setgxTv_SdtSDTNovedades_Nove_soporte( String value )
   {
      gxTv_SdtSDTNovedades_Nove_soporte = value ;
   }

   public String getgxTv_SdtSDTNovedades_Nove_rutasoporte( )
   {
      return gxTv_SdtSDTNovedades_Nove_rutasoporte ;
   }

   public void setgxTv_SdtSDTNovedades_Nove_rutasoporte( String value )
   {
      gxTv_SdtSDTNovedades_Nove_rutasoporte = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTNovedades_Nove_observaciones = "" ;
      gxTv_SdtSDTNovedades_Nove_masivo = "" ;
      gxTv_SdtSDTNovedades_Nove_soporte = "" ;
      gxTv_SdtSDTNovedades_Nove_rutasoporte = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTNovedades Clone( )
   {
      return (com.orions2.SdtSDTNovedades)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTNovedades struct )
   {
      setgxTv_SdtSDTNovedades_Nove_usuarioregistro(struct.getNove_usuarioregistro());
      setgxTv_SdtSDTNovedades_Nove_transid(struct.getNove_transid());
      setgxTv_SdtSDTNovedades_Tnov_codigo(struct.getTnov_codigo());
      setgxTv_SdtSDTNovedades_Nove_observaciones(struct.getNove_observaciones());
      setgxTv_SdtSDTNovedades_Nove_masivo(struct.getNove_masivo());
      setgxTv_SdtSDTNovedades_Nove_soporte(struct.getNove_soporte());
      setgxTv_SdtSDTNovedades_Nove_rutasoporte(struct.getNove_rutasoporte());
   }

   public com.orions2.StructSdtSDTNovedades getStruct( )
   {
      com.orions2.StructSdtSDTNovedades struct = new com.orions2.StructSdtSDTNovedades ();
      struct.setNove_usuarioregistro(getgxTv_SdtSDTNovedades_Nove_usuarioregistro());
      struct.setNove_transid(getgxTv_SdtSDTNovedades_Nove_transid());
      struct.setTnov_codigo(getgxTv_SdtSDTNovedades_Tnov_codigo());
      struct.setNove_observaciones(getgxTv_SdtSDTNovedades_Nove_observaciones());
      struct.setNove_masivo(getgxTv_SdtSDTNovedades_Nove_masivo());
      struct.setNove_soporte(getgxTv_SdtSDTNovedades_Nove_soporte());
      struct.setNove_rutasoporte(getgxTv_SdtSDTNovedades_Nove_rutasoporte());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTNovedades_Tnov_codigo ;
   protected long gxTv_SdtSDTNovedades_Nove_usuarioregistro ;
   protected long gxTv_SdtSDTNovedades_Nove_transid ;
   protected String sTagName ;
   protected String gxTv_SdtSDTNovedades_Nove_observaciones ;
   protected String gxTv_SdtSDTNovedades_Nove_soporte ;
   protected String gxTv_SdtSDTNovedades_Nove_masivo ;
   protected String gxTv_SdtSDTNovedades_Nove_rutasoporte ;
}

