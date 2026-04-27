package com.arianesline.ariane.plugin.i18n.french;

import com.arianesline.ariane.plugin.api.AbstractTranslationPlugin;
import java.util.Locale;

public class FrenchTranslationPlugin extends AbstractTranslationPlugin {

  public FrenchTranslationPlugin() {
    super(Locale.of("fr"), "/com/arianesline/ariane/plugin/i18n/french/ui_fr.properties");
  }

  @Override
  public String getName() {
    return "French Translation Plugin";
  }
}
