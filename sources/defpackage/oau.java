package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: oau  reason: default package */
/* loaded from: classes2.dex */
public final class oau {
    private final ArrayList a = new ArrayList();

    public final void a(Object obj) {
        this.a.add(obj.toString());
    }

    public final void b(String str, Object obj) {
        ArrayList arrayList = this.a;
        arrayList.add(str + "=" + obj);
    }

    public final String toString() {
        return this.a.toString();
    }
}
