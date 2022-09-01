package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fre  reason: default package */
/* loaded from: classes.dex */
public final class fre implements Handler.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fre(bcq bcqVar, int i) {
        this.b = i;
        this.a = bcqVar;
    }

    public fre(frc frcVar, int i) {
        this.b = i;
        this.a = frcVar;
    }

    public fre(jyb jybVar, int i) {
        this.b = i;
        this.a = jybVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (message.what == 1) {
                    ((jyb) this.a).j();
                    return true;
                }
                ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/scheduling/AbstractForegroundTaskService$HandlerCallback", "handleMessage", 310, "AbstractForegroundTaskService.java")).w("Unknown message: %s", message);
                return false;
            } else if (message.what == 1) {
                ((bcq) this.a).c((bco) message.obj);
                return true;
            } else if (message.what != 2) {
                return false;
            } else {
                ((bcq) this.a).c.l((bco) message.obj);
                return false;
            }
        }
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (((frc) this.a).c) {
                frb frbVar = (frb) message.obj;
                frd frdVar = (frd) ((frc) this.a).c.get(frbVar);
                if (frdVar != null && frdVar.b()) {
                    if (frdVar.c) {
                        frdVar.g.e.removeMessages(1, frdVar.e);
                        fsd.a(frdVar.g.d, frdVar);
                        frdVar.c = false;
                        frdVar.b = 2;
                    }
                    ((frc) this.a).c.remove(frbVar);
                }
            }
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (((frc) this.a).c) {
                frb frbVar2 = (frb) message.obj;
                frd frdVar2 = (frd) ((frc) this.a).c.get(frbVar2);
                if (frdVar2 != null && frdVar2.b == 3) {
                    String valueOf = String.valueOf(frbVar2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName componentName = frdVar2.f;
                    if (componentName == null) {
                        componentName = frbVar2.d;
                    }
                    if (componentName == null) {
                        String str = frbVar2.c;
                        fyb.ax(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    frdVar2.onServiceDisconnected(componentName);
                }
            }
        }
        return true;
    }
}
