package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: cfc  reason: default package */
/* loaded from: classes.dex */
public final class cfc extends gxu {
    private final cfd a;
    private final List b;

    public cfc(List list, cfd cfdVar) {
        super("SuperDelightDeleteLocale");
        this.b = list;
        this.a = cfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
