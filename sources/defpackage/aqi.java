package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: aqi  reason: default package */
/* loaded from: classes.dex */
public final class aqi {
    public final List a;
    public final amp b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final apn h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final apm p;
    public final ape q;
    public final List r;
    public final boolean s;
    public final int t;
    public final int u;
    public final bhc v;

    public aqi(List list, amp ampVar, String str, long j, int i, long j2, String str2, List list2, apn apnVar, int i2, int i3, int i4, float f, float f2, int i5, int i6, apm apmVar, bhc bhcVar, List list3, int i7, ape apeVar, boolean z, byte[] bArr) {
        this.a = list;
        this.b = ampVar;
        this.c = str;
        this.d = j;
        this.t = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = apnVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = i5;
        this.o = i6;
        this.p = apmVar;
        this.v = bhcVar;
        this.r = list3;
        this.u = i7;
        this.q = apeVar;
        this.s = z;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        aqi c = this.b.c(this.e);
        if (c != null) {
            sb.append("\t\tParents: ");
            sb.append(c.c);
            aqi c2 = this.b.c(c.e);
            while (c2 != null) {
                sb.append("->");
                sb.append(c2.c);
                c2 = this.b.c(c2.e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.g.size());
            sb.append("\n");
        }
        if (this.i != 0 && this.j != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
