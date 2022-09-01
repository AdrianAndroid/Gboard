package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dsr  reason: default package */
/* loaded from: classes.dex */
final class dsr extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 64;
    }
}
