package defpackage;

import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lne  reason: default package */
/* loaded from: classes.dex */
final class lne implements Comparator {
    final /* synthetic */ Comparator a;

    public lne(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return this.a.compare(entry.getKey(), entry2.getKey());
    }
}
