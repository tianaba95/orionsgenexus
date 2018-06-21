/*
               File: SdtSDTTransaccion
        Description: SDTTransaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.29
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

public final  class SdtSDTTransaccion extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTTransaccion( )
   {
      this(  new ModelContext(SdtSDTTransaccion.class));
   }

   public SdtSDTTransaccion( ModelContext context )
   {
      super( context, "SdtSDTTransaccion");
   }

   public SdtSDTTransaccion( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTTransaccion");
   }

   public SdtSDTTransaccion( StructSdtSDTTransaccion struct )
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
               gxTv_SdtSDTTransaccion_Tran_moduloorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaOrigen") )
            {
               gxTv_SdtSDTTransaccion_Tran_codalmaorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeOrigen") )
            {
               gxTv_SdtSDTTransaccion_Tran_codbodeorigen = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadanteOrigen") )
            {
               gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_ModuloDestino") )
            {
               gxTv_SdtSDTTransaccion_Tran_modulodestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodAlmaDestino") )
            {
               gxTv_SdtSDTTransaccion_Tran_codalmadestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_CodBodeDestino") )
            {
               gxTv_SdtSDTTransaccion_Tran_codbodedestino = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tran_IdCuentadanteDestino") )
            {
               gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino = GXutil.lval( oReader.getValue()) ;
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
         sName = "SDTTransaccion" ;
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
      oWriter.writeElement("Tran_ModuloOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccion_Tran_moduloorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccion_Tran_codalmaorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeOrigen", GXutil.rtrim( gxTv_SdtSDTTransaccion_Tran_codbodeorigen));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadanteOrigen", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_ModuloDestino", GXutil.rtrim( gxTv_SdtSDTTransaccion_Tran_modulodestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodAlmaDestino", GXutil.rtrim( gxTv_SdtSDTTransaccion_Tran_codalmadestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_CodBodeDestino", GXutil.rtrim( gxTv_SdtSDTTransaccion_Tran_codbodedestino));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Tran_IdCuentadanteDestino", GXutil.trim( GXutil.str( gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino, 18, 0)));
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
      AddObjectProperty("Tran_ModuloOrigen", gxTv_SdtSDTTransaccion_Tran_moduloorigen, false);
      AddObjectProperty("Tran_CodAlmaOrigen", gxTv_SdtSDTTransaccion_Tran_codalmaorigen, false);
      AddObjectProperty("Tran_CodBodeOrigen", gxTv_SdtSDTTransaccion_Tran_codbodeorigen, false);
      AddObjectProperty("Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen, 18, 0)), false);
      AddObjectProperty("Tran_ModuloDestino", gxTv_SdtSDTTransaccion_Tran_modulodestino, false);
      AddObjectProperty("Tran_CodAlmaDestino", gxTv_SdtSDTTransaccion_Tran_codalmadestino, false);
      AddObjectProperty("Tran_CodBodeDestino", gxTv_SdtSDTTransaccion_Tran_codbodedestino, false);
      AddObjectProperty("Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino, 18, 0)), false);
   }

   public String getgxTv_SdtSDTTransaccion_Tran_moduloorigen( )
   {
      return gxTv_SdtSDTTransaccion_Tran_moduloorigen ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_moduloorigen( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_moduloorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccion_Tran_codalmaorigen( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codalmaorigen ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_codalmaorigen( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codalmaorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccion_Tran_codbodeorigen( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codbodeorigen ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_codbodeorigen( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codbodeorigen = value ;
   }

   public long getgxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen( )
   {
      return gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen( long value )
   {
      gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen = value ;
   }

   public String getgxTv_SdtSDTTransaccion_Tran_modulodestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_modulodestino ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_modulodestino( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_modulodestino = value ;
   }

   public String getgxTv_SdtSDTTransaccion_Tran_codalmadestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codalmadestino ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_codalmadestino( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codalmadestino = value ;
   }

   public String getgxTv_SdtSDTTransaccion_Tran_codbodedestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_codbodedestino ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_codbodedestino( String value )
   {
      gxTv_SdtSDTTransaccion_Tran_codbodedestino = value ;
   }

   public long getgxTv_SdtSDTTransaccion_Tran_idcuentadantedestino( )
   {
      return gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino ;
   }

   public void setgxTv_SdtSDTTransaccion_Tran_idcuentadantedestino( long value )
   {
      gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTTransaccion_Tran_moduloorigen = "" ;
      gxTv_SdtSDTTransaccion_Tran_codalmaorigen = "" ;
      gxTv_SdtSDTTransaccion_Tran_codbodeorigen = "" ;
      gxTv_SdtSDTTransaccion_Tran_modulodestino = "" ;
      gxTv_SdtSDTTransaccion_Tran_codalmadestino = "" ;
      gxTv_SdtSDTTransaccion_Tran_codbodedestino = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTTransaccion Clone( )
   {
      return (com.orions2.SdtSDTTransaccion)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTTransaccion struct )
   {
      setgxTv_SdtSDTTransaccion_Tran_moduloorigen(struct.getTran_moduloorigen());
      setgxTv_SdtSDTTransaccion_Tran_codalmaorigen(struct.getTran_codalmaorigen());
      setgxTv_SdtSDTTransaccion_Tran_codbodeorigen(struct.getTran_codbodeorigen());
      setgxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen(struct.getTran_idcuentadanteorigen());
      setgxTv_SdtSDTTransaccion_Tran_modulodestino(struct.getTran_modulodestino());
      setgxTv_SdtSDTTransaccion_Tran_codalmadestino(struct.getTran_codalmadestino());
      setgxTv_SdtSDTTransaccion_Tran_codbodedestino(struct.getTran_codbodedestino());
      setgxTv_SdtSDTTransaccion_Tran_idcuentadantedestino(struct.getTran_idcuentadantedestino());
   }

   public com.orions2.StructSdtSDTTransaccion getStruct( )
   {
      com.orions2.StructSdtSDTTransaccion struct = new com.orions2.StructSdtSDTTransaccion ();
      struct.setTran_moduloorigen(getgxTv_SdtSDTTransaccion_Tran_moduloorigen());
      struct.setTran_codalmaorigen(getgxTv_SdtSDTTransaccion_Tran_codalmaorigen());
      struct.setTran_codbodeorigen(getgxTv_SdtSDTTransaccion_Tran_codbodeorigen());
      struct.setTran_idcuentadanteorigen(getgxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen());
      struct.setTran_modulodestino(getgxTv_SdtSDTTransaccion_Tran_modulodestino());
      struct.setTran_codalmadestino(getgxTv_SdtSDTTransaccion_Tran_codalmadestino());
      struct.setTran_codbodedestino(getgxTv_SdtSDTTransaccion_Tran_codbodedestino());
      struct.setTran_idcuentadantedestino(getgxTv_SdtSDTTransaccion_Tran_idcuentadantedestino());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTTransaccion_Tran_idcuentadanteorigen ;
   protected long gxTv_SdtSDTTransaccion_Tran_idcuentadantedestino ;
   protected String sTagName ;
   protected String gxTv_SdtSDTTransaccion_Tran_moduloorigen ;
   protected String gxTv_SdtSDTTransaccion_Tran_codalmaorigen ;
   protected String gxTv_SdtSDTTransaccion_Tran_codbodeorigen ;
   protected String gxTv_SdtSDTTransaccion_Tran_modulodestino ;
   protected String gxTv_SdtSDTTransaccion_Tran_codalmadestino ;
   protected String gxTv_SdtSDTTransaccion_Tran_codbodedestino ;
}

