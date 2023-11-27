package pasa.cbentley.framework.app.src4.ctx;

import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.framework.core.src4.app.ConfigAppAbstract;

public abstract class ConfigAppUiAbstract extends ConfigAppAbstract {
   protected int    h        = 320;

   protected int    w        = 276;

   protected String title;

   protected String iconPath;

   public ConfigAppUiAbstract(UCtx uc, String name) {
      super(uc, name);
   }

   
   protected void cloneMeSet(ConfigAppUiAbstract config) {
      config.h = this.h;
      config.w = this.w;
      config.title = this.title;
      config.iconPath = this.iconPath;
      super.cloneMeSet(config);
   }
}
