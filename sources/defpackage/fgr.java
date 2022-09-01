package defpackage;

import android.content.Context;
import android.util.Printer;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* renamed from: fgr  reason: default package */
/* loaded from: classes.dex */
public final class fgr implements fgn {
    private fgq a;

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println(Objects.toString(this.a));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SplitKeyboardModeDetectorModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        fgo fgoVar;
        hsk b = hsx.b();
        fgo fgoVar2 = fgo.b;
        if (fgoVar2 == null) {
            synchronized (fgo.class) {
                fgoVar2 = fgo.b;
                if (fgoVar2 == null) {
                    try {
                        Class<?> cls = Class.forName("com.zte.dualLcdManager.DisplayModeManager");
                        fgoVar = new fgo(cls.getMethod("getInstance", Context.class).invoke(null, context), cls.getMethod("getCurrentMode", new Class[0]));
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        fgoVar = new fgo(null, null);
                    }
                    fgo.b = fgoVar;
                    fgoVar2 = fgoVar;
                }
            }
        }
        if (b == null || b.V() == null || !fgoVar2.a()) {
            return;
        }
        this.a = new fgq(fgoVar2, ieh.j(), b.V());
    }

    @Override // defpackage.ifw
    public final void gn() {
        fgq fgqVar = this.a;
        if (fgqVar != null) {
            fgqVar.d.h();
            hww hwwVar = fgqVar.e;
            if (hwwVar != null) {
                hwwVar.j(fgqVar);
                fgqVar.e = null;
            }
            fgqVar.b.bf(null);
            fgqVar.b.close();
            this.a = null;
        }
    }
}
