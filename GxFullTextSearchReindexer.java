/*
               File: GxFullTextSearchReindexer
        Description: No description for object
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:21.72
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class GxFullTextSearchReindexer
{
   public static int Reindex( int remoteHandle )
   {
      GxSilentTrnSdt obj ;
      IGxSilentTrn trn ;
      boolean result ;
      obj = new com.orions2.SdtMAS_CARGUE_SALIDAS(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.orions2.SdtMAS_CARGUE_ENTRADA(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      return 1 ;
   }

}

