package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* renamed from: guh  reason: default package */
/* loaded from: classes.dex */
public class guh implements ijj {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public guh(String str) {
        this.a = str;
    }

    protected void a(gub gubVar) {
        throw null;
    }

    protected void b(Dialog dialog) {
    }

    protected void d() {
    }

    public final void e() {
        ijl.b().h(this, gui.class, mjl.a);
    }

    public final void f() {
        ijl.b().d(this, gui.class);
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        gui guiVar = (gui) ijgVar;
        if (!guiVar.a.equals(this.a)) {
            return;
        }
        int i = guiVar.b;
        if (i == 1) {
            a(guiVar.c);
        } else if (i == 2) {
            Dialog dialog = guiVar.d;
        } else if (i == 3) {
            b(guiVar.d);
        } else if (i == 4) {
            Dialog dialog2 = guiVar.d;
        } else if (i == 5) {
            Dialog dialog3 = guiVar.d;
            d();
        } else {
            Dialog dialog4 = guiVar.d;
            guw guwVar = guiVar.e;
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final boolean g(String str) {
        return this.a.equals(str);
    }
}
