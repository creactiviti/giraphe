package com.creactiviti.giraphe.graph.sql;

/**
 * @author Arik Cohen
 * @since Dec 16, 2017
 */
public interface SelectClause {

  void apply (SelectBuilder aSelectBuilder);
  
}
