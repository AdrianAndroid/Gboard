package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ccm  reason: default package */
/* loaded from: classes.dex */
public final class ccm {
    public static final Pattern a = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-!#$%&'`\\*/{|}=?^~]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    public hln e;
    private final cce f;
    private final Context i;
    private final lgb j;
    private final lgb k;
    final List b = new ArrayList();
    final List c = new ArrayList();
    private int g = 0;
    private final hlk h = hln.a();
    public boolean d = false;
    private int l = 1;

    public ccm(Context context, int i) {
        cce cckVar;
        boh bohVar = new boh(context.getApplicationContext(), 2);
        boh bohVar2 = new boh(context.getApplicationContext(), 3);
        this.i = context;
        if (i == 1) {
            cckVar = new cck(3);
        } else if (i != 2) {
            cckVar = i != 3 ? new ccl() : new cck(7);
        } else {
            cckVar = new cck(5);
        }
        this.f = cckVar;
        this.j = bohVar;
        this.k = bohVar2;
    }

    public static hln a(hln hlnVar, CharSequence charSequence) {
        if (hlnVar == null || TextUtils.isEmpty(charSequence)) {
            return hlnVar;
        }
        CharSequence charSequence2 = hlnVar.a;
        if (TextUtils.isEmpty(charSequence2) || charSequence2.length() <= charSequence.length()) {
            return null;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence2.charAt(i) != charSequence.charAt(i)) {
                return null;
            }
        }
        hlk hlkVar = new hlk();
        hlkVar.b(hlnVar);
        hlkVar.a = charSequence2.subSequence(charSequence.length(), charSequence2.length());
        hlkVar.h = -1;
        hlkVar.i = -1;
        return hlkVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final hlk n(mse mseVar) {
        int i;
        int E;
        int E2;
        int E3;
        String str = mseVar.d;
        msu msuVar = mseVar.n;
        if (msuVar == null) {
            msuVar = msu.f;
        }
        if (msuVar.e) {
            str = " ".concat(String.valueOf(str));
        }
        int b = msc.b(mseVar.c);
        boolean z = false;
        if (b != 0 && b == 34) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new jco(), 0, str.length(), 17);
            str = spannableString;
        }
        hlk hlkVar = this.h;
        hlkVar.c();
        hlkVar.a = str;
        hlkVar.b = null;
        boolean z2 = mseVar.e;
        hlkVar.g = z2;
        hlkVar.l = z2;
        if (this.d && ((E = jco.E((i = mseVar.g))) == 0 || E == 1 || (((E2 = jco.E(i)) != 0 && E2 == 5) || ((E3 = jco.E(i)) != 0 && E3 == 6)))) {
            z = true;
        }
        hlkVar.f = z;
        hlkVar.j = ccg.b(mseVar);
        hlkVar.d = mseVar.i;
        return hlkVar;
    }

    private static String o(mse mseVar) {
        int b = msc.b(mseVar.c);
        return (b != 0 && b == 4) ? "emoji ".concat(String.valueOf(mseVar.d)) : mseVar.d;
    }

    private static int p(mse mseVar) {
        if (!mseVar.j || !mseVar.e) {
            int i = mseVar.c;
            int b = msc.b(i);
            if (b != 0 && b == 2) {
                return 9;
            }
            int b2 = msc.b(i);
            return (b2 != 0 && b2 == 4 && ((Boolean) cas.f.c()).booleanValue()) ? 6 : 1;
        }
        return 8;
    }

    public final synchronized hln b() {
        if (this.g >= this.b.size()) {
            return null;
        }
        return (hln) this.b.get(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
        if (r4.equals(r5) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mty c(defpackage.mty r10, java.util.Set r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = 0
        L4:
            nga r4 = r10.c
            int r4 = r4.size()
            if (r2 >= r4) goto L7b
            nga r4 = r10.c
            java.lang.Object r4 = r4.get(r2)
            mse r4 = (defpackage.mse) r4
            int r5 = r4.m
            mrs r5 = defpackage.mrs.b(r5)
            if (r5 != 0) goto L1e
            mrs r5 = defpackage.mrs.CANDIDATE_SOURCE_UNKNOWN
        L1e:
            boolean r5 = r11.contains(r5)
            r6 = 1
            if (r5 == 0) goto L29
            int r5 = r4.c
        L27:
            r5 = r0
            goto L5a
        L29:
            int r5 = r4.c
            int r5 = defpackage.msc.b(r5)
            if (r5 != 0) goto L34
        L31:
            r5 = r0
        L32:
            r6 = 0
            goto L5a
        L34:
            r7 = 4
            if (r5 != r7) goto L31
            lgb r5 = r9.k
            java.lang.Object r5 = r5.a()
            hbd r5 = (defpackage.hbd) r5
            mse r5 = defpackage.cjf.c(r4, r5)
            if (r5 != 0) goto L46
        L45:
            goto L27
        L46:
            hdz r7 = defpackage.hdz.a()
            hdn r8 = defpackage.hdn.instance
            boolean r7 = defpackage.cjf.e(r5, r7, r8)
            if (r7 != 0) goto L53
            goto L45
        L53:
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L31
            goto L32
        L5a:
            if (r5 != 0) goto L5e
            if (r6 == 0) goto L6b
        L5e:
            if (r3 != 0) goto L6b
            java.util.ArrayList r3 = new java.util.ArrayList
            nga r7 = r10.c
            java.util.List r7 = r7.subList(r1, r2)
            r3.<init>(r7)
        L6b:
            if (r3 == 0) goto L78
            if (r5 == 0) goto L73
            r3.add(r5)
            goto L78
        L73:
            if (r6 != 0) goto L78
            r3.add(r4)
        L78:
            int r2 = r2 + 1
            goto L4
        L7b:
            if (r3 != 0) goto L7e
            return r0
        L7e:
            r11 = 5
            java.lang.Object r11 = r10.N(r11)
            nfh r11 = (defpackage.nfh) r11
            r11.cG(r10)
            boolean r10 = r11.c
            if (r10 == 0) goto L91
            r11.cD()
            r11.c = r1
        L91:
            nfm r10 = r11.b
            mty r10 = (defpackage.mty) r10
            nga r0 = defpackage.mty.G()
            r10.c = r0
            boolean r10 = r11.c
            if (r10 == 0) goto La4
            r11.cD()
            r11.c = r1
        La4:
            nfm r10 = r11.b
            mty r10 = (defpackage.mty) r10
            nga r0 = r10.c
            boolean r1 = r0.c()
            if (r1 != 0) goto Lb6
            nga r0 = defpackage.nfm.H(r0)
            r10.c = r0
        Lb6:
            nga r10 = r10.c
            defpackage.ndt.cs(r3, r10)
            nfm r10 = r11.cz()
            mty r10 = (defpackage.mty) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccm.c(mty, java.util.Set):mty");
    }

    public final synchronized List d(int i) {
        ArrayList arrayList;
        List list = this.b;
        int i2 = this.g;
        arrayList = new ArrayList(list.subList(i2, Math.min(i + i2, list.size())));
        this.g += arrayList.size();
        return arrayList;
    }

    public final synchronized List e() {
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c;
    }

    public final synchronized void f() {
        this.b.clear();
        this.g = 0;
        this.f.d();
    }

    public final synchronized void g() {
        this.g = 0;
    }

    public final synchronized void h() {
        this.c.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0082, code lost:
        if (r9.d.startsWith(r5) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r13 != 27) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01fe, code lost:
        if (r2 == 4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033f  */
    /* JADX WARN: Type inference failed for: r7v5, types: [cjg, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void i(defpackage.hlm r23, defpackage.mty r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccm.i(hlm, mty, boolean):void");
    }

    public final synchronized void j(mty mtyVar) {
        this.e = null;
        if ((mtyVar.a & 2) != 0) {
            mse mseVar = mtyVar.d;
            if (mseVar == null) {
                mseVar = mse.p;
            }
            hlk n = n(mseVar);
            n.s = p(mseVar);
            n.c = o(mseVar);
            n.i = -1;
            n.h = -1;
            this.e = n.a();
        }
    }

    public final synchronized boolean k() {
        return !this.b.isEmpty();
    }

    public final synchronized boolean l() {
        return this.g < this.b.size();
    }

    public final synchronized void m() {
        if (b() != null) {
            this.g++;
        }
    }
}
