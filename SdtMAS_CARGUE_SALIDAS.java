/*
               File: SdtMAS_CARGUE_SALIDAS
        Description: MAS_CARGUE_SALIDAS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:26.12
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

public final  class SdtMAS_CARGUE_SALIDAS extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtMAS_CARGUE_SALIDAS( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtMAS_CARGUE_SALIDAS.class));
   }

   public SdtMAS_CARGUE_SALIDAS( int remoteHandle ,
                                 ModelContext context )
   {
      super( context, "SdtMAS_CARGUE_SALIDAS");
      initialize( remoteHandle) ;
   }

   public SdtMAS_CARGUE_SALIDAS( int remoteHandle ,
                                 StructSdtMAS_CARGUE_SALIDAS struct )
   {
      this(remoteHandle);
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

   public void Load( long AV78NUMTRN ,
                     short AV79ID_SALIDA )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV78NUMTRN),new Short(AV79ID_SALIDA)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"NUMTRN", long.class}, new Object[]{"ID_SALIDA", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties() ;
      metadata.set("Name", "MAS_CARGUE_SALIDAS");
      metadata.set("BT", "MAS_CARGUE_SALIDAS");
      metadata.set("PK", "[ \"NUMTRN\",\"ID_SALIDA\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NUMTRN") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID_SALIDA") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PLACASENA") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Placasena = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONSECUTIVO") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CANTIDAD") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OBSERVACIONES") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NUMTRN_Z") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID_SALIDA_Z") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PLACASENA_Z") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONSECUTIVO_Z") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CANTIDAD_Z") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OBSERVACIONES_Z") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PLACASENA_N") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONSECUTIVO_N") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CANTIDAD_N") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OBSERVACIONES_N") )
            {
               gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "MAS_CARGUE_SALIDAS" ;
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
      oWriter.writeElement("NUMTRN", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ID_SALIDA", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("PLACASENA", GXutil.rtrim( gxTv_SdtMAS_CARGUE_SALIDAS_Placasena));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("CONSECUTIVO", GXutil.rtrim( gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("CANTIDAD", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("OBSERVACIONES", GXutil.rtrim( gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtMAS_CARGUE_SALIDAS_Mode));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("NUMTRN_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z, 11, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("ID_SALIDA_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("PLACASENA_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CONSECUTIVO_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CANTIDAD_Z", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("OBSERVACIONES_Z", GXutil.rtrim( gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("PLACASENA_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CONSECUTIVO_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("CANTIDAD_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
         oWriter.writeElement("OBSERVACIONES_N", GXutil.trim( GXutil.str( gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "ACBSENA");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("NUMTRN", gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn, false);
      AddObjectProperty("ID_SALIDA", gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida, false);
      AddObjectProperty("PLACASENA", gxTv_SdtMAS_CARGUE_SALIDAS_Placasena, false);
      AddObjectProperty("CONSECUTIVO", gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo, false);
      AddObjectProperty("CANTIDAD", gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad, false);
      AddObjectProperty("OBSERVACIONES", gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtMAS_CARGUE_SALIDAS_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtMAS_CARGUE_SALIDAS_Initialized, false);
         AddObjectProperty("NUMTRN_Z", gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z, false);
         AddObjectProperty("ID_SALIDA_Z", gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z, false);
         AddObjectProperty("PLACASENA_Z", gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z, false);
         AddObjectProperty("CONSECUTIVO_Z", gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z, false);
         AddObjectProperty("CANTIDAD_Z", gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z, false);
         AddObjectProperty("OBSERVACIONES_Z", gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z, false);
         AddObjectProperty("PLACASENA_N", gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N, false);
         AddObjectProperty("CONSECUTIVO_N", gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N, false);
         AddObjectProperty("CANTIDAD_N", gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N, false);
         AddObjectProperty("OBSERVACIONES_N", gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N, false);
      }
   }

   public void updateDirties( com.orions2.SdtMAS_CARGUE_SALIDAS sdt )
   {
      if ( sdt.IsDirty("NUMTRN") )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn = sdt.getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn() ;
      }
      if ( sdt.IsDirty("ID_SALIDA") )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida = sdt.getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida() ;
      }
      if ( sdt.IsDirty("PLACASENA") )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Placasena = sdt.getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena() ;
      }
      if ( sdt.IsDirty("CONSECUTIVO") )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo = sdt.getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo() ;
      }
      if ( sdt.IsDirty("CANTIDAD") )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad = sdt.getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad() ;
      }
      if ( sdt.IsDirty("OBSERVACIONES") )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones = sdt.getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones() ;
      }
   }

   public long getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn( long value )
   {
      if ( gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn != value )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Mode = "INS" ;
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z_SetNull( );
      }
      SetDirty("Numtrn");
      gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn = value ;
   }

   public short getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida( short value )
   {
      if ( gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida != value )
      {
         gxTv_SdtMAS_CARGUE_SALIDAS_Mode = "INS" ;
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z_SetNull( );
         this.setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z_SetNull( );
      }
      SetDirty("Id_salida");
      gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida = value ;
   }

   public String getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Placasena ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena( String value )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N = (byte)(0) ;
      SetDirty("Placasena");
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo( String value )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N = (byte)(0) ;
      SetDirty("Consecutivo");
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad( short value )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N = (byte)(0) ;
      SetDirty("Cantidad");
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones( String value )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N = (byte)(0) ;
      SetDirty("Observaciones");
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N = (byte)(1) ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_SALIDAS_Mode( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Mode ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Mode( String value )
   {
      SetDirty("Mode");
      gxTv_SdtMAS_CARGUE_SALIDAS_Mode = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Mode_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Mode = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_SALIDAS_Initialized( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Initialized ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Initialized( short value )
   {
      SetDirty("Initialized");
      gxTv_SdtMAS_CARGUE_SALIDAS_Initialized = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Initialized_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z( long value )
   {
      SetDirty("Numtrn_Z");
      gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z = 0 ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z( short value )
   {
      SetDirty("Id_salida_Z");
      gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z( String value )
   {
      SetDirty("Placasena_Z");
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z( String value )
   {
      SetDirty("Consecutivo_Z");
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z( short value )
   {
      SetDirty("Cantidad_Z");
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z( String value )
   {
      SetDirty("Observaciones_Z");
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z = "" ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N( byte value )
   {
      SetDirty("Placasena_N");
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N( byte value )
   {
      SetDirty("Consecutivo_N");
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N( byte value )
   {
      SetDirty("Cantidad_N");
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N( )
   {
      return gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N( byte value )
   {
      SetDirty("Observaciones_N");
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N = value ;
   }

   public void setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N_SetNull( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.orions2.mas_cargue_salidas_bc obj ;
      obj = new com.orions2.mas_cargue_salidas_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena = "" ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo = "" ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones = "" ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Mode = "" ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z = "" ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z = "" ;
      gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtMAS_CARGUE_SALIDAS Clone( )
   {
      com.orions2.SdtMAS_CARGUE_SALIDAS sdt ;
      com.orions2.mas_cargue_salidas_bc obj ;
      sdt = (com.orions2.SdtMAS_CARGUE_SALIDAS)(clone()) ;
      obj = (com.orions2.mas_cargue_salidas_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.orions2.StructSdtMAS_CARGUE_SALIDAS struct )
   {
      setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn(struct.getNumtrn());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida(struct.getId_salida());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena(struct.getPlacasena());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo(struct.getConsecutivo());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad(struct.getCantidad());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones(struct.getObservaciones());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Mode(struct.getMode());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Initialized(struct.getInitialized());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z(struct.getNumtrn_Z());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z(struct.getId_salida_Z());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z(struct.getPlacasena_Z());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z(struct.getConsecutivo_Z());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z(struct.getCantidad_Z());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z(struct.getObservaciones_Z());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N(struct.getPlacasena_N());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N(struct.getConsecutivo_N());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N(struct.getCantidad_N());
      setgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N(struct.getObservaciones_N());
   }

   public com.orions2.StructSdtMAS_CARGUE_SALIDAS getStruct( )
   {
      com.orions2.StructSdtMAS_CARGUE_SALIDAS struct = new com.orions2.StructSdtMAS_CARGUE_SALIDAS ();
      struct.setNumtrn(getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn());
      struct.setId_salida(getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida());
      struct.setPlacasena(getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena());
      struct.setConsecutivo(getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo());
      struct.setCantidad(getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad());
      struct.setObservaciones(getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones());
      struct.setMode(getgxTv_SdtMAS_CARGUE_SALIDAS_Mode());
      struct.setInitialized(getgxTv_SdtMAS_CARGUE_SALIDAS_Initialized());
      struct.setNumtrn_Z(getgxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z());
      struct.setId_salida_Z(getgxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z());
      struct.setPlacasena_Z(getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z());
      struct.setConsecutivo_Z(getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z());
      struct.setCantidad_Z(getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z());
      struct.setObservaciones_Z(getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z());
      struct.setPlacasena_N(getgxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N());
      struct.setConsecutivo_N(getgxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N());
      struct.setCantidad_N(getgxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N());
      struct.setObservaciones_N(getgxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N());
      return struct ;
   }

   private byte gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_N ;
   private byte gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_N ;
   private byte gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_N ;
   private byte gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_N ;
   private short gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida ;
   private short gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad ;
   private short gxTv_SdtMAS_CARGUE_SALIDAS_Initialized ;
   private short gxTv_SdtMAS_CARGUE_SALIDAS_Id_salida_Z ;
   private short gxTv_SdtMAS_CARGUE_SALIDAS_Cantidad_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn ;
   private long gxTv_SdtMAS_CARGUE_SALIDAS_Numtrn_Z ;
   private String gxTv_SdtMAS_CARGUE_SALIDAS_Mode ;
   private String sTagName ;
   private String gxTv_SdtMAS_CARGUE_SALIDAS_Placasena ;
   private String gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo ;
   private String gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones ;
   private String gxTv_SdtMAS_CARGUE_SALIDAS_Placasena_Z ;
   private String gxTv_SdtMAS_CARGUE_SALIDAS_Consecutivo_Z ;
   private String gxTv_SdtMAS_CARGUE_SALIDAS_Observaciones_Z ;
}

