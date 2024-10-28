package com.zero.validation.common.error;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class ValidationErrorResponse implements Serializable {

  private List<Violation> violations = new ArrayList<>();
}


