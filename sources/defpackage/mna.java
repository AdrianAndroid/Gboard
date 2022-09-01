package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: mna  reason: default package */
/* loaded from: classes2.dex */
public final class mna extends mnb {
    public mna(List list) {
        super("Dependency cycle detected: ".concat(String.valueOf(Arrays.toString(list.toArray()))));
    }
}
