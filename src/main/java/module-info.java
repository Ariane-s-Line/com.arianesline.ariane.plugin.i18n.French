module com.arianesline.ariane.plugin.i18n.french {
  requires com.arianesline.ariane.plugin.api;

  opens com.arianesline.ariane.plugin.i18n.french;

  provides com.arianesline.ariane.plugin.api.TranslationPlugin with
      com.arianesline.ariane.plugin.i18n.french.FrenchTranslationPlugin;
}
