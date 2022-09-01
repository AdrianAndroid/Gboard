package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: asp  reason: default package */
/* loaded from: classes.dex */
public final class asp {
    private final idk j;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    private String d = "";
    private String e = "";
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private boolean i = false;
    private final hqi k = new asm(this);
    private final hst l = new asn(this);
    private final eny m = new aso(this);

    public asp(idk idkVar) {
        this.j = idkVar;
        d();
    }

    private static final boolean e(hpy hpyVar, String str, int i) {
        int i2;
        if (i >= hpyVar.h + hpyVar.c.length() || (i2 = hpyVar.h) >= str.length() + i) {
            return true;
        }
        if (i > i2) {
            CharSequence charSequence = hpyVar.c;
            return TextUtils.equals(charSequence.subSequence(i - i2, charSequence.length()), str);
        } else if (i < i2) {
            return TextUtils.equals(hpyVar.c, str.substring(i2 - i));
        } else {
            return TextUtils.equals(hpyVar.c, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
        r0 = r8.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
        if (r8.a == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
        r1 = defpackage.iqu.SC_REJECT_SUGGESTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
        r2 = new java.lang.Object[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
        if (r8.h == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        r4 = defpackage.meb.SPELL_CORRECTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
        r2[0] = r4;
        r0.e(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
        r4 = defpackage.meb.GRAMMAR_CORRECTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        r1 = defpackage.iqu.SC_IGNORE_SUGGESTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
        r8.c = false;
        r8.a = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.hpy r9) {
        /*
            r8 = this;
            hqe r0 = r9.b
            hqe r1 = defpackage.hqe.IME
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L64
            hqe r0 = r9.b
            hqe r1 = defpackage.hqe.DELETE
            if (r0 != r1) goto Lf
            goto L64
        Lf:
            hqe r1 = defpackage.hqe.OTHER
            if (r0 == r1) goto L17
            hqe r1 = defpackage.hqe.RELOAD
            if (r0 != r1) goto La7
        L17:
            java.lang.CharSequence r0 = r9.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L4e
            boolean r0 = r9.f()
            if (r0 != 0) goto L4e
            java.lang.CharSequence r0 = r9.c
            boolean r4 = r0 instanceof android.text.Spanned
            if (r4 != 0) goto L2d
            goto L4e
        L2d:
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r4 = r9.d
            int r5 = r9.e
            java.lang.Class<android.text.style.SuggestionSpan> r6 = android.text.style.SuggestionSpan.class
            java.lang.Object[] r0 = r0.getSpans(r4, r5, r6)
            android.text.style.SuggestionSpan[] r0 = (android.text.style.SuggestionSpan[]) r0
            int r4 = r0.length
            r5 = 0
        L3d:
            if (r5 >= r4) goto L4e
            r6 = r0[r5]
            int r7 = r6.getFlags()
            r7 = r7 & 10
            if (r7 <= 0) goto L4b
            r1 = r6
            goto L4e
        L4b:
            int r5 = r5 + 1
            goto L3d
        L4e:
            if (r1 == 0) goto L5f
            r8.c = r2
            int r0 = r1.getFlags()
            r0 = r0 & 2
            if (r0 == 0) goto L5b
            goto L5c
        L5b:
            r2 = 0
        L5c:
            r8.h = r2
            goto La7
        L5f:
            r8.c = r3
            r8.a = r3
            goto La7
        L64:
            boolean r0 = r8.c
            if (r0 == 0) goto La7
            boolean r0 = r8.b
            if (r0 == 0) goto L7a
            java.lang.String r0 = r8.e
            if (r0 != 0) goto L71
            goto La7
        L71:
            int r1 = r8.g
            boolean r0 = e(r9, r0, r1)
            if (r0 != 0) goto La7
            goto L86
        L7a:
            java.lang.String r0 = r8.d
            if (r0 == 0) goto La7
            int r1 = r8.f
            boolean r0 = e(r9, r0, r1)
            if (r0 != 0) goto La7
        L86:
            idk r0 = r8.j
            if (r0 == 0) goto La3
            boolean r1 = r8.a
            if (r1 == 0) goto L91
            iqu r1 = defpackage.iqu.SC_REJECT_SUGGESTION
            goto L93
        L91:
            iqu r1 = defpackage.iqu.SC_IGNORE_SUGGESTION
        L93:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r4 = r8.h
            if (r4 == 0) goto L9c
            meb r4 = defpackage.meb.SPELL_CORRECTION
            goto L9e
        L9c:
            meb r4 = defpackage.meb.GRAMMAR_CORRECTION
        L9e:
            r2[r3] = r4
            r0.e(r1, r2)
        La3:
            r8.c = r3
            r8.a = r3
        La7:
            boolean r0 = r8.b
            if (r0 == 0) goto Lb8
            java.lang.CharSequence r0 = r9.c
            java.lang.String r0 = r0.toString()
            r8.e = r0
            int r9 = r9.h
            r8.g = r9
            return
        Lb8:
            java.lang.CharSequence r0 = r9.c
            java.lang.String r0 = r0.toString()
            r8.d = r0
            int r9 = r9.h
            r8.f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asp.a(hpy):void");
    }

    public final void b() {
        if (this.i) {
            return;
        }
        d();
        this.l.g(gyc.b);
        ijl.b().h(this.m, eoa.class, gyc.b);
        this.k.g(gyc.b);
        this.i = true;
    }

    public final void c() {
        if (!this.i) {
            return;
        }
        this.i = false;
        this.l.h();
        ijl.b().d(this.m, eoa.class);
        this.k.h();
    }

    public final void d() {
        this.b = false;
        this.a = false;
        this.c = false;
        this.h = false;
        this.d = "";
        this.e = "";
        this.f = 0;
        this.g = 0;
    }
}
