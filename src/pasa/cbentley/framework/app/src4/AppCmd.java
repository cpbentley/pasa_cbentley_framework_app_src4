package pasa.cbentley.framework.app.src4;

import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.core.src4.logging.Dctx;
import pasa.cbentley.framework.app.src4.interfaces.ICmdsApp;
import pasa.cbentley.framework.cmd.src4.ctx.CmdCtx;
import pasa.cbentley.framework.cmd.src4.engine.CmdInstance;
import pasa.cbentley.framework.cmd.src4.engine.CmdNode;
import pasa.cbentley.framework.cmd.src4.engine.MCmd;
import pasa.cbentley.framework.cmd.src4.interfaces.ICommandable;
import pasa.cbentley.framework.core.src4.app.AppCtx;
import pasa.cbentley.framework.core.src4.app.IAppli;

public class AppCmd implements ICommandable, ICmdsApp {

   protected final AppCtx apc;

   public AppCmd(AppCtx apc) {
      this.apc = apc;

   }

   public void commandAction(CmdInstance cmd) {
      int cmdid = cmd.getCmdID();
      if (cmdid == CMD_03_EXIT) {
         //how do we process UI confirmation here?
         //well if the UI must show a TentativeExit, and then if pressed OK, call the Exit cmd
         cmd.actionDone();
         //Exitable
         IAppli appli = apc.getAppli();
         appli.amsAppExit();
         apc.getCoordinator().appliWantBeDestroyed();
      }
   }

   public MCmd getCmd(int vcmdid) {
      // TODO Auto-generated method stub
      return null;
   }

   public CmdNode getCmdNode() {
      // TODO Auto-generated method stub
      return null;
   }

   public int sendEvent(int evType, Object param) {
      // TODO Auto-generated method stub
      return 0;
   }

   public void toString(Dctx dc) {
      // TODO Auto-generated method stub

   }

   public String toString1Line() {
      // TODO Auto-generated method stub
      return null;
   }

   public void toString1Line(Dctx dc) {
      // TODO Auto-generated method stub

   }

   public UCtx toStringGetUCtx() {
      return apc.getUCtx();
   }
}
