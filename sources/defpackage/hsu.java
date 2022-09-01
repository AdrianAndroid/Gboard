package defpackage;

import android.util.Printer;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: hsu  reason: default package */
/* loaded from: classes.dex */
public final class hsu implements ijh {
    public final int a;
    public final EditorInfo b;
    public final EditorInfo c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public hsu(hss hssVar) {
        this.a = hssVar.a;
        this.b = hssVar.b;
        this.c = hssVar.c;
        this.d = hssVar.d;
        this.e = hssVar.e;
        this.f = hssVar.f;
    }

    public static EditorInfo b() {
        hsu hsuVar = (hsu) ijl.b().a(hsu.class);
        if (hsuVar != null) {
            return hsuVar.b;
        }
        return null;
    }

    public static EditorInfo c() {
        hsu hsuVar = (hsu) ijl.b().a(hsu.class);
        if (hsuVar != null) {
            return hsuVar.c;
        }
        return null;
    }

    public static void d(EditorInfo editorInfo, boolean z, boolean z2) {
        e(editorInfo, null, z, z2);
    }

    public static void e(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z, boolean z2) {
        ijl b = ijl.b();
        hss hssVar = new hss();
        hssVar.a = 1;
        hssVar.b = editorInfo;
        hssVar.c = editorInfo2;
        hssVar.d = z;
        hssVar.f = z2;
        b.g(hssVar.a());
    }

    public static boolean f() {
        hsu hsuVar = (hsu) ijl.b().a(hsu.class);
        return hsuVar != null && hsuVar.f;
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        int i = this.a;
        printer.println("currentState = ".concat(i != 0 ? i != 1 ? i != 2 ? "INPUT_FINISHED" : "INPUT_VIEW_FINISHED" : "INPUT_VIEW_STARTED" : "INPUT_STARTED"));
        boolean z2 = this.d;
        printer.println("restarting = " + z2);
        boolean z3 = this.e;
        printer.println("finishingInput = " + z3);
        boolean z4 = this.f;
        printer.println("incognitoMode = " + z4);
        gzw gzwVar = new gzw(printer);
        printer.println("appEditorInfo:");
        ham.p(this.b, gzwVar);
        printer.println("imeEditorInfo:");
        ham.p(this.c, gzwVar);
    }

    public final boolean g() {
        return this.a == 1;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "InputSessionNotification";
    }
}
