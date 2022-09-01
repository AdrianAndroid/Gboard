package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hor  reason: default package */
/* loaded from: classes.dex */
public final class hor implements hnx {
    private static final ltg h = ltg.j("com/google/android/libraries/inputmethod/inlinesuggestion/SmartComposeSwipeSpaceExtension");
    public final idk a;
    public hfy c;
    public boolean d;
    public boolean e;
    public String f;
    private final Context i;
    private hpl m;
    private final iqe j = iqe.e(hof.p, 3);
    private final Bundle k = new Bundle();
    private final hhk l = new ffp(this, 5);
    public final hsh b = new hoq(this);
    public long g = 0;

    public hor(Context context, idk idkVar) {
        this.i = context;
        this.a = idkVar;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f != null && f.c == -50004) {
            this.a.e(hoj.SEND_SWIPE_ON_SPACE, new Object[0]);
            this.k.clear();
            Bundle bundle = this.k;
            jav c = hqp.c();
            bundle.putString("swipe_on_space", true != (c != null && c.C()) ? "SwipeRightOnSpace" : "SwipeLeftOnSpace");
            if (this.m != null) {
                this.m.a(String.valueOf(this.i.getPackageName()).concat(".SWIPE_ON_SPACE_ACTION"), this.k);
                this.g = SystemClock.elapsedRealtime();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SmartComposeSwipeSpaceExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        this.f = null;
        if (!this.d || !this.e) {
            return;
        }
        this.b.e();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final void k(hfy hfyVar) {
        this.c = hfyVar;
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        boolean j;
        this.f = ham.m(editorInfo);
        this.d = ham.s(this.i, editorInfo);
        String m = ham.m(editorInfo);
        if (TextUtils.isEmpty(m)) {
            ((ltd) ((ltd) h.b()).k("com/google/android/libraries/inputmethod/inlinesuggestion/SmartComposeSwipeSpaceExtension", "isEnabledForHostApp", 185, "SmartComposeSwipeSpaceExtension.java")).t("Empty app package name.");
            j = false;
        } else {
            j = this.j.j(m);
        }
        hsk b = hsx.b();
        if (b != null) {
            this.m = b.Q();
        }
        this.e = ((Boolean) hof.t.c()).booleanValue();
        hof.t.e(this.l);
        if (this.d && this.e) {
            this.b.d(gyc.b);
        }
        return this.d && j;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}
