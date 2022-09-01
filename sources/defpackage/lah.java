package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: lah  reason: default package */
/* loaded from: classes.dex */
final class lah implements laf {
    private final /* synthetic */ int a;

    public lah(int i) {
        this.a = i;
    }

    @Override // defpackage.laf
    public final Object[] a(Object obj, List list, List list2) {
        return this.a != 0 ? (Object[]) lby.i(obj, Object[].class, List.class, list, File.class, null, List.class, list2) : (Object[]) lby.g(obj, "makePathElements", Object[].class, List.class, list);
    }
}
