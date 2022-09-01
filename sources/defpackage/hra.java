package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hra  reason: default package */
/* loaded from: classes.dex */
public final class hra {
    public final qo a;
    public final ArrayList b;
    public final gvy c;
    public volatile boolean d;

    public hra(hrb hrbVar) {
        qo qoVar = new qo();
        this.a = qoVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        gvy gvyVar = new gvy(2);
        this.c = gvyVar;
        if (hrbVar != null) {
            qoVar.putAll(hrbVar.a);
            arrayList.addAll(hrbVar.b);
            gvyVar.c(hrbVar.c);
            this.d = hrbVar.d;
        }
    }
}
