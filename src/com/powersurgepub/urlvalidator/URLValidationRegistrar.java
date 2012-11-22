package com.powersurgepub.urlvalidator;

/**
 A class to which URL validation can be reported.
 */
public interface URLValidationRegistrar {

  public void registerURLValidationResult (ItemWithURL item, boolean result);

}
