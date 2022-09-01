package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: krn  reason: default package */
/* loaded from: classes.dex */
public final class krn implements kro {
    private final jma a;

    public krn(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append(str);
        this.a = kws.m(sb, arrayList);
    }

    @Override // defpackage.kro
    public final void a(jma jmaVar) {
        jmaVar.f(this.a);
    }
}
