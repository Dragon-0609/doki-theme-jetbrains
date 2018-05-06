package com.chrisrm.idea.themes.literature.club;

public final class MTSayoriTheme extends MTDokiDokiTheme {
  public MTSayoriTheme() {
    super("mt.sayori", "Material Sayori", false);
  }

  @Override
  protected String getBackgroundColorString() {
    return "fbfcfc";
  }

  @Override
  protected String getSecondaryBackgroundColorString() {
    return "c7f2ff";
  }

  @Override
  protected String getSecondaryForegroundColorString() {
    return "256fe2";
  }

  @Override
  protected String getSelectionForegroundColorString() {
    return "256fe2";
  }

  @Override
  protected String getSelectionBackgroundColorString() {
    return "99ebf0";
  }

  @Override
  protected String getTreeSelectionColorString() {
    return "546eec";
  }

  @Override
  protected String getMenuBarSelectionForegroundColorString() {
    return "ffffff";
  }

  @Override
  protected String getMenuBarSelectionBackgroundColorString() {
    return "de0a22";
  }
}
