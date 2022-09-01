package defpackage;

import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dom  reason: default package */
/* loaded from: classes.dex */
public final class dom extends gxu {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ LatinIme e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dom(LatinIme latinIme, boolean z, long j, long j2, boolean z2) {
        super("LatinIme#asyncFetchSuggestions");
        this.e = latinIme;
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            this.e.k.v(true);
        }
        final caj g = this.e.g();
        final long j = this.b;
        final boolean z = this.a;
        final long j2 = this.c;
        cbg cbgVar = g.i;
        if (cbgVar == null || !cbgVar.F()) {
            ((luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "asyncFetchSuggestions", 1839, "Delight5DecoderWrapper.java")).t("asyncFetchSuggestions(): Decoder state is invalid");
        } else {
            synchronized (g.j) {
                mko mkoVar = g.l;
                if (mkoVar != null) {
                    mkoVar.cancel(false);
                }
                final idu b = g.f.b();
                final mtv f = cbgVar.f();
                g.l = g.h.hR(new Runnable() { // from class: cad
                    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 280
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cad.run():void");
                    }
                }, null);
            }
        }
        if (!this.d || this.e.t || this.e.g().p()) {
            return;
        }
        this.e.t = true;
        ker.l(this.e.D, R.string.f176600_resource_name_obfuscated_res_0x7f140ce6, new Object[0]);
    }
}
