package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: huh  reason: default package */
/* loaded from: classes.dex */
public final class huh {
    public static final /* synthetic */ int i = 0;
    private static final lug j = hin.a;
    public final gqc b;
    public final imn c;
    public htu d;
    public ibm e;
    public hsy f;
    public SoftKeyboardView g;
    public final gsd h;
    private int l;
    private final hsz m = new huf(this);
    private final htt n = new hug(this, 0);
    private final int k = R.xml.f220170_resource_name_obfuscated_res_0x7f170524;
    public final idk a = ieh.j();

    public huh(gqc gqcVar, imn imnVar, gsd gsdVar, byte[] bArr) {
        this.h = gsdVar;
        this.b = gqcVar;
        this.c = imnVar;
    }

    public final SoftKeyboardView a(Context context) {
        htu htuVar;
        ibm ibmVar;
        icf b;
        if (this.l == 0) {
            return null;
        }
        if (this.f == null) {
            int i2 = this.k;
            ibk a = ibm.a();
            try {
                jfy.d(context, i2, new hue(a, 0));
            } catch (Exception e) {
                ((luc) ((luc) ((luc) j.c()).i(e)).k("com/google/android/libraries/inputmethod/keyboard/impl/PopupSoftKeyboardHandler", "loadKeyboardDef", 228, "PopupSoftKeyboardHandler.java")).w("Failed to load %s", jbi.j(i2));
            }
            ibm b2 = a.b();
            this.e = b2;
            this.f = iin.l(context, this.m, b2, null, ibz.a("popup"));
        }
        if (this.d == null && (ibmVar = this.e) != null && this.l != 0 && (b = ibmVar.b(ice.BODY, this.l)) != null && this.f != null) {
            this.d = new htu(this.n, b, new hud(context, this.m, this.e, b, this.f));
        }
        if (this.g == null && (htuVar = this.d) != null) {
            this.g = (SoftKeyboardView) htuVar.d(null);
        }
        return this.g;
    }

    public final void b(int i2) {
        if (this.l == i2) {
            return;
        }
        c();
        htu htuVar = this.d;
        if (htuVar != null) {
            htuVar.g();
        }
        gvt.a(this.d);
        this.d = null;
        this.g = null;
        this.l = i2;
    }

    public final void c() {
        SoftKeyboardView softKeyboardView = this.g;
        if (softKeyboardView == null || !this.c.f(softKeyboardView)) {
            return;
        }
        this.c.d(this.g, null, true);
    }
}
