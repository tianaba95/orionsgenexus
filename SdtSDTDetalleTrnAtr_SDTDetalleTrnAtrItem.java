/*
               File: SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem
        Description: SDTDetalleTrnAtr
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:17.44
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

public final  class SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem( )
   {
      this(  new ModelContext(SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem.class));
   }

   public SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem( ModelContext context )
   {
      super( context, "SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem");
   }

   public SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem");
   }

   public SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem( StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ListId") )
            {
               gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ListDescripcion") )
            {
               gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ListTipo") )
            {
               gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TDet_ValorAtributo") )
            {
               gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clas_AtributoObligatorio") )
            {
               gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio = oReader.getValue() ;
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
         sName = "SDTDetalleTrnAtr.SDTDetalleTrnAtrItem" ;
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
      oWriter.writeElement("TDet_ListId", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid, 11, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ListDescripcion", GXutil.rtrim( gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ListTipo", GXutil.rtrim( gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("TDet_ValorAtributo", GXutil.rtrim( gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Clas_AtributoObligatorio", GXutil.rtrim( gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio));
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
      AddObjectProperty("TDet_ListId", gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid, false);
      AddObjectProperty("TDet_ListDescripcion", gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion, false);
      AddObjectProperty("TDet_ListTipo", gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo, false);
      AddObjectProperty("TDet_ValorAtributo", gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo, false);
      AddObjectProperty("Clas_AtributoObligatorio", gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio, false);
   }

   public long getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid ;
   }

   public void setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid( long value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid = value ;
   }

   public String getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion ;
   }

   public void setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion = value ;
   }

   public String getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo ;
   }

   public void setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo = value ;
   }

   public String getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo ;
   }

   public void setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo = value ;
   }

   public String getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio( )
   {
      return gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio ;
   }

   public void setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio( String value )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion = "" ;
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo = "" ;
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo = "" ;
      gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem Clone( )
   {
      return (com.orions2.SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem struct )
   {
      setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid(struct.getTdet_listid());
      setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion(struct.getTdet_listdescripcion());
      setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo(struct.getTdet_listtipo());
      setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo(struct.getTdet_valoratributo());
      setgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio(struct.getClas_atributoobligatorio());
   }

   public com.orions2.StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem getStruct( )
   {
      com.orions2.StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem struct = new com.orions2.StructSdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem ();
      struct.setTdet_listid(getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid());
      struct.setTdet_listdescripcion(getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion());
      struct.setTdet_listtipo(getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo());
      struct.setTdet_valoratributo(getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo());
      struct.setClas_atributoobligatorio(getgxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listid ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listtipo ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Clas_atributoobligatorio ;
   protected String sTagName ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_listdescripcion ;
   protected String gxTv_SdtSDTDetalleTrnAtr_SDTDetalleTrnAtrItem_Tdet_valoratributo ;
}

