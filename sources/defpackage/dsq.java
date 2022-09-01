package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dsq  reason: default package */
/* loaded from: classes.dex */
final class dsq extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 32;
    }
}
