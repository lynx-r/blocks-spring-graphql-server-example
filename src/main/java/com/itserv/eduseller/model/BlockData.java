package com.itserv.eduseller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Created by Aleksey Popryadukhin on 08/08/2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlockData {
  @Id
  private String id;
  private EnumBlockType type;
  private String data;
  private int order;
}
