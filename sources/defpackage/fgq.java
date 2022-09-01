package defpackage;

import android.content.res.Configuration;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: fgq  reason: default package */
/* loaded from: classes.dex */
public final class fgq implements hwu, gzr {
    public final fgo a;
    public final hso b;
    public final idk c;
    public final hst d;
    public hww e;

    public fgq(fgo fgoVar, idk idkVar, hww hwwVar) {
        fgp fgpVar = new fgp(this);
        this.d = fgpVar;
        this.a = fgoVar;
        this.c = idkVar;
        hso hsoVar = new hso();
        this.b = hsoVar;
        this.e = hwwVar;
        fgpVar.g(mjl.a);
        if (hwwVar != null) {
            hwwVar.f(this);
        }
        hsoVar.bf(this);
    }

    @Override // defpackage.hwu
    public final void a(ibz ibzVar, ice iceVar, View view) {
        fgy.a(view, ibzVar, g());
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void d(View view) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void f(ibz ibzVar) {
    }

    @Override // defpackage.gzr
    public final boolean g() {
        fgo fgoVar;
        Object obj;
        Method method;
        hsk hskVar = this.b.a;
        Configuration E = hskVar == null ? null : hskVar.E();
        if (this.a.a() && E != null && E.orientation == 2 && (obj = (fgoVar = this.a).c) != null && (method = fgoVar.d) != null) {
            try {
                Object invoke = method.invoke(obj, new Object[0]);
                if (invoke instanceof Integer) {
                    if (((Integer) invoke).intValue() == 2) {
                        return true;
                    }
                } else {
                    ((luc) ((luc) fgo.a.d()).k("com/google/android/apps/inputmethod/libs/ztesplit/ZteDisplayModeManagerWrapper", "getCurrentMode", 97, "ZteDisplayModeManagerWrapper.java")).t("DisplayModeManager.getCurrentMode() did not return int");
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                ((luc) ((luc) ((luc) fgo.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/ztesplit/ZteDisplayModeManagerWrapper", "getCurrentMode", '[', "ZteDisplayModeManagerWrapper.java")).t("Error while calling DisplayModeManager.getCurrentMode");
            }
        }
        return false;
    }
}
