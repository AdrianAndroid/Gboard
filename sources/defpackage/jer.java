package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: jer  reason: default package */
/* loaded from: classes.dex */
final class jer implements Comparable {
    public final Map.Entry a;
    private final int b;

    public jer(int i, Map.Entry entry) {
        this.b = i;
        this.a = entry;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((jer) obj).b;
    }
}
