package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jkh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jkh implements miy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jkh(bze bzeVar, String str, boolean z, int i) {
        this.d = i;
        this.b = bzeVar;
        this.c = str;
        this.a = z;
    }

    public /* synthetic */ jkh(jkk jkkVar, boolean z, jig jigVar, int i) {
        this.d = i;
        this.c = jkkVar;
        this.a = z;
        this.b = jigVar;
    }

    public /* synthetic */ jkh(jkk jkkVar, boolean z, miy miyVar, int i) {
        this.d = i;
        this.b = jkkVar;
        this.a = z;
        this.c = miyVar;
    }

    public /* synthetic */ jkh(jkv jkvVar, boolean z, miy miyVar, int i) {
        this.d = i;
        this.b = jkvVar;
        this.a = z;
        this.c = miyVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, bze] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, miy] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        int i = this.d;
        if (i == 0) {
            Object obj2 = this.b;
            boolean z = this.a;
            ?? r8 = this.c;
            ArrayList arrayList = new ArrayList();
            for (jiq jiqVar : (List) obj) {
                if (!jiqVar.e) {
                    jkk jkkVar = (jkk) obj2;
                    arrayList.add(jkkVar.m(jkkVar.b.g(jiqVar), new jkd(jkkVar, z, jiqVar, (miy) r8, 0)));
                }
            }
            return jez.p(arrayList).a(hcb.l, ((jkk) obj2).e);
        } else if (i == 1) {
            jqm jqmVar = (jqm) obj;
            return this.b.h((String) this.c, new drn(this.a), jsq.a);
        } else if (i == 2) {
            boolean z2 = this.a;
            Object obj3 = this.b;
            if (!((Boolean) obj).booleanValue()) {
                return kcu.J(new IOException("Unable to update file group metadata"));
            }
            if (z2) {
                lvw.B((jig) obj3);
            }
            return kcu.K(obj3);
        } else {
            Object obj4 = this.b;
            boolean z3 = this.a;
            ?? r2 = this.c;
            Void r14 = (Void) obj;
            jkv jkvVar = (jkv) obj4;
            jkvVar.j.u();
            jkk jkkVar2 = jkvVar.c;
            return jkkVar2.m(jkkVar2.b.d(), ldd.c(new jkh(jkkVar2, z3, (miy) r2, 0)));
        }
    }
}
