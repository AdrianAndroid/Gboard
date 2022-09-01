package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: p  reason: default package */
/* loaded from: classes2.dex */
public final class p {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public p(l lVar) {
        this.a = lVar.w;
        this.b = lVar.x;
        this.c = lVar.h();
        this.d = lVar.d();
        ArrayList arrayList = lVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new o((k) arrayList.get(i)));
        }
    }
}
