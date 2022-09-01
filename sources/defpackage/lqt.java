package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lqt  reason: default package */
/* loaded from: classes.dex */
final class lqt extends lqy {
    final /* synthetic */ Map.Entry a;

    public lqt(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.lqw
    public final int a() {
        return ((Collection) this.a.getValue()).size();
    }

    @Override // defpackage.lqw
    public final Object b() {
        return this.a.getKey();
    }
}
