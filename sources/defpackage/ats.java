package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ats  reason: default package */
/* loaded from: classes.dex */
public class ats extends bel implements Cloneable {
    private ats A;
    private ats B;
    private boolean C = true;
    private boolean D;
    private boolean E;
    private final Context t;
    private final atw u;
    private final Class v;
    private final ath w;
    private atx x;
    private Object y;
    private List z;

    static {
        beu beuVar = (beu) ((beu) ((beu) new beu().w(awt.b)).J(atk.LOW)).S();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ats(atb atbVar, atw atwVar, Class cls, Context context) {
        this.u = atwVar;
        this.v = cls;
        this.t = context;
        ath athVar = atwVar.a.b;
        atx atxVar = (atx) athVar.d.get(cls);
        if (atxVar == null) {
            for (Map.Entry entry : athVar.d.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    atxVar = (atx) entry.getValue();
                }
            }
        }
        this.x = atxVar == null ? ath.a : atxVar;
        this.w = atbVar.b;
        for (bet betVar : atwVar.d) {
            a(betVar);
        }
        n(atwVar.k());
    }

    private final bep W(Object obj, bfh bfhVar, bet betVar, ber berVar, atx atxVar, atk atkVar, int i, int i2, bel belVar, Executor executor) {
        bem bemVar;
        ber berVar2;
        bep X;
        int i3;
        int i4;
        atk atkVar2;
        int i5;
        int i6;
        if (this.B != null) {
            ber bemVar2 = new bem(obj, berVar);
            bemVar = bemVar2;
            berVar2 = bemVar2;
        } else {
            bemVar = null;
            berVar2 = berVar;
        }
        ats atsVar = this.A;
        if (atsVar == null) {
            X = X(obj, bfhVar, betVar, belVar, berVar2, atxVar, atkVar, i, i2, executor);
        } else if (!this.E) {
            atx atxVar2 = true == atsVar.C ? atxVar : atsVar.x;
            if (super.Q(8)) {
                atkVar2 = atsVar.c;
            } else {
                int i7 = atr.b[atkVar.ordinal()];
                if (i7 == 1) {
                    atkVar2 = atk.NORMAL;
                } else if (i7 == 2) {
                    atkVar2 = atk.HIGH;
                } else if (i7 == 3 || i7 == 4) {
                    atkVar2 = atk.IMMEDIATE;
                } else {
                    throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.c))));
                }
            }
            atk atkVar3 = atkVar2;
            ats atsVar2 = this.A;
            int i8 = atsVar2.i;
            int i9 = atsVar2.h;
            if (!bgj.p(i, i2) || this.A.R()) {
                i5 = i9;
                i6 = i8;
            } else {
                i6 = belVar.i;
                i5 = belVar.h;
            }
            bex bexVar = new bex(obj, berVar2);
            bep X2 = X(obj, bfhVar, betVar, belVar, bexVar, atxVar, atkVar, i, i2, executor);
            this.E = true;
            ats atsVar3 = this.A;
            bep W = atsVar3.W(obj, bfhVar, betVar, bexVar, atxVar2, atkVar3, i6, i5, atsVar3, executor);
            this.E = false;
            bexVar.a = X2;
            bexVar.b = W;
            X = bexVar;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bemVar == null) {
            return X;
        }
        ats atsVar4 = this.B;
        int i10 = atsVar4.i;
        int i11 = atsVar4.h;
        if (!bgj.p(i, i2) || this.B.R()) {
            i3 = i11;
            i4 = i10;
        } else {
            i4 = belVar.i;
            i3 = belVar.h;
        }
        ats atsVar5 = this.B;
        bep W2 = atsVar5.W(obj, bfhVar, betVar, bemVar, atsVar5.x, atsVar5.c, i4, i3, atsVar5, executor);
        bemVar.a = X;
        bemVar.b = W2;
        return bemVar;
    }

    private final bep X(Object obj, bfh bfhVar, bet betVar, bel belVar, ber berVar, atx atxVar, atk atkVar, int i, int i2, Executor executor) {
        Context context = this.t;
        ath athVar = this.w;
        return new bew(context, athVar, obj, this.y, this.v, belVar, i, i2, atkVar, bfhVar, betVar, this.z, berVar, athVar.h, atxVar.a, executor, null, null);
    }

    private final void Y(bfh bfhVar, bet betVar, bel belVar, Executor executor) {
        ce.m(bfhVar);
        if (this.D) {
            bep W = W(new Object(), bfhVar, betVar, null, this.x, belVar.c, belVar.i, belVar.h, belVar, executor);
            bep d = bfhVar.d();
            if (W.m(d) && (belVar.g || !d.l())) {
                ce.m(d);
                if (d.n()) {
                    return;
                }
                d.b();
                return;
            }
            this.u.l(bfhVar);
            bfhVar.h(W);
            this.u.s(bfhVar, W);
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public ats a(bet betVar) {
        if (this.p) {
            return o().a(betVar);
        }
        if (betVar != null) {
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(betVar);
        }
        U();
        return this;
    }

    @Override // defpackage.bel
    /* renamed from: b */
    public ats n(bel belVar) {
        ce.m(belVar);
        return (ats) super.n(belVar);
    }

    @Override // defpackage.bel
    /* renamed from: c */
    public ats o() {
        ats atsVar = (ats) super.clone();
        atsVar.x = atsVar.x.clone();
        List list = atsVar.z;
        if (list != null) {
            atsVar.z = new ArrayList(list);
        }
        ats atsVar2 = atsVar.A;
        if (atsVar2 != null) {
            atsVar.A = atsVar2.o();
        }
        ats atsVar3 = atsVar.B;
        if (atsVar3 != null) {
            atsVar.B = atsVar3.o();
        }
        return atsVar;
    }

    public ats d(ats atsVar) {
        if (this.p) {
            return o().d(atsVar);
        }
        this.B = atsVar;
        U();
        return this;
    }

    public ats e(bet betVar) {
        if (this.p) {
            return o().e(betVar);
        }
        this.z = null;
        return a(betVar);
    }

    public ats f(Uri uri) {
        return k(uri);
    }

    public ats g(File file) {
        return k(file);
    }

    public ats h(Integer num) {
        ats k = k(num);
        Context context = this.t;
        int i = bfr.b;
        return k.n(beu.d(new bfr(context.getResources().getConfiguration().uiMode & 48, bfs.a(context))));
    }

    public ats i(Object obj) {
        return k(obj);
    }

    public ats j(String str) {
        return k(str);
    }

    public final ats k(Object obj) {
        if (this.p) {
            return o().k(obj);
        }
        this.y = obj;
        this.D = true;
        U();
        return this;
    }

    public ats l(ats atsVar) {
        if (this.p) {
            return o().l(atsVar);
        }
        this.A = atsVar;
        U();
        return this;
    }

    public ats m(atx atxVar) {
        if (this.p) {
            return o().m(atxVar);
        }
        ce.m(atxVar);
        this.x = atxVar;
        this.C = false;
        U();
        return this;
    }

    public final beo p() {
        bes besVar = new bes();
        Y(besVar, besVar, this, bgb.b);
        return besVar;
    }

    public final bfh q() {
        bff bffVar = new bff(this.u);
        s(bffVar);
        return bffVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.bgj.j()
            defpackage.ce.m(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.Q(r0)
            if (r0 != 0) goto L4c
            boolean r0 = r3.l
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = defpackage.atr.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            bel r0 = r3.clone()
            bel r0 = r0.D()
            goto L4d
        L31:
            bel r0 = r3.clone()
            bel r0 = r0.E()
            goto L4d
        L3a:
            bel r0 = r3.clone()
            bel r0 = r0.D()
            goto L4d
        L43:
            bel r0 = r3.clone()
            bel r0 = r0.C()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            ath r1 = r3.w
            java.lang.Class r2 = r3.v
            dg r1 = r1.g
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
            bez r1 = new bez
            r1.<init>(r4)
            goto L6e
        L61:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L75
            bfc r1 = new bfc
            r1.<init>(r4)
        L6e:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.bgb.a
            r3.Y(r1, r4, r0, r2)
            return
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unhandled class: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ats.r(android.widget.ImageView):void");
    }

    public final void s(bfh bfhVar) {
        Y(bfhVar, null, this, bgb.a);
    }
}
