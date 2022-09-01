package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hxw  reason: default package */
/* loaded from: classes.dex */
public final class hxw implements hfx, hfh {
    private final Context a;
    private final jaq b;

    public hxw(Context context) {
        this.a = context;
        this.b = new jaq(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r12.l(null) == false) goto L20;
     */
    @Override // defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.hfd r12) {
        /*
            r11 = this;
            iay r12 = r12.f()
            r0 = 0
            if (r12 == 0) goto L6d
            int r1 = r12.c
            r2 = -10022(0xffffffffffffd8da, float:NaN)
            if (r1 != r2) goto L6d
            java.lang.Object r12 = r12.e
            boolean r1 = r12 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L17
            java.lang.String r12 = (java.lang.String) r12
            goto L18
        L17:
            r12 = r2
        L18:
            ieh r1 = defpackage.ieh.j()
            idd r3 = defpackage.idd.INPUT_METHOD_PICKER_SHOWN
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r12
            r1.e(r3, r5)
            android.content.Context r12 = r11.a
            hqy r7 = defpackage.hrx.y(r12)
            hqt r8 = defpackage.hqp.b()
            if (r8 != 0) goto L33
            goto L6c
        L33:
            boolean r12 = r7.o()
            if (r12 != 0) goto L47
            jaq r12 = r11.b
            boolean r1 = r12.g()
            if (r1 != 0) goto L47
            boolean r12 = r12.l(r2)
            if (r12 == 0) goto L6c
        L47:
            hxv r12 = new hxv
            hsk r6 = defpackage.hsx.b()
            jaq r9 = r11.b
            ieh r10 = defpackage.ieh.j()
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            gud r1 = defpackage.guc.a
            hqt r2 = r12.e
            android.content.Context r2 = r2.a()
            boolean r12 = r12.c
            if (r4 == r12) goto L64
            goto L67
        L64:
            r0 = 2132083490(0x7f150322, float:1.9807124E38)
        L67:
            java.lang.String r12 = "LanguagePicker"
            r1.b(r2, r12, r0)
        L6c:
            return r4
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxw.c(hfd):boolean");
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
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
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        return true;
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
